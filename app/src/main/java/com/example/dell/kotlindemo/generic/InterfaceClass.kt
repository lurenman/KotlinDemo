package com.example.dell.kotlindemo.generic

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 * 仿照java 泛型接口
 */
class InterfaceClass<T> : Generator<T> {
    private var type: T? = null

    constructor(type: T) {
        this.type = type
    }

    override fun next(): T? {
        return type
    }
}