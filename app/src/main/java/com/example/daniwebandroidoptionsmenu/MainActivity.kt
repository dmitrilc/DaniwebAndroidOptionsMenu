package com.example.daniwebandroidoptionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView = findViewById<TextView>(R.id.hello)

        return when(item.itemId){
            R.id.refresh,
            R.id.help,
            R.id.settings -> {
                textView.text = item.title
                true
            }
            else -> false
        }
    }
}