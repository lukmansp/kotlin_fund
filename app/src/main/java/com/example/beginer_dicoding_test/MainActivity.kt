package com.example.beginer_dicoding_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNews: RecyclerView
    private var list: ArrayList<News> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "One Sport News"


        rvNews = findViewById(R.id.tv_news)
        rvNews.setHasFixedSize(true)

        list.addAll(NewsItems.listData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setButton(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setButton(itemId: Int) {
            when(itemId){
                R.id.about_page->{
                    val changePage=Intent(this@MainActivity,AboutPage::class.java)
                    startActivity(changePage)
                }
            }
    }

    private fun toDetailPage(news: News) {
        val changePage = Intent(this@MainActivity, DetailPage::class.java)
        changePage.putExtra(
            DetailPage.AUTHOR,
            arrayOf(news.author, news.detail, news.name, news.image.toString())
        )
        startActivity(changePage)
    }

    private fun showRecyclerList() {
        rvNews.layoutManager = LinearLayoutManager(this)
        val listNewsAdapter = ListNewsAdapter(list)
        rvNews.adapter = listNewsAdapter

        listNewsAdapter.setOnItemClickCallback(object : ListNewsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: News) {
                toDetailPage(data)
            }
        })


    }


}