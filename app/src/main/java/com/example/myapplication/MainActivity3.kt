package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }
    fun signin(view: View){
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть не заполненные поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }

}