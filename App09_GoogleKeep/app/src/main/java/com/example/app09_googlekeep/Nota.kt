package com.example.app09_googlekeep

import android.graphics.drawable.Drawable

data class Nota(
    var foto: Drawable?=null,
    var titulo: String,
    var conteudo: String,
)