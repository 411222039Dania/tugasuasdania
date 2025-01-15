package com.example.uasdania;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    private List<Product> productList; // Daftar produk

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produklist); // Pastikan layout ini ada

        GridView productGrid = findViewById(R.id.gridView);

        // Misalnya, inisialisasi productList dengan data produk
        // productList = ... (isi dengan data produk Anda)

        // Set adapter untuk GridView (pastikan Anda memiliki adapter yang sesuai)
        ProductAdapter adapter = new ProductAdapter(this, productList);
        productGrid.setAdapter(adapter);

        // Set listener untuk item di GridView
        productGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Ambil data produk berdasarkan posisi yang diklik
                Product selectedProduct = productList.get(position); // Ambil produk dari daftar

                // Buat Intent untuk berpindah ke ProductDetailActivity
                Intent intent = new Intent(ProductListActivity.this, ProductDetailActivity.class);

                // Kirim data produk ke ProductDetailActivity (misalnya, ID produk)
                intent.putExtra("product_id", selectedProduct.getId()); // Pastikan getId() ada di kelas Product

                // Mulai Activity
                startActivity(intent);
            }
        });
    }
}