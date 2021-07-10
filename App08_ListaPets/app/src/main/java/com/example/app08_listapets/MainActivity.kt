package com.example.app08_listapets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rvPets)

        val lista = mutableListOf<Pet>(
            Pet(foto = resources.getDrawable(R.drawable.cachorro), "Akamaru", TipoPet.CACHORRO, GeneroPet.MACHO),
            Pet(foto = resources.getDrawable(R.drawable.gato), "Gato branco", TipoPet.GATO, GeneroPet.MACHO),
            Pet(foto = resources.getDrawable(R.drawable.hamtaro), "Hamtaro", TipoPet.HAMSTER, GeneroPet.FEMEA)
        )

        rv.adapter = PetAdapter(lista)
        rv.layoutManager = LinearLayoutManager(this)
    }
}