package com.natura.android.sample.components

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.natura.android.sample.R
import kotlinx.android.synthetic.main.activity_selection_control.*
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SelectionControlActivityTest {

    lateinit var selectionControlActivityScenario: ActivityScenario<SelectionControlActivity>

    @Test
    fun checkRadioButtonPrimaryColorsWhenThemeIsNatura() {
        launchActivityWithNaturaTheme()
        selectionControlActivityScenario.onActivity { selectionControlActivity ->
            val colorText = selectionControlActivity.radioPrimary.textColors.defaultColor
            val colorByState = selectionControlActivity.radioPrimary.buttonTintList
            val state = listOf(android.R.attr.state_selected).toIntArray()

            val colorSelected = colorByState?.getColorForState(state, colorByState.defaultColor)

            assertEquals(Color.parseColor("#333333"), colorText)
            assertEquals(Color.parseColor("#F4AB34"), colorSelected)
        }
    }

    @Test
    fun checkRadioButtonSecondaryColorsWhenThemeIsNatura() {
        launchActivityWithNaturaTheme()
        selectionControlActivityScenario.onActivity { selectionControlActivity ->
            val colorText = selectionControlActivity.radioSecondary.textColors.defaultColor
            val colorByState = selectionControlActivity.radioSecondary.buttonTintList
            val state = listOf(android.R.attr.state_selected).toIntArray()

            val colorSelected = colorByState?.getColorForState(state, colorByState.defaultColor)

            assertEquals(Color.parseColor("#333333"), colorText)
            assertEquals(Color.parseColor("#FF6B0B"), colorSelected)
        }
    }

    @Test
    fun checkRadioButtonPrimaryColorsWhenThemeIsAvon() {
        launchActivityWithAvonTheme()
        selectionControlActivityScenario.onActivity { selectionControlActivity ->
            val colorText = selectionControlActivity.radioPrimary.textColors.defaultColor
            val colorByState = selectionControlActivity.radioPrimary.buttonTintList
            val state = listOf(android.R.attr.state_selected).toIntArray()

            val colorSelected = colorByState?.getColorForState(state, colorByState.defaultColor)

            assertEquals(Color.parseColor("#333333"), colorText)
            assertEquals(Color.parseColor("#DE0085"), colorSelected)
        }
    }

    @Test
    fun checkRadioButtonSecondaryColorsWhenThemeIsAvon() {
        launchActivityWithAvonTheme()
        selectionControlActivityScenario.onActivity { selectionControlActivity ->
            val colorText = selectionControlActivity.radioSecondary.textColors.defaultColor
            val colorByState = selectionControlActivity.radioSecondary.buttonTintList
            val state = listOf(android.R.attr.state_selected).toIntArray()

            val colorSelected = colorByState?.getColorForState(state, colorByState.defaultColor)

            assertEquals(Color.parseColor("#333333"), colorText)
            assertEquals(Color.parseColor("#E9E9E9"), colorSelected)
        }
    }

    @Test
    fun checkRadioButtonPrimaryColorsWhenThemeIsTheBodyShop() {
        launchActivityWithBodyShopTheme()
        selectionControlActivityScenario.onActivity { selectionControlActivity ->
            val colorText = selectionControlActivity.radioPrimary.textColors.defaultColor
            val colorByState = selectionControlActivity.radioPrimary.buttonTintList
            val state = listOf(android.R.attr.state_selected).toIntArray()

            val colorSelected = colorByState?.getColorForState(state, colorByState.defaultColor)

            assertEquals(Color.parseColor("#333333"), colorText)
            assertEquals(Color.parseColor("#004236"), colorSelected)
        }
    }

    @Test
    fun checkRadioButtonSecondaryColorsWhenThemeIsTheBodyShop() {
        launchActivityWithBodyShopTheme()
        selectionControlActivityScenario.onActivity { selectionControlActivity ->
            val colorText = selectionControlActivity.radioSecondary.textColors.defaultColor
            val colorByState = selectionControlActivity.radioSecondary.buttonTintList
            val state = listOf(android.R.attr.state_selected).toIntArray()

            val colorSelected = colorByState?.getColorForState(state, colorByState.defaultColor)

            assertEquals(Color.parseColor("#333333"), colorText)
            assertEquals(Color.parseColor("#A55F53"), colorSelected)
        }
    }

    private fun launchActivityWithAvonTheme() {
        val context: Context = ApplicationProvider.getApplicationContext()

        val avonIntent = Intent(context, SelectionControlActivity::class.java)
        avonIntent.putExtra("theme", R.style.Theme_Avon)

        selectionControlActivityScenario = ActivityScenario.launch(avonIntent)
    }

    private fun launchActivityWithNaturaTheme() {
        val context: Context = ApplicationProvider.getApplicationContext()

        val avonIntent = Intent(context, SelectionControlActivity::class.java)
        avonIntent.putExtra("theme", R.style.Theme_Natura)

        selectionControlActivityScenario = ActivityScenario.launch(avonIntent)
    }

    private fun launchActivityWithBodyShopTheme() {
        val context: Context = ApplicationProvider.getApplicationContext()

        val avonIntent = Intent(context, SelectionControlActivity::class.java)
        avonIntent.putExtra("theme", R.style.Theme_BodyShop)

        selectionControlActivityScenario = ActivityScenario.launch(avonIntent)
    }
}
