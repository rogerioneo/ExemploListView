package br.edu.ifsp.exemplolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val listaItens = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criando uma lista para usar como data
        for(i in 1..50) {
            listaItens.add("Item: ${i}")
        }

        //Instanciando um ArrayAdapter
        val adapter: ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listaItens)

        itensLv.adapter = adapter

    }
}
