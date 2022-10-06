package com.tw.androidtask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var inputValueList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddToiIst.setOnClickListener {
            val addvalue = edtAddLIst.text.toString()
            if (addvalue.isNotEmpty() && !addvalue.contains(addvalue)) {
                inputValueList.add(addvalue)
                Toast.makeText(this, "Value Added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Value Already existed", Toast.LENGTH_SHORT).show()
            }
        }

        btnReplace.setOnClickListener {
            replaceMethod()
        }

        btnPrint.setOnClickListener {
            val number = Integer.parseInt(edtPrintNumber.text.toString())
            printNValue(number)
        }
    }

    private fun replaceMethod() {
        val str = "abc pradeep 123"
        val replaceChar = str.split(" ").toTypedArray()
        for (i in replaceChar.indices) {
            if (replaceChar[i].contains(" ")) {
                replaceChar[i] = "*"
            }
        }
        val str1 = StringBuilder(replaceChar.toString())
        edtReplace.setText(str1)
    }

    fun printNValue(n: Int) {
        if (n > 0) {
            printNValue(n - 1)
            printValueTillZero.text = "$n"
        }
        return
    }
}