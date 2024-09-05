package com.example.peticion_apirest

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {

    //Variable donde guardar la url base
    var urlBase ="http://127.0.0.1:8005/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initObjects()
    }

    private fun initObjects() {
        var tvmsg = findViewById<TextView>(R.id.tvmsg)
        tvmsg.setVisibility(View.INVISIBLE)
    }

    fun infoRecibida(view: View){
        mostrarInfo()
    }

    private fun mostrarInfo() {
        //Variables para el control de los TexView
        var tvnombre = findViewById<TextView>(R.id.tvnombre)
        var tvprecio = findViewById<TextView>(R.id.tvprecio)
        var tvarticulo = findViewById<TextView>(R.id.tvarticulo)
        var tvmsg = findViewById<TextView>(R.id.tvmsg)
        var etarticulo = findViewById<EditText>(R.id.etarticulo)
        tvmsg.setVisibility(View.INVISIBLE)

        //Construimos la url para retrofit
        var retrofit = Retrofit.Builder()
            .baseUrl(urlBase)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        //Creamos la variable con la urlbase más la interface donde consultar los métodos
        var apiService = retrofit.create(PosApiService::class.java)


        if(etarticulo.text.toString() != "") {

            lifecycleScope.launch {
                try {
                    var post = apiService.getarticulo(etarticulo.text.toString())
                    // Hacer algo con el post obtenido
                    //tvnombre.text = post.component1().toString()
                    tvnombre.text = "Nombre: + ${post[0]}"
                    tvprecio.text = "Precio: + ${post[1]}"
                    tvarticulo.text = "Articulo: + ${post[2]}"
                } catch (e: Exception) {
                    //Mensaje ya precargado en el Layout
                    //tvmsg.text = "Error de comunicacion"
                    tvmsg.setVisibility(View.VISIBLE)
                }
            }
        }else {
            //Mostramos error como un globo al lado del EditText
            etarticulo.error = "Introduce un número."
        }

    }
}