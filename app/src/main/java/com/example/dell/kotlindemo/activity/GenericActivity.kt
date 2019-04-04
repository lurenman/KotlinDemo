package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.generic.*
import kotlin.reflect.KClass

/**
 * 创建日期：2019/3/22
 * 作者:baiyang
 * 泛型和java大多数差不多
 * 参考https://www.jianshu.com/p/fd1594dfa05d
 * http://www.runoob.com/kotlin/kotlin-generics.html
 * https://www.jianshu.com/p/016a24ba7a25 不错讲协变和逆变
 * 好好结合java基础demo理解一下
 */
class GenericActivity : BaseActivity() {
    companion object {
        private val TAG = "GenericActivity"
    }

    private var btn_click: Button? = null
    private var btn_interface: Button? = null
    private var btn_constraint: Button? = null
    private var btn_out: Button? = null
    private var btn_in: Button? = null
    private var btn_asterisk: Button? = null

    override val actionBarTitle: String
        get() = "泛型"

    override fun initViews() {
        setContentView(R.layout.activity_generic)
        btn_click = findViewById<Button>(R.id.btn_click)
        btn_interface = findViewById<Button>(R.id.btn_interface)
        btn_constraint = findViewById<Button>(R.id.btn_constraint)
        btn_out = findViewById<Button>(R.id.btn_out)
        btn_in = findViewById<Button>(R.id.btn_in)
        btn_asterisk = findViewById<Button>(R.id.btn_asterisk)
    }

    override fun initListener() {
        btn_click!!.setOnClickListener(View.OnClickListener {
            val genericClass = GenericClass("String")
            val genericClass1 = GenericClass<Int>(123)
            Log.e(TAG, "genericClass.key:" + genericClass.key)
            Log.e(TAG, "genericClass1.key:" + genericClass1.key)
        })
        btn_interface!!.setOnClickListener(View.OnClickListener {
            val interfaceClassString = InterfaceClass<String>("娜美")
            val nextStr = interfaceClassString.next()
            val interfaceClassInt = InterfaceClass<Int>(123)
            val nextInt = interfaceClassInt.next()
            Log.e(TAG, "nextStr:" + nextStr)
            Log.e(TAG, "nextInt:" + nextInt)
        })
        btn_constraint!!.setOnClickListener(View.OnClickListener {
            GeneratorMethod.foo(19)
            GeneratorMethod.foo1("招摇")
        })
        //泛型协变
        btn_out!!.setOnClickListener(View.OnClickListener {
            val zoomOut = ZoomOut<Animal>(Animal())
            // zoomOut.foo1()
            val zoomOut1 = ZoomOut<Dog>(Dog())
            //  zoomOut1.foo1()
            outMethod(zoomOut)
            outMethod(zoomOut1)
            val genericOutInClass = GenericOutInClass<Animal>(Animal())
            outInMethod(genericOutInClass)

        })
        //泛型逆变
        btn_in!!.setOnClickListener(View.OnClickListener {
            val zoomIn = ZoomIn<Animal>()
            val zoomIn1 = ZoomIn<Dog>()
            inMethod(zoomIn)
            inMethod(zoomIn1)
        })
        //星号投影
        btn_asterisk!!.setOnClickListener(View.OnClickListener {
            functionClass(Dog::class)
            wildcardMethod(WildcardA(Animal()))
            wildcardMethod(WildcardA(123))
        })
    }
//    fun <T : Comparable<T>> sort(list: List<T>) {
//        // ……
//    }
    /**
     * 感觉相当于 <? extend Animal>
     */
    fun outMethod(zoomOut: ZoomOut<Animal>) {
        zoomOut.foo1()
    }

    fun outInMethod(generic: GenericOutInClass<Animal>) {
        generic.foo1()
    }

    fun inMethod(zoomIn: ZoomIn<Dog>) {
        val dog = Dog()
        // val animal = Animal()
        zoomIn.foo(dog)
    }

    fun functionClass(cls: KClass<*>) {
        Log.e(TAG, "cls.toString():" + cls.toString())
    }
    fun wildcardMethod(wild :WildcardA<*>){
        wild.foo()
    }
}