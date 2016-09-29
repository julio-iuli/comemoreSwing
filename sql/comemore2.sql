-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema comemore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema comemore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `comemore` DEFAULT CHARACTER SET utf8 ;
USE `comemore` ;

-- -----------------------------------------------------
-- Table `comemore`.`uf`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`uf` (
  `id` CHAR(2) NOT NULL,
  `nome` CHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`cidade` (
  `id` INT UNSIGNED NOT NULL,
  `nome` VARCHAR(60) NOT NULL,
  `iduf` CHAR(2) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cidade_uf1_idx` (`iduf` ASC),
  CONSTRAINT `fk_tb_cidade_tb_uf1`
    FOREIGN KEY (`iduf`)
    REFERENCES `comemore`.`uf` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 92
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`bairro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`bairro` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `idcidade` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_bairro_cidade1_idx` (`idcidade` ASC),
  CONSTRAINT `fk_tb_bairro_tb_cidade1`
    FOREIGN KEY (`idcidade`)
    REFERENCES `comemore`.`cidade` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 101
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`cargo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`cargo` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `salario` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`categoria` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`logradouro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`logradouro` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `cep` INT(8) UNSIGNED NULL,
  `idbairro` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `cep_UNIQUE` (`cep` ASC),
  INDEX `fk_logradouro_bairro1_idx` (`idbairro` ASC),
  CONSTRAINT `fk_tb_logradouro_tb_bairro1`
    FOREIGN KEY (`idbairro`)
    REFERENCES `comemore`.`bairro` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 101
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`cliente` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(80) NOT NULL,
  `resddd` TINYINT(2) UNSIGNED NULL DEFAULT NULL,
  `restel` INT(9) UNSIGNED NULL DEFAULT NULL,
  `celddd` TINYINT(2) UNSIGNED NULL DEFAULT NULL,
  `celtel` INT(9) UNSIGNED NULL DEFAULT NULL,
  `rg` INT(7) NULL DEFAULT NULL,
  `rgemissor` CHAR(2) NULL DEFAULT NULL,
  `cpf` BIGINT(11) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `cnpj` BIGINT(14) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `pfpj` TINYINT(1) NOT NULL,
  `email` VARCHAR(80) NULL DEFAULT NULL,
  `datanasc` DATE NULL DEFAULT NULL,
  `complemento` VARCHAR(20) NOT NULL,
  `idlogradouro` INT UNSIGNED NOT NULL,
  `recomendacaonome` VARCHAR(80) NULL DEFAULT NULL,
  `recomendacaodatanasc` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cliente_logradouro1_idx` (`idlogradouro` ASC),
  CONSTRAINT `fk_cliente_logradouro1`
    FOREIGN KEY (`idlogradouro`)
    REFERENCES `comemore`.`logradouro` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`funcionario` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(80) NOT NULL,
  `resddd` TINYINT(2) UNSIGNED NULL DEFAULT NULL,
  `restel` INT(9) UNSIGNED NULL DEFAULT NULL,
  `celddd` TINYINT(2) UNSIGNED NULL DEFAULT NULL,
  `celtel` INT(9) UNSIGNED NULL DEFAULT NULL,
  `rg` INT(7) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `rgemissor` CHAR(2) NULL DEFAULT NULL,
  `cpf` BIGINT(11) UNSIGNED ZEROFILL NOT NULL,
  `pis` BIGINT(11) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `datacontratacao` DATE NOT NULL,
  `email` VARCHAR(80) NULL DEFAULT NULL,
  `complemento` CHAR(8) NULL DEFAULT NULL,
  `idlogradouro` INT(10) UNSIGNED NOT NULL,
  `login` CHAR(8) NOT NULL,
  `senha` CHAR(8) NOT NULL,
  `tipoadm` TINYINT(1) NULL DEFAULT NULL,
  `idcargo` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC),
  UNIQUE INDEX `pis_UNIQUE` (`pis` ASC),
  INDEX `fk_funcionario_logradouro1_idx` (`idlogradouro` ASC),
  INDEX `fk_funcionario_cargo1_idx` (`idcargo` ASC),
  CONSTRAINT `fk_funcionario_cargo1`
    FOREIGN KEY (`idcargo`)
    REFERENCES `comemore`.`cargo` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_funcionario_logradouro1`
    FOREIGN KEY (`idlogradouro`)
    REFERENCES `comemore`.`logradouro` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`tema`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`tema` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(80) NOT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  `descricao` TEXT NULL DEFAULT NULL,
  `genero` CHAR(1) NOT NULL,
  `datacompra` DATE NULL DEFAULT NULL,
  `preco` DECIMAL(10,2) NOT NULL,
  `imgtema` VARCHAR(150) NULL DEFAULT NULL,
  `idcategoria` INT UNSIGNED NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tema_categoria1_idx` (`idcategoria` ASC),
  CONSTRAINT `fk_tema_categoria1`
    FOREIGN KEY (`idcategoria`)
    REFERENCES `comemore`.`categoria` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`item` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `tipo` VARCHAR(60) NOT NULL,
  `idtema` INT UNSIGNED NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_item_tema1_idx` (`idtema` ASC),
  CONSTRAINT `fk_item_tema1`
    FOREIGN KEY (`idtema`)
    REFERENCES `comemore`.`tema` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `comemore`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `comemore`.`pedido` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `datapedido` DATE NOT NULL,
  `dataentrega` DATETIME NOT NULL,
  `obspedido` TEXT NULL DEFAULT NULL,
  `complemento` VARCHAR(20) NOT NULL,
  `idlogradouro` INT UNSIGNED NOT NULL,
  `idcliente` INT UNSIGNED NOT NULL,
  `idfuncionario` INT UNSIGNED NOT NULL,
  `idtema` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_pedido_logradouro1_idx` (`idlogradouro` ASC),
  INDEX `fk_pedido_funcionario1_idx` (`idfuncionario` ASC),
  INDEX `fk_pedido_tema1_idx` (`idtema` ASC),
  INDEX `fk_pedido_cliente1_idx` (`idcliente` ASC),
  CONSTRAINT `fk_pedido_cliente1`
    FOREIGN KEY (`idcliente`)
    REFERENCES `comemore`.`cliente` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_pedido_funcionario1`
    FOREIGN KEY (`idfuncionario`)
    REFERENCES `comemore`.`funcionario` (`id`),
  CONSTRAINT `fk_pedido_logradouro1`
    FOREIGN KEY (`idlogradouro`)
    REFERENCES `comemore`.`logradouro` (`id`),
  CONSTRAINT `fk_pedido_tema1`
    FOREIGN KEY (`idtema`)
    REFERENCES `comemore`.`tema` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
