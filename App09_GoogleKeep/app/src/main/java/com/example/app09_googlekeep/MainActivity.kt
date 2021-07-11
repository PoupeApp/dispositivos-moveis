package com.example.app09_googlekeep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvNotas)

        val lista = mutableListOf<Nota>(
            Nota(
                titulo = "Hey",
                conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Nota(
                titulo = "There",
                conteudo = "Integer sit amet ligula lacinia, condimentum justo nec, lacinia mauris."
            ),
            Nota(
                titulo = "Test",
                conteudo = "Morbi sollicitudin libero sed metus interdum lacinia. In non convallis neque."
            ),
            Nota(
                titulo = "There",
                conteudo = "Integer sit amet ligula lacinia, condimentum justo nec, lacinia mauris."
            ),
            Nota(
                titulo = "Hey",
                conteudo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            )
        )

        rv.adapter = NotaAdapter(lista)
        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}