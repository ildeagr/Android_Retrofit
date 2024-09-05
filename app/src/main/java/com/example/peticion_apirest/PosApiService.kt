package com.example.peticion_apirest

import retrofit2.http.GET
import retrofit2.http.Path

interface PosApiService {
    //Definicion de los métodos
    @GET("listar")
    suspend fun getLista(): ArrayList<PostModel>

    @GET("listar/{id}")
    suspend fun getarticulo(@Path("id") id: String): ArrayList<PostModel>
}