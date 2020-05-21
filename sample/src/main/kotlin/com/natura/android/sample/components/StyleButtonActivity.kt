package com.natura.android.sample.components

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.natura.android.sample.R
import com.natura.android.sample.setChosenTheme
import com.natura.android.sample.setContentViewWithBrand

class StyleButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setChosenTheme()

        super.onCreate(savedInstanceState)

        setContentViewWithBrand(R.layout.activity_styled_button)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Button"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        onBackPressed()
        return true
    }
}
