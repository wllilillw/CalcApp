package jp.techacademy.okuda.kanji.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonPlus.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)
        buttonCall.setOnClickListener(this)
        buttonDivide.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var calc = 0
        when(v?.id){
            R.id.buttonPlus -> calc = 1
            R.id.buttonMinus -> calc = 2
            R.id.buttonCall -> calc = 3
            R.id.buttonDivide -> calc = 4

        }
        val intent = Intent(this,Main2Activity::class.java)
        val number1 = number1text.text
        val number2 = number2text.text

        intent.putExtra("VALUE1",number1)
        intent.putExtra("VALUE2",number2)
        intent.putExtra("CALC",calc)

        startActivity(intent)

    }
}
