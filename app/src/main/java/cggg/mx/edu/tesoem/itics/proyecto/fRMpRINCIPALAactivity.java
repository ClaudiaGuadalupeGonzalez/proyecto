package cggg.mx.edu.tesoem.itics.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fRMpRINCIPALAactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_rmp_rincipalaactivity);
    }
    public void pantallapatrulla (View view) {
        Intent pantallapatrulla = new Intent(this,patrullaActivity.class);
        startActivity(pantallapatrulla);
    }
    public void pantallaarmas (View view) {
        Intent pantallaarmas = new Intent(this,ArmasActivity.class);
        startActivity(pantallaarmas);
    }
    public void pantallaEsposas (View view) {
        Intent pantallaEsposas = new Intent(this,EsposasActivity.class);
        startActivity(pantallaEsposas);
    }
    public void pantallaUniformes (View view) {
        Intent pantallaUniformes = new Intent(this,UniformesActivity.class);
        startActivity(pantallaUniformes);
    }
    public void pantallaplacas (View view) {
        Intent pantallaplacas = new Intent(this,PlacasActivity.class);
        startActivity(pantallaplacas);
    }
    public void pantallasector (View view) {
        Intent pantallasector = new Intent(this,sectorActivity.class);
        startActivity(pantallasector);
    }
    public void pantallabotas (View view) {
        Intent pantallabotas = new Intent(this,BotasActivity.class);
        startActivity(pantallabotas);
    }
    public void pantallaoperativo (View view) {
        Intent pantallaoperativo = new Intent(this,operativoActivity.class);
        startActivity(pantallaoperativo);
    }
}

