package com.basico.hechoscuriosos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ActividadHechosCuriosos extends ActionBarActivity {

    private BaseCurioso textoCurioso = new BaseCurioso();
    private ColeccionColores color = new ColeccionColores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hechos_curiosos);

        final TextView etiquetaTexto = (TextView) findViewById(R.id.textoHecho);
        final Button botonNuevoHecho = (Button) findViewById(R.id.botonMostrarHecho);
        final RelativeLayout pantalla = (RelativeLayout) findViewById(R.id.pantalla);

        View.OnClickListener escuchador = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //el boton es presionado actualiar con un nuevo hecho
                String texto = textoCurioso.ObtenerHecho();

                int cambiarColor = color.ObtenerColor();

                pantalla.setBackgroundColor(cambiarColor);
                etiquetaTexto.setText(texto);
                botonNuevoHecho.setTextColor(cambiarColor);

            }
        };
        botonNuevoHecho.setOnClickListener(escuchador);

        Toast.makeText(this,"La actividad fue creada",Toast.LENGTH_LONG).show();//notificacion toast en una sola linea

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_hechos_curiosos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
