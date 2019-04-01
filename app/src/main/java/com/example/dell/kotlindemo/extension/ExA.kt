package com.example.dell.kotlindemo.extension

import android.util.Log

/**
 * 创建日期：2019/3/12
 * 作者:baiyang
 * 扩展函数是静态解析的，并不是接收者类型的虚拟成员，在调用扩展函数时，具体被调用的的是哪一个函数，
 * 由调用函数的的对象表达式来决定的，而不是动态的类型决定的:
 * 原来扩展可以声明在外面
 */
open class ExA {
    companion object {
        val TAG = "ExA"
    }

    fun test(a: ExB) {
        a.foo()
    }

}

fun ExA.foo() {
    Log.e(ExA.TAG, "ExA.foo()")
}

