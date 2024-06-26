package com.example.vitb2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var a = 20  //scope = class == training center

    override fun onCreate(savedInstanceState: Bundle?) {
        var b = 20
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun some(){
        println(a)
    }
}