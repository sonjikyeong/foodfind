package net.daum.www.findfood.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import net.daum.www.findfood.R
import net.daum.www.findfood.vo.FoodItem

/**
 * Created by thswl on 2018-05-06.
 */
class ItemAdapter constructor(context : Context, items : List<FoodItem>) : RecyclerView.Adapter<ContentsViewHolder>(){

    private var context : Context
    private var items : List<FoodItem>

    init{
        this.context = context
        this.items = items
    }

    override fun onBindViewHolder(holder: ContentsViewHolder, position: Int) {

        var item: FoodItem= items.get(holder.adapterPosition)

        holder.food_name
        holder.food_image
        holder.food_recipt

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentsViewHolder {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.food_item, parent,false)
        var ContentsViewHolder = ContentsViewHolder(view)

        return ContentsViewHolder

    }

    override fun getItemCount(): Int = this.items.size
}


class ContentsViewHolder constructor(itemView : View) : RecyclerView.ViewHolder(itemView){
    var food_image = itemView.findViewById<ImageView>(R.id.food_image)
    var food_name = itemView.findViewById<TextView>(R.id.food_name)
    var food_recipt = itemView.findViewById<TextView>(R.id.food_recip)
}