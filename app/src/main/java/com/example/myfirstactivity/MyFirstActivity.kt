package com.example.myfirstactivity

import android.app.Activity
//import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

//import android.widget.Toast


class MyFirstActivity() : Activity()  {
    lateinit var tvContador:TextView
    lateinit var btnBoton:Button
    var contador=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_first)

        tvContador= findViewById(R.id.tvContador)
        btnBoton=findViewById(R.id.btnBoton)

        btnBoton.setOnClickListener {

            contador++
            tvContador.text=contador.toString()
            Toast.makeText(this, contador.toString(),Toast.LENGTH_LONG).show()
        }


    }
    override fun onResume() {
        super.onResume()
       /* Toast.makeText(  this, "Hola", Toast.LENGTH_LONG).show()

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com")
        startActivity(intent)*/

    }


}