-- Script para crear la tabla de usuarios
CREATE TABLE usuarios (
    id_usuario SERIAL PRIMARY KEY,
    usuario VARCHAR(50) UNIQUE NOT NULL, 
    clave VARCHAR(255) NOT NULL,
    nombres VARCHAR(100),
    nivel INT
);

-- Datos de prueba para el login (admin/123)
INSERT INTO usuarios (usuario, clave, nombres, nivel) 
VALUES ('admin', '123', 'Administrador', 1);