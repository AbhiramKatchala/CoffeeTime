package com.asitbehera.coffeetime;

/*
* @@@@@@@@@@@@@@@@@@@@@@@@@@@@
* @@                        @@
* @@ Author - Crazzi_Boii   @@
* @@                        @@
* @@@@@@@@@@@@@@@@@@@@@@@@@@@@
*
* Follow me on github - "github.com/Crazzi-Boii"
*/
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    public int lol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            final Intent i = new Intent(this, HomeActivity.class);
            Thread timer = new Thread() {
                public void run() {
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        startActivity(i);
                        finish();
                    }
                }
            };
            timer.start();
        }

}
