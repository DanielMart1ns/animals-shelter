--Inserção de dados ao de forma automática para fins de testes no nosso sistema

--Animais
Insert into animal (tipo ,nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte)
values ('Papagaio', 'Kiko', '4', 'Australiano', current_date - 5, 'Falador', 'Cleber', 'Adulto');

Insert into animal (tipo ,nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, data_adocao)
values ('Iguana', 'Jamile', '2', 'Iguana das montanhas', current_date - 10, 'Bonita', 'Cleber', 'Jovem', current_date);

--Cachorros
INSERT INTO animal (tipo ,nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte)
VALUES ('Cachorro', 'Buzz', 5, 'Labrador', current_date - 10, 'Bem velinho', 'Renato', 'Grande');

INSERT INTO animal (tipo,nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte)
VALUES ('Cachorro', 'Woody', 5, 'SRD', current_date, 'Pulguento', 'Cleber', 'Pequeno');

INSERT INTO animal (tipo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, data_adocao)
VALUES ('Cachorro', 'Totó', 2, 'Pincher', current_date, '50% tremedeira, 50% ódio', 'Giovanna', 'Pequeno', current_date);

--Gatos
INSERT INTO animal (tipo ,nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte, data_adocao)
VALUES ('Gato', 'Frajola', 2, 'SRD', current_date, 'Bem cuidado', 'Giovanna', 'Médio', current_date + 3);

INSERT INTO animal (tipo ,nome_provisorio, idade_estimada, raca, data_entrada, condicoes_de_chegada, nome_recebedor, porte)
VALUES ('Gato', 'Nina', 2, 'Siamês', current_date, 'Agitada', 'Giovanna', 'Médio');