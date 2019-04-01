package com.example.dell.kotlindemo.classobject

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 内部类是一种特殊的嵌套类，被嵌套到里面的类使用inner关键字修饰，内部类可以拥有对外部类的引用。但是外部类没有内部类的引用
 */
class OuterClass1 {
    private var name: String = "haha"
    private var age: Int = 18

    inner class InnerClass {
        fun foo(): String {
            return name
        }

        fun test() {
            val outerClass1 = this@OuterClass1 //获取外部类的成员变量
            outerClass1.age
            outerClass1.logAge()
            logAge()//看到没不用获取外部类成员变量也可以直接调用
        }
    }

    private fun logAge() {
        Log.e("OuterClass1", "logAge():" + "嵌套类方法被调用")
    }
}