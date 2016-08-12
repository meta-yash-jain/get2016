CREATE DATABASE Country;

USE Country;

CREATE TABLE Country_Zipcode(
	zipcode CHAR(36) NOT NULL,
	PRIMARY KEY (zipcode)
);

CREATE TABLE Country_State(
	state_name VARCHAR(200) NOT NULL,
	PRIMARY KEY (state_name)
);

CREATE TABLE Country_City(
	city_name VARCHAR(200) NOT NULL,
	city_population INT NOT NULL,
	state_name VARCHAR(200) NOT NULL,
	zipcode CHAR(36) NOT NULL,
	FOREIGN KEY fk_zipcode (zipcode) REFERENCES Country_Zipcode (zipcode)
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
	FOREIGN KEY fk_state (state_name) REFERENCES Country_State (state_name)
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
	PRIMARY KEY(city_name,zipcode)
);

INSERT INTO Country_Zipcode Values ('442402');
INSERT INTO Country_Zipcode Values ('442432');
INSERT INTO Country_Zipcode Values ('442451');
INSERT INTO Country_Zipcode Values ('342489');
INSERT INTO Country_Zipcode Values ('342463');
INSERT INTO Country_Zipcode Values ('342477');

INSERT INTO Country_State Values('Maharashtra');
INSERT INTO Country_State Values('Rajasthan');

INSERT INTO Country_City VALUES ('Chandrapur', '500000', 'Maharashtra', '442402');
INSERT INTO Country_City VALUES ('Nagpur', '1000000', 'Maharashtra', '442432');
INSERT INTO Country_City VALUES ('Pune', '2000000', 'Maharashtra', '442451');
INSERT INTO Country_City VALUES ('Jaipur', '5000000', 'Rajasthan', '342489');
INSERT INTO Country_City VALUES ('Jodhpur', '500000', 'Rajasthan', '342463');
INSERT INTO Country_City VALUES ('Ajmer', '6000000', 'Rajasthan', '342477');

Select z.zipcode, c.city_name, c.state_name
FROM Country_Zipcode z
LEFT JOIN Country_City c 
ON z.zipcode = c.zipcode
ORDER BY c.state_name AND c.city_name;
