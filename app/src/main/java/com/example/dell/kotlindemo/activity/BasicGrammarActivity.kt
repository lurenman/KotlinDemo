package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R

/**
 * 创建日期：2019/2/25
 * 作者:baiyang
 * http://www.runoob.com/kotlin/kotlin-basic-syntax.html
 */
class BasicGrammarActivity : BaseActivity() {
    companion object {
        private val TAG = "BasicGrammarActivity"
    }

    //当一个变量允许为空值时，必须显示地使用 ? 来进行声明
    private var btn_test: Button? = null
    private var btn_null: Button? = null
    private var btn_interval: Button? = null
    override val actionBarTitle: String
        get() = "基础语法"

    override fun initViews() {
        setContentView(R.layout.activity_basic_grammar)
        btn_test = findViewById<Button>(R.id.btn_test)
        btn_null = findViewById<Button>(R.id.btn_null)
        btn_interval = findViewById<Button>(R.id.btn_interval)
    }

    override fun initListener() {
        btn_test!!.setOnClickListener {
            // val sum = sum(1, 2)
            vars(1, 2, 3, 4, 5)
        }
        btn_null!!.setOnClickListener(View.OnClickListener {
            btnNull()
        })
        btn_interval!!.setOnClickListener(View.OnClickListener {
            interval()
        })
    }

    fun sum(a: Int, b: Int) = a + b
    //    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
    //fun sum(a: Int, b: Int):Int=a+b

    //public fun sum(a: Int, b: Int) = a + b
    /**
     * 无返回值的函数(类似Java中的void)
     */
    fun printSum(a: Int, b: Int): Unit {
        Log.e(TAG, (a + b).toString())
    }

    /**
     * 函数的变长参数可以用 vararg 关键字进行标识：
     */
    fun vars(vararg v: Int) {
        for (vt in v) {
            Log.e(TAG, "vararg:" + vt.toString())
        }
    }

    /**
     * Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式，字段后加!!像Java一样抛出空异常，
     * 另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
     * 说白就是根据？值可以返回null，根据！！直接抛异常
     */
    fun btnNull() {
        //类型后面加?表示可为空
        var age: String? = "23"
        //抛出空指针异常
        val ages = age!!.toInt()
        //不做处理返回 null
        val ages1 = age?.toInt()
        //age为空返回-1
        val ages2 = age?.toInt() ?: -1
    }

    /**
     * 类型检测及自动类型转换
    我们可以使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)。
    Any 和 Object差不多
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }

        //在这里还有一种方法，与Java中instanceof不同，使用!is
        // if (obj !is String){
        //   // XXX
        // }

        // 这里的obj仍然是Any类型的引用
        return null
    }

    /**
     * 区间测试
     *
     */
    fun interval() {
//        for (i in 1..4) {// 输出“1234” 相当于 1<=i, i<=4
//            Log.e(TAG,i.toString())
//        }
//        for (i in 4..1){// 什么都不输出 相当于 4<=i,i<=1 所以没输出
//            Log.e(TAG,i.toString())
//        }
//        for (i in 1..4 step 2){ //step 可以理解为间距
//            Log.e(TAG,i.toString())
//        }
//        for (i in 4..1 step 2){//这种还是什么不输出
//            Log.e(TAG,i.toString())
//        }
//        for (i in 4 downTo 1) {//这个是真真实实的4-1
//            Log.e(TAG, i.toString())
//        }
//        for (i in 4 downTo 1 step 2){
//            Log.e(TAG, i.toString())
//        }
        //// 使用 until 函数排除结束元素
        for (i in 1 until 10) {//相当于1<=1,i<10
            Log.e(TAG, i.toString())
        }

    }
}
