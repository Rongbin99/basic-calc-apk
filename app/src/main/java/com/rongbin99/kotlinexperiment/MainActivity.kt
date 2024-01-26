package com.rongbin99.kotlinexperiment
//imports
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {
    //variable declarations
    lateinit var add : Button
    lateinit var sub : Button
    lateinit var mul : Button
    lateinit var div : Button
    lateinit var valueA : EditText
    lateinit var valueB : EditText
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //assigning variables an object ID
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mul = findViewById(R.id.multiply)
        div = findViewById(R.id.divide)
        valueA = findViewById(R.id.valueA)
        valueB = findViewById(R.id.valueB)
        result = findViewById(R.id.answer)
        //adding the event listener
        add.setOnClickListener(this)
        sub.setOnClickListener(this)
        mul.setOnClickListener(this)
        div.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        //variable declarations
        val first = valueA.text.toString().toDouble()
        val second = valueB.text.toString().toDouble()
        var answer = 0.0
        //if conditions for proceeding calculation
        when(v?.id) {
            R.id.add -> {
                answer = first + second
            }
            R.id.sub -> {
                answer = first - second
            }
            R.id.multiply -> {
                answer = first * second
            }
            R.id.divide -> {
                answer = first / second
            }
        }
        result.text = "Answer: $answer"//return output
    }
}