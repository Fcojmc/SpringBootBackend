INSERT INTO users (first_name, last_name, email, password) VALUES ('Manolito', 'Menganito', 'yahoo@gmail.com', 'yahoorespuestas');
INSERT INTO users (first_name, last_name, email, password) VALUES ('Laurita', 'Pinganillo', 'yahoo2@gmail.com', 'yahoorespuestas2');
INSERT INTO employees (hire_date) VALUES('2020-01-20');
INSERT INTO employees (hire_date) VALUES('2020-01-22');
INSERT INTO absences (employee_id, type_of, description, start_date, end_date ) VALUES (1,'sapuestomalito','se rompio la cabeza', '2020-01-14', '2020-01-20');
INSERT INTO employee_project_periods(employee_id, project_id, start_date,end_date, dedication) VALUES(1,1,'2020-01-20', null, 50 );
INSERT INTO projects(name, description, start_date) VALUES ('El proyecto del zulo', 'Una aplicacion fullstack con tecnologias de las cuales no sabia y ahora entiendo un 10%', '2020-01-23');
INSERT INTO projects(name, description, start_date) VALUES ('Chicles Mercadona', 'La aplicación web de los Chicles del Mercadona', '2020-01-02');