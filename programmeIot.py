#!/usr/bin/env python
import pigpio
import DHT22
#import RPi.GPIO as GPIO
from gpiozero import LightSensor
from time import sleep
import decimal

# partie luminosité

valeur_lumiere = LightSensor(26)



# partie humidité et température

pi = pigpio.pi()

dht22 = DHT22.sensor(pi, 21)
dht22.trigger()

def readDHT22():

        dht22.trigger()
        humidity = '%.2f' % (dht22.humidity())
        temp = ' %.2f' % (dht22.temperature())

        return (humidity, temp)

while True:
    humidity, temperature = readDHT22()
    print("Humidity is: " + humidity + "%")
    print("Temperature is: " + temperature + "C")
    if valeur_lumiere.value < 0:
        print('Light: 0.0 %')
    else:
        print("Light: " + str(round(valeur_lumiere.value*100, 1)) + ' %')
    sleep(1.5)