package net.daum.www.findfood.view.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.a1_login_fragment.view.*
import net.daum.www.findfood.R
import net.daum.www.findfood.view.activity.B_FunctionActivity

/**
 * Created by thswl on 2018-05-06.
 */
class A1_LoginFragment : Fragment(){
    init{

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.a1_login_fragment,container,false)

        rootView.submit_button.setOnClickListener({
            val intent = Intent(activity, B_FunctionActivity::class.java)
            startActivity(intent)
        })

        return rootView
    }
}