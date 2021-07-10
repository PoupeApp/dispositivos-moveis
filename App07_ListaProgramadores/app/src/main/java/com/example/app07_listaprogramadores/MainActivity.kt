package com.example.app07_listaprogramadores

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome="Victor", email="victor@poupeapp.com", stack= Stack.FULLSTACK, senioridade= Senioridade.PLENO, foto=resources.getDrawable(R.drawable.iconpoupeapp)),
            Usuario(nome="Maria", email="maria@poupeapp.com", stack= Stack.FRONTEND, senioridade= Senioridade.JUNIOR, foto=resources.getDrawable(R.drawable.iconpoupeapp)),
            Usuario(nome="Paulo", email="paulo@poupeapp.com", stack= Stack.FULLSTACK, senioridade= Senioridade.PLENO, foto=resources.getDrawable(R.drawable.iconpoupeapp)),
            Usuario(nome="Isabella", email="isabella@poupeapp.com", stack= Stack.BACKEND, senioridade= Senioridade.JUNIOR, foto=resources.getDrawable(R.drawable.iconpoupeapp))
        )

        rv.adapter = UsuarioAdapter(lista)

        rv.layoutManager = LinearLayoutManager(this)
    }
}
