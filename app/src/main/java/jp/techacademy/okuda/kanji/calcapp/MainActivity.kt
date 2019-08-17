package jp.techacademy.okuda.kanji.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        try {

            val intent = Intent(this,Main2Activity::class.java)
        val number1 = number1text.text.toString().toFloat()
        val number2 = number2text.text.toString().toFloat()




        Log.d("uiparts",number1.toString())

        intent.putExtra("VALUE1",number1)
        intent.putExtra("VALUE2",number2)
        intent.putExtra("CALC",calc)

        startActivity(intent)
        } catch (e: Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示

            Log.d("kotlintest", e.message)
            showAlertDialog()
        } finally {
            Log.d("kotlintest", "ans = " )
        }

    }
    private fun showAlertDialog(){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("エラー")
        alertDialogBuilder.setMessage("数字を設定してください")

        // AlertDialogを作成して表示する
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

    }
}
