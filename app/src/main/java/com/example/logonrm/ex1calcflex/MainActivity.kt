package com.example.logonrm.ex1calcflex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    BtResultado.setOnClickListener() {
        val alcool = alcoolText.text.toString().toDouble()
        val gasolina = gasolinaText.text.toString().toDouble()
        var resultado = alcool / gasolina
        resultadotv.text = resultado.toString()

        if(resultado < 0.7){
            condicaoTv.text = "Abasteça com Álcool"
         }else{
            condicaoTv.text = "Abasteça com Gasolina"
            }

        }

    }


}
