package com.example.dell.kotlindemo.generic

/**
 * 创建日期：2019/4/3
 * 作者:baiyang
 */
interface Generator<T> {
    fun next():T?
}