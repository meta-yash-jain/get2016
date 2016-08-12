CREATE DATABASE ECommerce;

USE ECommerce;

CREATE TABLE Product(

	product_category_id CHAR(36) NOT NULL,
	category_name VARCHAR(100) NOT NULL,
	parent_category_id CHAR(36),
	PRIMARY KEY (product_category_id)
);

INSERT INTO Product VALUES ('1', 'Mobiles And Tablets', null);
INSERT INTO Product VALUES ('2', 'Computers', null);
INSERT INTO Product VALUES ('3', 'Home Appliances', null);
INSERT INTO Product VALUES ('4', 'Mobiles', '1');
INSERT INTO Product VALUES ('5', 'Tablets', '1');
INSERT INTO Product VALUES ('6', 'Accessories', '1');
INSERT INTO Product VALUES ('7', 'Cases And Covers', '1');
INSERT INTO Product VALUES ('8', 'Desktop', '2');
INSERT INTO Product VALUES ('9', 'Laptop', '2');
INSERT INTO Product VALUES ('10', 'Laptop Accessories', '2');
INSERT INTO Product VALUES ('11', 'Printers', '2');
INSERT INTO Product VALUES ('12', 'Tvs', '3');
INSERT INTO Product VALUES ('13', 'Air Conditioners', '3');
INSERT INTO Product VALUES ('14', 'Washing Machines', '3');
INSERT INTO Product VALUES ('15', 'Smart Phones', '4');
INSERT INTO Product VALUES ('16', 'Featured Phones', '4');
INSERT INTO Product VALUES ('17', '2G Tablets', '5');
INSERT INTO Product VALUES ('18', '3G Tablets', '5');
INSERT INTO Product VALUES ('19', 'Keyboard', '10');
INSERT INTO Product VALUES ('20', 'Mouse', '10');
INSERT INTO Product VALUES ('21', 'HeadPhones', '10');
INSERT INTO Product VALUES ('22', 'Inkjet Printers', '11');
INSERT INTO Product VALUES ('23', 'Laser Printers', '11');
INSERT INTO Product VALUES ('24', 'LED TV', '12');
INSERT INTO Product VALUES ('25', 'LCD TV', '12');
INSERT INTO Product VALUES ('26', 'Plasma TV', '12');
INSERT INTO Product VALUES ('27', 'Full Automatic', '14');
INSERT INTO Product VALUES ('28', 'Semi Automatic', '14');
INSERT INTO Product VALUES ('29', 'Top Load', '27');
INSERT INTO Product VALUES ('30', 'Front Load', '27'); 

SELECT p.product_category_id, p.category_name,
IFNULL (m.category_name, 'Top Category') as Parent_Category
FROM Product p
LEFT JOIN Product m
ON p.parent_category_id = m.product_category_id;

SELECT p.product_category_id, p.category_name,
IFNULL (m.category_name, 'Top Category') as Parent_Category
FROM Product p
LEFT JOIN Product m
ON p.parent_category_id = m.product_category_id
ORDER BY m.category_name ;

SELECT p.category_name as Top_Category
FROM Product p WHERE p.parent_category_id IS null;
