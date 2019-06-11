create table plant
(plant_id int primary key AUTO_INCREMENT,
plant_nom varchar(80),
plant_categorie varchar(50),
plant_description varchar(300),
plant_optimal_humidity float,
plant_optimal_temp float,
plant_optimal_lum float,
plant_periode_floraison varchar(50));

create table users
(user_id int primary key,
user_nom varchar(80),
user_catégorie varchar(50));

create table data_capter
(data_capter_id int primary key AUTO_INCREMENT,
data_capter_date date,
data_capter_luminosity float,
data_capter_temp float,
data_capter_humidity float);

create table plant_use
(plant_use_id int primary key AUTO_INCREMENT,
plant_use_nom varchar(80),
plant_use_categorie varchar(50),
plant_use_description varchar(300),
plant_use_optimal_humidity float ,
plant_use_optimal_temp float ,
plant_use_optimal_lum float ,
plant_use_peridoe_floraison varchar(50));


INSERT INTO plant(plant_id, plant_nom, plant_categorie, plant_description, plant_optimal_humidity, plant_optimal_temp, plant_optimal_lum, plant_periode_floraison)
VALUES
(1,'abricotier','arbre','L’Abricotier, parfois appelé Abricotier commun (Prunus armeniaca), est un arbre fruitier appartenant au genre Prunus de la famille des Rosaceae.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',50,20,50,'fevrier-avril'),
(2,'acajou','arbre','L’acajou est un nom vernaculaire ambigu qui désigne un ensemble d’arbres tropicaux de la famille des Méliacées, dont la caractéristique principale est d’avoir un bois de couleur rose pâle à rouge, odorant, durable et facile à travailler. Les fruits des acajous sont des capsules contenant des samares.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre ',15,15,15,'varie suivant l’hemisphere'),
(3,'ail','herbace','L’ail, ail commun ou ail cultivé (Allium sativum) est une espèce de plante potagère vivace monocotylédone dont les bulbes, à l’odeur et au goût forts, sont souvent employés comme condiment en cuisine.Formez de légers sillons de 3-4 cm de profondeur. Plantez uniquement les caïeux situés sur le pourtour du bulbe, pointe en l’air, en les espaçant de 10-12 cm.Disposez-les en quinconce. Refermez le sillon en ne recouvrant les caïeux que dvun cm de terre.',40,30,60,'juin-septembre'),
(4,'brome','herbace','Le Brome stérile (Bromus sterilis) est une espèce de plantes monocotylédones de la famille des Poaceae, originaire de l’Ancien Monde.Pour réussir l’implantation de la culture du brome, il est nécessaire de procéder à 3 étapes avant le semis : un bêchage superfi ciel pour faciliter le développementdes racines, un désherbage s’impose avant le semis pour limiter la concurrence des plantes adventices, les 2 cm de surface du sol (le lit de semences) doivent être préparés très fi nement pour obtenir une terre émiettée.',15,15,15,'juin-juillet'),
(5,'chardon','herbace','Chardon est un terme générique qui désigne de nombreuses espèces de plantes épineuses appartenant principalement à la famille des Asteraceae (Composées).Les semis de chardon-Marie se font en place au printemps en procédant à un éclaircissage pour les espacer de 50 cm. Si vous faites les semis en serre froide en mars, il faudra les repiquer en godets jusqu’à leur plantation définitive en extérieur en avril.',20,25,70,'juillet-septembre'),
(6,'chou','herbace','« Chou » est un nom vernaculaire ambigu désignant en français certaines espèces, sous-espèces ou variétés de plantes appartenant généralement à la famille des Brassicaceae, mais aussi à d’autres familles botaniques..Déterrez délicatement vos plants avec les racines. Pour faciliter la reprise vous pouvez les praliner. Plantez vos choux en lignes en enfonçant la tige jusqu’aux premières feuilles. Tassez bien autour des plants et arrosez.',20,20,20,'juin-septembre'),
(7,'courge','liane','Le terme courge, ou plus rarement cougourde, désigne plusieurs espèces de plantes de la famille des cucurbitacées. Elles sont généralement cultivées pour leurs fruits comestibles mais il arrive qu’elles le soient pour leurs graines oléagineuses..Semez au potager quand les gelées ne sont plus à craindre, dans des poquets de 3 graines. Ne conservez que le plus beau plant de chaque poquet.',70,27,30,'juin-septembre'),
(8,'echalotte','herbace','L’échalote est une plante bulbeuse de la famille des Amaryllidacées, cultivée comme plante condimentaire et potagère. Le terme désigne aussi le bulbe lui-même, qui fait partie depuis longtemps de la gastronomie française.Commencez par ameublir le sol, au râteau ou au croc, au moment de la plantation (fin février-début mars). En terrain humide, ramenez la terre vers vous pour former une butte de 10-15cm de hauteur, empêchant l’humidité de faire moisir les bulbes en terre.Posez les bulbes d’échalote sur le terrain préparé, en respectant un écartement de 15 cm entre les plantes',30,30,30,'juin-septembre'),
(9,'erable','arbre','Les érables sont des arbres et des arbustes du genre Acer, type de la famille des Sapindacées selon la classification APG III (autrefois, selon la classification de Cronquist, de celle des Acéracées), dans l’ordre des Sapindales..Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',40,20,60,'mai'),
(10,'figuier','arbre','Ficus carica L. aux noms vernaculaires Figuier, Figuier comestible ou Figuier commun, est un arbre fruitier de la famille des Moracées qui donne des fruits comestibles appelés figues.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',10,10,10,'fevrier-juin'),
(11,'gingembre','herbace','Le gingembre (Zingiber officinale) est une espèce de plantes originaire d’Inde, du genre Zingiber et de la famille des Zingiberaceae dont on utilise le rhizome en cuisine et en médecine traditionnelle.Plantez dès le début du printemps, le gingembre préfère les sols bien drainés et très riches, p	lantez votre gingembre. Placez chaque morceau à 5-10 cm de profondeur dans la terre en vous assurant que les yeux sont orientés vers le haut',15,15,15,'juillet-septembre'),
(12,'geranium','herbace','Geranium est un genre de plantes herbacées de la famille des Geraniaceae. Le genre comporte environ 430 espèces, distribuées partout dans le monde.Attendez les saints de glace (mi-mai ) pour planter vos géraniums à l’extérieur. Privilégiez les terreaux conçus pour la culture de géranium qui intègrent des engrais à libération lente. Pour favoriser l’enracinement après la plantation, grattez la motte avec un petit râteau pour séparer les racines et coupez les pointes.',20,20,20,'avril-octobre'),
(13,'hetre','arbre','Le Hêtre commun, Fagus sylvatica, couramment désigné simplement comme le hêtre est une espèce d’arbres à feuilles caduques, indigène d’Europe, appartenant à la famille des Fagaceae, tout comme le chêne et le châtaignie.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre.',20,20,20,'avril-mai'),
(14,'hibiscus','herbace','Hibiscus (du grec ἱϐίσκος / hibískos, signifiant guimauve) est un genre de plantes à fleurs annuelles ou vivaces qui comporte plusieurs centaines d’espèces. L’hibiscus fait partie de la famille des Malvacées (Malvaceae)..Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',15,51,15,'mars-octobre'),
(15,'igname','liane','L’igname est une liane vivace développant des tiges graciles pouvant mesurer jusqu’à 2 à 3m de long. Ses feuilles persistantes, atteignant au mieux une dizaine de centimètres, adoptent une jolie forme de cœur à la couleur vert foncéFin avril début mai, coupez des morceaux de rhizomes de 10 à 20 cm, contenant au moins deux yeux. Plantez-les à 10 cm de profondeur tous les 40 cm',30,35,70,'mars'),
(16,'jacinthe','herbace','Hyacinthus est un genre de plantes bulbeuses, anciennement classées dans la famille des Liliaceae et qui désigne les véritables espèces de jacinthes. Ce genre fait désormais partie de la famille des Asparagaceae.Choisir une exposition ensoleillée ou mi-ombragée et un endroit où le sol n’est jamais détrempé. Planter les jacinthes en automne.Former un trou à l’aide d’un plantoir à bulbes et poser le bulbe au fond du trou à une profondeur de 10 cm la pointe vers le haut. Recouvrir de terre, tasser légèrement.',27,27,33,'fevrier-juin'),
(17,'jonc','harbace','L’appellation « jonc » s’applique en français à plusieurs taxons distincts. Famille des Juncaceae : Genre Juncus..Choisir une exposition ensoleillée ou mi-ombragée et un endroit où le sol n’est jamais détrempé. Planter les jacinthes en automne.Former un trou à l’aide d’un plantoir à bulbes et poser le bulbe au fond du trou à une profondeur de 10 cm la pointe vers le haut. Recouvrir de terre, tasser légèrement.',05,05,05,'juillet aout'),
(18,'jonquille','herbace','Jonquille est en français un nom vernaculaire qui désigne plusieurs plantes, généralement du genre Narcissus..Les bulbes de jonquilles se plantent idéalement au mois de septembre, octobre et novembre. Faites un trou d’environ 3 fois la hauteur du bulbe afin de le protéger des gelées hivernales.',10,10,15,'mars-juin'),
(19,'laitue','herbace','La laitue, laitue cultivée est une plante herbacée appartenant au genre Lactuca, de la famille des Astéracées, largement cultivée pour ses feuilles tendres consommées comme légume, généralement crues en salade..Comptez 7 à 10 jours selon la température du sol pour la levée des graines. Dès que les plants ont 4-5 feuilles, soit environ 4 à 5 semaines après le semis, procédez à l’éclaircissage pour ne laisser qu’un plant tous les 25 à 30 cm sur la ligne. Ensuite, arrosez copieusement.',60,25,80,'juin-septembre'),
(20,'laurier','arbre','Laurus nobilis, le Laurier vrai, Laurier-sauce ou simplement Laurier, est une espèce d’arbustes à feuillage persistant de la famille des Lauracées. Il est originaire du bassin méditerranéen. Il est parfois appelé Laurier d’Apollon ou Laurier noble.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',08,07,92,'juin-septembre'),
(21,'lys','herbace','Les lys ou lis sont des plantes herbacées de la famille des Liliaceæ appartenant au genre Lilium.Le lys se plante environ 10-15 cm de profondeur.Respectez un espacement dvau moins 15 cm et faites des touffes de 4-5 bulbes.',12,12,12,'mai-novembre'),
(22,'manguier','arbre','Le manguier est un arbre de la famille des Anacardiaceae, originaire d’Asie méridionale, largement cultivé dans les pays tropicaux pour son fruit, la mangue.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',92,37,14,'mai-juin'),
(23,'orchidée','herbace','Les Cypripediaceae sont une famille de plantes monocotylédones. Cette famille n’existe ni dans la classification classique de Cronquist ni dans la classification phylogénétique APG III.Émiettez la terre et enrichissez le fond du trou de plantation avec une bonne quantité de compost parfaitement mûr. Sortez délicatement le sujet de son pot : les racines sont fragiles. Positionnez-le, sans défaire la motte. Faites arriver le tout à 3 cm environ sous la surface. Comblez le trou avec un mélange de compost mûr et de terre de jardin.',30,24,68,'toute l’annee'),
(24,'palmier','arbre','Les palmiers, palmacées, Palmae, ou arécacées, Arecaceae, – les deux noms sont reconnus – forment une famille de plantes monocotylédones.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',87,04,12,'mai-septembre'),
(25,'paletuvier','arbre','Les palétuviers sont des arbres ou arbustes tropicaux appartenant à diverses espèces d’angiospermes, capables de prospérer le long des rivages marins dans la zone de balancement des marées.',34,34,34,'mai-septembre'),
(26,'pin','arbre','Le pin est la désignation générique des conifères appartenant au genre Pinus, de la famille des Pinacées, dont au moins 111 espèces ont été décrites.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',56,27,89,'mai-septembre'),
(27,'pommier','arbre','Les pommiers sont des arbres du genre botanique Malus et de la famille des Rosacées, dont le fruit est la pomme. Ce genre comprend une quarantaine d’espèces d’arbres ou d’arbustes dont la plus importante, sur le plan de l’alimentation humaine, est le pommier domestique.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',33,22,77,'fevrier-juin'),
(28,'rosier','arbre','Les rosiers, ou églantiers, forment un genre de plantes, le genre Rosa de la famille des Rosaceae, originaires des régions tempérées et subtropicales de l’hémisphère nord. Ce sont des arbustes et arbrisseaux sarmenteux et épineux.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',66,22,88,'mai-juin'),
(29,'sapin','arbre','Les sapins sont des arbres conifères du genre Abies originaires des régions tempérées de l’hémisphère nord. Ils font partie de la famille des Pinaceae.Pour le planter, creusez un grand trou, apportez de l’engrais, instalez le tuteur puis plantez l’arbre',90,33,77,'fervier-juin'),
(30,'trefle','liane','Les trèfles sont des plantes herbacées de la famille des Fabacées (Légumineuses), appartenant au genre Trifolium. Ils sont caractérisés par leurs feuilles composées à trois folioles et leur capacité à fixer l’azote atmosphérique grâce à des bactéries symbiotiques hébergées dans leurs racines.Préparez le sol ou la pelouse. Vous pouvez faire pousser le trèfle sur la terre ou vous pouvez aussi le semer sur votre pelouse déjà implantée. Mélangez les graines avec du sable ou de la terre. Semez les graines. Arrosez la zone. Ne mettez pas d’engrais.',03,14,98,'juin-septembre');

UPDATE plant SET plant_description=CONCAT(plant_description, ' ') where plant_id = 1;
UPDATE plant SET plant_description=CONCAT(plant_description, ' ') where plant_id = 2;
UPDATE plant SET plant_description=CONCAT(plant_description, ' ') where plant_id = 3;
UPDATE plant SET plant_description=CONCAT(plant_description, ' ') where plant_id = 4;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 5;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 6;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 7;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 8;

UPDATE plant SET plant_description=CONCAT(plant_description, ' ') where plant_id = 11;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 12

UPDATE plant SET plant_description=CONCAT(plant_description, '. ') where plant_id = 15;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 16;

UPDATE plant SET plant_description=CONCAT(plant_description, ' ') where plant_id = 18;
UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 19;

UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 21;

UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 23;

UPDATE plant SET plant_description=CONCAT(plant_description, '') where plant_id = 30;

