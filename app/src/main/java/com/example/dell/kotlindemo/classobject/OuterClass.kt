package com.example.dell.kotlindemo.classobject

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 嵌套类
 */
class OuterClass {
    val age: Int = 1

    class NestedClass {             // 嵌套类
        fun foo() {
            Log.e("NestedClass", "nestedClass:" + "嵌套类方法被调用")
        }


    }
}