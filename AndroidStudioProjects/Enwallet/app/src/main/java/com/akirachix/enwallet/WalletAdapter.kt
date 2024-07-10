package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class WalletAdapter(var walletList: List<Wallet>):
    RecyclerView.Adapter<WalletViewHolder>(
    ){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.transaction_item_layout, parent, false)
        return WalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val contact = walletList[position]
        holder.tvCategory.text = contact.avatar
        holder.tvAmount.text = contact.amount
        holder.tvDate.text = contact.moneyin
        holder.tvCategory2.text = contact.avatar2
        holder.tvAmount2.text = contact.amount2
        holder.tvDate2.text = contact.moneyin2
    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}
class WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val  tvCategory = itemView.findViewById<TextView>(R.id.tvCategory)
    val  tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    val  tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val  tvCategory2 = itemView.findViewById<TextView>(R.id.tvCategory2)
    val  tvAmount2 = itemView.findViewById<TextView>(R.id.tvAmount2)
    val  tvDate2 = itemView.findViewById<TextView>(R.id.tvDate2)
}
