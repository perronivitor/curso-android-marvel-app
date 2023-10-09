package com.example.marvelapp.presentation.characters

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter

class CharactersLoadStateAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<CharactersLoadMoreViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ) = CharactersLoadMoreViewHolder.create(parent, retry)

    override fun onBindViewHolder(
        holder: CharactersLoadMoreViewHolder,
        loadState: LoadState
    ) = holder.bind(loadState)
}