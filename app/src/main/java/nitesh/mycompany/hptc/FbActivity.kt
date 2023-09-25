package nitesh.mycompany.hptc

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FbActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fblayout)
        setSupportActionBar(findViewById(R.id.my_toolbar1))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}