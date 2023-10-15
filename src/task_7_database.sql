CREATE DATABASE IF NOT EXISTS task_7_database;
USE task_7_database;

CREATE TABLE IF NOT EXISTS animals (
    id INT PRIMARY KEY AUTO_INCREMENT,
    age INT,
    name VARCHAR(100),
    tail BOOLEAN
);

SELECT * FROM animals;
