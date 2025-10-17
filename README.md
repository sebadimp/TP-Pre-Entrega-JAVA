# 🧁 Pre Entrega TP Talento Tech

Aplicación de consola desarrollada en **Java** (utilizando **IntelliJ IDEA**) que simula la gestión de una **pastelería**, permitiendo administrar productos y pedidos a través de un menú interactivo.

---

## 🚀 Funcionalidad

El sistema permite realizar operaciones básicas sobre los productos y pedidos mediante un menú CRUD (Crear, Leer, Actualizar, Eliminar):

### 🧩 Menú principal
1) Agregar producto

2) Listar productos

3) Buscar / Actualizar producto

4) Eliminar producto

5) Crear pedido

6) Listar pedidos

0) Salir


Cada opción permite gestionar la información desde consola de manera validada, evitando errores comunes como entradas vacías o valores inválidos.

---

## 🏗️ Estructura del proyecto

- **Principal** → Contiene el método `main`, punto de inicio del programa.
- **Menu** → Muestra el menú principal y los mensajes de inicio/fin.
- **OperacionesMenu** → Implementa las operaciones del CRUD y la lógica del negocio.
- **Producto** → Representa un producto de la pastelería, con ID autoincremental, nombre, categoría, precio y stock.
- **Pedido** → Contiene una lista de productos seleccionados por el cliente.
- **LineaPedido** → Representa cada ítem dentro de un pedido.

---

## ⚙️ Ejecución

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en **IntelliJ IDEA** (o cualquier IDE compatible con Java 17+).
3. Ejecutar la clase `Principal.java`.
4. Seguir las instrucciones del menú desde la consola.

---



