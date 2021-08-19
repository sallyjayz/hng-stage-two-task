package com.sallyjayz.userinput

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zuriTextView = findViewById<MaterialTextView>(R.id.zuri_link_text)
        val hngTextView = findViewById<MaterialTextView>(R.id.hng_link_text)
        val i4gTextView = findViewById<MaterialTextView>(R.id.i4g_link_text)

        zuriTextView.setTextColor(Color.BLUE)
        hngTextView.setTextColor(Color.BLUE)
        i4gTextView.setTextColor(Color.BLUE)

    }

    fun displayInput(view: View) {

        addUserInput(view)
    }

    private fun addUserInput(view: View) {

        val inputEditText = findViewById<TextInputEditText>(R.id.user_input)
        val displayInputTextView = findViewById<MaterialTextView>(R.id.display_input_text)

        displayInputTextView.text = inputEditText.text

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)

    }

    fun zuriLink(view: View) {
        val zuriIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://zuri.team/"))
        startActivity(zuriIntent)
    }

    fun hngLink(view: View) {
        val hngIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://hng.tech/"))
        startActivity(hngIntent)
    }

    fun i4gLink(view: View) {
        val i4gIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ingressive.org/"))
        startActivity(i4gIntent)
    }
}