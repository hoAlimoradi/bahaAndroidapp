package com.gandalf.baha.financial.banks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gandalf.baha.R
import com.gandalf.baha.gridlayout.AlphaAdapters
import com.gandalf.baha.gridlayout.AlphaChar

class BanksActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? =null
    private var gridLayoutManager:GridLayoutManager?=null
    private var arrayList:ArrayList<AlphaChar>?=null
    private var adapter: BanksAdapters?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banks)
        recyclerView= findViewById(R.id.my_recycle_view)
        gridLayoutManager= GridLayoutManager(this ,3,
                LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager=gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList=ArrayList()
        arrayList= setDataInList()
        adapter =
            BanksAdapters(this, arrayList!!)
        recyclerView?.adapter= adapter
    }

    private fun setDataInList():ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()
        items.add(AlphaChar(R.drawable.ic_iranzamin_bank_big ,alphaChar = "ایران زمین"))
        items.add(AlphaChar(R.drawable.ic_karafarin_bank_big ,alphaChar = "کارآفرین"))
        items.add(AlphaChar(R.drawable.ic_khavarmiane_bank_big ,alphaChar = "خاورمیانه"))
        items.add(AlphaChar(R.drawable.ic_kosar_bank_big,alphaChar = "کوثر"))
        items.add(AlphaChar(R.drawable.ic_maskan_bank_big,alphaChar = "مسکن"))
        items.add(AlphaChar(R.drawable.ic_mehreghtesad_bank_big,alphaChar = "مهر اقتصاد"))
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