INSERT INTO GENERO(NOMBRE) VALUES ('Accion');
INSERT INTO GENERO(NOMBRE) VALUES ('Comedia');
INSERT INTO GENERO(NOMBRE) VALUES ('Drama');
INSERT INTO GENERO(NOMBRE) VALUES ('Fantasia');
INSERT INTO GENERO(NOMBRE) VALUES ('Terror');

INSERT INTO ACTOR(NOMBRE, URL_IMAGE) VALUES ('Adam Sandler', 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Adam_Sandler_Cannes_2017.jpg/220px-Adam_Sandler_Cannes_2017.jpg');
INSERT INTO ACTOR(NOMBRE, URL_IMAGE) VALUES ('Miranda Cosgrove', 'https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Miranda_Cosgrove_NickRewind_2022.jpg/220px-Miranda_Cosgrove_NickRewind_2022.jpg');
INSERT INTO ACTOR(NOMBRE, URL_IMAGE) VALUES ('Chloë Grace Moretz', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Chloe_Moretz_2018_2.jpg/220px-Chloe_Moretz_2018_2.jpg');

INSERT INTO PELICULA(NOMBRE, GENERO_ID, FECHA_ESTRENO) VALUES ('Pelicula test', 1, '2022-01-01');
INSERT INTO PELICULA(NOMBRE, GENERO_ID, FECHA_ESTRENO) VALUES ('Pelicula test2', 2, '2022-01-01');
INSERT INTO PELICULA(NOMBRE, GENERO_ID, FECHA_ESTRENO) VALUES ('Pelicula test3', 3, '2022-01-01');
INSERT INTO PELICULA(NOMBRE, GENERO_ID, FECHA_ESTRENO) VALUES ('Pelicula test4', 4, '2022-01-01');
