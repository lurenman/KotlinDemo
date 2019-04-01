package com.example.dell.kotlindemo.classobject

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 构造函数
 * 如果修饰符加上private那就访问不到get和set
 */
class ConstructorMainClass(name: String, age: Int) {
      var name: String
      var age: Int
//    var name: String=name
//    var age: Int=age
    init {
        this.name = name
        this.age = age
    }

}
/**
 * 当主构造函数有注解或者可见性修饰符，需加 constructor 关键字。
 * 这个public 为什么修饰在后面
 */
class Personpublic public constructor(name: String) {
}
