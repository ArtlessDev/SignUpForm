package edu.temple.signupform

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO(have button only work if all the criterias are met, which consist of: proper email, matching passwords and modify welcome message to say user's name)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        findViewById<Button>(R.id.button).setOnClickListener{welcomeMessage.text = "Thanks For Signing Up!"}
    }
}