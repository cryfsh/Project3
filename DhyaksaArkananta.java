package com.namagithubanda.planebattle.karakter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class DhyaksaArkananta {
    private Bitmap sprite;
    private int nyawa = 3;
    private float posisiX, posisiY;
    
    public DhyaksaArkananta(Context context) {
        sprite = BitmapFactory.decodeResource(
            context.getResources(), 
            R.drawable.dhyaksa
        );
    }
    
    public void gunakanKemampuanKhusus() {
        // Logika kemampuan khusus Dhyaksa
    }
    
    // Method lainnya...
}