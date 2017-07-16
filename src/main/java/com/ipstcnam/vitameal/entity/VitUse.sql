insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2001, 'Asmatiques');
insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2002, 'Diabétiques');
insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2003, 'Hépatiques');
insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2004, 'Hypertendus');
insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2005, 'Cardiaques');
insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2006, 'Pneumopathie');
insert into GROUPEPATIENTS (GROUPEPATIENTSID, NOM) values (2007, 'Cancéreux');

insert into Natures (naturesID, nature) values (100, 'Allergie');
insert into Natures (naturesID, nature) values (101, 'Contre Indication');
insert into Natures (naturesID, nature) values (102, 'Maladie');

insert into Formes (formesID, forme) values (200, 'Liquide');
insert into Formes (formesID, forme) values (201, 'Solide');
insert into Formes (formesID, forme) values (202, 'Gélifié');
insert into Formes (formesID, forme) values (203, 'Moulu');
insert into Formes (formesID, forme) values (204, 'Semoule');
insert into Formes (formesID, forme) values (205, 'Frais');

insert into Textures (texturesID, texture) values (300, 'Maintenue');
insert into Textures (texturesID, texture) values (301, 'Modifiée');

insert into Familles (famillesID, famille) values (400, 'Produits laitiers');
insert into Familles (famillesID, famille) values (401, 'Fruits à coque');
insert into Familles (famillesID, famille) values (402, 'Crustacés');
insert into Familles (famillesID, famille) values (403, 'Fromages');
insert into Familles (famillesID, famille) values (404, 'Légumes');
insert into Familles (famillesID, famille) values (405, 'Viandes');
insert into Familles (famillesID, famille) values (406, 'Céréales');
insert into Familles (famillesID, famille) values (407, 'Glucides');
insert into Familles (famillesID, famille) values (408, 'Lipides');
insert into Familles (famillesID, famille) values (409, 'Condiments');

insert into AlimentsBase (alimentsBaseID, alimentBase) values (500, 'Sel');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (501, 'Poivre');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (502, 'Miel');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (503, 'Farine de blé');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (504, 'Boulgour');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (505, 'Poireau');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (506, 'Batavia');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (507, 'Laitue');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (508, 'Huile d''arachide');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (509, 'Huile de tournesol');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (510, 'Banane');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (511, 'Poire');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (512, 'Pomme');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (513, 'Riz');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (514, 'Tomate');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (515, 'Brocoli');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (516, 'Courgette');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (517, 'Poulet');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (518, 'Pintade');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (519, 'Lapin');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (520, 'Chocolat');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (521, 'Roquefort');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (522, 'Émental');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (523, 'Reblochon');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (524, 'Café');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (525, 'Sucre');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (526, 'Aïl');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (527, 'Oignon');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (528, 'Béterave rouge');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (529, 'Soja');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (530, 'Eau');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (531, 'Vin');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (532, 'Bière');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (533, 'Choucroute');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (534, 'Choux');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (535, 'Boeuf');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (536, 'Maïzena');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (537, 'Gingembre');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (538, 'Citron jaune');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (539, 'Citron vert');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (540, 'Coriandre');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (541, 'Riz basmati');
insert into AlimentsBase (alimentsBaseID, alimentBase) values (542, 'Anchoi');

-- Ingrédients du Boeuf aux oignons à la chinoise
insert into Ingredient (IngredientID, nom, famille, forme, texture) values (600, 'Nuoc-mam', NULL, 200, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (542, 600);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (500, 600);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (530, 600);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (601, 'Sauce soja', NULL, 200, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (529, 601);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (500, 601);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (530, 601);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (602, 'Boeuf', 405, 201, 300);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (535, 602);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (603, 'Maïzena', 407, 203, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (536, 603);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (604, 'Huile d''arachide', 408, 200, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (508, 604);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (605, 'Aïl', 409, 201, 300);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (526, 605);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (606, 'Gingembre moulu', 409, 203, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (537, 606);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (607, 'Oignon', 409, 201, 300);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (527, 607);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (608, 'Sucre semoule', 407, 204, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (525, 608);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (609, 'Jus de citron vert', 409, 200, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (539, 609);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (610, 'Coriandre frais', 409, 205, 300);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (540, 610);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (611, 'Riz basmati', 406, 201, 300);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (541, 611);

insert into Ingredient (IngredientID, nom, famille, forme, texture) values (612, 'Sel', 409, 203, NULL);
insert into AlimentCompose (AlimentsBaseID, ingredientID) values (500, 612);

-- Définition du Boeuf aux oignons à la chinoise
insert into Plat (platID, nom, categorie, periode, nbServices, minMax) values (1000, 'BŒUF AUX OIGNONS A LA CHINOISE', 'Déjeuner', 20, 5, 'Max');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 602, 120, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 601, 2, 'cl');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 603, 3, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 604, 1, 'cl');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 605, 5, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 606, 3, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 607, 20, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 608, 10, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 600, 2, 'cl');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 609, 1, 'cl');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 610, 0.04, 'botte');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 611, 60, 'g');
insert into ComposantPlat (platID, ingredientID, quantite, unite) values (1000, 612, 1, 'g');
