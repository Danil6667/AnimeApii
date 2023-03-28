package com.example.presentation.ui.adapters.pager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.presentation.ui.fragments.anime.AnimeFragment
import com.example.presentation.ui.fragments.manga.MangaFragment

class PagersAdapter(fragment: Fragment): FragmentStateAdapter(fragment){

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AnimeFragment()
            else -> MangaFragment()
        }
    }
}