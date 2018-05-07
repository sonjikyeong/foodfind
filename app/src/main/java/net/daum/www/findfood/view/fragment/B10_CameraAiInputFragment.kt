package net.daum.www.findfood.view.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.b10_camera_ai_input_fragment.view.*
import net.daum.www.findfood.R
import net.daum.www.findfood.view.activity.C_AiActivity

/**
 * Created by thswl on 2018-05-06.
 */
class B10_CameraAiInputFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.b10_camera_ai_input_fragment,container, false)

        rootView.dataUploadButton.setOnClickListener({
            var intent = Intent(activity, C_AiActivity::class.java)
            startActivity(intent)
        })

        return rootView
    }
}