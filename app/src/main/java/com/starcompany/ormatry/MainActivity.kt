package com.starcompany.ormatry

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.Nullable
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override protected fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this, "kotlin + orma", Toast.LENGTH_SHORT).show()
    //    var toast = new Toast.makeText(this,)
/*
        val db = provideOrmaDatabase(this)
        val td = Todo()
        td.done = true
        db.insertIntoTodo(td)
*/

    }
/*
    fun provideOrmaDatabase(context: Context): OrmaDatabase {
        return OrmaDatabase.builder(context).build()
    }
    */
}
