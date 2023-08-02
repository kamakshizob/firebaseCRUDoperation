package com.example.firebasecrud.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firebasecrud.R
import com.example.firebasecrud.activity.dataFetch.FetchdDataActivity
import com.example.firebasecrud.activity.dataInsertion.InsertionActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var btnInsertdata: Button
    private lateinit var btnFetchdata: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firebase : DatabaseReference =FirebaseDatabase.getInstance().getReference()
        btnFetchdata =findViewById(R.id.btnFetchData)
        btnInsertdata =findViewById(R.id.btnInsertData)

        btnInsertdata.setOnClickListener{
            val intent =Intent(this, InsertionActivity::class.java)
            startActivity(intent)
        }
        btnFetchdata.setOnClickListener {
            val intent =Intent(this, FetchdDataActivity::class.java)
            startActivity(intent)
        }

    }
}