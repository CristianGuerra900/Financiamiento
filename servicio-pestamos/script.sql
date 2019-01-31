create database prestamos;

use prestamos;

create table socios
(
	id int auto_increment primary key,
    nombre varchar(20) not null,
    taza decimal(6,1) not null,
    monto_maximo_disponible decimal(20.2) not null
);


INSERT INTO socios (nombre, taza, monto_maximo_disponible) VALUES ('Andrés', '2.0', '7500000');
INSERT INTO socios (nombre, taza, monto_maximo_disponible) values ('Juan', '1.5', '5000000');
INSERT INTO socios (nombre, taza, monto_maximo_disponible) VALUES ('Maria', '1.2', '3000000');
