package com.example.kaushik.csi_lnmiit;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by KAUSHIK on 10-Dec-15.
 */
public class SplashScreen extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timerThread = new Thread(){
            public void  run(){
                try {
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }
}
