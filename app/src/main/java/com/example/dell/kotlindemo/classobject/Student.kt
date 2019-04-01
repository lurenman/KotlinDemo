package com.example.dell.kotlindemo.classobject

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * http://www.runoob.com/kotlin/kotlin-class-object.html
 * 理解就好
 */
class Student {
    var name: String? = null

    var age: Int = 0
        get() = field
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }
}