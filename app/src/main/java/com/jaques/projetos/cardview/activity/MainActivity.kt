package com.jaques.projetos.cardview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaques.projetos.cardview.PreparaPostagens
import com.jaques.projetos.cardview.R
import com.jaques.projetos.cardview.adapter.PostagemAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.recyclerView_Postagem_Id
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var postagemAdapter: PostagemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = PreparaPostagens.createDataSet()
        postagemAdapter.submitList(data)

    }

    private fun iniRecyclerView (): Unit {
        recyclerView_Postagem_Id.apply {
            recyclerView_Postagem_Id.layoutManager = LinearLayoutManager(this@MainActivity)
            postagemAdapter = PostagemAdapter()
            recyclerView_Postagem_Id.adapter = postagemAdapter
        }

    }
}
