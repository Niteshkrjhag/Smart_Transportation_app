package nitesh.mycompany.hptc

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class Seat_Preview:AppCompatActivity() {
    private var isSeatRed = false
    private var sA=20
    private var sO=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seat_preview)
        setSupportActionBar(findViewById(R.id.my_toolbar3))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
fun seatClicked(view:View){
   val imageButton = view as ImageButton
    val currentTag = imageButton.tag.toString()
    var seatavail:TextView = findViewById(R.id.seat_avail)
    var seatOcc:TextView = findViewById(R.id.seat_occupied)
    if (currentTag == "green") {
        imageButton.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.red_seat))
        imageButton.tag = "red"
        sO++
        seatOcc.text=sO.toString()
        sA--
        seatavail.text=sA.toString()
    } else if (currentTag == "red") {
        imageButton.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.green_seat))
        imageButton.tag = "green"
        sO--
        seatOcc.text = sO.toString()
        sA++;
        seatavail.text=sA.toString()
    }
}
}
