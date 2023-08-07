package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name=findViewById<EditText>(R.id.textInput)
        val nameString=name.editableText.toString()
        val intent = Intent(this,BirthdayGreetingCard::class.java)
        intent.putExtra("name",nameString)
        startActivity(intent)
    }
}