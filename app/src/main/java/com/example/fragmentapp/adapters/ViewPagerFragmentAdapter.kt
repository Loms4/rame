package com.example.fragmentapp.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragmentapp.fragments.FirstFragment
import com.example.fragmentapp.fragments.SecondFragment
import com.example.fragmentapp.fragments.meotxeFragment
import com.example.fragmentapp.fragments.mesameFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        } else if(position == 1) {
            return SecondFragment()
        }else if(position== 2) {
            return mesameFragment()
        }
        else{
            return meotxeFragment()
        }

    }
}