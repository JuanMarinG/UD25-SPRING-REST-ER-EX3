DROP TABLE IF EXISTS Almacenes;
DROP TABLE IF EXISTS Cajas;

Create table Almacenes (
id_Codigo int auto_increment primary key,
Lugar varchar(100),
Capacidad int
);

Create table Cajas (
id_Num_Ref char(5) primary key,
Contenido varchar (100),
Valor int,
Almacen int,
Foreign key (Almacen) references Almacenes(id_Codigo));

INSERT INTO Almacenes(Lugar, Capacidad) VALUES ('Valencia', 152000);
INSERT INTO Almacenes(Lugar, Capacidad) VALUES ('Castellon', 170000);
INSERT INTO Almacenes(Lugar, Capacidad) VALUES ('Alicante', 120000);

INSERT INTO Cajas (id_Num_Ref, Contenido, Valor, Almacen) VALUES ('CJ01','Procesadores', 750, 1);
INSERT INTO Cajas (id_Num_Ref, Contenido, Valor, Almacen) VALUES ('CJ02','Teclados', 150, 2);
INSERT INTO Cajas (id_Num_Ref, Contenido, Valor, Almacen) VALUES ('CJ03','Rams', 500, 3);