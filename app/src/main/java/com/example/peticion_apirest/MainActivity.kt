package com.example.peticion_apirest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    fun peticionget(view: View){
        startActivity(Intent(this, GetActivity::class.java))
    }

    fun peticionpost(view: View){
        startActivity(Intent(this, PostActivity::class.java))
    }

    fun peticionput(view: View){
        startActivity(Intent(this, PutActivity::class.java))
    }

    fun peticiondelete(view: View){
        startActivity(Intent(this, DeleteActivity::class.java))
    }

    fun peticiongetall(view: View){
        startActivity(Intent(this, GetAllActivity::class.java))
    }
}