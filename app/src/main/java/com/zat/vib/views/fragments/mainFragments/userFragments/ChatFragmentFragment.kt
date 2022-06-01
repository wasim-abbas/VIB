package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyList
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.ChatAdapter
import kotlinx.android.synthetic.main.fragment_chat_fragment.*


class ChatFragmentFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_chat_fragment
    override val viewModelClass: Class<BaseViewModel>
        get() =BaseViewModel::class.java

    private lateinit var chatAdapter:ChatAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        chatAdapter = ChatAdapter(currentActivity()){}

        chatAdapter.updateData(dummyList)

        rv_chat.let {
            it.adapter = chatAdapter
        }

    }

}