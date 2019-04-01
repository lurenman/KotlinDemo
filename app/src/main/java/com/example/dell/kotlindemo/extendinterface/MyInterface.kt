package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/6
 * 作者:baiyang
 * Kotlin 接口与 Java 8 类似，使用 interface 关键字定义接口，允许方法有默认实现：
 * 接口有默认的实现方法，实现接口就可以不用去实现它
 */
interface MyInterface {
    var name:String //name 属性, 抽象的
    fun bar()
    fun foo() {
        // 可选的方法体
        Log.e("MyInterface", "MyInterface.foo() 方法调用")
    }
}