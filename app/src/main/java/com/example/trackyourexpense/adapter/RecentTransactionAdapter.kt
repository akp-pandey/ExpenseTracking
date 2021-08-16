package com.example.trackyourexpense.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackyourexpense.databinding.RecentTransactionLayoutBinding
import com.example.trackyourexpense.model.RecentTransaction
import com.example.trackyourexpense.model.recentTransactionDiffUtil


class RecentTransactionAdapter(function: () -> Unit) :androidx.recyclerview.widget.ListAdapter<RecentTransaction,RecentTransactionViewHolder>(recentTransactionDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentTransactionViewHolder {
        val binding=RecentTransactionLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecentTransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecentTransactionViewHolder, position: Int) {
       holder.bind(getItem(position))
    }
}

class RecentTransactionViewHolder(private val binding: RecentTransactionLayoutBinding) :RecyclerView.ViewHolder(binding.root) {
    fun bind(item: RecentTransaction?) {
        binding.run {
            this.recentTransaction=item
            executePendingBindings()
        }
    }

}
