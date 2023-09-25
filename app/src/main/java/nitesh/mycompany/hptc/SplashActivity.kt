package nitesh.mycompany.hptc

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import nitesh.mycompany.hptc.MainActivity
import nitesh.mycompany.hptc.R

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    var topanim: Animation?=null
    var bottomanim: Animation?=null
    private var imaget: ImageView?=null
    private var imageb:ImageView?=null
    private var power:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        imageb=findViewById(R.id.iv_hrtc)
        imaget=findViewById(R.id.iv_top)
        power=findViewById(R.id.hp)
        imaget?.setAnimation(topanim)
        imageb?.setAnimation(bottomanim)
        power?.setAnimation(bottomanim)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        //Normal Handler is deprecated , so we have to change the code little bit

        // Handler().postDelayed({
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}
