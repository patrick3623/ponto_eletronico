--begin user table initialization
INSERT INTO user (id, name, email, password) VALUES ('1', 'Patrick Ferro Ribeiro', 'patrick@teste.com', '123456');
INSERT INTO user (id, name, email, password) VALUES ('2', 'Teste de Usuário', 'teste@teste.com', '123456');
--begin acess table initialization
INSERT INTO acess (id, name, level) VALUES ('1', 'Administrador', '2');
INSERT INTO acess (id, name, level) VALUES ('2', 'Supervisor', '1');
INSERT INTO acess (id, name, level) VALUES ('3', 'Usuário', '0');
