package com.example.dell.kotlindemo.dataclass

/**
 * 创建日期：2019/3/12
 * 作者:baiyang
 * 数据类
 * 主构造函数至少包含一个参数。

所有的主构造函数的参数必须标识为val 或者 var ;

数据类不可以声明为 abstract, open, sealed 或者 inner;

数据类不能继承其他类 (但是可以实现接口)。
 */
data class DataA(var name: String, var age: Int) {
//    译器会自动的从主构造函数中根据所有声明的属性提取以下函数：
//
//    equals() / hashCode()
//    toString() 格式如 "User(name=John, age=42)"
//    componentN() functions 对应于属性，按声明顺序排列
//    copy() 函数

    //说白了数据类就是封装了几个方法供外面使用而已
}