package com.zat.vib.views.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick
import kotlinx.android.synthetic.main.item_view_home_feeds.view.*

class FeedsAdapter(var context: Context, var onClick: () -> Unit) :
    BaseAdapter<FeedsAdapter.FeedViewHolder, String>() {
    class FeedViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_home_feeds

    override fun setData(holder: FeedViewHolder, model: String, position: Int) {
        val view = holder.itemView

        view.singleClick {
            onClick()
        }


    }


}