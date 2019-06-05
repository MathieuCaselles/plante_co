create table plant
(plant_id int not null primary key,
plant_nom varchar(80),
plant_catégorie varchar(50),
plant_description varchar(300),
plant_optimal_humidity float not null,
plant_optimal_temp float not null,
plant_optimal_lum float not null,
plant_periode_floraison varchar(50));

create table users
(user_id int not null primary key,
user_nom varchar(80),
user_catégorie varchar(50));

create table data_capter
(data_capter_id int not null primary key AUTO_INCREMENT,
data_capter_date datetime,
data_capter_luminosity float,
data_capter_temp float,
data_capter_humidity float);

create table plant_use
(plant_use_id int not null primary key,
plant_use_nom varchar(80),
plant_use_catégorie varchar(50),
plant_use_description varchar(300),
plant_use_optimal_humidity float not null,
plant_use_optimal_temp float not null,
plant_use_optimal_lum float not null,
plant_use_peridoe_floraison varchar(50));



INSERT INTO plant(plant_id, plant_nom, plant_catégorie, plant_description, plant_optimal_humidity, plant_optimal_temp, plant_optimal_lum, plant_periode_floraison)
VALUES
(1,'abricotier','arbre','L’Abricotier, parfois appelé Abricotier commun (Prunus armeniaca), est un arbre fruitier appartenant au genre Prunus de la famille des Rosaceae',50,20,50,'fevrier-avril'),
(2,'acajou','arbre','L’acajou est un nom vernaculaire ambigu qui désigne un ensemble d’arbres tropicaux de la famille des Méliacées, dont la caractéristique principale est d’avoir un bois de couleur rose pâle à rouge, odorant, durable et facile à travailler. Les fruits des acajous sont des capsules contenant des samares ',15,15,15,'varie suivant l’hemisphere'),
(3,'ail','herbace','L’ail, ail commun ou ail cultivé (Allium sativum) est une espèce de plante potagère vivace monocotylédone dont les bulbes, à l’odeur et au goût forts, sont souvent employés comme condiment en cuisine',40,30,60,'juin-septembre'),
(4,'brome','herbace','Le Brome stérile (Bromus sterilis) est une espèce de plantes monocotylédones de la famille des Poaceae, originaire de l’Ancien Monde.',15,15,15,'juin-juillet'),
(5,'chardon','herbace','Chardon est un terme générique qui désigne de nombreuses espèces de plantes épineuses appartenant principalement à la famille des Asteraceae (Composées)',20,25,70,'juillet-septembre'),
(6,'chou','herbace','« Chou » est un nom vernaculaire ambigu désignant en français certaines espèces, sous-espèces ou variétés de plantes appartenant généralement à la famille des Brassicaceae, mais aussi à d’autres familles botaniques.',20,20,20,'juin-septembre'),
(7,'courge','liane','Le terme courge, ou plus rarement cougourde, désigne plusieurs espèces de plantes de la famille des cucurbitacées. Elles sont généralement cultivées pour leurs fruits comestibles mais il arrive qu’elles le soient pour leurs graines oléagineuses.',70,27,30,'juin-septembre'),
(8,'echalotte','herbace','L’échalote est une plante bulbeuse de la famille des Amaryllidacées, cultivée comme plante condimentaire et potagère. Le terme désigne aussi le bulbe lui-même, qui fait partie depuis longtemps de la gastronomie française',30,30,30,'juin-septembre'),
(9,'erable','arbre','Les érables sont des arbres et des arbustes du genre Acer, type de la famille des Sapindacées selon la classification APG III (autrefois, selon la classification de Cronquist, de celle des Acéracées), dans l’ordre des Sapindales.',40,20,60,'mai'),
(10,'figuier','arbre','Ficus carica L. aux noms vernaculaires Figuier, Figuier comestible ou Figuier commun, est un arbre fruitier de la famille des Moracées qui donne des fruits comestibles appelés figues.',10,10,10,'fevrier-juin'),
(11,'gingembre','herbace','Le gingembre (Zingiber officinale) est une espèce de plantes originaire d’Inde, du genre Zingiber et de la famille des Zingiberaceae dont on utilise le rhizome en cuisine et en médecine traditionnelle.',15,15,15,'juillet-septembre'),
(12,'geranium','herbace','Geranium est un genre de plantes herbacées de la famille des Geraniaceae. Le genre comporte environ 430 espèces, distribuées partout dans le monde.',20,20,20,'avril-octobre'),
(13,'hetre','arbre','Le Hêtre commun, Fagus sylvatica, couramment désigné simplement comme le hêtre est une espèce d’arbres à feuilles caduques, indigène d’Europe, appartenant à la famille des Fagaceae, tout comme le chêne et le châtaignier.',20,20,20,'avril-mai'),
(14,'hibiscus','herbace','Hibiscus (du grec ἱϐίσκος / hibískos, signifiant guimauve) est un genre de plantes à fleurs annuelles ou vivaces qui comporte plusieurs centaines d’espèces. L’hibiscus fait partie de la famille des Malvacées (Malvaceae).',15,51,15,'mars-octobre'),
(15,'igname','liane','L’igname est une liane vivace développant des tiges graciles pouvant mesurer jusqu’à 2 à 3m de long. Ses feuilles persistantes, atteignant au mieux une dizaine de centimètres, adoptent une jolie forme de cœur à la couleur vert foncé.',30,35,70,'mars'),
(16,'jacinthe','herbace','Hyacinthus est un genre de plantes bulbeuses, anciennement classées dans la famille des Liliaceae et qui désigne les véritables espèces de jacinthes. Ce genre fait désormais partie de la famille des Asparagaceae',27,27,33,'fevrier-juin'),
(17,'jonc','harbace','L’appellation « jonc » s’applique en français à plusieurs taxons distincts. Famille des Juncaceae : Genre Juncus.',05,05,05,'juillet aout'),
(18,'jonquille','herbace','Jonquille est en français un nom vernaculaire qui désigne plusieurs plantes, généralement du genre Narcissus.',10,10,15,'mars-juin'),
(19,'laitue','herbace','La laitue, laitue cultivée est une plante herbacée appartenant au genre Lactuca, de la famille des Astéracées, largement cultivée pour ses feuilles tendres consommées comme légume, généralement crues en salade.',60,25,80,'juin-septembre'),
(20,'laurier','arbre','Laurus nobilis, le Laurier vrai, Laurier-sauce ou simplement Laurier, est une espèce d’arbustes à feuillage persistant de la famille des Lauracées. Il est originaire du bassin méditerranéen. Il est parfois appelé Laurier d’Apollon ou Laurier noble',08,07,92,'juin-septembre'),
(21,'lys','herbace','Les lys ou lis sont des plantes herbacées de la famille des Liliaceæ appartenant au genre Lilium',12,12,12,'mai-novembre'),
(22,'manguier','arbre','Le manguier est un arbre de la famille des Anacardiaceae, originaire d’Asie méridionale, largement cultivé dans les pays tropicaux pour son fruit, la mangue',92,37,14,'mai-juin'),
(23,'orchidée','herbace','Les Cypripediaceae sont une famille de plantes monocotylédones. Cette famille n’existe ni dans la classification classique de Cronquist ni dans la classification phylogénétique APG III.',30,24,68,'toute l’annee'),
(24,'palmier','arbre','Les palmiers, palmacées, Palmae, ou arécacées, Arecaceae, – les deux noms sont reconnus – forment une famille de plantes monocotylédones.',87,04,12,'mai-septembre'),
(25,'paletuvier','arbre','Les palétuviers sont des arbres ou arbustes tropicaux appartenant à diverses espèces d’angiospermes, capables de prospérer le long des rivages marins dans la zone de balancement des marées.',34,34,34,'mai-septembre'),
(26,'pin','arbre','Le pin est la désignation générique des conifères appartenant au genre Pinus, de la famille des Pinacées, dont au moins 111 espèces ont été décrites.',56,27,89,'mai-septembre'),
(27,'pommier','arbre','Les pommiers sont des arbres du genre botanique Malus et de la famille des Rosacées, dont le fruit est la pomme. Ce genre comprend une quarantaine d’espèces d’arbres ou d’arbustes dont la plus importante, sur le plan de l’alimentation humaine, est le pommier domestique.',33,22,77,'fevrier-juin'),
(28,'rosier','arbre','Les rosiers, ou églantiers, forment un genre de plantes, le genre Rosa de la famille des Rosaceae, originaires des régions tempérées et subtropicales de l’hémisphère nord. Ce sont des arbustes et arbrisseaux sarmenteux et épineux.',66,22,88,'mai-juin'),
(29,'sapin','arbre','Les sapins sont des arbres conifères du genre Abies originaires des régions tempérées de l’hémisphère nord. Ils font partie de la famille des Pinaceae.',90,33,77,'fervier-juin'),
(30,'trefle','liane','Les trèfles sont des plantes herbacées de la famille des Fabacées (Légumineuses), appartenant au genre Trifolium. Ils sont caractérisés par leurs feuilles composées à trois folioles et leur capacité à fixer l’azote atmosphérique grâce à des bactéries symbiotiques hébergées dans leurs racines.',03,14,98,'juin-septembre');




GRANT ALL PRIVILEGES ON projet_plante_co.* TO root@'%' IDENTIFIED BY 'root';