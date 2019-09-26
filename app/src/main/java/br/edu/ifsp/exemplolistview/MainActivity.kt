package br.edu.ifsp.exemplolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val listaPessoas = mutableListOf<Pessoa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criando uma lista para usar como data
        for(i in 1..50) {
            listaPessoas.add(Pessoa("Pessoa ${i}", i))
        }

        //Instanciando um ArrayAdapter
        val adapter: PessoaAdapter = PessoaAdapter(this,
            R.layout.item_layout,
            listaPessoas)

        itensLv.adapter = adapter

    }
}
