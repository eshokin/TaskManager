package com.eshokin.taskmanager.screens

import android.os.Bundle
import android.support.design.bottomappbar.BottomAppBar
import android.support.design.widget.FloatingActionButton
import android.view.View
import com.eshokin.taskmanager.R
import com.eshokin.taskmanager.screens.navigation.NavigationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : NavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     //   val floatingActionButton = findViewById<View>(R.id.fab) as FloatingActionButton
        val bar = findViewById<View>(R.id.bar) as BottomAppBar
        bar.replaceMenu(R.menu.main_menu)

        mFabButton.setOnClickListener({
            if (bar.getFabAlignmentMode() === BottomAppBar.FAB_ALIGNMENT_MODE_CENTER)
                bar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END)
            else {
                bar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER)
            }
        })
        //setSupportActionBar(bar)
    }
}
