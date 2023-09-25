package nitesh.mycompany.hptc

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnStart:Button = findViewById(R.id.btn_login)
        var password:EditText=findViewById(R.id.Password)
         setTheme(R.style.Mytheme)
        btnStart.setOnClickListener(){
            val et_name:EditText = findViewById(R.id.Email)
            if(et_name.text.isNotEmpty() && password.text.isNotEmpty()){
                if(password.text.toString().length>=8){
                    Toast.makeText(this,"welcome,${et_name.text}",Toast.LENGTH_LONG).show()
                    val intent = Intent(this,UserActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Password should be of 8 or more character",Toast.LENGTH_LONG).show()
                }
            }
            else{
                Toast.makeText(this,"Please enter your name and Password",Toast.LENGTH_LONG).show()
            }
        }
    }
    fun adminOpen(view:View) {
        val url = "https://agents.hrtchp.com/hrtc-oprs/"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Handle the case where no activity can handle the intent (e.g., no web browser installed)
            Toast.makeText(this, "No web browser found", Toast.LENGTH_SHORT).show()
        }
    }
    fun signup(view:View){
        val intent = Intent(this@MainActivity,Signing::class.java)
        startActivity(intent)
    }

    fun startDriverActivity(view:View){
        val intent = Intent(this@MainActivity,driver::class.java)
        startActivity(intent)
    }
}

