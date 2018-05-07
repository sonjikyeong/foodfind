package net.daum.www.findfood.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.daum.www.findfood.R
import net.daum.www.findfood.view.fragment.A1_LoginFragment

/**
 * Created by thswl on 2018-05-06.
 */

class A_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_activity_main)

        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_layout_1, A1_LoginFragment())
        transaction.commit()


    }

}
