package net.daum.www.findfood.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.daum.www.findfood.R

/**
 * Created by thswl on 2018-05-06.
 */
class B2_TalkFragment : Fragment(){
    init {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.b2_talk_fragment,container, false)
        return rootView
    }
}