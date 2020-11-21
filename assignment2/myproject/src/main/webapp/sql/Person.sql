CREATE SCHEMA CZ3002;

CREATE  TABLE CZ3002.person (
  id INT NOT NULL ,
  name VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id) ,
  UNIQUE(name));

INSERT INTO CZ3002.person VALUES (1, 'adrian', 'secret');