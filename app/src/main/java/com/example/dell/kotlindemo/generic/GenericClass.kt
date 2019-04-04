package com.example.dell.kotlindemo.generic

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 */
class GenericClass<T> {
    var key: T? = null

    constructor(key: T) {
        this.key = key
        //this@GenericClass.key=key
    }

}
