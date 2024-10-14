package com.example.peticion_apirest

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DeleteActivity : AppCompatActivity() {

    //Variable donde guardar la url base
    var urlBase = "http://127.0.0.1:8005/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_delete)
    }

    fun btget(view: View){
        showinfo()
    }
    private fun showinfo(){
        //Variables para el control de los TexView
        var tvid = findViewById<TextView>(R.id.tvid)
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


        if (etarticulo.text.toString() != "") {

            lifecycleScope.launch {
                try {
                    var get = apiService.getarticulo(etarticulo.text.toString())
                    // Muestra la info del artículo
                    tvid.text = "Id: + ${get[0]}"
                    tvnombre.text = "Nombre: + ${get[1]}"
                    tvprecio.text = "Precio: + ${get[2]}"
                    tvarticulo.text = "Artículo: + ${get[3]}"
                } catch (e: Exception) {
                    //Mensaje ya precargado en el Layout
                    //tvmsg.text = "Error de comunicacion"
                    tvmsg.setVisibility(View.VISIBLE)
                }
            }
        } else {
            //Mostramos error como un globo al lado del EditText
            etarticulo.error = "Introduce un número."
        }
    }


    fun btdelete(view: View){
        deleteId()
    }
    private fun deleteId() {
        //Variables para el control de los TexView
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

        if (etarticulo.text.toString() != "") {

            lifecycleScope.launch {
                try {
                    var get = apiService.deletearticulo(etarticulo.text.toString())
                    // Borra el artículo indicado

                } catch (e: Exception) {
                    //Mensaje ya precargado en el Layout
                    //tvmsg.text = "Error de comunicacion"
                    tvmsg.setVisibility(View.VISIBLE)
                }
            }
        } else {
            //Mostramos error como un globo al lado del EditText
            etarticulo.error = "Introduce un número."
        }

    }
}