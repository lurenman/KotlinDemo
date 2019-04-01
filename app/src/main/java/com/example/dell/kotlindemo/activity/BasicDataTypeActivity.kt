package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R

/**
 * 创建日期：2019/2/28
 * 作者:baiyang
 * 参考http://www.runoob.com/kotlin/kotlin-basic-types.html
 */
class BasicDataTypeActivity : BaseActivity() {
    companion object {
        private val TAG = "BasicDataTypeActivity"
    }

    private var btn_comparison: Button? = null
    private var btn_test: Button? = null
    private var btn_bit_operator: Button? = null
    private var btn_array: Button? = null
    private var btn_string: Button? = null
    override val actionBarTitle: String
        get() = "基础数据类型"

    override fun initViews() {
        setContentView(R.layout.activity_basic_data_type)
        btn_test = findViewById<Button>(R.id.btn_test)
        btn_comparison = findViewById<Button>(R.id.btn_comparison)
        btn_bit_operator = findViewById<Button>(R.id.btn_bit_operator)
        btn_array = findViewById<Button>(R.id.btn_array)
        btn_string = findViewById<Button>(R.id.btn_string)
    }

    override fun initListener() {
        super.initListener()
        btn_test!!.setOnClickListener(View.OnClickListener {

        })
        //TODO 三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
        btn_comparison!!.setOnClickListener(View.OnClickListener {
            val a: Int = 1
            val b: Int = 1
            val c: Int = 2
            val d: Int? = a
            val e: Int? = a
            Log.e(TAG, (a == b).toString())
            Log.e(TAG, (a === b).toString())
            Log.e(TAG, (a === d).toString())
            Log.e(TAG, (a == c).toString())
            Log.e(TAG, (a === e).toString())

        })
        /**
         * 参考https://www.jianshu.com/p/0122c1441178
         */
        btn_bit_operator!!.setOnClickListener(View.OnClickListener {
            //operatorBaseMethod()
            operatorMethod()
        })
        btn_array!!.setOnClickListener(View.OnClickListener {
            arrayMethod()
        })
        btn_string!!.setOnClickListener(View.OnClickListener {
            stringMethod()
        })
    }

    /**
     * 基本运算符 基本运算符另一种表达方式
     * a + b   a.plus(b)
    a - b   a.minus(b)
    a * b   a.times(b)
    a / b   a.div(b)
    a % b   a.rem(b), a.mod(b) (deprecated)
    a..b    a.rangeTo(b)
     */
    fun operatorBaseMethod() {
        var a = 1
        var b = 2
        val plus = a.plus(b)//  plus:3
        val minus = a.minus(b)//minus:-1
        val times = a.times(b)//
        val div = a.div(b)//  div:0
        val i = a % b//    i:1
        val rangeTo = a.rangeTo(b)//  rangeTo:1..2 就是创造一个range
//        for (y in rangeTo){
//            Log.e(TAG,y.toString())
//        }
        Log.e(TAG, "plus:" + plus.toString() + "\n"
                + "minus:" + minus + "\n"
                + "times:" + times + "\n"
                + "div:" + div + "\n"
                + "i:" + i + "\n"
                + "rangeTo:" + rangeTo + "\n"
        )
    }

    /**
     * 位运算符对照表：
     * shl(bits) – 有符号左移 (相当于 Java’s <<)
    shr(bits) – 有符号右移 (相当于 Java’s >>)
    ushr(bits) – 无符号右移 (相当于 Java’s >>>)
    and(bits) – 按位与
    or(bits) – 按位或
    xor(bits) – 按位异或
    inv(bits) – 按位翻转
     */
    fun operatorMethod() {
        var a = 2
        var b = 3
        val shl = a.shl(b)
        val shr = a.shr(b)
        val ushr = a.ushr(b)
        val and = a.and(b)
        val or = a.or(b)
        val xor = a.xor(b)
        //val inv = a.inv(b)
        Log.e(TAG, "shl:" + shl.toString() + "\n"
                + "shr:" + shr + "\n"
                + "ushr:" + ushr + "\n"
                + "and:" + and + "\n"
                + "or:" + or + "\n"
                + "xor:" + xor + "\n")
    }

    /**
     * 数组的创建两种方式：一种是使用函数arrayOf()；另外一种是使用工厂函数。如下所示，我们分别是两种方式创建了两个数组：
     */
    fun arrayMethod() {
        var a = arrayOf(1, 2, 3)
        var b = intArrayOf(1, 2, 3)
        //[0,2,4]
        val c = Array(3, { i -> (i * 2) })//有待研究
        Log.e(TAG, "a:" + a[2])
        Log.e(TAG, "b:" + b[2])
        Log.e(TAG, "c:" + c[2])
    }

    /**
     * 关于字符串的练习
     * Kotlin 支持三个引号 """ 扩起来的字符串，支持多行字符串
     * $感觉就是一个引用
     */
    fun stringMethod() {
//      for (c in "大美女"){//很6
//          Log.e(TAG,c.toString())
//      }
//        val text = """
//    多行字符串
//    多行字符串
//    """
//        Log.e(TAG, text)
//        val text1 = """
//    |多行字符串
//    |菜鸟教程
//    |多行字符串
//    |Runoob
//    """.trimMargin()
//        println(text1)    // 前置空格删除了
//        text1.trim()
        var str = "林允儿"
        var str1 = "$str 是大美女"
        Log.e(TAG, str1)
    }
}