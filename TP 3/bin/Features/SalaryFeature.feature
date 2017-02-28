Feature: Gestions des salaires

Scenario: Modifier le salaire d un employee 
	Given le systeme de gestion des salaires est initalise comme suit
		| id 	| user 		| salaire | 
		| 1 	| Ahmed		| 60000.0 |
		| 2 	| Said	 	| 62000.0 |
		| 3 	| Fatima 	| 55000.0 |
		| 4 	| Amal		| 70000.0 |
		| 5 	| Karim		| 56000.0 | 
		| 6 	| Samira 	| 62000.0 | 
		| 7 	| Youness 	| 91000.0 |
		| 8 	| Sirrin 	| 96500.0 |
	When le directeur augmente le salaire de employee avec id 3 par 5 %
	Then le Salaire de employee avec id 3 sera 57750