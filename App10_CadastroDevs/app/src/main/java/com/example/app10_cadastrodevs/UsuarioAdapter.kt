package com.example.app10_cadastrodevs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UsuarioAdapter(var listaUsuario: MutableList<Usuario>, var context: Context):RecyclerView.Adapter<UsuarioAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgFoto: ImageView = view.findViewById(R.id.imvFoto)
        val txtNome: TextView = view.findViewById(R.id.edtNome)
        val txtStack: TextView = view.findViewById(R.id.rdgStack)
        val txtSenioridade: TextView = view.findViewById(R.id.spnSenioridade)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_cadastro, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        listaUsuario[position].foto?.let{
            holder.imgFoto.setImageBitmap(it)
        }
        holder.txtNome.text = listaUsuario[position].nome
        holder.txtStack.text = listaUsuario[position].stack.nome
        holder.txtSenioridade.text = listaUsuario[position].senioridade.nome

        holder.itemView.setOnClickListener(){
            var texto = if (listaUsuario[position].empregado) {
                "Dev na ativa!"
            }
            else
            {
                "Dev procurando job!"
            }

            Toast.makeText(context, texto, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listaUsuario.size
    }
}
