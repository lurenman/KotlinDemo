package com.example.dell.kotlindemo.enumclass

import android.util.Log

/**
 * 创建日期：2019/4/4
 * 作者:baiyang
 */
enum class Color1(var rgb: Int):InterfaceEnum {
    RED(100), BLACK(200), BLUE(300){}, GREEN(400), WHITE(500){
        //自己实现
        override fun click() {
            Log.e(TAG, "click()WHITE:" + nameValue)
        }


    };

    companion object {
        val TAG = "Color1"
    }

    var nameValue: String? = null
    fun foo(str: String) {
        nameValue = str+rgb
        Log.e(TAG, "foo:" + nameValue)
    }

    /**
     * 可以统一实现也可单一实现
     */
    override fun click() {
        Log.e(TAG, "click():" + nameValue)
    }
}