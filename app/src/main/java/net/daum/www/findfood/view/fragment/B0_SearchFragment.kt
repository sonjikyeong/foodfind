package net.daum.www.findfood.view.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.daum.www.findfood.R
import net.daum.www.findfood.adapter.ItemAdapter
import net.daum.www.findfood.vo.FoodItem

/**
 * Created by thswl on 2018-05-06.
 */
class B0_SearchFragment : Fragment(){
    init{

    }

    var currentLife : Int? = null

    /* recyclerView */
    lateinit var m: RecyclerView
    lateinit var mContext : Context
    lateinit var mAdapter : ItemAdapter
    var Items = ArrayList<FoodItem>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.b0_search_fragment,container,false)

        currentLife = 0
        Items.clear()

        mContext = activity!!.applicationContext
        m = rootView.findViewById(R.id.my_recycler_view)
        var llm = LinearLayoutManager(activity)
        llm.orientation
        m!!.setHasFixedSize(true)
        m!!.layoutManager = llm

        /* test Item...*/
        var item_one = FoodItem()
        var item_two = FoodItem()
        var item_three = FoodItem()

        Items.add(item_one)
        Items.add(item_two)
        Items.add(item_three)

        mAdapter = ItemAdapter(mContext!!, Items)
        m.adapter = mAdapter

        return rootView
    }
}