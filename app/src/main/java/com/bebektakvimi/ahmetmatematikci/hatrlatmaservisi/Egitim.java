package com.bebektakvimi.ahmetmatematikci.hatrlatmaservisi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Egitim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Ders saat 19 da");
        setContentView(tv);
    }
}
