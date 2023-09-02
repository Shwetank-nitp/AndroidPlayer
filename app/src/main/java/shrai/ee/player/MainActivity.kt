package shrai.ee.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_layout)
        val cancel:Button? = findViewById(R.id.button)
        cancel?.setOnClickListener {
            finish()
        }
        val ok:Button? = findViewById(R.id.button3)
        ok?.setOnClickListener {
            setContentView(R.layout.activity_main)
            val back:Button? = findViewById(R.id.button2)
            back?.setOnClickListener {
                setContentView(R.layout.note_layout)
            }
        }

    }
}