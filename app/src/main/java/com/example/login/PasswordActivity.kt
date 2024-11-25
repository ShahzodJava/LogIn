package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivityPasswordBinding

class PasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPasswordBinding.inflate(layoutInflater)

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
            startActivity(Intent(this, OtpActivity::class.java))
//            Toast.makeText(this, "Next button Pressed", Toast.LENGTH_SHORT).show()
        }
    }
}