package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 */
open class A {
    //定义两个属性分别是var和val声明的
    open var name: String = "娜美"
    open val age: Int = 18
    open fun foo() {
        Log.e("A", "A.foo() 方法调用")
    }
}