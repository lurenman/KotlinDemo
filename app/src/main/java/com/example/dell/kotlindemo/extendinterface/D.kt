package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/6
 * 作者:baiyang
 */
class D :MyInterface {
    override var name: String
        get() ="D_NAME"
        set(value) {}

    override fun bar() {
        Log.e("D", "D.bar() 方法调用")
    }
}