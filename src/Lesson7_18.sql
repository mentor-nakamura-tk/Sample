CREATE DATABASE kadaidb default character set utf8;

CREATE TABLE kadaidb.person (
    id INT(11) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name VARCHAR(50),
    age INT(11)
);

INSERT INTO kadaidb.person (name, age) VALUES("takumi-nakamura", 30);