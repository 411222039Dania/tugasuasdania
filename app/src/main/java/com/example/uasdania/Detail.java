package com.example.uasdania;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    private ImageView productImage;
    private TextView productName;
    private TextView productDescription;
    private Button addToCartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail); // Pastikan ini sesuai dengan nama layout Anda

        // Inisialisasi komponen UI
        productImage = findViewById(R.id.productName);
        productName = findViewById(R.id.productName);
        productDescription = findViewById(R.id.productDescription);
        addToCartButton = findViewById(R.id.addToCartButton);

        // Ambil data dari Intent
        Intent intent = getIntent();
        String productId = intent.getStringExtra("product_id");

        // TODO: Ambil data produk berdasarkan productId
        // Misalnya, Anda bisa menggunakan database atau API untuk mendapatkan detail produk
        // Di sini, saya akan menggunakan data dummy untuk contoh

        // Contoh data produk (ganti dengan data nyata)
        if (productId != null) {
            // Misalnya, Anda bisa mendapatkan produk dari database atau API berdasarkan productId
            // Di sini kita hanya menggunakan data dummy
            productName.setText("Product Name for ID: " + productId);
            productDescription.setText("This is a detailed description of the product with ID: " + productId);
            productImage.setImageResource(R.drawable.ic_product_image); // Ganti dengan gambar produk yang sesuai
        }

        // Set listener untuk tombol Add to Cart
        addToCartButton.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk menambahkan produk ke keranjang
        });
    }
}