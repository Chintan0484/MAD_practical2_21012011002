package com.example.mad_practical2_21012011002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    val TAG = "MainActivity"
    fun showMassage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMassage("onCreate method is called")
    }

    override fun onStart() {
        super.onStart()
        showMassage("onstart method is called")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        showMassage("oncreate method is called")
    }

    override fun onResume() {
        super.onResume()
        showMassage("onresume method is called")
        
    }
}