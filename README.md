## Proyecto Gestión de Catálogo (Frontend Android)

Aplicacion móvil con Android para el manejo de un catálogo de productos tecnologicos almacenados en una base de datos relacional SQL.

Este frontend realiza peticiones Restful a un microservicio encargado de gestionar con la base de datos dichas peticiones. A continuacion mostramos y explicamos todas las opciones que nos permite realizar en la base de datos desde nuestra aplicacion Android.

## Funcionamiento del Frontend
El usuario verá una pantalla principal donde debe seleccionar que función desea realizar sobre el catálogo.

## Petición Get
Aqui el usuario debe indicar el "id" del artículo para realizar la busqueda y que se muestre la información en caso de existir el artículo en la base de datos.

## Petición Post
Otra función es poder introducir un artículo nuevo. Para ello se requiere introducir la información completa del artículo y enviar la peticion.

## Petición Put
Tambien podemoslos modificar los campos de la base de datos de los artículos. En primer lugar indicamos el id del artículo a modificar para conocer el valor de todos los campos, y después basta con modificar el campo deseado y mandar la petición de modificación.

## Peticón Delete
En caso de que algun artículo no sea válido y salgo del catálogo por obsoleto podemos eliminarlo del mismo. Primero indicamos el artículo a través del "id", y una vez visto que es el artículo correcto podemoste proceder a la eliminacion.

## Mostrar catálogo completo
Una funcion bastante útil es poder ver el catálogo completo actual. Este se mostrará en una tabla y así podremos tener la información completa de forma general.
