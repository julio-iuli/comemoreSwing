insert into uf (id, nome) values 
("AC", "Acre"), 
("AL", "Alagoas"),
("AP", "Amapá"),
("AM", "Amazônia"),
("BA", "Bahia"),
("CE", "Ceará"),
("DF", "Distrito Federal"),
("ES", "Espírito Santo"),
("GO", "Goiás"),
("MA", "Maranhão"),
("MT", "Mato Grosso"),
("MS", "Mato Grosso do Sul"),
("MG", "Minas Gerais"),
("PA", "Pará"),
("PB", "Pernambuco"),
("PR", "Paraná"),
("PI", "Piauí"),
("RJ", "Rio de Janeiro"),
("RN", "Rio Grande do Norte"),
("RS", "Rio Grande do Sul"),
("RO", "Rondônia"),
("RR", "Roraima"),
("SC", "Santa Catarina"),
("SP", "São Paulo"),
("SE", "Sergipe"),
("TO", "Tocantins");

set @id_pa = 'PA';
INSERT INTO cidade (id, nome, iduf) VALUES
(1,'Belém', @id_pa),
(2,'Ananindeua', @id_pa),
(3,'Santarém', @id_pa),
(4, 'Marabá', @id_pa),
(5, 'Parauapebas', @id_pa),
(6, 'Castanhal', @id_pa),
(7, 'Abaetetuba', @id_pa),
(8, 'Cametá', @id_pa),
(9, 'Marituba', @id_pa),
(10, 'Bragança', @id_pa);

SET @id := 1; -- Belém
INSERT INTO bairro (id, nome, idcidade) VALUES
(1,'Guamá', @id),
(2, 'Pedreira', @id),
(3, 'Marambaia', @id),
(4, 'Tapanã', @id),
(5, 'Marco', @id),
(6, 'Jurunas', @id),
(7, 'Montese', @id),
(8, 'Coqueiro', @id),
(9, 'Sacramenta', @id),
(10, 'Telégrafo', @id);

SET @id := 1; -- Guamá
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(1, 'Passagem Guamá', 66065335, @id),
(2, 'Rua da Salvação', 66079050, @id),
(3, 'Avenida José Bonifácio', 66065362, @id),
(4, 'Avenida Perimetral', 66075750, @id),
(5, 'Vila Silva Castro', 66075010, @id),
(6, 'Alameda Mamoré', 66075425, @id),
(7, 'Conjunto Mauro Porto', 66073390, @id),
(8, 'Passagem da Paz', 66073440, @id),
(9, 'Travessa Guerra Passos', 66073250, @id),
(10, 'Conjunto Aron', 66075865, @id);

SET @id := 'RS';
INSERT INTO cidade (id, nome, iduf) VALUES
(11, 'Porto Alegre', @id),
(12, 'Caxias do Sul', @id),
(13, 'Pelotas', @id),
(14, 'Canoas', @id),
(15, 'Santa Maria', @id),
(16, 'Gravataí', @id),
(17, 'Viamão', @id),
(18, 'Novo Hamburgo', @id),
(19, 'São Leopoldo', @id),
(20, 'Rio Grande', @id);

SET @id := 11; -- (Porto Alegre)
INSERT INTO bairro (id, nome, idcidade) VALUES
(11, 'Rubem Berta', @id),
(12, 'Sarandi', @id),
(13, 'Restinga', @id),
(14, 'Lomba de Pinheiro', @id),
(15, 'Partenon', @id),
(16, 'Santa Teresa', @id),
(17, 'Centro Histórico', @id),
(18, 'Petrópolis', @id),
(19, 'Vila nova', @id),
(20, 'Jardim Itu-sabará', @id);

SET @id := 11; -- (Rubem Berta)
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(11, 'Travessa Jordão', 91170700, @id),
(12, 'Rua Vinte e Cinco', 91170440, @id),
(13, 'Rua Umbertina Gonçalves', 91170750, @id),
(14, 'Rua Sagitário', 91150310, @id),
(15, 'Rua Rufino Antonio Monteiro', 91150311, @id),
(16, 'Rua S', 91160520, @id),
(17, 'Praça Tom Jobim', 91150035, @id),
(18, 'Estrada Martim Félix Berta', 91270650, @id),
(19, 'Beco da Servidão', 91250270, @id),
(20, 'Avenida Homero Guerreiro', 91150030, @id);

set @id_pr := 'PR'; -- Paraná
INSERT INTO cidade (id, nome, iduf) VALUES
(21, 'Abatiá', @id_pr),
(22, 'Atalaia', @id_pr),
(23, 'Balsa Nova', @id_pr),
(24, 'Brasilândia do Sul', @id_pr),
(25, 'Cafeara', @id_pr),
(26, 'Curitiba', @id_pr),
(27, 'Enéas Marques', @id_pr),
(28, 'Engenheiro Beltrão', @id_pr),
(29, 'Figueira', @id_pr),
(30, 'Flórida', @id_pr);

-- Bairro (CURITIBA)

SET @id :=26;
INSERT INTO bairro (id, nome, idcidade) VALUES
(21,'1º de Setembro', @id),
(22,'Aberta Morros', @id),
(23,'Abranches', @id),
(24,'Água Branca', @id),
(25,'Boa Vista', @id),
(26,'Barreirinha', @id),
(27,'Cerqueira Cezar', @id),
(28,'Jabaquara', @id),
(29,'Ibirapuera', @id),
(30,'Thomaz Coelho', @id);

-- Logradouros (CURITIBA)
 
SET @id :=28; -- Jabaquara
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(21,'Rua Americo Ribeiro',81050650, @id),
(22,'Avenida Marechal Dutra ',81460286, @id),
(23,'Praça da Cultura ',81230220, @id),
(24,'Rua Moacir Nogueira,145 a 190',81530300, @id),
(25,'Rua da Consolação ',81490050, @id),
(26,'Avenida Martins Pacheco',82315094, @id),
(27,'Estação Central',81580370, @id),
(28,'Avenida Ademar de Souza ',82630420, @id),
(29,'Rua Pinheiro de Souza',82115272, @id),
(30,'Avenida Aricajá',81480404, @id);

SET @id_rj := 'RJ'; -- RIO DE JANEIRO
INSERT INTO cidade (id, nome, iduf) VALUES
(31, 'Rio de Janeiro', @id_rj),
(32, 'Cabo Frio', @id_rj),
(33, 'Niterói', @id_rj),
(34, 'Angra dos Reis', @id_rj),
(35, 'Barbosa', @id_rj),
(36, 'Salgueiro', @id_rj),
(37, 'Cambuci', @id_rj),
(38, 'Itaipava', @id_rj),
(39, 'Laranjal', @id_rj),
(40, 'Duque de Caxias', @id_rj);

-- Bairros (Rio de Janeiro)

SET @id := 31;
INSERT INTO bairro (id, nome, idcidade) VALUES
(31, '25 de Agosto', @id),
(32, '300', @id),
(33, 'Bangu', @id),
(34, 'Belford Roxo', @id),
(35, 'Botafogo', @id),
(36, 'Flamengo', @id),
(37, 'Consolação', @id),
(38, 'Gávea', @id),
(39, 'Recreio dos Banderantes', @id),
(40, 'Bom Sucesso', @id);

-- Logradouros -- (Rio de Janeiro)
 
SET @id := 36; -- Flamengo
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(31, 'Praia do Flamengo de 195/196 ao fim',23850220, @id),
(32, 'Rua Ferreira Viana',27970410, @id),
(33, 'Praça Luís de Camões Glória',25907120, @id),
(34, 'Rua Almirante Tamandaré',21825435, @id),
(35, 'Rua Ferreira Viana',21864221, @id),
(36, 'Parque Carlos Lacerda',21012255, @id),
(37, 'Ladeira do Russel',20931675, @id),
(38, 'Pedro Maquenzie',28920100, @id),
(39, 'Ladeira do Abel',22793381, @id),
(40, 'Avenida Central',22793380, @id);

set @id_sp := 'SP';
INSERT INTO cidade (id, nome, iduf) VALUES
(41, 'São Caetano', @id_sp),
(42, 'Avaré', @id_sp),
(43, 'Riberão Preto', @id_sp),
(44, 'Sumaré', @id_sp),
(45, 'Guarulhoss', @id_sp),
(46, 'Campinas', @id_sp),
(47, 'Sorocaba', @id_sp),
(48, 'Jundiaí', @id_sp),
(49, 'Araraquara', @id_sp),
(50, 'Mogi', @id_sp);


-- Bairros (São Paulo)

SET @id := 45; -- Guarulhos
INSERT INTO bairro (id, nome, idcidade) VALUES
(41, 'Pimentas', @id),
(42, 'Sucesso', @id),
(43, 'Taboão', @id),
(44, 'Presidente Dutra', @id),
(45, 'Bananal', @id),
(46, 'Macedo', @id),
(47, 'Cocaia', @id),
(48, 'Itapegica', @id),
(49, 'Vila Barros', @id),
(50, 'Grampola', @id);


-- Logradouros -- (Guarulhus)
 
SET @id := 49; -- Vila Barros
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(41, 'Praça Anita',07194380, @id),
(42, 'Rua Anita Garibaldi',07123190, @id),
(43, 'Rua Anjicos Júnior',07252190, @id),
(44, 'Rua Anna Muggiasco Marcondes',07272550, @id),
(45, 'Avenida Anna Rodrigues de Carvalho',07075220, @id),
(46, 'Rua Annunciato Thomeu',07082560, @id),
(47, 'Avenida Annunciato Thomeu',07224280, @id),
(48, 'Passagem Ano Bom',07020300, @id),
(49, 'Viela Anofi',07240011, @id),
(50, 'Viela Antas',07170031, @id);

set @id_pa = 'CE';
INSERT INTO cidade (id, nome, iduf) VALUES
(51,'Fortaleza', @id_pa),
(52,'Juazeiro do Norte', @id_pa),
(53,'Caucaia', @id_pa),
(54, 'Maracanaú', @id_pa),
(55, 'Sobral', @id_pa),
(56, 'Crato', @id_pa),
(57, 'Itapipoca', @id_pa),
(58, 'Maranguape', @id_pa),
(59, 'Iguatu', @id_pa),
(60, 'Quixadá', @id_pa);

SET @id := 51; -- Fortaleza
INSERT INTO bairro (id, nome, idcidade) VALUES
(51,'Mondubim', @id),
(52, 'Barra de Ceará', @id),
(53, 'Vila Velha', @id),
(54, 'Granja Lisboa', @id),
(55, 'Passaré', @id),
(56, 'Jangurussu', @id),
(57, 'Quintino Cunha', @id),
(58, 'Vicente Pinzon', @id),
(59, 'Pici(parque Univesitário)', @id),
(60, 'Aldeota', @id);

SET @id := 51; -- Mondubim
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(51, 'Alameda Verde 01', 60752180, @id),
(52, 'Avenida 1', 60752310, @id),
(53, 'Praça São Judas Tadeu', 60711490, @id),
(54, 'Rua 10', 60752400, @id),
(55, 'Vila Risoneide', 60761450, @id),
(56, 'Vila Serrano', 60711450, @id),
(57, 'Via Coletora A', 60768010, @id),
(58, 'Travessa Vitalino', 60763260, @id),
(59, 'Rua Wagner Marinho', 60766200, @id),
(60, 'Rua Uirapuru', 60711790, @id);

set @id_pa = 'MG'; -- Minas Gerais
INSERT INTO cidade (id, nome, iduf) VALUES
(61,'Belo Horizonte', @id_pa),
(62,'Uberlândia', @id_pa),
(63,'Contagem', @id_pa),
(64, 'Juiz de Fora', @id_pa),
(65, 'Betim', @id_pa),
(66, 'Montes Claros', @id_pa),
(67, 'Ribeirão das Neves', @id_pa),
(68, 'Uberaba', @id_pa),
(69, 'Governador Valadares', @id_pa),
(70, 'Ipatinga', @id_pa);

SET @id := 61; -- Belo Horizonte
INSERT INTO bairro (id, nome, idcidade) VALUES
(61,'Sagrada Família', @id),
(62, 'Buritis', @id),
(63, 'Padre Eustáquio', @id),
(64, 'Lindéia', @id),
(65, 'Santa Mônica', @id),
(66, 'Céu Azul', @id),
(67, 'Santa Cruz', @id),
(68, 'Santo Antônio', @id),
(69, 'Alto Vera Cruz', @id),
(70, 'Jardim dos Comerciários', @id);

SET @id := 61; -- Sagrada Família
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(61, 'Praça Euclydes josé Correia', 31030325, @id),
(62, 'Praça Nilo Peçanha', 31030270, @id),
(63, 'Rua Abílio Machado', 31030390, @id),
(64, 'Rua Carolina Guedes', 31035130, @id),
(65, 'Rua Joaquim Felício', 31030200, @id),
(66, 'Rua Volta Grande', 31003340, @id),
(67, 'Rua São Bento', 31035060, @id),
(68, 'Rua Petrolina', 31030370, @id),
(69, 'Rua Geraldo Menezes Soares', 31030440, @id),
(70, 'Rua Diametral', 31030350, @id);

set @id_go := 'GO';
INSERT INTO cidade (id, nome, iduf) VALUES
(71,'Goiânia', @id_go),
(72,'Caldas Novas', @id_go),
(73,'Anápolis', @id_go),
(74,'Cidade Ocidental', @id_go),
(75,'Cristalina', @id_go),
(76,'Rio Verde', @id_go),
(77,'Formosa', @id_go),
(78,'Catalão', @id_go),
(79,'Jaraguá', @id_go),
(80,'Niquelândia', @id_go);

-- Bairros (Goiânia)

SET @id := 71; -- Goiânia
INSERT INTO bairro (id, nome, idcidade) VALUES
(71, 'Aeroporto', @id),
(72, 'Nova Villa', @id),
(73, 'Norte Ferroviário', @id),
(74, 'Jardim Pompéia', @id),
(75, 'Shamgrilá', @id),
(76, 'Vale dos Sonhos', @id),
(77, 'Asa Branca', @id),
(78, 'Alice Barbosa', @id),
(79, 'Jardim Diamantina ', @id),
(80, 'Perím', @id);

-- Logradouros -- ()
 
SET @id := 74;
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(71, 'Rua da Liberdade',74703210, @id),
(72, 'Avenida Central',74465100, @id),
(73, 'Avenida César Lattes',74363400, @id),
(74, 'Avenida Minas Gerais',74510040, @id),
(75, 'Rua José Hermano',74515030, @id),
(76, 'Avenida Vera Cruz',74675830, @id),
(77, 'Avenida Honestino Guimarães',74510020, @id),
(78, 'Avenida Genésio de Lima Brito - de 4447/4448 ao fim',74593210, @id),
(79, 'Avenida São Paulo  ',74160010, @id),
(80, 'Avenida do Povo ',74440010, @id);

set @id_es := 'ES';
INSERT INTO cidade (id, nome,iduf) VALUES
(81, 'Afonso Cláudio', @id_es),
(82, 'Anchieta', @id_es),
(83, 'Colatina', @id_es),
(84, 'Itaguaçu', @id_es),
(85, 'Linhares', @id_es),
(86, 'Santa Teresa', @id_es),
(87, 'Vila Valério', @id_es),
(88, 'Vila Velha', @id_es),
(89, 'Laranja da Terra', @id_es),
(90, 'Guarapari', @id_es);

-- Bairros (Vila Velha)

SET @id := 88;
INSERT INTO bairro (id, nome, idcidade) VALUES
(81, 'Paul', @id),
(82, 'Divino Espírito Santo', @id),
(83, 'Riviera da Barra', @id),
(84, 'Morada do Sol', @id),
(85, 'Morro da Lagoa', @id),
(86, 'Santos Dumont', @id),
(87, 'Residencial Coqueiral', @id),
(88, 'Ataíde', @id),
(89, 'Praia das Gaivotas ', @id),
(90, 'Barra do Jucu', @id);

-- Logradouros (Vila Velha)
 
SET @id := 81;
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(81, 'Rua Anita Garibaldi',29115280, @id),
(82, 'Praça Anita Malfati',29129742 , @id),
(83, 'Rua Aniz Oliveira Santos',29109520, @id),
(84, 'Travessa Annor da Silva',29102606, @id),
(85, 'Rua Ano Novo',29119020, @id),
(86, 'Vila Anselmo',60347290, @id),
(87, 'Rua Antenor Braga',29102574, @id),
(88, 'Praça Antenor Fassarela',29115015, @id),
(89, 'Escadaria Antenor Gomes',29114026 , @id),
(90, 'Rua Antenor Pinto Carneiro',29125120 , @id);


-- Distrito Federal - Atenção
set @id_pa = 'DF';
INSERT INTO cidade (id, nome, iduf) VALUES
(91,'Brasília', @id_pa);

SET @id := 91; -- Brasília
INSERT INTO bairro (id, nome, idcidade) VALUES
(91,'Asa Sul', @id),
(92, 'Asa Norte', @id),
(93, 'Ceilândia Norte', @id),
(94, 'Ceilândia Sul', @id),
(95, 'Setor Sudoeste', @id),
(96, 'Cruzeiro Velho', @id),
(97, 'Cruzeiro Novo', @id),
(98, 'Gama Leste', @id),
(99, 'Sobradinho I', @id),
(100, 'Lago Sul', @id);

SET @id := 91; -- Asa Sul
INSERT INTO logradouro (id, nome, cep, idbairro) VALUES
(91, 'SQS 304 Bloco A', 70337010, @id),
(92, 'SQS 304 Bloco B', 70337020, @id),
(93, 'SQS 304 Bloco C', 70337030, @id),
(94, 'SQS 304 Bloco D', 70337040, @id),
(95, 'SQS 304 Bloco E', 70337050, @id),
(96, 'SQS 304 Bloco F', 70337060, @id),
(97, 'SQS 304 Bloco G', 70337070, @id),
(98, 'SQS 304 Bloco H', 70337080, @id),
(99, 'SQS 304 Bloco I', 70337090, @id),
(100, 'SQS 304 Bloco J', 70337100, @id);
