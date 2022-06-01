package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick

class PeopleAdapter(var context: Context, var onClick: (String) -> Unit) :
    BaseAdapter<PeopleAdapter.PeopleViewHolder, String>() {
    class PeopleViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_people

    override fun setData(holder: PeopleViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {
            onClick(model)
        }
    }


}
