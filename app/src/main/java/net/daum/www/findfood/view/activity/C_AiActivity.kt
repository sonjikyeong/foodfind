package net.daum.www.findfood.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.daum.www.findfood.R
import net.daum.www.findfood.view.fragment.C1_CameraAiFragment

/**
 * Created by thswl on 2018-05-08.
 */
class C_AiActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_ai_activity)

        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_layout_3, C1_CameraAiFragment())
        transaction.commit()


    }

}