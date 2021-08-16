package com.example.trackyourexpense.modules.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.trackyourexpense.R
import com.example.trackyourexpense.adapter.RecentTransactionAdapter
import com.example.trackyourexpense.databinding.FragmentHomeBinding
import com.example.trackyourexpense.model.getRecentTransaction
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        setUp()
        return  binding.root

    }

    private fun setUp() {
        val recentAdapter=RecentTransactionAdapter{

        }
        recentAdapter.submitList(getRecentTransaction)
        binding.rvRecentTransaction.adapter=recentAdapter
    }
}