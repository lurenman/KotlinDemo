package com.example.dell.kotlindemo.activity

import com.example.dell.kotlindemo.R

/**
 * 创建日期：2019/3/22
 * 作者:baiyang
 */
class GenericActivity : BaseActivity() {
    override val actionBarTitle: String
        get() = "泛型"

    override fun initViews() {
        setContentView(R.layout.activity_generic)
    }
}