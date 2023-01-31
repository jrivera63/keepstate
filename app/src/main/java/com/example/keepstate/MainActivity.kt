package com.example.keepstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var fName: EditText
    lateinit var lName: EditText
    lateinit var city: EditText
    lateinit var college: EditText
    lateinit var lblFName: TextView
    lateinit var lblLName: TextView
    lateinit var lblCity: TextView
    lateinit var lblCollege: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        fName = findViewById<EditText>(R.id.userFName)
        lName = findViewById<EditText>(R.id.userLName)
        city = findViewById<EditText>(R.id.userCity)
        college = findViewById<EditText>(R.id.userCollege)

        lblFName = findViewById<TextView>(R.id.lblFName)
        lblLName = findViewById<TextView>(R.id.lblLName)
        lblCity = findViewById<TextView>(R.id.lblCity)
        lblCollege = findViewById<TextView>(R.id.lblCollege)

        button.setOnClickListener{
            lblFName.text = fName.text
            lblLName.text = lName.text
            lblCity.text = city.text
            lblCollege.text = college.text

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("fName", lblFName.text.toString())
        outState.putString("lName", lblLName.text.toString())
        outState.putString("city", lblCity.text.toString())
        outState.putString("college", lblCollege.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        lblFName.setText(savedInstanceState.getString("fName"))
        lblLName.setText(savedInstanceState.getString("lName"))
        lblCity.setText(savedInstanceState.getString("city"))
        lblCollege.setText(savedInstanceState.getString("college"))
    }
}