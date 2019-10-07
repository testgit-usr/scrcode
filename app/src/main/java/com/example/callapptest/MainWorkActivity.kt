package com.example.callapptest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainWorkActivity : AppCompatActivity() {
    var title: TextView? = null
    var result: TextView? = null
    var txtVal1: EditText? = null
    var txtVal2: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtVal2= findViewById(R.id.editText2)
        txtVal1= findViewById(R.id.editText)
        title=findViewById(R.id.titleText)
        result=findViewById(R.id.resultText)
        var goAddButton: Button = findViewById(R.id.button)
        goAddButton.setOnClickListener(View.OnClickListener {
            println("call add")
            getAddDetail()
        })
        var goSubButton: Button = findViewById(R.id.button2)
        goSubButton.setOnClickListener(View.OnClickListener {
            println("call sub")
            getSubDetail()
        })

    }
    fun getAddDetail(){
    var res: Int
        res= txtVal1?.getText().toString().toInt() +txtVal2?.getText().toString().toInt()
        result?.setText("Result of addition:"+ res)
    }
    fun getSubDetail(){
        var res: Int
        res= txtVal1?.getText().toString().toInt() -txtVal2?.getText().toString().toInt()
        result?.setText("Result of subtraction:"+ res)
    }
}