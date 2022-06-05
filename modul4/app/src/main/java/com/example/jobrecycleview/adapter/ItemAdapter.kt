package com.example.jobrecycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jobrecycleview.R
import com.example.jobrecycleview.model.Pekerjaan

class ItemAdapter (
    private val context: Context,
    private val dataset: List<Pekerjaan>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


        class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.job_name)
            val imageView: ImageView = view.findViewById(R.id.workhard)
            val annualWageView: TextView = view.findViewById(R.id.annual_wage)
            val hourlyWageView : TextView = view.findViewById(R.id.hourly_wage)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.job_list, parent, false)

            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = dataset[position]
            holder.imageView.setImageResource(item.GetImage())
            holder.textView.text = item.GetJob()
            holder.annualWageView.text = String.format("Median Annual Wage: %s", item.GetAnnual())
            holder.hourlyWageView.text = String.format("Median Hourly Wage: %s", item.GetHourly())
        }

        override fun getItemCount() = dataset.size
}
