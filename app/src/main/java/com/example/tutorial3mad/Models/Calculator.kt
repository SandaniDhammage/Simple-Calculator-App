package com.example.tutorial3mad.Models

class Calculator(private val number1:Double,private val number2:Double) {
    fun add():Double{
        return number1+number2
    }
    fun substract()=number1-number2
    fun multiply()=number1*number2
    fun divide()=number1/number2
  }