package kr.co.actortkangmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.*
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 궁금한 점
        // 만약 데이터로 가져오는 사진의 경우 어떻게 동적으로 이벤트가 되도록 하는가

        // 1. 화면이 클릭되었다는 것을 알아야 함.
        val photo1 = findViewById<ImageView>(R.id.photo_1)

        // 사진이 클릭되면 어떻게 동작할 것인가
        photo1.setOnClickListener {
//            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()
            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진을 크게 보여줌. (구글 검색어 : activity 화면 전환)
            val intent = Intent(this, ActorPhotoActivity2::class.java)
            startActivity(intent)
        }



        // 3.
    }
}
