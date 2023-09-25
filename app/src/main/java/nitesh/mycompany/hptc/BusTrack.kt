package nitesh.mycompany.hptc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BusTrack: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bustrack)
        setSupportActionBar(findViewById(R.id.my_toolbar2))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}