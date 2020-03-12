CREATE TABLE Endereco (
  id integer constraint pk_id_endereco PRIMAREY KEY,
  Rua varchar(100), 
  Numero integer,
  Bairro varchar(50),
  Cidade varchar(100)
);


CREATE TABLE Empresa (
  id integer constraint pk_id_empresa PRIMARY KEY,
  Nome varchar(160) not null,
  Nome_Fantasia varchar(100) not null,
  CNPJ varchar(20) not null,
  Endereco integer, 
  FOREIGN KEY (Endereco) REFERENCES Endereco (id)
);


CREATE TABLE Cliente (
  id integer constraint pk_id_cliente PRIMARY KEY,
  Nome varchar(100),
  CFP varchar(14),
  Endereco integer,
  FOREIGN KEY (Endereco) REFERENCES Endereco (id)
);

Insert into Endereco values(1,'Sueli Luna Menelau',37,'Imbiribeira','Recife');
