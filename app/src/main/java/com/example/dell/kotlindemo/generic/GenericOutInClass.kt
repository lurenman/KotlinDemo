package com.example.dell.kotlindemo.generic

import android.util.Log

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 * 探究协变
 */
class GenericOutInClass<T : Animal> {
    companion object {
        val TAG = "GenericOutClass"
    }

    private var type: T? = null

    constructor(t: T) {
        type = t
    }

    fun foo(t: T) {

    }

    fun foo1(): T? {
        Log.e(TAG, "type.toString():" + type.toString())
        return type
    }
}