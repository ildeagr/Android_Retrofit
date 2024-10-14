package com.example.peticion_apirest

import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

interface PosApiService {
    //Definicion de los métodos

    //Devuelve todos los articulos en una lista
    @GET("listar")
    suspend fun getLista(): ArrayList<PostModel>

    //Listar el artículo con el número de id solicitado
    @GET("listar/{id}")
    suspend fun getarticulo(@Path("id") id: String): ArrayList<PostModel>

    //Listar el artículo con el número de id solicitado
    @DELETE("listar/{id}")
    suspend fun deletearticulo(@Path("id") id: String): ArrayList<PostModel>

}