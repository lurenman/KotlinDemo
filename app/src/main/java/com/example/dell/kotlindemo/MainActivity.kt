package com.example.dell.kotlindemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.example.dell.kotlindemo.activity.*

/**
 * http://www.runoob.com/kotlin/kotlin-basic-syntax.html
 */
class MainActivity : AppCompatActivity() {
    private var btn_basic_grammar: Button? = null
    private var btn_basic_data_type: Button? = null
    private var btn_control: Button? = null
    private var btn_class_object: Button? = null
    private var btn_extends_interface: Button? = null
    private var btn_extension: Button? = null
    private var btn_data_sealed: Button? = null
    private var btn_generic: Button? = null
    private var mContext: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext = this
        btn_basic_grammar = findViewById(R.id.btn_basic_grammar)
        btn_basic_data_type = findViewById<Button>(R.id.btn_basic_data_type)
        btn_control = findViewById<Button>(R.id.btn_control)
        btn_class_object = findViewById<Button>(R.id.btn_class_object)
        btn_extends_interface = findViewById<Button>(R.id.btn_extends_interface)
        btn_extension = findViewById<Button>(R.id.btn_extension)
        btn_data_sealed = findViewById<Button>(R.id.btn_data_sealed)
        btn_generic = findViewById<Button>(R.id.btn_generic)
        initListener()

    }

    fun initListener() {
        btn_basic_grammar!!.setOnClickListener {
            val intent = Intent(this@MainActivity, BasicGrammarActivity::class.java)
            startActivity(intent)
        }
        btn_basic_data_type!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, BasicDataTypeActivity::class.java)
            startActivity(intent)
        })
        btn_control!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, ControlActivity::class.java)
            startActivity(intent)
        })
        btn_class_object!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, ClassAndObjectActivity::class.java)
            startActivity(intent)
        })
        btn_extends_interface!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, ExtendsAndInterfaceActivity::class.java)
            startActivity(intent)
        })
        btn_extension!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, ExtensionActivity::class.java)
            startActivity(intent)
        })
        btn_data_sealed!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, DataClassAndSealedClassActivity::class.java)
            startActivity(intent)
        })
        btn_generic!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, GenericActivity::class.java)
            startActivity(intent)
        })
    }
}
