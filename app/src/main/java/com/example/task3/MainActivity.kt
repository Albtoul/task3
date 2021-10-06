package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var ed :EditText
    lateinit var a:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed=findViewById(R.id.editTextTextPersonName)


    }

    fun submit(view: android.view.View) {

            var N=AlertDialog.Builder(this)
        N.setMessage("good morning")
        N.setTitle("welcome " )
        N.setPositiveButton("thank",null)
        N.show()


    }

    fun Go(view: android.view.View) {

        a=ed.text.toString()
        var b = Intent(this,MainActivity2::class.java)
        b.putExtra("good",ed.text.toString())
        startActivity(b)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun AB(item: android.view.MenuItem) {
        Toast.makeText(applicationContext,"click",Toast.LENGTH_SHORT).show()

    }
}