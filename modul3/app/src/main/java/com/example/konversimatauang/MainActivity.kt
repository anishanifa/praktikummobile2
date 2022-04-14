package com.example.konversimatauang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.konversimatauang.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnConvertor.setOnClickListener{ startConversion() }

        bind.currencyValue.setOnKeyListener{ view, keyCode, _ ->
            handleKeyEvent(
                view,
                keyCode
            )}
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("currency_result", bind.currencyResult.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        bind.currencyResult.setText(savedInstanceState.getString("currency_result"))
    }

    private fun startConversion(){
        val stringInput = bind.currencyValue.text.toString()
        val currencyInput = stringInput.toDoubleOrNull()

        if (currencyInput == null){
            bind.currencyResult.text = ""
            return
        }

        val userCurrencyChoice = when (bind.currencyChoice.checkedRadioButtonId){
            R.id.c_euro -> 15564.45
            R.id.c_dollar -> 14376.80
            R.id.c_yen -> 114.62
            else -> 3833.86
        }

        var currencyOutput =  currencyInput * userCurrencyChoice

        val indonesianLocale = Locale("in", "ID")
        val result_format =
            NumberFormat.getCurrencyInstance(indonesianLocale).format(currencyOutput)

        bind.currencyResult.text = getString(R.string.currency_result, result_format)
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            val inputMethodManager =
                getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}