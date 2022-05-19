package com.neocaptainnemo.layouts19thmay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            openConstraint()
        }

        findViewById<BottomNavigationView>(R.id.bottom_nav).setOnItemSelectedListener {
            when (it.itemId) {
                R.id.action_constraint -> openConstraint()
                R.id.action_coordinator -> openCoordinator()
                R.id.action_motion -> openMotion()

            }

            true
        }
    }

    private fun openConstraint() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ConstraintFragment())
            .commit()
    }

    private fun openCoordinator() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, CoordinatorFragment())
            .commit()
    }

    private fun openMotion() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MotionFragment())
            .commit()
    }

}