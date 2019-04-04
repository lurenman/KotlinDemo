package com.example.dell.kotlindemo.generic

import android.util.Log

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 * 使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型：
 */
class ZoomOut<out T> {
    companion object {
        val TAG = "ZoomOut"
    }

    private var type: T? = null

    constructor(t: T) {
        type = t
    }

    //    fun foo(t: T) {
//
//    }
    fun foo1(): T? {
        Log.e(TAG, "type.toString():" + type.toString())
        return type
    }
}