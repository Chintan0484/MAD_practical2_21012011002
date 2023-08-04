package com.example.mad_practical2_21012011002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    val TAG = "MainActivity"
    fun showMassage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val constraint: ConstraintLayout? = findViewById(R.id.mainConstraint)
        if (constraint!=null)
        {
            Snackbar.make(constraint,message,Snackbar.LENGTH_SHORT).show()
        }
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

    override fun onRestart() {
        super.onRestart()
        showMassage("onRestart method is called")
    }

    override fun onPause() {
        super.onPause()
        showMassage("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        showMassage("onStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMassage("onDestroy method is called")
    }
}