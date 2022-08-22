DROP TABLE IF EXISTS Almacenes;
DROP TABLE IF EXISTS Cajas;

Create table Almacenes (
idCodigo int auto_increment primary key,
Lugar varchar(100),
Capacidad int
);

Create table Cajas (
idNumRef char(5) auto_increment primary key,
Contenido varchar (100),
Valor int,
Almacen int,
Foreign key (Almacen) references Almacenes(idCodigo));

INSERT INTO Almacenes(Lugar, Capacidad) VALUES ('Valencia', 152000);
INSERT INTO Almacenes(Lugar, Capacidad) VALUES ('Castellon', 170000);
INSERT INTO Almacenes(Lugar, Capacidad) VALUES ('Alicante', 120000);

INSERT INTO Cajas (Contenido, Valor, Almacen) VALUES ('Procesadores', 750, 1);
INSERT INTO Cajas (Contenido, Valor, Almacen) VALUES ('Teclados', 150, 2);
INSERT INTO Cajas (Contenido, Valor, Almacen) VALUES ('Rams', 500, 3);