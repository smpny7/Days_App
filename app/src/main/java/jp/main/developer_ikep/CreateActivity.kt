package jp.main.developer_ikep



//package jp.main.developer_ikep
//
//import android.app.DatePickerDialog
//import android.app.Dialog
//import android.content.Context
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.DatePicker
//import androidx.fragment.app.DialogFragment
//import java.util.*
//
//class CreateActivity : AppCompatActivity(),DatePickerFlagment.OnDateSelectedListener {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val datePicker = DatePickerFlagment()
//        datePicker.show(supportFragmentManager,"date_picker")
//    }
//
//    override fun onSelected(year: Int, month: Int, day: Int) {
//        print(year)
//        print(month)
//        print(day)
//    }
//}
//
//class DatePickerFlagment: DialogFragment(), DatePickerDialog.OnDateSetListener {
//
//    interface OnDateSelectedListener{
//        fun onSelected(year: Int, month: Int, day: Int)
//    }
//    //リスナ-作成
//    private lateinit var listener: OnDateSelectedListener
//
//    override fun onAttach(context: Context?) {
//        super.onAttach(context)
//        if (context is OnDateSelectedListener){
//            listener = context
//        }
//    }
//
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        val calendar = Calendar.getInstance()
//        val year = calendar.get(Calendar.YEAR)
//        val month = calendar.get(Calendar.MONTH)
//        val day = calendar.get(Calendar.DAY_OF_MONTH)
//        return DatePickerDialog(context, this, year, month, day )
//    }
//    //onSelectedインターフェースを呼び出す。
//    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
//        listener.onSelected(year, month, dayOfMonth)
//    }
//}