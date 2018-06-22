package com.eshokin.taskmanager.screens.navigation

import android.os.Handler
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.eshokin.taskmanager.R

abstract class NavigationActivity : MvpAppCompatActivity() {
    private var mDoubleBackToExitPressedOnce = false

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onBackPressed() {

        if (mDoubleBackToExitPressedOnce) {
            finish()
            return
        }

        mDoubleBackToExitPressedOnce = true
        Toast.makeText(this, getString(R.string.press_back_twice), Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ mDoubleBackToExitPressedOnce = false }, 2000)
    }
}