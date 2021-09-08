package com.trueddns.homenano.coffe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    private var titleTextView: TextView? = null
    private var contentTextView: TextView? = null
    private var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var intent = intent

        titleTextView = findViewById<TextView>(R.id.detailTitleTextView)
        contentTextView = findViewById<TextView>(R.id.detailContentView)
        imageView = findViewById<ImageView>(R.id.detailImageView)

        titleTextView!!.text = intent.getStringExtra("title")
        contentTextView!!.text = intent.getStringExtra("content")

        // set image
        val img = intent.getStringExtra("thumbnail").toString()
        // Not work
//        imageView!!.setImageResource(img, 1)
        Picasso.get()
            .load(img)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background )
            .into(imageView)
    }
}


