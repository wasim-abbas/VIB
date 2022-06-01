package com.zat.vib.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zat.vib.R
import com.zat.vib.views.adapters.*


abstract class BaseAdapter<VH : BaseViewHolder, D> : RecyclerView.Adapter<VH>() {
    abstract val layoutId: Int

    abstract fun setData(holder: VH, model: D, position: Int)
    private var list = ArrayList<D>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return when (layoutId) {
            R.layout.item_view_images ->
                ImagesAdapter.ImagesViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_user_notification->
                UserNotificationAdapter.UserNotificationViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_edit_images ->
                EditProfileImagesAdapter.EditProfileImagesViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_work_out_type->
                WorkOutAdapter.WorkOutViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

                R.layout.item_view_notifications ->
                GymNotificationAdapter.GymViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_view_images2 ->
                AboutUserImagesAdapter.ProfileImagesAdapterViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_gym_detail ->
                CheckedInUserImagesAdapter.CheckedInUserImagesHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_view_people ->
                PeopleAdapter.PeopleViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH


            R.layout.item_view_chatt ->
                ChatAdapter.ChatViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_home_feeds ->
                FeedsAdapter.FeedViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_view_memeber ->
                GymMemberAdapter.GymMemberViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            else -> GymListAdapter.GymListViewHolder(
                LayoutInflater.from(
                    parent.context
                ).inflate(layoutId, parent, false)
            ) as VH
        }


    }
//
//
////            else -> HistoryAdapter.HistoryViewHolder(
////                LayoutInflater.from(
////                    parent.context
////                ).inflate(layoutId, parent, false)
////            ) as VH
////        }
//
//    }


    override fun onBindViewHolder(holder: VH, position: Int) {
        if (list.size > 0)
            setData(holder, list[position], position)

    }

    override fun getItemCount() = list.size

    fun updateData(newList: ArrayList<D>) {
        list = newList
        notifyDataSetChanged()
    }

    fun clearData() {
        list.clear()
        notifyDataSetChanged()
    }


}
