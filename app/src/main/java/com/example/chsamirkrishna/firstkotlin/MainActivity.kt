package com.example.chsamirkrishna.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var e:EditText =findViewById(R.id.et1)
        var t:TextView =findViewById(R.id.tv1)
        var b:Button=findViewById(R.id.b1)
        b.setOnClickListener(View.OnClickListener {
            t.setText(e.text)
        })
    }
   /* fun click(v:View)
    {
        var e:EditText =findViewById(R.id.et1)
        var t:TextView =findViewById(R.id.tv1)
        t.setText(e.text)
    }*/

}
