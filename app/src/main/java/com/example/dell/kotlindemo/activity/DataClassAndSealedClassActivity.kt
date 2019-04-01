package com.example.dell.kotlindemo.activity

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.dell.kotlindemo.R
import com.example.dell.kotlindemo.dataclass.DataA
import com.example.dell.kotlindemo.sealedclass.SealedA

/**
 * 创建日期：2019/3/12
 * 作者:baiyang
 * https://www.cnblogs.com/figozhg/p/6363335.html 数据类Java代码
 */
class DataClassAndSealedClassActivity : BaseActivity() {
    companion object {
        private val TAG = "DataClassAndSealed"
    }

    private var btn_data_class: Button? = null
    private var btn_sealed_class: Button? = null
    override val actionBarTitle: String
        get() = "数据类与密封类"

    override fun initViews() {
        setContentView(R.layout.activity_data_sealed)
        btn_data_class = findViewById<Button>(R.id.btn_data_class)
        btn_sealed_class = findViewById<Button>(R.id.btn_sealed_class)
    }

    override fun initListener() {
        btn_data_class!!.setOnClickListener(View.OnClickListener {
            val dataA = DataA("jack", 15)
            val copy = dataA.copy(age = 28)
            val copy1 = dataA.copy(name = "索隆", age = 22)
            val equals = copy.equals(copy1)
            val hashCode = copy.hashCode()
            val hashCode1 = copy1.hashCode()
            Log.e(TAG, "copy.age:" + copy.age)
            Log.e(TAG, "copy1.toString():" + copy1.toString())
            Log.e(TAG, "copy.equals(copy1):" + equals)
            Log.e(TAG, "copy.hashCode():" + hashCode + "copy1.hashCode()" + hashCode1)
        })
        btn_sealed_class!!.setOnClickListener(View.OnClickListener {
//            val show = SealedA.Show
//            excute(show)
//            val A = SealedA.A("namei")
//            excute(A)
            val B = SealedA.B(18)
            excute(B)

        })
    }

    fun excute(sealeda: SealedA) = when (sealeda) {
        SealedA.Show -> Toast.makeText(mContext, "Show", Toast.LENGTH_SHORT).show()
        SealedA.Hide -> Toast.makeText(mContext, "Hide", Toast.LENGTH_SHORT).show()
        is SealedA.A->Toast.makeText(mContext, "ealeda.name:"+sealeda.name, Toast.LENGTH_SHORT).show()
        is SealedA.B->Toast.makeText(mContext, "sealeda.foo():"+sealeda.foo("蛮子"), Toast.LENGTH_SHORT).show()
    }
}