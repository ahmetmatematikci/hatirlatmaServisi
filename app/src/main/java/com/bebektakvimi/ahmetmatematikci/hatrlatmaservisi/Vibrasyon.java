package com.bebektakvimi.ahmetmatematikci.hatrlatmaservisi;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by a on 17.04.2017.
 */

public class Vibrasyon
{

    private Context c;

    public Vibrasyon(Context context) {
        c = context;
    }

    //2 snlik titreşim

    public void Titrestir() {
        Vibrator v = (Vibrator)c.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(2000);
    }

    //3 kez titrestir

    public void Titrestir2() {
        Vibrator v = (Vibrator)c.getSystemService(Context.VIBRATOR_SERVICE);
        long pattern[] = {1000,1000,3000,100};
        v.vibrate(pattern, 3);
    }

}
