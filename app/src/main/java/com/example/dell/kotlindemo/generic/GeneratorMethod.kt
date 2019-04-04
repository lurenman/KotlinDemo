package com.example.dell.kotlindemo.generic

import android.util.Log

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 * 使用<T:Any>来确保类型T是非空类型；
 */
class GeneratorMethod<T>(key: T) {
    /**
     * 伴生对象只可以有一个可以
     */
    companion object {
        public val TAG = "GeneratorMethod"
        fun <T : Number> foo(age: T) {
            Log.e(TAG, "age:" + age)
        }

        /**
         * 指定多个约束
         * 如同Java 中 (<T extends Number & Appendable>)
         */
        fun <T> foo1(name: T) where T : String, T : CharSequence {
            Log.e(TAG, "name:" + name)
        }
    }
}