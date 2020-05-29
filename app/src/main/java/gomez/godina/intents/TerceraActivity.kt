package gomez.godina.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tercera.*

class TerceraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)
        val mensaje = intent.getStringExtra("info")

        if (mensaje != null){
            tvMensaje.text = mensaje
        }else{
            tvMensaje.text = "No se recibió nada"
        }


    }
}
