package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick

class GymListAdapter(var context: Context, var onClick: (String) -> Unit) :
    BaseAdapter<GymListAdapter.GymListViewHolder, String>() {
    class GymListViewHolder(itemView: View) : BaseViewHolder(itemView)

    override val layoutId: Int
        get() = R.layout.item_view_gym_list

    override fun setData(holder: GymListViewHolder, model: String, position: Int) {

        var view = holder.itemView
        view.singleClick {
            onClick(model)
        }
    }
}