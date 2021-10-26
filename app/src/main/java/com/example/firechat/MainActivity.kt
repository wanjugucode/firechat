package com.example.firechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
    lateinit var database:FirebaseDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database= FirebaseDatabase.getInstance("https://firechat-a08bd-default-rtdb.asia-southeast1.firebasedatabase.app/")
        val dbReference=database.getReference("message")
        dbReference.setValue("Hi this is Anastasia")
//        dbReference.push().setValue("Hi this is Anastasia")

    }

    override fun onResume() {
        super.onResume()
    }
//    data class Message(var sender:String="")
}