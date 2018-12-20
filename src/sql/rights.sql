CREATE  TABLE mydb.rights
(
ID BIGINT NOT NULL AUTO_INCREMENT,
NAME VARCHAR (50),
PRIMARY KEY (ID)
);

INSERT INTO mydb.rights (NAME) VALUES
('Vasily Petrovich'),
('Natalia Ivanovna'),
('Arkady Semenovich'),
('Tatyana Sergeevna'),
('Vitaly Antonovich'),
('Svetlana Evgenevna');