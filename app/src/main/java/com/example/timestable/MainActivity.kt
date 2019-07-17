package com.example.timestable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    lateinit var timesTableSeekBar: SeekBar
    lateinit var timesTableListView: ListView
    lateinit var timesTableContent: MutableList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timesTableSeekBar = findViewById(R.id.timesTableSeekBar)
        timesTableListView = findViewById(R.id.timeTableListView)
        timesTableSeekBar.max = 20
        timesTableSeekBar.progress = 10
//        timesTableSeekBar.min = 1
        timesTableSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                var min = 1
                var timesTable: Int
                if (progress < min){
                    timesTable = min
//                    timesTableSeekBar.progress = min
                }
                else timesTable = progress
//                Log.i("seekbar value", timesTable.toString())
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
//                timesTableGenerator(timesTable)


//        var timesTable= 10
//        for (i in 1..10) { timesTableContent.add((i * timesTable).toString()) }
//        var arrayAdapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1,
//            timesTableContent
//        )
////                timesTableListView.adapter
//        timesTableListView.adapter = arrayAdapter
//


//        timesTableGenerator(10)

//    fun timesTableGenerator(timesTable: Int) {
////        var timesTable = 10
//        for (i in 1..10) {
//            timesTableContent.add(i * timesTable)
//        }
//        var arrayAdapter: ArrayAdapter<Int> =
//            ArrayAdapter(this, android.R.layout.simple_list_item_1, timesTableContent)
//        timesTableListView.adapter = arrayAdapter
    }
}
