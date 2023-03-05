package ru.netology.homework_2_resources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("pvl_info", "Запустилось")

        setContentView(R.layout.activity_main)

        var textsCounter = 0
        val arrTexts = resources.getStringArray(R.array.text_hello)

        findViewById<Button>(R.id.button_new_text).setOnClickListener {
            textsCounter = if (textsCounter==arrTexts.size-1) {0} else {textsCounter+1}
            println("Хотим поменять текст на "+arrTexts[textsCounter])

            val myTextView = findViewById<TextView>(R.id.textView) as TextView
            // можно так:
            // myTextView.setText(resources.getStringArray(R.array.text_hello)[textsCounter])
            // и можно так:
            myTextView.text = arrTexts[textsCounter]

        }
    }
}