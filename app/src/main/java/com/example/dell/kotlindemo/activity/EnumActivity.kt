package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.enumclass.Color
import com.example.dell.kotlindemo.enumclass.Color1

/**
 * 创建日期：2019/4/4
 * 作者:baiyang
 * 和sealed做个比较感觉sealed when中是有提示的
 */
class EnumActivity : BaseActivity() {
    companion object {
        val TAG = "EnumActivity"
    }

    private var btn_test: Button? = null
    private var btn_enum_constants: Button? = null
    override val actionBarTitle: String
        get() = "枚举"

    override fun initViews() {
        setContentView(R.layout.activity_enum)
        btn_test = findViewById<Button>(R.id.btn_test)
        btn_enum_constants = findViewById<Button>(R.id.btn_enum_constants)
    }

    override fun initListener() {
        btn_test!!.setOnClickListener(View.OnClickListener {
            test(Color.BLUE)
            test1(Color1.GREEN)
            test1(Color1.BLACK)
            test1(Color1.WHITE)
        })
        //枚举常量
        btn_enum_constants!!.setOnClickListener(View.OnClickListener {
            constantsMethod()
            printAllValues<Color>()
        })
    }

    fun test(color: Color) {
        when (color) {
            Color.RED -> Log.e(TAG, "Color.RED")
            Color.BLUE -> Log.e(TAG, "Color.BLUE")
            else -> Log.e(TAG, "Color.OTHER")
        }
    }

    fun test1(color1: Color1) {
        when (color1) {
            Color1.GREEN -> {
                Color1.GREEN.foo("GREEN")
            }
            Color1.BLACK -> {
                Color1.BLACK.foo("BLACK")
                Color1.BLACK.click()
            }
            Color1.WHITE -> {
                Color1.WHITE.foo("WHITE")
                Color1.WHITE.click()
            }
        }
    }

    fun constantsMethod() {
//        for (value in Color1.values()) {
//            Log.e(TAG,"value:"+value.toString())
//        }
        val valueOf = Color1.valueOf("BLACK")
        Log.e(TAG, "valueOf:" + valueOf)
        var color1: Color1 = Color1.WHITE
        Log.e(TAG, "color1.name:" + color1.name)
        val ordinal = color1.ordinal
        Log.e(TAG, "color1.ordinal:" + ordinal)
    }

    /**
     * 用内联函数
     * 说白了这个就是省略了判断类型
     */
    inline fun <reified T : Enum<T>> printAllValues() {
        //print(enumValues<T>().joinToString { it.name })
//        for (enumValue in enumValues<T>()) {
//
//        }
        val joinToString = enumValues<T>().joinToString {
            it.name
        }
        Log.e(TAG, "joinToString:" + joinToString)
    }

}