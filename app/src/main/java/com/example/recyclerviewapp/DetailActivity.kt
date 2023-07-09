package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.recyclerviewapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var foto: Int = intent.getIntExtra("Foto",0)
        var nama: String? = intent.getStringExtra("Nama")
        var email: String? = intent.getStringExtra("Email")
        var major: String? = intent.getStringExtra("Jurusan")
        var semester: Int? = intent.getIntExtra("Semester", 0)


        binding.tvNameDetail.text = "Nama : $nama"
        binding.tvEmailDetail.text = "Email : $email"
        binding.tvMajorDetail.text = "Jurusan : $major"
        binding.tvSemesterDetail.text = "Semester : $semester"
        Glide.with(this)
            .load(getDrawable(foto))
            .circleCrop()
            .into(binding.ivDetail)
    }
}