package com.examen.simulacroviewmodel

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.examen.simulacroviewmodel.databinding.ChicasUsersBinding


var listachicas: List<Result>? = null

class ChicasUsersActivity : AppCompatActivity() {
    private lateinit var binding: ChicasUsersBinding
    private val viewModel: ChicasUsersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ChicasUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url = "https://randomuser.me/api/?&results=100&gender=female"
        viewModel.descargarPersonas(url)
        initObserver()
    }
    private fun initObserver() {
        viewModel.isVisible.observe(this) { isVisible ->
            if (isVisible) setVisible() else setGone()
        }

        viewModel.responseText.observe(this) { responseText ->
            showToast(responseText)
        }

        viewModel.responseList.observe(this) {
            setRecycler(it as MutableList<Result>)
        }
    }
    private fun setVisible() {
        binding.pbDownloading.visibility = View.VISIBLE
    }

    private fun setGone() {
        binding.pbDownloading.visibility = View.GONE
    }

    private fun showToast(text: String) {
        Toast.makeText(this@ChicasUsersActivity, text, Toast.LENGTH_SHORT).show()

    }

    private fun setRecycler(lista: MutableList<Result>) {

        val adapter = TodosUsersAdapter(lista)


        listachicas = lista
        binding.recycler.layoutManager = LinearLayoutManager(this@ChicasUsersActivity)
        binding.recycler.adapter = adapter
    }


}