package com.example.biodatamahasiswaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        val actionBar = supportActionBar
        actionBar!!.title = "Hello ..."
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
