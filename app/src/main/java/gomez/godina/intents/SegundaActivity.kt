package gomez.godina.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        btnSolo.setOnClickListener {
            val miSegundoIntent = Intent(this,TerceraActivity::class.java)

            val  nombre = etNombre.text.toString()
            miSegundoIntent.putExtra("info",nombre)
            startActivity(miSegundoIntent)
        }
    }
}
