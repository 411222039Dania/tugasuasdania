package com.example.uasdania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {

    private TextView tvSuccess;
    private TextView tvOrderDetails;
    private Button btnContinueShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success); // Pastikan ini sesuai dengan nama layout Anda

        // Inisialisasi komponen UI
        tvSuccess = findViewById(R.id.tvSuccess);
        tvOrderDetails = findViewById(R.id.tvOrderDetails);
        btnContinueShopping = findViewById(R.id.btnContinueShopping);

        // Set pesan sukses
        tvSuccess.setText("Order Successful!");
        tvOrderDetails.setText("Thank you for your order!");

        // Set listener untuk tombol Continue Shopping
        btnContinueShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman utama atau halaman belanja
                Intent intent = new Intent(SuccessActivity.this, MainActivity.class); // Ganti MainActivity dengan activity yang sesuai
                startActivity(intent);
                finish(); // Menutup SuccessActivity agar tidak kembali ke halaman ini
            }
        });
    }
}