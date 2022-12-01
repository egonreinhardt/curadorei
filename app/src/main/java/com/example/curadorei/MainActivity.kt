package com.example.curadorei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.login_button)
        buttonLogin.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        val createAccount = findViewById<TextView>(R.id.create_account)
        createAccount.setOnClickListener {
            val intent = Intent(this,CreateAccountActivity::class.java)
            startActivity(intent)
        }
    }
}