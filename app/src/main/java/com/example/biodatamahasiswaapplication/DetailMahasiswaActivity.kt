package com.example.biodatamahasiswaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.biodatamahasiswaapplication.databinding.ActivityDetailMahasiswaBinding
import kotlinx.android.synthetic.main.activity_detail_mahasiswa.*

class DetailMahasiswaActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailMahasiswaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detail_mahasiswa)
        tv_item_nama.text = getIntent().getStringExtra("NAMA")
        tv_item_detail.text = getIntent().getStringExtra("DETAIL")
        iv_item_photo.setImageResource(getIntent().getStringExtra("PHOTO").toInt())
        tv_item_email.text = getIntent().getStringExtra("EMAIL")
        tv_item_telp.text = getIntent().getStringExtra("NOTLP")

        val actionBar = supportActionBar
        actionBar!!.title = "Tentang Saya"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
