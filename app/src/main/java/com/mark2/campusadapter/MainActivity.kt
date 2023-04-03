package com.mark2.campusadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.mark2.campusadapter.TABS.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs(){

        val adapter = viewPageAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(ChatFragment(),"Chat")
        adapter.addFragment(NewsFragment(),"News")
        adapter.addFragment(HostelsFragment(),"Hostels")
        adapter.addFragment(DietyFragment(),"Diety")



        var viewPager = findViewById<ViewPager>(R.id.viewpager)
        var tablayout = findViewById<TabLayout>(R.id.tablayout)
        viewPager.adapter = adapter
        tablayout.setupWithViewPager(viewPager)


    }

}