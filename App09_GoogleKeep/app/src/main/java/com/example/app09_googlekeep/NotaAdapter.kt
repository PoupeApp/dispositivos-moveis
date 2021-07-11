package com.example.app09_googlekeep

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import java.net.URI

class NotaAdapter(var listaNotas: MutableList<Nota>):RecyclerView.Adapter<NotaAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgFoto: ImageView = view.findViewById(R.id.imgFoto)
        val txtTitulo: TextView = view.findViewById(R.id.txtTitulo)
        val txtConteudo: TextView = view.findViewById(R.id.txtConteudo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_nota, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        listaNotas[position].foto?.let{
            holder.imgFoto.setImageDrawable(it)
        }
        holder.txtTitulo.text = listaNotas[position].titulo
        holder.txtConteudo.text = listaNotas[position].conteudo

    }

    override fun getItemCount(): Int {
        return listaNotas.size
    }
}