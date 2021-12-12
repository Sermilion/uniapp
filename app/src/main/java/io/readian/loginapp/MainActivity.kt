package io.readian.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var logIn: Button
    private lateinit var SignUp: Button
    private lateinit var Skip: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logIn = findViewById(R.id.button)

        SignUp = findViewById(R.id.button2)

        Skip = findViewById(R.id.button3)

    }
}