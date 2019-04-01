package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 */
class Students : Teacher() {
    companion object {
        private val TAG = "Students"
    }

    override fun doSomething() {
        //super.doSomething()
        Log.e(TAG, "美女学生")
    }
}