package com.example.ar_project_v1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MarkaPageActivity : AppCompatActivity() {

    private lateinit var mercedesSpinner: Spinner
    private lateinit var toyotaSpinner: Spinner
    private lateinit var BMWSpinner: Spinner
    private lateinit var PorscheSpinner: Spinner
    private lateinit var HondaSpinner: Spinner
    private lateinit var VolkswagenSpinner: Spinner
    private lateinit var LamborghiniSpinner: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marka_page)

        mercedesSpinner = findViewById(R.id.spinnerMercedes)
        toyotaSpinner = findViewById(R.id.spinnerToyota)
        BMWSpinner = findViewById(R.id.spinnerBMW)
        PorscheSpinner = findViewById(R.id.spinnerPorsche)
        HondaSpinner = findViewById(R.id.spinnerHonda)
        VolkswagenSpinner = findViewById(R.id.spinnervw)
        LamborghiniSpinner = findViewById(R.id.spinnerlambo)



        //MERCEDES SPINNER
        val itemsMercedes = arrayOf("MERCEDES", "A45 AMG","S600")
        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterMercedes = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsMercedes)
        adapterMercedes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        mercedesSpinner.setAdapter(adapterMercedes)

        //**************************************************************************************************************************

        //TOYOTA SPINNER
        val itemsToyota = arrayOf("TOYOTA", "Corolla", "Supra", "İnnova")

        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterToyota = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsToyota)
        adapterToyota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        toyotaSpinner.setAdapter(adapterToyota)

        //**************************************************************************************************************************

        //BMW SPINNER
        val itemsBWM = arrayOf("BMW", "BMW I8", "BMW M2")

        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterBMW = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsBWM)
        adapterBMW.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        BMWSpinner.setAdapter(adapterBMW)

        //**************************************************************************************************************************

        //Porsche SPINNER
        val itemsPorsche = arrayOf("PORSCHE", "911", "718 boxster")

        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterPorsche = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsPorsche)
        adapterPorsche.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        PorscheSpinner.setAdapter(adapterPorsche)

        //**************************************************************************************************************************

        //Honda SPINNER
        val itemsHonda = arrayOf("HONDA","Civic", "Accord")

        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterHonda = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsHonda)
        adapterHonda.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        HondaSpinner.setAdapter(adapterHonda)

        //**************************************************************************************************************************

        val itemsVw = arrayOf("VOLKSWAGEN","Amarok", "Beetle")

        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterVw = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsVw)
        adapterVw.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        VolkswagenSpinner.setAdapter(adapterVw)

        //**************************************************************************************************************************

        val itemsLambo = arrayOf("LAMBORGHİNİ","Huracan", "Gallardo")

        // ArrayAdapter oluşturma ve öğeleri Spinner'a bağlama
        val adapterLambo = ArrayAdapter(this, android.R.layout.simple_spinner_item, itemsLambo)
        adapterLambo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        LamborghiniSpinner.setAdapter(adapterLambo)


        //**************************************************************************************************************************


        mercedesSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsMercedes[position]
                if (selectedValue.equals("A45 AMG")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Mercedes_A_Activity::class.java))
                }
                else if(selectedValue.equals("S600")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Mercedes_S_Activity::class.java))
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        BMWSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsBWM[position]

                if (selectedValue.equals("BMW I8")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Bmw_i8_Activity::class.java))
                }
                else if (selectedValue.equals("BMW M2")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Bmw_m2_Activity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        toyotaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsToyota[position]

                if (selectedValue.equals("Corolla")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, ToyotaCorollaActivity::class.java))
                }
                else if (selectedValue.equals("Supra")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Toyota_Supra_Activity::class.java))
                }
                else if(selectedValue.equals("İnnova")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Toyota_Innova_Activity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        HondaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsHonda[position]

                if (selectedValue.equals("Civic")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Honda_Civic_Activity::class.java))
                }
                else if (selectedValue.equals("Accord")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Honda_Accord_Activity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        VolkswagenSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsVw[position]

                if (selectedValue.equals("Amarok")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Volkswagen_Amarok_Activity::class.java))
                }
                else if (selectedValue.equals("Beetle")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Vw_Beetle_Activity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        LamborghiniSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsLambo[position]

                if (selectedValue.equals("Huracan")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, LamborginiHuracanActivity::class.java))
                }
                else if (selectedValue.equals("Gallardo")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, LamborginiGallardoActivity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        PorscheSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Seçilen öğe değiştikçe buraya kod ekleyebilirsiniz.
                val selectedValue = itemsPorsche[position]

                if (selectedValue.equals("911")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Porsche911Activity::class.java))
                }
                else if (selectedValue.equals("718 boxster")){
                    Toast.makeText(applicationContext, "Seçilen öğe: $selectedValue", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@MarkaPageActivity, Porsche718_Activity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }



    }
}