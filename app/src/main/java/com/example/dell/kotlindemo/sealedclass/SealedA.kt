package com.example.dell.kotlindemo.sealedclass

/**
 * 创建日期：2019/3/13
 * 作者:baiyang
 * 密封类 比较像Java 枚举
 * 子类都必须要内嵌在密封类中
 * 感觉就是枚举，主要也就是配合when使用的
 */
sealed class SealedA() {
    object Show : SealedA()
    object Hide : SealedA()
    class A(var name: String) : SealedA()
    class B(var age: Int) : SealedA() {
        //还可以有自己的方法
        fun foo(name: String): String {
            return name + " age:" + age
        }

        override fun exc() {
            super.exc()
        }
    }

    open fun exc() {

    }
}



