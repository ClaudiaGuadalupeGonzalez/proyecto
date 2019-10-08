package cggg.mx.edu.tesoem.itics.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    new Handler().postDelayed(new Runnable() {

        public void run() {
            Intent principal =  new Intent(MainActivity.this,fRMpRINCIPALAactivity.class);
            startActivity(principal);
            finish();
        }
    },4000);

}
}