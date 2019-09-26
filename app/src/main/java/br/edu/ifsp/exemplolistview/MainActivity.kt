package br.edu.ifsp.exemplolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val listaItens = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criando uma lista
        for(i in 1..50) {
            listaItens.add("Item: ${i}")
        }

    }
}
