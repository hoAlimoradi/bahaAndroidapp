package com.gandalf.baha.gridlayout

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.gandalf.baha.*
import com.gandalf.baha.financial.*
import com.gandalf.baha.financial.banks.BanksActivity
import com.gandalf.baha.financial.coin.CoinActivity


class AlphaAdapters(var context: Context, var arrayList: ArrayList<AlphaChar>):
    RecyclerView.Adapter<AlphaAdapters.ItemHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

    val itemHolder=LayoutInflater.from(parent.context).inflate(R.layout.financial_layout_list_item,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var alphaChar:AlphaChar=arrayList.get(position)
        holder.icons.setImageResource(alphaChar.iconsChar!!)
        holder.alphas.text=alphaChar.alphaChar
        holder.alphas.setOnClickListener{
            when (position) {
                0 -> {
                    val intent = Intent(holder.alphas.context, CryptoCurrenciesActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)

                }

                1 -> {
                    val intent = Intent(holder.alphas.context, StocksActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)
                }

                2 -> {
                    val intent = Intent(holder.alphas.context, FundsActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)
                }

                3 -> {
                    val intent = Intent(holder.alphas.context, BanksActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)
                }

                5 -> {
                    val intent = Intent(holder.alphas.context, CoinActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)
                }
                6 -> {
                    val intent = Intent(holder.alphas.context, GoldActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)
                }

                7 -> {
                    val intent = Intent(holder.alphas.context, SilverActivity::class.java)
                    startActivity(holder.alphas.context, intent, null)
                }


                else -> {
                    Toast.makeText(context,alphaChar.alphaChar,Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    class ItemHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var icons=itemView.findViewById<ImageView>(R.id.icons_image)
        var alphas=itemView.findViewById<TextView>(R.id.alpha_text_view)
    }

}