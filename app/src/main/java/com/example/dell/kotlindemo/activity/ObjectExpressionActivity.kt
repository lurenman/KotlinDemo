package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.objectexpression.A
import com.example.dell.kotlindemo.objectexpression.ExpressionInterface

/**
 * 创建日期：2019/4/6
 * 作者:baiyang
 * 对象表达式
 */
class ObjectExpressionActivity : BaseActivity() {
    //一个类里面只能声明一个内部关联对象，即关键字 companion 只能使用一次。
    companion object {
        val TAG: String = "ObjectExpression"
        fun goto() {

        }
    }

    private var btn_expression: Button? = null
    private var btn_declaration: Button? = null
    private var btn_companion_object: Button? = null
    override val actionBarTitle: String
        get() = "对象表达式"

    override fun initViews() {
        setContentView(R.layout.activity_object_expression)
        btn_expression = findViewById<Button>(R.id.btn_expression)
        btn_declaration = findViewById<Button>(R.id.btn_declaration)
        btn_companion_object = findViewById<Button>(R.id.btn_companion_object)
    }

    override fun initListener() {
        btn_expression!!.setOnClickListener(View.OnClickListener {
            // test1()
            test2()
            test3()
        })
        btn_declaration!!.setOnClickListener(View.OnClickListener {
            test4()
        })
        btn_companion_object!!.setOnClickListener(View.OnClickListener {
            test5()
        })
    }

    /**
     * 就看作一个对象完了
     */
    fun test1() {
        val obj = object : A(18), ExpressionInterface {
            override fun foo() {
                Log.e(TAG, "test1()")
            }
        }
        obj.foo()
    }

    fun test2() {
        val obj = object {
            var name = "namei"
            var age = 18
            override fun toString(): String {
                return "name:" + name + "\n" + "age:" + age
            }
        }
        Log.e(TAG, "test2():" + obj.toString())
    }

    /**
     * 这个有点没理解
     */
    fun test3() {
        val x1 = foo().x        // 没问题
        // val x2 = publicFoo().x  // 错误：未能解析的引用“x”
    }

    /**
     * 说白了就是证明一下是单例
     */
    fun test4() {
        val site1 = Site
        val site2 = Site
        site1.url = "www.baidu.com"
        Log.e(TAG, "test4():" + "site1.url:" + site1.url + "\n"
                + "site2.url:" + site2.url)
    }

    /**
     * 类内部的对象声明可以用 companion 关键字标记，这样它就与外部类关联在一起，我们就可以直接通过外部类访问到对象的内部元素。
     */
    fun test5() {

//        ObjectExpressionActivity.goto()
//        ObjectExpression.goto()  这个是自定义的ObjectExpression name
//        goto()
//        ObjectExpressionActivity.Companion.goto()   .Companion 没有名字可以直接这么搞拿到对象，对象也是单例感觉没啥意义
    }

    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    /**
     * 这个外面也能访问到 就是一个类里的单例对象
     * 感觉像static声明 的内部类在创建一个static单例对象一样
     */
    object Site {
        var url: String = ""
        val name: String = "菜鸟教程"
    }

}