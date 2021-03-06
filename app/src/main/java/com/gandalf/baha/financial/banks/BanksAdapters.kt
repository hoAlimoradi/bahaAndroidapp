package com.gandalf.baha.financial.banks

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.gandalf.baha.R
import com.gandalf.baha.gridlayout.AlphaAdapters
import com.gandalf.baha.gridlayout.AlphaChar

class BanksAdapters (var context: Context, var arrayList: ArrayList<AlphaChar>):
    RecyclerView.Adapter<BanksAdapters.ItemHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder= LayoutInflater.from(parent.context).inflate(R.layout.financial_layout_list_item,parent,false)
        return ItemHolder(
            itemHolder
        )
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var alphaChar: AlphaChar =arrayList.get(position)
        holder.icons.setImageResource(alphaChar.iconsChar!!)
        holder.alphas.text=alphaChar.alphaChar
        holder.alphas.setOnClickListener{
            /*when (position) {
                2 -> {
                    val intent = Intent(holder.alphas.context, FundsActivity::class.java)
                    ContextCompat.startActivity(holder.alphas.context, intent, null)
                }
                else -> {
                    Toast.makeText(context,alphaChar.alphaChar, Toast.LENGTH_LONG).show()
                }
            }*/
            val intent = Intent(holder.alphas.context, BankDetailsActivity::class.java)
            ContextCompat.startActivity(holder.alphas.context, intent, null)
        }
    }
    class ItemHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var icons=itemView.findViewById<ImageView>(R.id.icons_image)
        var alphas=itemView.findViewById<TextView>(R.id.alpha_text_view)
    }

}