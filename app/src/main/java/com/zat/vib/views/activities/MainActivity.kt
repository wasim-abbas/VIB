package com.zat.vib.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.zat.vib.R
import com.zat.vib.base.BaseActivity
import com.zat.vib.utils.gone
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_nav_user.*
import kotlinx.android.synthetic.main.userside_menu.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController = Navigation.findNavController(
            this,
            R.id.navMainHomeFrag // name of nav graph
        )
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.myGymDetailFragment ||
                destination.id == R.id.userDetailFragment ||
                destination.id == R.id.setTimePlaceFragment ||
                destination.id == R.id.blankFragment ||
                destination.id == R.id.blankFragment2 ||
                destination.id == R.id.createGroupFragment ||
                destination.id == R.id.createdGroupsFragment ||
                destination.id == R.id.groupDetailFragment ||
                destination.id == R.id.editGroupFragment ||
                destination.id == R.id.addParticipantFragment ||
                destination.id == R.id.scheduleWorkOutFragment ||
                destination.id == R.id.achievementFragment ||
                destination.id == R.id.profileFragment ||
                destination.id == R.id.userNotificationFragment ||
                destination.id == R.id.privacyPolicyFragment2 ||
                destination.id == R.id.termsAndConditionFragment2 ||
                destination.id == R.id.profileCompletionFragment ||
                destination.id == R.id.profileCompletion2Fragment

            ) {
                bottom_Navigation.gone()
            } else {

                bottom_Navigation.visible()
            }
        }
        NavigationUI.setupWithNavController(bottom_Navigation, navController)
        sideDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

        txtFeed.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_blankFragment)
        }

        txtChatGroups.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_blankFragment2)
        }

        txtScheduledWorkOut.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_scheduleWorkOutFragment)
        }

        txtAchivements.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_achievementFragment)

        }

        txtProfile.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_profileFragment)
        }

        txtNotification.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_userNotificationFragment)
        }

        txtTermsCondion.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_termsAndConditionFragment2)
        }

        txtPrivacyPolicy.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment2_to_privacyPolicyFragment2)
        }


    }

    override fun attachViewMode() {}

    fun toggleDrawer() {
        if (sideDrawer.isDrawerOpen(GravityCompat.START)) {
            sideDrawer.closeDrawer(GravityCompat.START)

        } else {
            sideDrawer.openDrawer(GravityCompat.START)
        }
    }

}