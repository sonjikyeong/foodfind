package net.daum.www.findfood.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.daum.www.findfood.R

/**
 * Created by thswl on 2018-05-08.
 */
class C1_CameraAiFragment : Fragment(){
    init{

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.c1_camera_ai_fragment,container, false)
        return rootView
    }
}