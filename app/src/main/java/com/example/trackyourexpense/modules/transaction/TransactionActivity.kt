package com.example.trackyourexpense.modules.transaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.trackyourexpense.R
import kotlinx.android.synthetic.main.activity_transaction.*

class TransactionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)
        getIntentExtra()
        setUp()
    }

    private fun getIntentExtra() {
        val intent=intent.getStringExtra("category")
        if (intent!=null){
            when(intent){
                "expense"->{
                    relativeLayout.setBackgroundResource(R.color.teal_700)
                    tvTitle.text="Expense"
                    showFragment(ExpenseFragment())
                }
                "income"->{
                    relativeLayout.setBackgroundResource(R.color.teal_200)
                    tvTitle.text="Income"
                    showFragment(IncomeFragment())
                }
                "transaction"->{
                    relativeLayout.setBackgroundResource(R.color.purple_700)
                    showFragment(TransactionFragment())
                    tvTitle.text="Tranfer"
                }
            }
        }
    }

    private fun showFragment(fragment: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flTransaction,fragment)
        transaction.commit()
    }

    private fun setUp() {
    }
}