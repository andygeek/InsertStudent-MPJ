# Insert Student

[<img src="https://img.shields.io/badge/Developer-AndyGeek-blue">](https://github.com/andygeek) [<img src="https://img.shields.io/badge/IDE-Spring%20Tool%20Suite-blueviolet">](https://github.com/andygeek?utf8=%E2%9C%93&tab=repositories&q=Spring+Tool+Suite&type=&language=) [<img src="https://img.shields.io/badge/Type-Maven%20Project-orange">](https://github.com/andygeek?utf8=%E2%9C%93&tab=repositories&q=Maven+Project&type=&language=) [<img src="https://img.shields.io/badge/Language-Java-brightgreen">](https://github.com/andygeek?utf8=%E2%9C%93&tab=repositories&q=&type=&language=java)

Insert Student is a very simple **Maven projec** that insert a element in mysql database. Was developed to practice in **JavaEE, Hibernete, Spring Tool Suite and MySQL**.

<div align="center"><img src="https://raw.githubusercontent.com/andygeek/InsertStudent-MPJ/master/demo.gif" width="750" height="450" align="middle"/></div>

## To execute you need

Create a database with the following script

````sql
CREATE DATABASE db_students;

USE db_students;

CREATE TABLE Students (
   id int NOT NULL AUTO_INCREMENT,
   name varchar(50) NOT NULL,
   age int NOT NULL,
   CONSTRAINT Students_pk PRIMARY KEY (id)
);
````

It is necessary to configure the file **hibernate.cfg.xml** this is on the path **src/main/resources** using password and username of your Mysql. Conveniently use MySQL Workbench.
