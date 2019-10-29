package com.example.responsi_265

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.responsi_265.R
import kotlinx.android.synthetic.main.activity_preview.*

class preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        val bundle: Bundle? = intent.extras
        val nama2 = bundle?.get("nama2")
        val alamat2 = bundle?.get("alamat2")
        val tgl_lhr = bundle?.get("tgl_lhr")
        val tmp_lhr = bundle?.get("tmp_lhr")

        this.nama.setText(nama2.toString())
        this.alamat.setText(alamat2.toString())
        this.tempatLahir.setText(tmp_lhr.toString())
        this.tgl_lahir.setText(tgl_lhr.toString())
    }
}

