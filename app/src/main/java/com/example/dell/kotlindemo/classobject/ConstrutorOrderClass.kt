package com.example.dell.kotlindemo.classobject

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 次级构造器
 */
class ConstrutorOrderClass {
    var name:String?=null
    var age :Int = 0
    constructor(name :String,age :Int){
        this.name=name
        this.age=age
    }
}