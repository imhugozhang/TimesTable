package com.example.timestable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    lateinit var timesTableListView: ListView

    fun generateTimesTable(timesTable: Int) {
        val timesTableContent = arrayListOf<String>()
        for (i in 1..10) {
            timesTableContent.add((i * timesTable).toString())
        }
        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            timesTableContent
        )
        timesTableListView.adapter = arrayAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timesTableSeekBar: SeekBar = findViewById(R.id.timesTableSeekBar)
        timesTableListView = findViewById(R.id.timeTableListView)
        timesTableSeekBar.max = 20
        timesTableSeekBar.progress = 10
        var timesTable: Int
        timesTableSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val min = 1
                if (progress < min){
                    timesTable = min
                    timesTableSeekBar.progress = min
                }
                else timesTable = progress
                generateTimesTable(timesTable)
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        generateTimesTable(10)
    }
}
