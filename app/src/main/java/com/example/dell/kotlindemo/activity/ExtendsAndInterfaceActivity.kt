package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.extendinterface.C
import com.example.dell.kotlindemo.extendinterface.D

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 继承比较简单略
 */
class ExtendsAndInterfaceActivity : BaseActivity() {
    companion object {
        private val TAG = "ExtendsAndInterface"
    }

    private var btn_overried: Button? = null
    private var btn_interface: Button? = null
    override val actionBarTitle: String
        get() = "继承和接口"

    override fun initViews() {
        setContentView(R.layout.activity_extend_interface)
        btn_overried = findViewById<Button>(R.id.btn_overried)
        btn_interface = findViewById<Button>(R.id.btn_interface)
    }

    override fun initListener() {
        btn_overried!!.setOnClickListener(View.OnClickListener {
            //            val students = Students()
//            students.doSomething()
            val c = C()
            c.foo()
            Log.e(TAG, "c.name:+${c.name}" + "\n" + "c.age:${c.age}")
        })
        btn_interface!!.setOnClickListener(View.OnClickListener {
            val d = D()
            Log.e(TAG, "d.name:+${d.name}")
            d.bar()
            d.foo()
        })
    }
}