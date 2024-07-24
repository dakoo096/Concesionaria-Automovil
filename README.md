# Concesionaria-Automovil

Este proyecto,realizado en el curso de Programación Orientada a Objetos en Java de TodoCode, es una aplicación de escritorio desarrollada en Java para la gestión de una concesionaria de autos. Utiliza el modelo de capas, separando la interfaz gráfica de usuario (IGU), la lógica de negocio y la persistencia de datos para mantener un código modular y fácil de mantener.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Swing**: Biblioteca gráfica utilizada para crear la interfaz de usuario.
- **Modelo de capas**:
  - **IGU**: Maneja la interacción con el usuario y se implementa utilizando Swing.
  - **Lógica**: Contiene la lógica de negocio de la aplicación.
  - **Persistencia**: Maneja el almacenamiento y recuperación de datos.

## Funcionalidades

### Menú Principal

- **Agregar Automóvil**: Permite añadir un nuevo automóvil a la concesionaria.
- **Ver Automóviles**: Muestra una nueva ventana donde se pueden visualizar todos los automóviles cargados en una tabla.

### Ventana de Visualización de Automóviles

- **Tabla de Automóviles**: Muestra una lista de todos los automóviles con detalles relevantes.
- **Editar Automóvil**: Permite modificar la información de un automóvil existente.
- **Borrar Automóvil**: Permite eliminar un automóvil de la lista.

## Estructura del Proyecto

- **src**: Carpeta principal del código fuente.
  - **igu**: Contiene las clases relacionadas con la interfaz gráfica.
  - **logica**: Contiene las clases con la lógica de negocio.
  - **persistencia**: Contiene las clases para el manejo de la persistencia de datos.
