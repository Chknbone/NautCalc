package com.palarran.nautcalc

/**
 *App name: Nautcalc
 *Created by CB on 12/20/2017.
 *Simple app that accepts a number(float) and converts it into miles, kilometers & nautical miles
 */

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		//Find the id of unitOfMeasure
		val unitOfMeasure = findViewById<Spinner>(R.id.unitOfMeasureSpinner)

		//set an adapter with strings array
		unitOfMeasure.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,
				resources.getStringArray(R.array.list_units_of_measure))

		//set onClick listener
		unitOfMeasure.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
			override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

				Toast.makeText(this@MainActivity, "You have Selected ${unitOfMeasure
						.selectedItem}", + Toast.LENGTH_SHORT).show()
			}

			override fun onNothingSelected(parent: AdapterView<*>) {

				/*Do something if nothing selected*/
			}
		}
	}
}