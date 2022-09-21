package com.lepii.mahasiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran, etNamaCalonMahasiswa;
    Button btnDaftar;
    String nomorPendaftaran, namaCalonMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNamaCalonMahasiswa = findViewById(R.id.et_nama_calon_mahasiswa);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                namaCalonMahasiswa = etNamaCalonMahasiswa.getText().toString();

                if (nomorPendaftaran.trim().equals("")) {
                    etNomorPendaftaran.setError("Mohon isi Nomor Pendaftaran!");
                }
                else if (namaCalonMahasiswa.trim().equals("")) {
                    etNamaCalonMahasiswa.setError("Mohon isi Nama Calon Mahasiswa!");
                }
                else {
                    Toast.makeText(MainActivity.this, "Selamat " + namaCalonMahasiswa + " Anda Sudah Terdaftar", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}