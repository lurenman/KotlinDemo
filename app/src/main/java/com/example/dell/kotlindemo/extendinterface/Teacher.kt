package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 被继承除了抽象就必须声明open
 */
open class Teacher {
    companion object {
        private val TAG = "Teacher"
    }

    open fun doSomething() {
        Log.e(TAG, "美女老师")
    }
}