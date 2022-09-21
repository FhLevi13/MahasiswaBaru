package com.lepii.mahasiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran;
    EditText etNamaCalonMahasiswa;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNamaCalonMahasiswa = findViewById(R.id.et_nama_calon_mahasiswa);
        btnDaftar = findViewById(R.id.btn_daftar);
    }
}