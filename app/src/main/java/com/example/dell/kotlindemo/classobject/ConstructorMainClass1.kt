package com.example.dell.kotlindemo.classobject

/**
 * 创建日期：2019/3/5
 * 作者:baiyang
 * 这种在构造器中声明形参，然后在属性定义进行赋值，这个过程实际上很繁琐，
 * 有没有更加简便的方法呢？当然有，我们可以直接在Primary Constructor中定义类的属性
 */
class ConstructorMainClass1(var name :String,var age :Int) {

}
