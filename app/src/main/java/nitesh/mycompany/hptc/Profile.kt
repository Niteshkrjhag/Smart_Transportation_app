package nitesh.mycompany.hptc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class Profile:AppCompatActivity() {

    var isDarkMode: Boolean =true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        val change:ImageView=findViewById(R.id.change_color)

        change.setOnClickListener{
            if (isDarkMode)
            {
                isDarkMode=false
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else
            {
                isDarkMode=true
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }



        val back:ImageView = findViewById(R.id.back)
        back.setOnClickListener {
            finish()
        }
    }
}