package com.gandalf.baha.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gandalf.baha.R
import com.gandalf.baha.gridlayout.AlphaAdapters
import com.gandalf.baha.gridlayout.AlphaChar

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var recyclerView: RecyclerView? =null
    private var gridLayoutManager:GridLayoutManager?=null
    private var arrayList:ArrayList<AlphaChar>?=null
    private var AlphaAdapters: AlphaAdapters?=null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        homeViewModel.text.observe(viewLifecycleOwner, Observer {

        })

        recyclerView= root.findViewById(R.id.my_recycle_view)
        gridLayoutManager= GridLayoutManager(this@HomeFragment.requireContext() ,3,
            LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager=gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList=ArrayList()
        arrayList=setDataInList()
        var alphaAdapters = AlphaAdapters(this@HomeFragment.requireContext() , arrayList!!)
        recyclerView?.adapter=alphaAdapters
        return root
    }

    private fun setDataInList():ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()
        items.add(AlphaChar(R.drawable.ic_iranzamin_bank_big ,alphaChar = "ارز دیجیتال"))
        items.add(AlphaChar(R.drawable.ic_karafarin_bank_big ,alphaChar = "سهام"))
        items.add(AlphaChar(R.drawable.ic_khavarmiane_bank_big ,alphaChar = "صندوق"))
        items.add(AlphaChar(R.drawable.ic_kosar_bank_big,alphaChar = "بانک"))
        items.add(AlphaChar(R.drawable.ic_maskan_bank_big,alphaChar = "فارکس"))
        items.add(AlphaChar(R.drawable.ic_mehreghtesad_bank_big,alphaChar = "سکه"))
        items.add(AlphaChar(R.drawable.ic_iranzamin_bank_big ,alphaChar = "طلا و نفره"))
        items.add(AlphaChar(R.drawable.ic_karafarin_bank_big ,alphaChar = "ارز"))
        items.add(AlphaChar(R.drawable.ic_khavarmiane_bank_big ,alphaChar = "اوراق نقدی"))
        items.add(AlphaChar(R.drawable.ic_kosar_bank_big,alphaChar = "اوراق آتی"))
        items.add(AlphaChar(R.drawable.ic_maskan_bank_big,alphaChar = "فلزات"))
        items.add(AlphaChar(R.drawable.ic_mehreghtesad_bank_big,alphaChar = "نفت و مشتقات"))
        items.add(AlphaChar(R.drawable.ic_iranzamin_bank_big ,alphaChar = "اوراق بدهی"))
        items.add(AlphaChar(R.drawable.ic_karafarin_bank_big ,alphaChar = "سود سپرده"))
        items.add(AlphaChar(R.drawable.ic_khavarmiane_bank_big ,alphaChar = "محاسبات وام"))
        items.add(AlphaChar(R.drawable.ic_kosar_bank_big,alphaChar = "بازگشت سرمایه"))
        items.add(AlphaChar(R.drawable.ic_maskan_bank_big,alphaChar = "تبدیل رهن و اجاره"))
        items.add(AlphaChar(R.drawable.ic_mehreghtesad_bank_big,alphaChar = "کمسیون املاک"))
        items.add(AlphaChar(R.drawable.ic_karafarin_bank_big ,alphaChar = "هزینه انتقال سند"))
        items.add(AlphaChar(R.drawable.ic_khavarmiane_bank_big ,alphaChar = "هزینه دفترخانه"))
        items.add(AlphaChar(R.drawable.ic_kosar_bank_big,alphaChar = "بیمه بیکاری"))
        items.add(AlphaChar(R.drawable.ic_maskan_bank_big,alphaChar = "مالیات و تخفیف"))
        items.add(AlphaChar(R.drawable.ic_mehreghtesad_bank_big,alphaChar = "درصد گیری"))
        /*items.add(AlphaChar(R.drawable.ic_karafarin_bank_big ,alphaChar = "hamburger"))
        items.add(AlphaChar(R.drawable.ic_khavarmiane_bank_big ,alphaChar = "hotdog"))
        items.add(AlphaChar(R.drawable.ic_kosar_bank_big,alphaChar = "noodles"))
        items.add(AlphaChar(R.drawable.ic_maskan_bank_big,alphaChar = "sandwich"))
        items.add(AlphaChar(R.drawable.ic_mehreghtesad_bank_big,alphaChar = "springroll"))*/

        return items
    }
}