package edu.dami.ciclovidademoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //antagonista: onDestroy
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * Se activa cuando el sistema crea la actividad por primera vez
        * */
        showMsg("onCreate. ¡Estoy vivo! (dijo el activity)");
    }

    //antagonista: onStop
    @Override
    protected void onStart() {
        super.onStart();
        /*
        * Hace que el usuario pueda ver la actividad mientras la app se prepara
        * para que esta entre en primer plano
        * */
        showMsg("onStart. \"Se mira pero no se toca\"");
    }

    //antagonista: onPause
    @Override
    protected void onResume() {
        super.onResume();
        /*
        * ...pasa al primer plano...
        * ...Este es el estado en el que la app interactúa con el usuario...
        * */
        showMsg("onResume. Push me...and then just touch me..satisfaction");
        /*
        * turutu..turuturutu turuturuturutuuuuu ruru...
        * */
    }

    @Override
    protected void onPause() {
        super.onPause();
        /*
        * Primera indicación de que el usuario está abandonando tu actividad
        * Ya no está en 1er plano...
        * */
        showMsg("onPause. Por más que suplique, no me abandones..");
        /*
        * ...Dijiste, no soy yo, es el android...
        * ...De que me sirve la vida, Si no la vivo contigo...
         * */
    }

    @Override
    protected void onStop() {
        super.onStop();
        /*
        * Ocurre cuando el usuario ya no puede ver tu actividad
        * El sistema también puede llamar a onStop() cuando haya terminado la actividad
        * y esté a punto de finalizar.
        * Desde el estado Stopped, la actividad regresa a interactuar con el usuario
        * o se termina de ejecutar y desaparece
        * */
        showMsg("onStop. Hammer time!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /*
        * Se llama a onDestroy() antes de que finalice la actividad. Puede ser por:
        * - La actividad está terminando
        * - El sistema está finalizando temporalmente la actividad por cambio de config.
         * */
        showMsg("onDestroy. I'll tell you all about it when I see you again");
        /*
        * Aah oh, aah oh
        * Wooooh-oh-oh-oh-oh-oh1
        * */
    }

    private void showMsg(String message) {
        Log.d("MainActivity", message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}