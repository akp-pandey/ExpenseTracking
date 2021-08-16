package com.example.trackyourexpense.model

import androidx.recyclerview.widget.DiffUtil

data class RecentTransaction(
    val transactionType:String?=null,
    val transactionTitle:String?=null,
    val transactionAmount:Int?=null,
    val transactionCategory:String?=null,
    val transactionDescription:String?=null,
    val transactionTime:String?=null
)

object recentTransactionDiffUtil:DiffUtil.ItemCallback<RecentTransaction>(){
    override fun areItemsTheSame(oldItem: RecentTransaction, newItem: RecentTransaction): Boolean {
        return oldItem.transactionType==newItem.transactionType
    }

    override fun areContentsTheSame(
        oldItem: RecentTransaction,
        newItem: RecentTransaction
    ): Boolean {
        return oldItem==newItem
    }

}

val getRecentTransaction= listOf<RecentTransaction>(
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM"),
    RecentTransaction("Expense","Shopping",200,"Shopping","Purchased Bag","10:00 AM")
)