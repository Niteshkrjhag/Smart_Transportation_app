package nitesh.mycompany.hptc

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class UserActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
      setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val bustrack:ImageView=findViewById(R.id.bus_track)
        val feedback:ImageView=findViewById(R.id.feedback)
        val receive:ImageView = findViewById(R.id.receive)
        val profile1:ImageView = findViewById(R.id.profile)
        val businfo:ImageView = findViewById(R.id.businfo)

        businfo.setOnClickListener {
            val intent = Intent(this, Webview::class.java)
            startActivity(intent)
        }


        bustrack.setOnClickListener{
            val intent=Intent(this,BusTrack::class.java)
            startActivity(intent)
        }
        profile1.setOnClickListener{
            val intent=Intent(this,Profile::class.java)
            startActivity(intent)
        }
        feedback.setOnClickListener{
            val intent=Intent(this,FbActivity::class.java)
            startActivity(intent)
        }
        receive.setOnClickListener{
            val intent=Intent(this,Notification::class.java)
            startActivity(intent)
        }
    }
}