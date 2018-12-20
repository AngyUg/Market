CREATE TABLE mydb.addresses
(
  ID         BIGINT NOT NULL AUTO_INCREMENT,
  COUNTRY    VARCHAR(255),
  REGION     VARCHAR(255),
  CITY       VARCHAR(255),
  DISTRICT   VARCHAR(255),
  STREET     VARCHAR(255),
  HOUSE_NUMB VARCHAR(255),
  INDEX_     VARCHAR(255),
  PRIMARY KEY (ID)
);

INSERT INTO addresses (COUNTRY, REGION,
                       CITY, DISTRICT, STREET, HOUSE_NUMB,INDEX_)VALUES
('Ukraine','Kiyvsky','Kiyv','Sviatoshinsky', 'Gitomerskaya', 75, 65),
('Ukraine','Kiyvsky','Kiyv','Obolonsky', 'Obolon', 71, 46),
('Ukraine','Kiyvsky','Kiyv','Dniprovsky', 'Saburova', 10, 45),
('Ukraine','Kiyvsky','Kiyv','Goloseevsky', '40-richa', 15, 4);

INSERT INTO addresses (COUNTRY, REGION,
                       CITY, DISTRICT, STREET, HOUSE_NUMB,INDEX_)VALUES
('Ukraine','Kiyvsky','Kiyv','Shevchenkovsky', 'Olgicha', 1, 4);
