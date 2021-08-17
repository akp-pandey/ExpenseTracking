package com.example.trackyourexpense.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackyourexpense.databinding.RecentTransactionLayoutBinding
import com.example.trackyourexpense.model.RecentTransaction
import com.example.trackyourexpense.model.recentTransactionDiffUtil


class RecentTransactionAdapter(private val onClick: (RecentTransaction) -> Unit) :androidx.recyclerview.widget.ListAdapter<RecentTransaction,RecentTransactionViewHolder>(recentTransactionDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentTransactionViewHolder {
        val binding=RecentTransactionLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val holder=RecentTransactionViewHolder(binding)
        holder.itemView.setOnClickListener {
            onClick(getItem(holder.adapterPosition))
        }
        return holder
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
