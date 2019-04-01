package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R

/**
 * 创建日期：2019/3/3
 * 作者:baiyang
 * if表达式Break 和 Continue省略
 */
class ControlActivity : BaseActivity() {
    companion object {
        private val TAG = "ControlActivity"
    }

    private var btn_when: Button? = null
    private var btn_while: Button? = null
    private var btn_for: Button? = null
    private var btn_label: Button? = null
    override val actionBarTitle: String
        get() = "条件循环控制"

    override fun initViews() {
        setContentView(R.layout.activity_control)
        btn_when = findViewById<Button>(R.id.btn_when)
        btn_for = findViewById<Button>(R.id.btn_for)
        btn_while = findViewById<Button>(R.id.btn_while)
        btn_label = findViewById<Button>(R.id.btn_label)
    }

    override fun initListener() {
        btn_when!!.setOnClickListener(View.OnClickListener {
            whenControl()
        })
        btn_for!!.setOnClickListener(View.OnClickListener {
            forControl()
        })
        btn_while!!.setOnClickListener(View.OnClickListener {
            whileControl()
        })
        btn_label!!.setOnClickListener(View.OnClickListener {
            labelControl()
        })
    }

    /**
     * when 类似其他语言的 switch 操作符。
     * 在 when 中，else 同 switch 的 default。如果其他分支都不满足条件将会求值 else 分支。
    如果很多分支需要用相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔：
     */
    fun whenControl() {
        var x = 1
        when (x) {
            1 -> Log.e(TAG, "when hello" + x.toString())
            2 -> Log.e(TAG, "when hello" + x.toString())
            else -> Log.e(TAG, "when hello" + x.toString())
        }
        when (x) {
            1, 2 -> Log.e(TAG, "when hello " + x.toString())
            else -> Log.e(TAG, "when hello " + "default")
        }
        when (x) {//感觉x可以代表传进来的参数可以省略
            in 1..10 -> Log.e(TAG, "when hello " + "1..10")
            // !in 10..20 -> Log.e(TAG, "when hello " + "10..20")
            else -> Log.e(TAG, "when hello " + "default")
        }
        var y: Any = "haha"
        when (y) {
            is String -> Log.e(TAG, "when hello " + "is String")
            else -> Log.e(TAG, "when hello " + "is other type")
        }
        //when 也可以用来取代 if-else if链。 如果不提供参数，所有的分支条件都是简单的布尔表达式，而当一个分支的条件为真时则执行该分支：
        when {
            x == 1 -> Log.e(TAG, "when hello " + "x==1")
            x == 2 -> Log.e(TAG, "when hello " + "x==2")
            else -> {
                Log.e(TAG, "when hello " + "x==?")
            }
        }
    }

    /**
     * 集合这种后面会深研究一下
     */
    fun forControl() {
        var a = intArrayOf(1, 2, 3)
//        for (x in a.iterator()) {
//            Log.e(TAG, "for " + x.toString())
//        }
        //IntArray.indices 返回range
//        for (x in a.indices) {//这个只是返回一个range 0，1，2
//            Log.e(TAG, "for index" + a[x].toString())
//        }
        for ((index, value) in a.withIndex()) {
            Log.e(TAG, "for withIndex" + "the element at $index is $value")
        }
    }

    /**
     * do…while 循环 对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
    do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次
     */
    fun whileControl() {
        var x = 2
        while (x > 1) {//死循环
            Log.e(TAG, "while " + x.toString())
        }
        var y = 4
        do {
            Thread.sleep(1000)
            Log.e(TAG, "while " + y.toString())
        } while (y > 3)
    }

    /**
     * 标签的使用
     * 参考https://blog.csdn.net/achenyuan/article/details/83684878
     * 感觉这个东西就是控制在哪返回的，像java的话估计应该是套方法返回了
     */
    fun labelControl() {
//        loop@ for (i in 1..10) {
//            for (j in 1..10) {
//                if (i == 3 && j == 3) {
//                    Log.e(TAG, "label1 " + i.toString())
//                    break@loop
//                }
//
//            }
//            Log.e(TAG, "label2 " + i.toString())
//        }
//        var a = intArrayOf(1, 2, 3)
//        a.forEach {
//            Log.e(TAG, "forEach " + it.toString())
//        }
        //注意一下标签是在表达式前面的
//        intArrayOf(1, 2, 3).forEach lit@{
//            if (it == 3)
//                return@lit // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
//            Log.e(TAG, "forEach " + it.toString())
//        }
//        //隐式标签更方便。 该标签与接受该 lambda 的函数同名。
        intArrayOf(1, 2, 3).forEach {
            if (it == 3)
                return@forEach
            Log.e(TAG, "forEach " + it.toString())
        }
//        intArrayOf(1, 2, 3).forEach {
//            if (it == 3)
//                return
//            Log.e(TAG, "forEach " + it.toString())
//        }
        Log.e(TAG, "forEach " + "--------")
    }
}