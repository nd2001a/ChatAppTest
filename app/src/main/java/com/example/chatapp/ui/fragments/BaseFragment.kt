package com.example.chatapp.ui.fragments

import androidx.fragment.app.Fragment
import android.view.View
import com.example.chatapp.MainActivity
import com.example.chatapp.utilities.APP_ACTIVITY

open class BaseFragment(layout: Int) : Fragment(layout) {

    private lateinit var rootView: View

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.appDrawer.disableDrawer()
    }

    override fun onStop() {
        super.onStop()
        APP_ACTIVITY.appDrawer.enableDrawer()
    }
}
