package com.example.dell.kotlindemo.generic

import android.util.Log

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 *  n 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型：
 */
class ZoomIn<in T> {
    companion object {
        val TAG = "ZoomOut"
    }

    private var type: T? = null

//    constructor(t: T) {
//        type = t
//    }

    fun foo(t: T) {
        Log.e(TAG, "t.toString():" + t.toString())
    }
//    fun foo1(): T? {
//        Log.e(TAG, "type.toString():" + type.toString())
//        return type
//    }
}