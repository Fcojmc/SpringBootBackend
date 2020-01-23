INSERT INTO users (first_name, last_name, email, password) VALUES ('Manolito', 'Menganito', 'yahoo@gmail.com', 'yahoorespuestas');
INSERT INTO users (first_name, last_name, email, password) VALUES ('Laurita', 'Pinganillo', 'yahoo2@gmail.com', 'yahoorespuestas2');
INSERT INTO employees (hire_date) VALUES('2020-01-20');
INSERT INTO employees (hire_date) VALUES('2020-01-22');
INSERT INTO absences (employee_id, type_of, description, start_date, end_date ) VALUES (1,'sapuestomalito','se rompio la cabeza', '2020-01-14', '2020-01-20');
INSERT INTO employee_project_periods(employee_id, project_id, start_date,end_date, dedication) VALUES(1,2,'2020-01-20', null, 50 );