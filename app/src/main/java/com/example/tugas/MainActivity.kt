package com.example.tugas

package learn.idn.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail: EditText = findViewById(R.id.email)
        val edtPassword: EditText = findViewById(R.id.password)
        val btnLogin: Button = findViewById(R.id.login)
        val btnRegister: Button = findViewById(R.id.register)
        val btnForgetPass: TextView = findViewById(R.id.forgot)
        val radioRemember: RadioButton = findViewById(R.id.remember)

        dataEmail = arrayOf("mirza", "muhammad", "ahsan")
        dataPassword = arrayOf("1234", "5678", "9101")

        btnLogin.setOnClickListener {
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
        }

    }

    fun signIn(email: String, password: String) {
        for (i in dataEmail.indices) {
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email && takeDataPass == password) {
                Toast.makeText(this, "LoggedIn", Toast.LENGTH_SHORT).show()
                break
            } else {
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}