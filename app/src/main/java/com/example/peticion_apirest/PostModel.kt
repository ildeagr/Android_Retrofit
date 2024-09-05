package com.example.peticion_apirest

import com.google.gson.annotations.SerializedName

data class PostModel (
    //Entidad reflejo de la base de datos
    @SerializedName("id")
    var Id: Long,
    @SerializedName("nombre")
    var Nombre: String,
    @SerializedName("precio")
    var Precio: Long,
    @SerializedName("articulo")
    var Articulo: String
)