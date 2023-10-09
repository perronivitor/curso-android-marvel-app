package com.example.marvelapp.presentation.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelapp.databinding.ItemCharacterMoreStateBinding

class CharactersLoadMoreViewHolder(
    itemBinding: ItemCharacterMoreStateBinding,
    retry: () -> Unit
) : RecyclerView.ViewHolder(itemBinding.root) {

    private val binding = ItemCharacterMoreStateBinding.bind(itemView)

    private val progressBarLoadMore = binding.progressLoadingMore
    private val textTryAgainMessage = binding.textTryAgain.also {
        it.setOnClickListener { retry() }
    }

    fun bind(loadState: LoadState) {
        progressBarLoadMore.isVisible = loadState is LoadState.Loading
        textTryAgainMessage.isVisible = loadState is LoadState.Error
    }

    companion object {
        fun create(parent: ViewGroup, retry: () -> Unit): CharactersLoadMoreViewHolder {
            val itemBinding = ItemCharacterMoreStateBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

            return CharactersLoadMoreViewHolder(itemBinding, retry)
        }
    }
}