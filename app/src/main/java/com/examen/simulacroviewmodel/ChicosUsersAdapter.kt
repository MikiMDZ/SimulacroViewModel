package com.examen.simulacroviewmodel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.examen.simulacroviewmodel.databinding.ItemUsuarioBinding

class ChicosUsersAdapter(var personas: MutableList<Result>) :
    RecyclerView.Adapter<ChicosUsersAdapter.TextoViewHolder>() {

    class TextoViewHolder(var itemBinding: ItemUsuarioBinding) :
        RecyclerView.ViewHolder(itemBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChicosUsersAdapter.TextoViewHolder {
        val binding =
            ItemUsuarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChicosUsersAdapter.TextoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ChicosUsersAdapter.TextoViewHolder, pos: Int) {

        holder.itemBinding.nombre.text = personas[pos].name.title
        holder.itemBinding.apellido.text = personas[pos].name.first
    }

    override fun getItemCount(): Int {
        return personas.size
    }

    }