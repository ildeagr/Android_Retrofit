# Proyecto Gestión de Catálogo (Frontend Android)

## Objetivo:
Desarrollar un aplicacion móvil con Android Studio para el manejo de un catálogo de productos tecnologicos almacenados en una base de datos relacional SQL. Este frontend realiza peticiones Restful a un microservicio encargado de gestionar con la base de datos dichas peticiones.

## Sobre mi participacion y Logros:
He desarrollado el frontend de forma integra, lo que me ha permitido:

1. Aprender el uso y configuración de las librerías Retrofit para las peticiones HTTP de la API Rest.
2. Aplicar y consolidar los conocimientos de Kotlin en Android.
3. Diseñar una interfaz simple e intuitiva para el usuario.

## Funcionamiento del Frontend
La aplicación inicia en una pantalla principal donde el usuario debe seleccionar que función desea realizar sobre el catálogo. Dependiendo de la opcion selecciónada, se inicia otra actividad donde se solicita la información necesaria para realizar la petición al microservicio.

<H3>Pantalla inicial</H3>

![Captura de pantalla 2024-10-18 a las 8 51 34](https://github.com/user-attachments/assets/a197b5cd-05b6-4dda-85fb-412e68f87499)

## Visualizar un artículo (Petición Get)
Aqui el usuario debe indicar el "id" del artículo para realizar la busqueda y que se muestre la información en caso de existir el artículo en la base de datos.

## Crear un artículo nuevo (Petición Post)
Otra función es poder introducir un artículo nuevo. Para ello se requiere introducir la información completa del artículo y enviar la peticion.

## Modificar un artículo existente (Petición Put)
Tambien podemoslos modificar los campos de la base de datos de los artículos. En primer lugar indicamos el id del artículo a modificar para conocer el valor de todos los campos, y después basta con modificar el campo deseado y mandar la petición de modificación.

## Eliminar un artículo (Peticón Delete)
En caso de que algun artículo no sea válido y salgo del catálogo por obsoleto podemos eliminarlo del mismo. Primero indicamos el artículo a través del "id", y una vez visto que es el artículo correcto podemoste proceder a la eliminacion.

## Mostrar catálogo completo
Una funcion bastante útil es poder ver el catálogo completo actual. Este se mostrará en una tabla y así podremos tener la información completa de forma general.
