package com.example.trackyourexpense.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackyourexpense.R
import com.example.trackyourexpense.modules.onboarding.OnboardingActivity
import com.example.trackyourexpense.modules.signin.SignInActivity
import kotlinx.android.synthetic.main.onboarding_layout.view.*

class ViewPagerAdapter(val onboardingActivity: OnboardingActivity) :RecyclerView.Adapter<PagerViewHolder>() {
    private val images= intArrayOf(
        R.drawable.ic_first,
        R.drawable.ic_second,
        R.drawable.ic_third
    )
    private val colors= intArrayOf(
        R.color.purple_500,
        R.color.teal_700,
        R.color.teal_200
    )
    private val title= intArrayOf(
        R.string.firstTitle,
        R.string.secondTitle,
        R.string.thirdTitle
    )
    private val description= intArrayOf(
        R.string.firstDescription,
        R.string.secondDescription,
        R.string.thirdDescription
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder{
        val inflater=LayoutInflater.from(parent.context).inflate(R.layout.onboarding_layout,parent,false)
        inflater.tvGetStarted.setOnClickListener {
            val intent=Intent(onboardingActivity,SignInActivity::class.java)
            onboardingActivity.startActivity(intent)
            onboardingActivity.finish()
        }
        return PagerViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.itemView.run {
            ivOnboarding.setImageResource(images[position])
            tvTitleOnboarding.setText(title[position])
            tvDescriptionOnboarding.setText(description[position])
            rlContainer.setBackgroundResource(colors[position])
            if (position==0){
                tvPrevious.visibility=View.GONE
            }
            if (position==2){
                tvNext.visibility=View.GONE
                tvGetStarted.visibility=View.VISIBLE
            }

        }
    }

    override fun getItemCount(): Int {
        return colors.size
    }
}

class PagerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

}
