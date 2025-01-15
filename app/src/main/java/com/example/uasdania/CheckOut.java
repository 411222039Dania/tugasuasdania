package com.example.uasdania;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckOut extends AppCompatActivity {

    private TextView orderSummary;
    private TextView orderDetails;
    private Button confirmOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout); // Pastikan ini sesuai dengan nama layout Anda

        // Inisialisasi komponen UI
        orderSummary = findViewById(R.id.orderSummary);
        orderDetails = findViewById(R.id.orderDetails);
        confirmOrderButton = findViewById(R.id.confirmOrderButton);

        // TODO: Ambil data pesanan dari Intent atau sumber lain
        // Misalnya, Anda bisa mendapatkan data dari keranjang belanja
        String summary = "Order Summary"; // Ganti dengan ringkasan yang sesuai
        String details = "Product 1: $10.00\nProduct 2: $15.00\nTotal: $25.00"; // Ganti dengan detail yang sesuai

        // Set teks untuk TextView
        orderSummary.setText(summary);
        orderDetails.setText(details);

        // Set listener untuk tombol konfirmasi pesanan
        confirmOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Tambahkan logika untuk mengonfirmasi pesanan
                // Misalnya, simpan pesanan ke database atau kirim ke server
                // Tampilkan pesan konfirmasi atau pindah ke halaman lain
            }
        });
    }
}