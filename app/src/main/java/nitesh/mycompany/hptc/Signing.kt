package nitesh.mycompany.hptc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signing:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)
        val signupbtn:Button = findViewById(R.id.btn_signup)
        signupbtn.setOnClickListener{
            var name:EditText = findViewById(R.id.name)
            var password:EditText = findViewById(R.id.et_Password)
            var cpassword:EditText =findViewById(R.id.Password)
            if(password.text.isNotEmpty() && cpassword.text.isNotEmpty() &&(password.text.toString() == cpassword.text.toString())){
                if(password.text.toString().length>=8){
                    val intent = Intent(this,UserActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this,"Congratulation,${name.text}",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Password should be of 8 or more character",Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(this,"Please fill the form correctly",Toast.LENGTH_SHORT).show()
            }
        }
    }
}