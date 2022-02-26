package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var inputText : EditText
    private lateinit var btninput : Button
    private lateinit var ResultText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.inputText)
        btninput = findViewById(R.id.btninput)
        ResultText = findViewById(R.id.result)

        btninput.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "Nama berhasil di input",
            Toast.LENGTH_SHORT).show()

        ResultText.text = inputText.text.toString().trim()
    }
}