package com.diyorbek.homework_04_09_22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()

        findViewById<MaterialButton>(R.id.btnOne).setOnClickListener { firstActivity() }
        findViewById<MaterialButton>(R.id.btnTwo).setOnClickListener { secondActivity() }
        findViewById<MaterialButton>(R.id.btnThree).setOnClickListener { thirdActivity() }

    }

    private fun firstActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun secondActivity() {
        val intent = Intent(this, Second::class.java)
        startActivity(intent)
        finish()
    }

    private fun thirdActivity() {
        val intent = Intent(this, Third::class.java)
        startActivity(intent)
        finish()
    }
}