package net.daum.www.findfood.view.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.b_function_actiivty.*
import net.daum.www.findfood.R
import net.daum.www.findfood.view.fragment.B0_SearchFragment
import net.daum.www.findfood.view.fragment.B10_CameraAiInputFragment
import net.daum.www.findfood.view.fragment.B2_TalkFragment

/**
 * Created by thswl on 2018-05-06.
 */
class B_FunctionActivity : AppCompatActivity(){

    companion object {
        var current_function_state = false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.b_function_actiivty)

       openFragment(B0_SearchFragment())

        /* 기본 선책 + */
        function_select.setOnClickListener({
            if(current_function_state == false) {
                function_camera_image.visibility = VISIBLE
                function_search_select.visibility = VISIBLE
                function_talk_image.visibility = VISIBLE
                current_function_state = !current_function_state
            }else{
                function_camera_image.visibility = GONE
                function_search_select.visibility = GONE
                function_talk_image.visibility = GONE
                current_function_state = !current_function_state
            }
        })

        function_camera_image.setOnClickListener({
            openFragment(B10_CameraAiInputFragment())
        })

        function_talk_image.setOnClickListener({
            openFragment(B2_TalkFragment())
        })

        function_search_select.setOnClickListener({
            openFragment(B0_SearchFragment())
        })

    }

    private fun openFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout_2, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}