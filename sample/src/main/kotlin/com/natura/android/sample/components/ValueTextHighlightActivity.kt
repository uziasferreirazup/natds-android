package com.natura.android.sample.components

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.natura.android.sample.R
import com.natura.android.widget.ValueTextHighlight

class ValueTextHighlightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_input_highlight)

        val inputHighlight = findViewById<ValueTextHighlight>(R.id.highlightInitViaCode)
        inputHighlight.setDescription("Add description via code")
        inputHighlight.setHighlightedInfo("$ 00.00")
        inputHighlight.setEditButtonClickListener { Log.e("Click", "Click") }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Value Text Highlight")
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        onBackPressed()
        return true
    }
}
