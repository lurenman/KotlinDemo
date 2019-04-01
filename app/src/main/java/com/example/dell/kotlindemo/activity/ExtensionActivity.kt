package com.example.dell.kotlindemo.activity

import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.extension.*

/**
 * 创建日期：2019/3/12
 * 作者:baiyang
 * 扩展简单练习一下，说白了就是一个就像把调用者传过去一样
 * 注意一下扩展可以声明在类外部，静态解析
 */
class ExtensionActivity : BaseActivity() {
    private var btn_test: Button? = null
    private var btn_static_resolution: Button? = null
    override val actionBarTitle: String
        get() = "扩展"

    override fun initViews() {
        setContentView(R.layout.activity_extension)
        btn_test = findViewById<Button>(R.id.btn_test)
        btn_static_resolution = findViewById<Button>(R.id.btn_static_resolution)

    }

    override fun initListener() {
        btn_test!!.setOnClickListener(View.OnClickListener {
            var user = User("娜美")
            user.test()

        })
        btn_static_resolution!!.setOnClickListener(View.OnClickListener {
            val exA = ExA()
            exA.test(ExB())
        })
    }

}