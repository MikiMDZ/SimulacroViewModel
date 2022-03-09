package com.examen.simulacroviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examen.simulacroviewmodel.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.todos.setOnClickListener {
            val intent = Intent (this, TodosUsersActivity::class.java)
            startActivity(intent)
        }

        binding.chicos.setOnClickListener {
            val intent = Intent (this, ChicosUsersActivity::class.java)
            startActivity(intent)
        }

        binding.chicas.setOnClickListener {
            val intent = Intent (this, ChicasUsersActivity::class.java)
            startActivity(intent)
        }
    }
}
