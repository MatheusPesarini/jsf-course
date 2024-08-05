insert into ramo_atividade (id, descricao) values (1, 'Alimentação');
insert into ramo_atividade (id, descricao) values (2, 'Telecomunicações');
insert into ramo_atividade (id, descricao) values (3, 'Vestuário');
insert into ramo_atividade (id, descricao) values (4, 'Lavanderia');
insert into ramo_atividade (id, descricao) values (5, 'Gráfica');
insert into ramo_atividade (id, descricao) values (6, 'Meccânica');
insert into ramo_atividade (id, descricao) values (7, 'Turismo');
insert into ramo_atividade (id, descricao) values (8, 'Saúde');
insert into ramo_atividade (id, descricao) values (9, 'Educação');
insert into ramo_atividade (id, descricao) values (10, 'Lazer');

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (1, '70.311.193/0001-87', 'Mercado', 'Mercado Ltda', 'Matriz', '2020-01-01', 1);
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (2, '70.311.193/0002-68', 'Loja de Roupas', 'Loja de Roupas Ltda', 'Filial', '2020-02-01', 2);
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (3, '70.311.193/0003-40', 'Lavanderia', 'Lavanderia Ltda', 'Matriz', '2020-03-01', 3);
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (4, '70.311.193/0004-21', 'Gráfica', 'Gráfica Ltda', 'Filial', '2020-04-01', 4);