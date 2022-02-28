package com.example.abo_hamdo_client

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



// Read from the database
        val database11 = FirebaseDatabase.getInstance()
        val myRef11 = database11.getReference("bd")
        myRef11.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextBD1.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })

        // Read from the database
        val database12 = FirebaseDatabase.getInstance()
        val myRef12 = database12.getReference("sd")
        myRef12.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextSD1.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })

        // Read from the database
        val database13 = FirebaseDatabase.getInstance()
        val myRef13 = database13.getReference("bt")
        myRef13.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextBT1.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })


        // Read from the database
        val database14 = FirebaseDatabase.getInstance()
        val myRef14 = database14.getReference("st")
        myRef14.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextST1.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })








        //
        //
        //

        // Read from the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("date")
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                var str="اخر تحديث :"
                str+="\n"
                str+=value.toString()
                TextD.setText(str)
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })
        // Read from the database
        val database1 = FirebaseDatabase.getInstance()
        val myRef1 = database1.getReference("bdollar")
        myRef1.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextBD.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })

        // Read from the database
        val database2 = FirebaseDatabase.getInstance()
        val myRef2 = database2.getReference("sdollar")
        myRef2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextSD.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })

        // Read from the database
        val database3 = FirebaseDatabase.getInstance()
        val myRef3 = database3.getReference("bturkey")
        myRef3.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextBT.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })


        // Read from the database
        val database4 = FirebaseDatabase.getInstance()
        val myRef4 = database4.getReference("sturkey")
        myRef4.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextST.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })

        // Read from the database
        val database5 = FirebaseDatabase.getInstance()
        val myRef5 = database5.getReference("gold")
        myRef5.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                TextG.setText(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })
        var phone="tel:"
        // Read from the database
        val database6 = FirebaseDatabase.getInstance()
        val myRef6 = database6.getReference("phone")
        myRef6.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
                phone+=value.toString()
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })
        btn_ph.setOnClickListener {
            val intent1 = Intent(Intent.ACTION_DIAL, Uri.parse(phone))
            startActivity(intent1)
        }

    }
}
