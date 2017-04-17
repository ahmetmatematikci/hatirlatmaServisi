package com.bebektakvimi.ahmetmatematikci.hatrlatmaservisi;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private final int NOTIFICATION_ID = 1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Vibrasyon(MainActivity.this).Titrestir2();
    }

    public void btn_Click(View view) {
        NotificationManager mng = (NotificationManager)this.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder nb = new Notification.Builder(this);
        //nb.setColor(Color.YELLOW);
        nb.setContentTitle("Hatıraltma");
        nb.setContentText("Android dersleri");
        nb.setSmallIcon(R.drawable.bebeicon);
        nb.setTicker("Bildirim geldi");
        nb.setAutoCancel(true);
        nb.setLights(Color.YELLOW, 1,1);

        Intent i = new Intent(this, Egitim.class);
        PendingIntent pi = PendingIntent.getActivity(this, NOTIFICATION_ID, i, 0);
        nb.setContentIntent(pi);

        Notification not = nb.getNotification();
        not.vibrate = new long[] {500,500,500,500};
        mng.notify(NOTIFICATION_ID, not);
    }
}
