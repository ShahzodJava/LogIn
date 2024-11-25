package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivityEmailBinding

class EmailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEmailBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.back.setOnClickListener {

            onBackPressedDispatcher.onBackPressed()
        }
        binding.nextBtn.setOnClickListener {
            startActivity(Intent(this, PasswordActivity::class.java))
//            Toast.makeText(this, "Next button Pressed", Toast.LENGTH_SHORT).show()
        }
    }
}