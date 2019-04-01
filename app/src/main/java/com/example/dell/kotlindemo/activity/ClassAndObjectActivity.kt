package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.classobject.*

/**
 * 创建日期：2019/3/4
 * 作者:baiyang
 */
class ClassAndObjectActivity : BaseActivity() {
    companion object {
        private val TAG = "ClassAndObjectActivity"
    }

    private var btn_property: Button? = null
    private var btn_constructor: Button? = null
    private var btn_nested: Button? = null
    private var btn_internal: Button? = null
    private var btn_anonymous_internal: Button? = null
    //private var lateObject: runObject?=null
    //非空属性必须在定义的时候初始化,kotlin提供了一种可以延迟初始化的方案,使用 lateinit 关键字描述属性：
    private lateinit var lateObject: runObject
    override val actionBarTitle: String
        get() = "类和对象"

    override fun initViews() {
        setContentView(R.layout.activity_class_object_activity)
        btn_property = findViewById<Button>(R.id.btn_property)
        btn_constructor = findViewById<Button>(R.id.btn_constructor)
        btn_nested = findViewById<Button>(R.id.btn_nested)
        btn_internal = findViewById<Button>(R.id.btn_internal)
        btn_anonymous_internal = findViewById<Button>(R.id.btn_anonymous_internal)
    }

    override fun initListener() {

        btn_property!!.setOnClickListener(View.OnClickListener {
            //            val runObject = runObject()
//            //默认实现get和setter val只实现get var全实现
//
//            val name = runObject.name
//            runObject.age = 13
//            val age = runObject.age
//            Log.e(TAG, "age:" + age.toString())
//            Log.e(TAG, "name:" + name.toString())
//            runObject.name = "11"
//            Log.e(TAG, "name1:" + name.toString())
//            val person = Person("小明")
            val student = Student()
            student.age = 100
            Log.e(TAG, "student.age:" + student.age.toString())

        })
        btn_constructor!!.setOnClickListener(View.OnClickListener {
            val constructorMainClass = ConstructorMainClass("小明", 18)
            Log.e(TAG, "constructorMainClass.name:" + constructorMainClass.name)
            val constructorMainClass1 = ConstructorMainClass1("小红", 19)
            Log.e(TAG, "constructorMainClass1.name:" + constructorMainClass1.name)
            val construtorOrderClass = ConstrutorOrderClass("路飞", 20)
            Log.e(TAG, "construtorOrderClass.name:" + construtorOrderClass.name)
            val construtorOrderClass1 = ConstrutorOrderClass1("娜美", 18, "日本", false)
            Log.e(TAG, "ConstrutorOrderClass1.name:" + construtorOrderClass1.username)
        })
        btn_nested!!.setOnClickListener(View.OnClickListener {
            OuterClass.NestedClass().foo()//这部和java差不多
        })
        btn_internal!!.setOnClickListener(View.OnClickListener {
            val foo = OuterClass1().InnerClass().foo()
            Log.e(TAG, "OuterClass1().InnerClass().foo():" + foo)
            OuterClass1().InnerClass().test()

        })
        btn_anonymous_internal!!.setOnClickListener(View.OnClickListener {
            val clazz = AnonymousInternalClass()
            clazz.setInterFace(object : AnonymousInternalClass.TestInterFace {
                override fun test() {
                    Log.e(TAG, "匿名内部类调用了")
                }

            })
        })
    }

    class runObject {
        var name: String? = null
            get() = field
            set(value) {
                field = "haha"
            }
        var age: Int = 12
        val id: String = ""
    }


}