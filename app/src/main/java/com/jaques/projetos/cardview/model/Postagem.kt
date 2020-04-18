package com.jaques.projetos.cardview.model

data class Postagem(
    internal val nome: String,
    internal val postagem: String,
    internal val imagem: Int
) {
    override fun toString(): String {
        return "Postagem(nome='$nome', postagem='$postagem', imagem=$imagem)"
    }
}