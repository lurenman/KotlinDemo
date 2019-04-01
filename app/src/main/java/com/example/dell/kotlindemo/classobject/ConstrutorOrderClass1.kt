package com.example.dell.kotlindemo.classobject

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 次级构造器
 * 发没发先这种构造调用还有种继承关系
 */
class ConstrutorOrderClass1 {
    val username: String
    var age: Int
    var address: String
    var isMarried: Boolean


    init {
        this.address = "Beijing"
        this.isMarried = false
    }

    constructor(username: String, age: Int) {
        this.username = username
        this.age = age
    }

    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
    }


    constructor(username: String, age: Int, address: String, isMarried: Boolean) : this(username, age, address) {
        this.isMarried = isMarried
    }

}