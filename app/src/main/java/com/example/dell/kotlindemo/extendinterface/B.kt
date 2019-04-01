package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 */
interface B {
    fun foo() {//接口默认是open 卧槽接口定义的方法还可以重写
        Log.e("B", "B.foo() 方法调用")
    }
    fun test()
}