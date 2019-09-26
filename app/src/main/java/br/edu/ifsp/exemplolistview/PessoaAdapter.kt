package br.edu.ifsp.exemplolistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PessoaAdapter(val contexto: Context,
                    val leiaute: Int,
                    val lista: MutableList<Pessoa>): ArrayAdapter<Pessoa>(contexto, leiaute, lista) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view: View? = convertView

        if (view == null) {
            //Inflar um leiaout antes de preencher
            val layoutInflater = contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            view = layoutInflater.inflate(leiaute, parent, false)
        }

        val nomeTv = view?.findViewById<TextView>(R.id.nomeTv)
        val idateTv = view?.findViewById<TextView>(R.id.idadeTv)

        val pessoa: Pessoa = lista[position]
        nomeTv?.text = pessoa.nome
        idateTv?.text = pessoa.idade.toString()

        return view?:super.getView(position, convertView, parent)
    }
}
