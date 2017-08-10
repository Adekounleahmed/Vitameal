-- -*- coding: utf-8 -*-
insert into GroupePatients (groupePatientsID, nom) values (2001, 'Asmatiques');
insert into GroupePatients (groupePatientsID, nom) values (2002, 'Diabétiques');
insert into GroupePatients (groupePatientsID, nom) values (2003, 'Hépatiques');
insert into GroupePatients (groupePatientsID, nom) values (2004, 'Hypertendus');
insert into GroupePatients (groupePatientsID, nom) values (2005, 'Cardiaques');
insert into GroupePatients (groupePatientsID, nom) values (2006, 'Pneumopathie');
insert into GroupePatients (groupePatientsID, nom) values (2007, 'Cancéreux');

insert into Forme (id, nom) values (200, 'Liquide');
insert into Forme (id, nom) values (201, 'Solide');
insert into Forme (id, nom) values (202, 'Gélifié');
insert into Forme (id, nom) values (203, 'Moulu');
insert into Forme (id, nom) values (204, 'Semoule');
insert into Forme (id, nom) values (205, 'Frais');

insert into Texture (id, nom) values (300, 'Maintenue');
insert into Texture (id, nom) values (301, 'Modifiée');

insert into Famille (id, nom) values (400, 'Produits laitiers');
insert into Famille (id, nom) values (401, 'Fruits à coque');
insert into Famille (id, nom) values (402, 'Crustacés');
insert into Famille (id, nom) values (403, 'Fromages');
insert into Famille (id, nom) values (404, 'Légumes');
insert into Famille (id, nom) values (405, 'Viandes');
insert into Famille (id, nom) values (406, 'Céréales');
insert into Famille (id, nom) values (407, 'Glucides');
insert into Famille (id, nom) values (408, 'Lipides');
insert into Famille (id, nom) values (409, 'Condiments');

insert into Ingredient (id, nom) values (500, 'Sel');
insert into Ingredient (id, nom) values (501, 'Poivre');
insert into Ingredient (id, nom) values (502, 'Miel');
insert into Ingredient (id, nom) values (503, 'Farine de blé');
insert into Ingredient (id, nom) values (504, 'Boulgour');
insert into Ingredient (id, nom) values (505, 'Poireau');
insert into Ingredient (id, nom) values (506, 'Batavia');
insert into Ingredient (id, nom) values (507, 'Laitue');
insert into Ingredient (id, nom) values (508, 'Huile d''arachide');
insert into Ingredient (id, nom) values (509, 'Huile de tournesol');
insert into Ingredient (id, nom) values (510, 'Banane');
insert into Ingredient (id, nom) values (511, 'Poire');
insert into Ingredient (id, nom) values (512, 'Pomme');
insert into Ingredient (id, nom) values (513, 'Riz');
insert into Ingredient (id, nom) values (514, 'Tomate');
insert into Ingredient (id, nom) values (515, 'Brocoli');
insert into Ingredient (id, nom) values (516, 'Courgette');
insert into Ingredient (id, nom) values (517, 'Poulet');
insert into Ingredient (id, nom) values (518, 'Pintade');
insert into Ingredient (id, nom) values (519, 'Lapin');
insert into Ingredient (id, nom) values (520, 'Chocolat');
insert into Ingredient (id, nom) values (521, 'Roquefort');
insert into Ingredient (id, nom) values (522, 'Émental');
insert into Ingredient (id, nom) values (523, 'Reblochon');
insert into Ingredient (id, nom) values (524, 'Café');
insert into Ingredient (id, nom) values (525, 'Sucre');
insert into Ingredient (id, nom) values (526, 'Aïl');
insert into Ingredient (id, nom) values (527, 'Oignon');
insert into Ingredient (id, nom) values (528, 'Béterave rouge');
insert into Ingredient (id, nom) values (529, 'Soja');
insert into Ingredient (id, nom) values (530, 'Eau');
insert into Ingredient (id, nom) values (531, 'Vin');
insert into Ingredient (id, nom) values (532, 'Bière');
insert into Ingredient (id, nom) values (533, 'Choucroute');
insert into Ingredient (id, nom) values (534, 'Choux');
insert into Ingredient (id, nom) values (535, 'Boeuf');
insert into Ingredient (id, nom) values (536, 'Maïzena');
insert into Ingredient (id, nom) values (537, 'Gingembre');
insert into Ingredient (id, nom) values (538, 'Citron jaune');
insert into Ingredient (id, nom) values (539, 'Citron vert');
insert into Ingredient (id, nom) values (540, 'Coriandre');
insert into Ingredient (id, nom) values (541, 'Riz basmati');
insert into Ingredient (id, nom) values (542, 'Anchoi');

-- Ingrédients du Boeuf aux oignons à la chinoise
insert into Aliment (alimentID, nom, famille, forme, texture) values (600, 'Nuoc-mam', NULL, 200, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (542, 600);
insert into IngredientCompose (ingredientID, alimentID) values (500, 600);
insert into IngredientCompose (ingredientID, alimentID) values (530, 600);

insert into Aliment (alimentID, nom, famille, forme, texture) values (601, 'Sauce soja', NULL, 200, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (529, 601);
insert into IngredientCompose (ingredientID, alimentID) values (500, 601);
insert into IngredientCompose (ingredientID, alimentID) values (530, 601);

insert into Aliment (alimentID, nom, famille, forme, texture) values (602, 'Boeuf', 405, 201, 300);
insert into IngredientCompose (ingredientID, alimentID) values (535, 602);

insert into Aliment (alimentID, nom, famille, forme, texture) values (603, 'Maïzena', 407, 203, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (536, 603);

insert into Aliment (alimentID, nom, famille, forme, texture) values (604, 'Huile d''arachide', 408, 200, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (508, 604);

insert into Aliment (alimentID, nom, famille, forme, texture) values (605, 'Aïl', 409, 201, 300);
insert into IngredientCompose (ingredientID, alimentID) values (526, 605);

insert into Aliment (alimentID, nom, famille, forme, texture) values (606, 'Gingembre moulu', 409, 203, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (537, 606);

insert into Aliment (alimentID, nom, famille, forme, texture) values (607, 'Oignon', 409, 201, 300);
insert into IngredientCompose (ingredientID, alimentID) values (527, 607);

insert into Aliment (alimentID, nom, famille, forme, texture) values (608, 'Sucre semoule', 407, 204, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (525, 608);

insert into Aliment (alimentID, nom, famille, forme, texture) values (609, 'Jus de citron vert', 409, 200, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (539, 609);

insert into Aliment (alimentID, nom, famille, forme, texture) values (610, 'Coriandre frais', 409, 205, 300);
insert into IngredientCompose (ingredientID, alimentID) values (540, 610);

insert into Aliment (alimentID, nom, famille, forme, texture) values (611, 'Riz basmati', 406, 201, 300);
insert into IngredientCompose (ingredientID, alimentID) values (541, 611);

insert into Aliment (alimentID, nom, famille, forme, texture) values (612, 'Sel', 409, 203, NULL);
insert into IngredientCompose (ingredientID, alimentID) values (500, 612);

-- Définition du Boeuf aux oignons à la chinoise
insert into Plat (platID, nom, categorie, periode, nombreService, minMax) values (1000, 'BŒUF AUX OIGNONS A LA CHINOISE', 'Déjeuner', 20, 5, 'Max');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 602, 120, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 601, 2, 'cl');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 603, 3, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 604, 1, 'cl');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 605, 5, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 606, 3, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 607, 20, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 608, 10, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 600, 2, 'cl');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 609, 1, 'cl');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 610, 0.04, 'botte');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 611, 60, 'g');
insert into ComposantPlat (platID, alimentID, quantite, unite) values (1000, 612, 1, 'g');
