package com.basico.hechoscuriosos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ActividadHechosCuriosos extends ActionBarActivity {

    private BaseCurioso textoCurioso = new BaseCurioso();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hechos_curiosos);

        final TextView etiquetaTexto = (TextView) findViewById(R.id.textoHecho);
        Button botonNuevoHecho = (Button) findViewById(R.id.botonMostrarHecho);

        View.OnClickListener escuchador = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //el boton es presionado actualiar con un nuevo hecho
                String texto = textoCurioso.ObtenerRespuestas();

                etiquetaTexto.setText(texto);


            }
        };
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
