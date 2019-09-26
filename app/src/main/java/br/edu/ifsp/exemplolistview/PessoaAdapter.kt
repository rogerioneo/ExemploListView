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

            val holder = PessoaHolder()
            holder.nomeTextView = view?.findViewById<TextView>(R.id.nomeTv)
            holder.idadeTextView = view?.findViewById<TextView>(R.id.idadeTv)

            (view as View).setTag(holder)
        }

        var holder = view.getTag() as PessoaHolder

        val pessoa: Pessoa = lista[position]

        holder.nomeTextView?.text = pessoa.nome
        holder.idadeTextView?.text = pessoa.idade.toString()

        return view
    }

    private class PessoaHolder{
        var nomeTextView: TextView? = null
        var idadeTextView: TextView? = null
    }
}
