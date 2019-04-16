package rifat.finalproject.locator;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Timer t = new Timer();

        boolean checkConnection = new ApplicationUtility().checkConnection(this);
        if (checkConnection) {
            t.schedule(new splash(), 3000);
        } else {

            AlertDialog.Builder builder;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder = new AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Dialog);
            } else {
                builder = new AlertDialog.Builder(this);
            }
            builder.setTitle("No Internet Connection")
                    .setMessage("No Worry! You can still check offline")
                    .setPositiveButton("Go Offline", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
//                            Intent myIntent = new Intent(SplashScreen.this, FragmentLoderActivity.class);
//                            SplashScreen.this.startActivity(myIntent);
                        }
                    })
                    .setNegativeButton("Connect Internet", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // do nothing

                        }
                    })
                    .setIcon(android.R.drawable.ic_menu_help).setCancelable(false)
                    .show();
        }

    }

    class splash extends TimerTask {

        @Override
        public void run() {
            Intent i = new Intent(SplashScreen.this, MainActivity.class);
            finish();
            startActivity(i);
        }

    }


}


