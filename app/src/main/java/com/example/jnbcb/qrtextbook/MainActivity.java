package com.example.jnbcb.qrtextbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int RC_BARCODE_CAPTURE = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchBarcode(View view){
        Intent intent = new Intent(this, BarcodeScanner.class);
        intent.putExtra(BarcodeScanner.AutoFocus, true);
        intent.putExtra(BarcodeScanner.UseFlash, false);

        startActivityForResult(intent, RC_BARCODE_CAPTURE);
    }
}
