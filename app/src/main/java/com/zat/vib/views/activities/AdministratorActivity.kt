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
import kotlinx.android.synthetic.main.activity_adminstrator.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_nav_gym_administrator.*
import kotlinx.android.synthetic.main.bottom_nav_user.*
import kotlinx.android.synthetic.main.gym_admis_side_menu.*

class AdministratorActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adminstrator)

        val navController = Navigation.findNavController(
            this,
            R.id.navgymAdmHomeFrag // name of nav graph
        )


        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.gymProfileFragment ||
                destination.id == R.id.privacyPolicyFragment ||
                destination.id == R.id.termsAndConditionFragment
            ) {
                bottom_Nav_gym_Admi.gone()
            } else {

                bottom_Nav_gym_Admi.visible()
            }
        }
        NavigationUI.setupWithNavController(bottom_Nav_gym_Admi, navController)
        sideDrawer2.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

        txtPrivacyPolicy.singleClick {
            sideDrawer2.closeDrawer(GravityCompat.START)
            replaceFragmentInGYMAmins(R.id.action_administratorHomeFragment_to_privacyPolicyFragment)
        }

        txtTermsCondion.singleClick {
            sideDrawer2.closeDrawer(GravityCompat.START)
            replaceFragmentInGYMAmins(R.id.action_administratorHomeFragment_to_termsAndConditionFragment)
        }

    }

    override fun attachViewMode() {}

    fun toggleDrawer() {
        if (sideDrawer2.isDrawerOpen(GravityCompat.START)) {
            sideDrawer2.closeDrawer(GravityCompat.START)

        } else {
            sideDrawer2.openDrawer(GravityCompat.START)
        }
    }

}