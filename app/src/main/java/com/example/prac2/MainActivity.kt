package com.example.prac2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Darío Huallpa 10A
 * Práctica 2
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        estructuracontrol()

    }//Fin fun onCreate

    private fun estructuracontrol(){
        //Operadores relacionales
        // > Mayor que   ...   < Menor que
        // >= Mayor o igual que  ...  <= Menor o igual que
        // == Igual que   ...  != Diferente

        var num1 =  16
        var ciudad = "Guadalajara"
        //var num2 = 41

        if (num1 <= 10){
            println("$num1 es menor o igual que 10")
        }//Fin if
        else{
            println("$num1 es mayor que 10")
        }

        //When es como el switch
        when(num1){
            7, 8, 9, 10 -> {
                println("El valor está entre 7 y 10")
            }
            else -> {
                println("El valor no está entre 7 y 10")
            }
        }//Fin when num1

        when(ciudad){
            "Guadalajara", "Zapopan", "Tlajomulco" -> {
                println("Es de Jalisco")
            }
            else -> {
                println("No es de Jalisco")
            }
        }//Fin when ciudad

    }//Fin fun estructuracontrol
}//Fin class MainActivity