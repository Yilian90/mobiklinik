package com.example.mobiklinik

import android.content.Intent
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class Customer_info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customer_info)





        val text = findViewById<EditText>(R.id.edtHP)
        text.addTextChangedListener(PhoneNumberFormattingTextWatcher())



        val timeSlot = resources.getStringArray(R.array.timeSlot)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, timeSlot
            )
            spinner.adapter = adapter

//            spinner.onItemSelectedListener = object :
//                AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(
//                    parent: AdapterView<*>,
//                    view: View, position: Int, id: Long
//                ) {
//                    Toast.makeText(
//                        this@Customer_info,
//                        getString(R.string.selected_item) + " " +
//                                "" + timeSlot[position], Toast.LENGTH_SHORT
//                    ).show()
//                }

//                override fun onNothingSelected(parent: AdapterView<*>) {
//                    // write code to perform some action
//                }
            }

            val buttonOrder = findViewById<Button>(R.id.order_btn)
            buttonOrder.setOnClickListener {
                val intent = Intent(this, ConfirmationOrder::class.java)
                startActivity(intent)

            }
        }


    }
