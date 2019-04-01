package com.example.dell.kotlindemo.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

/**
 * Created by Administrator on 2017/7/27 0027.
 */

abstract class BaseActivity : AppCompatActivity() {
    protected var mContext:Context?=null
    protected abstract val actionBarTitle: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setDisplayUseLogoEnabled(false)
        supportActionBar!!.title = actionBarTitle
        mContext=this
        initViews()
        initVariables()
        initListener()
        loadData()
    }

    protected abstract fun initViews()

    open fun initVariables() {

    }

    open fun loadData() {

    }

    //加open关键字可以重写
    open fun initListener() {

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            else -> {
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
