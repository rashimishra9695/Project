package com.sunbeaminfo.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnDiv: Button
    lateinit var btnMul: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var ResultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnAdd =findViewById(R.id.btn_add)
        btnSub =findViewById(R.id.btn_sub)
        btnDiv =findViewById(R.id.btn_div)
        btnMul =findViewById(R.id.btn_mul)
        etA =findViewById(R.id.et_a)
        etB =findViewById(R.id.et_b)
        ResultTv =findViewById(R.id.tv_result)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnMul.setOnClickListener(this)



        }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add->{
                result = a+b

            }
            R.id.btn_sub->{
                result = a-b

            }
            R.id.btn_div->{
                    result = a/b
            }
            R.id.btn_mul->{
                result = a*b
            }

        }
      ResultTv.text = "Result: $result"
    }
}
