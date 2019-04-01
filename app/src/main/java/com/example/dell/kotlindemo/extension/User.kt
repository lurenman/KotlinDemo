package com.example.dell.kotlindemo.extension

import android.util.Log

/**
 * 创建日期：2019/3/12
 * 作者:baiyang
作用域
  扩展，可以是在类之外的，也可以是在类（或伴生对象）中实现，两种情况拥有不同的作用域。上面的示例，
就是在类之外，在这种情况下，扩展的属性和方法可以被其他类用。而如果是在类中实现的，该方法只能被局限在该类中，
也就是说上面的情况里，如果有一个类class Sample，
并在其中扩展String.isNullString(text)方法和List.lastIndex属性，就只能在Sample中使用。
 */
class User(var name: String) {
    companion object {
        private val TAG = "User"
    }

    fun User.Print() {
        Log.e(TAG, "User.print()" + this.name)
    }

    fun Any?.tostring() {
        when (this) {
            null -> Log.e(TAG, "Any?.tostring()")
            else -> Log.e(TAG, "Any?.tostring()-else")
        }
    }

    fun test() {
        Print()
        var t = null
        t.tostring()
    }
}