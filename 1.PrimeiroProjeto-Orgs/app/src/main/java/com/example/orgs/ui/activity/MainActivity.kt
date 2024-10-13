package com.example.orgs.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdaptar


class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        val descricao = findViewById<TextView>(R.id.descricao)
//        val valor = findViewById<TextView>(R.id.valor)
//        nome.text = "Cesta de Frutas"
//        descricao.text = "Laranja, Manga Maçã"
//        valor.text = "R$ 19,90"
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.adapter = ListaProdutosAdaptar()
    }
}