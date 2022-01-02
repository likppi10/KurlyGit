package com.ssafy.kurlygit.ui.adapter

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.ssafy.kurlygit.ui.view.data.model.RepositoryModel
import com.ssafy.kurlygit.databinding.ViewholderItemBinding

class MainViewHolder(private val binding: ViewholderItemBinding) : RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(item: RepositoryModel) {

        with(binding){
            repo = item
            executePendingBindings()
        }
    }
}