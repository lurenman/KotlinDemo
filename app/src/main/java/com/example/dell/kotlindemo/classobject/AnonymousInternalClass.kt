package com.example.dell.kotlindemo.classobject

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 */
class AnonymousInternalClass {
    var v = "成员属性"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }
    /**
     * 定义接口
     */
    interface TestInterFace {
        fun test()
    }
}