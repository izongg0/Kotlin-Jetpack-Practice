package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  db : SQLiteHelperSample

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = SQLiteHelperSample(this)

        val inputArea = findViewById<EditText>(R.id.inputArea)
        val insertBtn = findViewById<Button>(R.id.insert)
        val resultArea = findViewById<TextView>(R.id.resultArea)

        insertBtn.setOnClickListener {
            val inputText = inputArea.text.toString()
            db.insert(inputText)
            inputArea.setText("")

        }

        findViewById<Button>(R.id.getAll).setOnClickListener {

            val arr = db.getAllData()
            resultArea.text = arr.toString()
        }
        findViewById<Button>(R.id.deleteAll).setOnClickListener {
            db.deleteAll()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        db.close()
    }
}