package net.daum.www.findfood.vo

/**
 * Created by thswl on 2018-05-06.
 */
class FoodItem(){
    var food_idx : String? = null
    var user_id : String? = null;
    var food_name : String? = null
    var recipt : String? = null
    var food_image: String? = null

    fun toMap():Map<String, Any>{
        val result = HashMap<String, Any>()
        result.put("food_idx", food_idx!!)
        result.put("user_id", user_id!!)
        result.put("food_name", food_name!!)
        result.put("recipt", recipt!!)
        result.put("food_image", food_image!!)

        return result
    }
}