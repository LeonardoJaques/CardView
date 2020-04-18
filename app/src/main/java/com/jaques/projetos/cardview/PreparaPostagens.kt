package com.jaques.projetos.cardview

import com.jaques.projetos.cardview.model.Postagem

class PreparaPostagens {
    companion object {
        fun createDataSet(): ArrayList<Postagem> {
            val list = ArrayList<Postagem>()
            list.add(Postagem("Leonardo Jaques 1", "testando 1º", R.drawable.imagem1))
            list.add(Postagem("Leonardo Jaques 2", "testando 2º", R.drawable.imagem2))
            list.add(Postagem("Leonardo Jaques 3", "testando 3º", R.drawable.imagem3))
            list.add(Postagem("Leonardo Jaques 4", "testando 4º", R.drawable.imagem4))
            return list
        }
    }
}