package kr.co.actortkangmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import java.lang.reflect.Field

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        // mainActivity에서 putExtra로 추가한 data
        val getData = intent.getStringExtra ("data")

        //android ImageView set image drawable programmatically
        val actorImageArea = findViewById<ImageView>(R.id.actorImageArea)

        // 이거 좀 줄이고 싶다
        if(getData == "1"){
            actorImageArea.setImageResource(R.drawable.kimkangmin1)
        }else if(getData == "2"){
            actorImageArea.setImageResource(R.drawable.kimkangmin2)
        }else if(getData == "3"){
            actorImageArea.setImageResource(R.drawable.kimkangmin3)
        }else if(getData == "4"){
            actorImageArea.setImageResource(R.drawable.kimkangmin4)
        }else if(getData == "5"){
            actorImageArea.setImageResource(R.drawable.kimkangmin5)
        }else if(getData == "6"){
            actorImageArea.setImageResource(R.drawable.kimkangmin6)
        }else if(getData == "7"){
            actorImageArea.setImageResource(R.drawable.kimkangmin7)
        }else if(getData == "8"){
            actorImageArea.setImageResource(R.drawable.kimkangmin8)
        }else if(getData == "9"){
            actorImageArea.setImageResource(R.drawable.kimkangmin9)
        }

        // Toast.makeText(this, getData, Toast.LENGTH_LONG).show();
    }
}