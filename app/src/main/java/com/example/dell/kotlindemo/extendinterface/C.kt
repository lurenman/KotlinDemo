package com.example.dell.kotlindemo.extendinterface

import android.util.Log

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 发现接口中的方法和父类A中的有同名方法时候可以不去实现
 */
class C :A(), B {
    //看到没重写var定义的变量是有set方法
    override var name: String
        get() = "C-name"
        set(value) {

        }
    //看到没重写va定义的变量里只有get方法
    override val age: Int
        get() =20
    override fun test() {
        Log.e("C", "C.test() 方法调用")
    }

    override fun foo() {
        //可以选择性调用父级方法
//        super<A>.foo()
        super<B>.foo()
        Log.e("C", "C.foo() 方法调用")
    }

}