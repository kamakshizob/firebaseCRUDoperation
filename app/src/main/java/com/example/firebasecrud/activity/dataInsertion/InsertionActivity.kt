package com.example.firebasecrud.activity.dataInsertion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.firebasecrud.R
import com.example.firebasecrud.model.EmployeeModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class InsertionActivity : AppCompatActivity() {
//    private lateinit var etEmpName: EditText
//    private lateinit var etEmpAge: EditText
//    private lateinit var etEmpSalary: EditText
//    private lateinit var btnSaveData: Button

    private val db :FirebaseFirestore by lazy {  Firebase.firestore }
     private val NAME ="name"
     private val AGE ="age"
     private val SALERY ="salery"
     private val COLLECTION ="notes"
     private val DOCUMENT ="inner_notes"

//    private lateinit var dbRef: DatabaseReference //type of db reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion)
//        etEmpName = findViewById(R.id.etEmpName)
//        etEmpAge = findViewById(R.id.etEmpAge)
//        etEmpSalary = findViewById(R.id.etEmpSalary)
//        btnSaveData = findViewById(R.id.btnSave)

        save()


    }

    private fun save() {
        val title =
    }
//        dbRef = FirebaseDatabase.getInstance().getReference("MP")

//        btnSaveData.setOnClickListener {
//            saveEmployeeData()
//        }
//    }

//    private fun saveEmployeeData() {
//
//        //getting values
//        val empName = etEmpName.text.toString()
//        val empAge = etEmpAge.text.toString()
//        val empSalary = etEmpSalary.text.toString()
//
//        if (empName.isEmpty()) {
//            etEmpName.error = "Please enter name"
//        }
//        if (empAge.isEmpty()) {
//            etEmpAge.error = "Please enter age"
//        }
//        if (empSalary.isEmpty()) {
//            etEmpSalary.error = "Please enter salary"
//        }
//
//        val empId = dbRef.push().key!! //!! null check
//
//        val employee = EmployeeModel(empId, empName, empAge, empSalary)
//
//        dbRef.child(empId).setValue(employee)
//            .addOnCompleteListener {
//                Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
//
//                etEmpName.text.clear()
//                etEmpAge.text.clear()
//                etEmpSalary.text.clear()
//
//            }.addOnFailureListener { err ->
//                Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_LONG).show()
//            }
//    }
}