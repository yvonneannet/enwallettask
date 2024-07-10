package com.akirachix.enwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager = LinearLayoutManager(this)
        display()

    }

    fun display(){
        val expense1  = Wallet("Salary","1 July 2024", "KES 40000","Rent", "2 July 2024", "KES 16000")
        val expense2 = Wallet("Dividends","4 July 2024","KES 16000","Electricity","5 July 2024","KES 2400")
        val expense3 = Wallet("Internet","5 July 2024","KES 2500", "Shopping","5 July 2024","KES 500")
        val expense4 = Wallet("Bus fare","11 July 2024","KES 500", "Water bill","6 July 2024","KES 5400")

        val totalList = listOf(expense1,expense2,expense3,expense4)
        val total = WalletAdapter(totalList)
        binding.rvExpenses.adapter = total
    }
}


