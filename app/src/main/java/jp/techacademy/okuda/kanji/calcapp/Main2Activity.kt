package jp.techacademy.okuda.kanji.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val value1 = intent.getFloatExtra("VALUE1", 0F)
        val value2 = intent.getFloatExtra("VALUE2", 0F)
        val value3 = intent.getIntExtra("CALC",0)

        when (value3) {
            1 -> textResult.text = "${value1 + value2}"
            2 -> textResult.text = "${value1 - value2}"
            3 -> textResult.text = "${value1 * value2}"
            4 -> textResult.text = "${value1 / value2}"
        }



    }
}
