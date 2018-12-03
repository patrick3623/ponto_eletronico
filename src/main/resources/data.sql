--begin user table initialization
INSERT INTO user (id, name, email, password) VALUES ('1', 'Patrick Ferro Ribeiro', 'patrick@teste.com', '123456');
INSERT INTO user (id, name, email, password) VALUES ('2', 'Pedro Paulo', 'pedro@teste.com', '123456');
INSERT INTO user (id, name, email, password) VALUES ('3', 'João da Silva', 'joao@teste.com', '123456');
INSERT INTO user (id, name, email, password) VALUES ('4', 'Roberto Augusto', 'roberto@teste.com', '123456');
--begin acess table initialization
INSERT INTO acess (id, name, level) VALUES ('1', 'Administrador', '2');
INSERT INTO acess (id, name, level) VALUES ('2', 'Supervisor', '1');
INSERT INTO acess (id, name, level) VALUES ('3', 'Usuário', '0');
--begin record table initialization
INSERT INTO record (id, date, note, id_user) VALUES ('1', '2018-12-12T12:12', 'Lorem Ipsum is simply dummy text.', '4');
INSERT INTO record (id, date, note, id_user) VALUES ('2', '2018-12-12T12:12', 'Lorem Ipsum is simply dummy text.', '4');
INSERT INTO record (id, date, note, id_user) VALUES ('3', '2018-12-12T12:12', 'Lorem Ipsum is simply dummy text.', '4');
INSERT INTO record (id, date, note, id_user) VALUES ('4', '2018-12-12T12:12', 'Lorem Ipsum is simply dummy text.', '4');
INSERT INTO record (id, date, note, id_user) VALUES ('5', '2018-12-12T12:12', 'Lorem Ipsum is simply dummy text.', '4');
INSERT INTO record (id, date, note, id_user) VALUES ('6', '2018-12-12T12:12', 'Lorem Ipsum is simply dummy text.', '4');
