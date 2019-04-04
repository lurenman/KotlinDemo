package com.example.dell.kotlindemo.generic

import android.util.Log

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 * 星号投影
 */
class WildcardA<T>(t: T) {
    var type: T

    init {
        type = t
    }

    companion object {
        val TAG = "WildcardA"
    }

    fun foo() {
        Log.e(TAG,"type.toString():"+type.toString())
    }
}