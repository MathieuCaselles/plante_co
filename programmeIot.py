#!/usr/bin/env python

import mysql.connector as mariadb

import pigpio
import DHT22
#import RPi.GPIO as GPIO
from gpiozero import LightSensor
from time import sleep
import decimal
import os

# partie connection bdd
mariadb_connection = mariadb.connect(user='pi', password='root', database='projet_plante_co')
cursor = mariadb_connection.cursor()

# partie luminosité

detecter_lumiere = LightSensor(26)
valeur_lumiere = round(detecter_lumiere.value*100, 1)



# partie humidité et température

pi = pigpio.pi()

dht22 = DHT22.sensor(pi, 21)
dht22.trigger()

def readDHT22():

        dht22.trigger()
        humidity = '%.2f' % (dht22.humidity())
        temp = ' %.2f' % (dht22.temperature())

        return (humidity, temp)

#afficher les données

while True:
    humidity, temperature = readDHT22()
    print("Humidity is: " + humidity + "%")
    print("Temperature is: " + temperature + "°C")
    if valeur_lumiere < 0:
        print('Light: 0.0 %')
    else:
        print("Light: " + str(valeur_lumiere) + ' %')

    cursor.execute("INSERT INTO data_capter(data_capter_luminosity, data_capter_temp, data_capter_humidity) VALUES(" + str(valeur_lumiere) + "," + str(temperature) + "," + str(humidity) + ")")
    mariadb_connection.commit()
    sleep(1.5)