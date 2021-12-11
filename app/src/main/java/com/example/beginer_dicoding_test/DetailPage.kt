package com.example.beginer_dicoding_test

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailPage : AppCompatActivity() {

    companion object {
        const val AUTHOR = ""
        const val TITLE = ""
        const val IMAGE = ""
        const val DESCRIPTION = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "More Info"
        setContentView(R.layout.activity_detail_page)
        val receivedDescription: TextView = findViewById(R.id.description_textview)
        val receivedAuthor: TextView = findViewById(R.id.author_textview)
        val receivedImage: ImageView = findViewById(R.id.image_imageview)
        val receivedTitle: TextView = findViewById(R.id.title_textview)
        val author = intent.getStringArrayExtra(AUTHOR)?.get(0)
        val image = intent.getStringArrayExtra(AUTHOR)?.get(3)
        val title = intent.getStringArrayExtra(AUTHOR)?.get(2)
        val description = intent.getStringArrayExtra(AUTHOR)?.get(1)

        val textAuthor = "Penulis : $author"
        receivedDescription.text = description
        receivedAuthor.text = textAuthor
        receivedTitle.text = title
        if (image != null) {
            receivedImage.setImageResource(image.toInt())
        }
    }

}