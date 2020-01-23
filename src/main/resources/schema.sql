DROP TABLE IF EXISTS employee_project_periods;
DROP TABLE IF EXISTS absences;
DROP TABLE  IF EXISTS employees;
DROP TABLE  IF EXISTS users;

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL UNIQUE,
	password VARCHAR(100) NOT NULL
);

CREATE TABLE employees (
	id SERIAL PRIMARY KEY,
	hire_date DATE DEFAULT CURRENT_DATE 
);

CREATE TABLE absences (
	id SERIAL PRIMARY KEY,
	employee_id INT REFERENCES employees(id),
	type_of VARCHAR(100) NOT NULL,
	description VARCHAR(500) NOT NULL,
	start_date DATE  DEFAULT CURRENT_DATE,
	end_date DATE DEFAULT CURRENT_DATE
);

CREATE TABLE employee_project_periods (
	id SERIAL PRIMARY KEY,
	employee_id INT REFERENCES employees(id) ,
	project_id INT,
	start_date DATE DEFAULT CURRENT_DATE,
	end_date DATE DEFAULT CURRENT_DATE,
	dedication INT NOT NULL
);

CREATE TABLE projects (
	id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	description VARCHAR(500) NOT NULL,
	start_date DATE DEFAULT CURRENT_DATE,
	end_date DATE DEFAULT CURRENT_DATE
);

CREATE TABLE skills(
	id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	description VARCHAR(500) NOT NULL
);

CREATE TABLE employees_projects (

)

