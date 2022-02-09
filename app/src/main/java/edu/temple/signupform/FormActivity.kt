package edu.temple.signupform

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeMessage = "Thanks For Signing Up!"
        val inputEmail = findViewById<EditText>(R.id.textEmailAddress)
        val inputPasswordAuthentication = findViewById<EditText>(R.id.textPassword)
        val inputPasswordConfirmation = findViewById<EditText>(R.id.textPasswordConfirm)

        val toastText = "Error, not all parameters are filled out"
        val duration = Toast.LENGTH_SHORT

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener() {
            val passA = inputPasswordAuthentication.getText().toString()
            val passC = inputPasswordConfirmation.getText().toString()
            val emailIn = inputEmail.getText().toString()

            if(!passA.equals(passC) || emailIn.isNullOrEmpty()) {
                val toast = Toast.makeText(this, toastText, duration).show()
            }
            else if(passA.equals(passC) && !emailIn.isNullOrEmpty()) {
                val toast = Toast.makeText(this, welcomeMessage, duration).show()
            }

        }

    }
}