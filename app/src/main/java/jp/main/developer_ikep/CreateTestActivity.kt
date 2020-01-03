package jp.main.developer_ikep

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_test.*
import java.util.*

class CreateTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_test)

        val calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        val day = calender.get(Calendar.DAY_OF_MONTH)

        btn.setOnClickListener {
            val dtp = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view,y,m,d ->
                Toast.makeText(this, "日付を選択しました"+y+m+d,Toast.LENGTH_LONG).show()
            }, year,month,day
            )
            dtp.show()
        }
    }
}