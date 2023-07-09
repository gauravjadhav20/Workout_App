package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a7minutesworkout.databinding.ActivityBmiBinding
import java.math.BigDecimal
import java.math.RoundingMode

class BMIActivity : AppCompatActivity() {
    private var binding: ActivityBmiBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarBmiActivity)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "CALCULATE BMI"
        }

        binding?.toolbarBmiActivity?.setNavigationOnClickListener{
            onBackPressed()
        }

        binding?.btncalculateUnit?.setOnClickListener {
            if(validateMetricUnits()){
                val heightValue : Float = binding?.etMetricUnitHeight?.text.toString().toFloat() / 100
                val weightValue : Float = binding?.etMetricUnitWeight?.text.toString().toFloat() 

                val bmi = weightValue/ (heightValue*heightValue)
                displayBMIresult(bmi)
            }else{
                Toast.makeText(this@BMIActivity,
                "Please enter valid values",
                Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun displayBMIresult(bmi:Float){

        val bmiLebel :String
        val bmiDescription:String

        if(bmi.compareTo(15f) <= 0){
            bmiLebel= "Very severely underweight"
            bmiDescription = "You really need to take better care of yourself"
        }else if(bmi.compareTo(15f) >0  && bmi.compareTo(16f) <=0){
            bmiLebel= " severely underweight"
            bmiDescription = "You really need to take better care of yourself"
        }else if(bmi.compareTo(16f) >0  && bmi.compareTo(18.5f) <=0){
            bmiLebel= " underweight"
            bmiDescription = "Exercise daily and eat healthy"
        }else if(bmi.compareTo(18.5f) >0  && bmi.compareTo(25f) <=0){
            bmiLebel= " Normal weight"
            bmiDescription = "You are healthy"
        }else if(bmi.compareTo(25f) >0  && bmi.compareTo(30f) <=0){
            bmiLebel= " Overweight"
            bmiDescription = "need to take care of yourself"
        }else if(bmi.compareTo(30f) >0  && bmi.compareTo(35f) <=0){
            bmiLebel= "moderately  Obese class"
            bmiDescription = "need to take care of yourself"
        }else if(bmi.compareTo(35f) >0  && bmi.compareTo(40f) <=0){
            bmiLebel= " severely obese"
            bmiDescription = "need to take care of yourself"
        }else {
            bmiLebel= " very severely obese"
            bmiDescription = "need to take care of yourself"
        }

        val bmiValue = BigDecimal(bmi.toDouble()).setScale(2,RoundingMode.HALF_EVEN).toString()

        binding?.llDiplayBMIresult?.visibility= View.VISIBLE
        binding?.tvBMIValue?.text = bmiValue
        binding?.tvBMIType?.text = bmiLebel
        binding?.tvBMIDescription?.text = bmiDescription


    }

    private fun validateMetricUnits():Boolean{
        var isValid = true

        if(binding?.etMetricUnitWeight?.text.toString().isEmpty()){
            isValid = false
        }else if(binding?.etMetricUnitHeight?.text.toString().isEmpty()){
            isValid = false
        }
        return isValid
    }
}