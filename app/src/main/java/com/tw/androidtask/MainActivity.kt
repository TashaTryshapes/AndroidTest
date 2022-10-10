package com.tw.androidtask

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var inputValueList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddToiIst.setOnClickListener {
            val addValue = edtAddLIst.text.toString()
            if (addValue.isNotEmpty()) {
                if (!inputValueList.contains(addValue)) {
                    inputValueList.add(addValue)
                    Toast.makeText(this, "Value Added", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Value Already existed", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnReplace.setOnClickListener {
            val replace = edtReplace.text.toString()
            replaceMethod(replace)
        }

        btnPrint.setOnClickListener {
            val number = Integer.parseInt(edtPrintNumber.text.toString())
            printNValue(number)
        }

        reverseNumber(1568)
    }

    private fun replaceMethod(replace: String) {
        val replaceChar = replace.split(" ").toTypedArray()
        for (i in replaceChar.indices) {
            if (replaceChar[i].contains(" ")) {
                replaceChar[i] = "*"
            }
        }
        val str1 = StringBuilder()
        for (entity in replaceChar) {
            str1.append(entity)
        }
        edtReplace.setText(str1)
    }

    private fun printNValue(n: Int) {
        if (n > 0) {
            Log.e("PrintN", "N${n}")
            printNValue(n - 1)
        }
        return
    }

    private fun reverseNumber(number: Long) {
        //Remainder= number % 10
        //reverse=reverse * number + remainder
        //number= number / 10
        var number = number
        var reverse = 0
        while (number != 0L) {
            val remainder = Math.toIntExact(number % 10)
            reverse = reverse * 10 + remainder
            number = number / 10
        }
        println(reverse)
    }
}