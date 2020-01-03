package jp.main.developer_ikep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            val intent = Intent(this@MainActivity, CreateTestActivity::class.java)
            startActivity(intent)
        }

        val calendar1 = Calendar.getInstance()
        // Month 値は 0 から始まるので注意
        calendar1.set(2020, 0, 18, 9, 30, 0)

        val timeMillis1 = calendar1.getTimeInMillis()

        val handler = Handler()
        val r = object : Runnable {
            override fun run() {

                // 現在時刻のミリ秒
                var currentTimeMillis = System.currentTimeMillis()

                // 差分のミリ秒
                var diff1: Long = timeMillis1 - currentTimeMillis

                var diff2 = diff1 / 1000

                var diff: Int = diff2.toInt()

                val seconds = String.format("%02d", diff % 60)
                diff = diff / 60

                val minutes = String.format("%02d", diff % 60)
                diff = diff / 60

                val hours = String.format("%02d", diff % 24)
                val days = diff / 24

                val textView1: TextView = findViewById(R.id.days_number)
                val str1 = days.toString()
                textView1.setText(str1)

                val textView2: TextView = findViewById(R.id.hours_number)
                val str2 = hours.toString()
                textView2.setText(str2)

                val textView3: TextView = findViewById(R.id.minutes_number)
                val str3 = minutes.toString()
                textView3.setText(str3)

                val textView4: TextView = findViewById(R.id.seconds_number)
                val str4 = seconds.toString()
                textView4.setText(str4)

                handler.postDelayed(this, 1000)
            }
        }
        handler.post(r)
    }
}