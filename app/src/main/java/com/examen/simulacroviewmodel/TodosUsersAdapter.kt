package com.examen.simulacroviewmodel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.examen.simulacroviewmodel.databinding.ItemUsuarioBinding

class TodosUsersAdapter(var personas: MutableList<Result>) :
    RecyclerView.Adapter<TodosUsersAdapter.TextoViewHolder>() {


    class TextoViewHolder(var itemBinding: ItemUsuarioBinding) :
        RecyclerView.ViewHolder(itemBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextoViewHolder {
        val binding =
            ItemUsuarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TextoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: TextoViewHolder, pos: Int) {

        holder.itemBinding.nombre.text = personas[pos].name.title
        holder.itemBinding.apellido.text = personas[pos].name.first
        holder.itemBinding.itemUsuario.setOnClickListener {



        }
    }

    override fun getItemCount(): Int {
        return personas.size
    }

}