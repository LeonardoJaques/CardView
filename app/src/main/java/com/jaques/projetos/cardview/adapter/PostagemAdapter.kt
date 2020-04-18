package com.jaques.projetos.cardview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jaques.projetos.cardview.R
import com.jaques.projetos.cardview.model.Postagem
import kotlinx.android.synthetic.main.cardview_list.view.*

class PostagemAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Postagem> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemList: View =
            LayoutInflater.from(parent.context).inflate(R.layout.cardview_list, parent, false)
        return PostagemViewHolder(itemList)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(postList: List<Postagem>) {
        items = postList
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is PostagemViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

}

class PostagemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    internal val nome = itemView.textView_nome
    internal val postagem = itemView.textView_postagem
    internal val imagem = itemView.imageView_postagem

    fun bind (post: Postagem): Unit {
        nome.text = post.nome
        postagem.text = post.postagem
        imagem.setImageResource(post.imagem)
    }

    init {
        imagem.setOnClickListener { view ->
            val text = nome.text
            Toast.makeText(imagem.context, text, Toast.LENGTH_LONG).show()
        }
    }
}