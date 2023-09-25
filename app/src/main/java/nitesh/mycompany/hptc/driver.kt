package nitesh.mycompany.hptc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class driver: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.driver)
        var Name:EditText = findViewById(R.id.username)
        var License_id:EditText = findViewById(R.id.license_id)
        var Phone_no:EditText = findViewById(R.id.Phone_no)
        var password:EditText = findViewById(R.id.password)
        var cpassword:EditText = findViewById(R.id.confirm_password)
        var confirm: Button = findViewById(R.id.btnconfirm)

        confirm.setOnClickListener{
            if(Name.text.isNotEmpty() && License_id.text.isNotEmpty() && Phone_no.text.isNotEmpty() &&
                password.text.isNotEmpty() && cpassword.text.isNotEmpty()){
                Toast.makeText(this@driver,"You have successfully registered as driver",Toast.LENGTH_SHORT).show()
                val intent=Intent(this,Seat_Preview::class.java)
                startActivity(intent)
            }else
                Toast.makeText(this@driver,"Fill the form correctly",Toast.LENGTH_SHORT).show()
        }


    }
}