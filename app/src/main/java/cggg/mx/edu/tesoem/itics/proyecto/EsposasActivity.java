package cggg.mx.edu.tesoem.itics.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EsposasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esposas);
    } public void regreso (View view) {
        Intent regreso = new Intent(this,fRMpRINCIPALAactivity.class);
        startActivity(regreso);
    }
}
