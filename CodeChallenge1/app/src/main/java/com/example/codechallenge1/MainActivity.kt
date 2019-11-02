package com.example.codechallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        arm_bttn.setOnClickListener {
            if (armstrong()) {
                arm_text.setText("This number is an Armstrong number")
            } else {
                arm_text.setText("This number isn't an Armstrong number")
            }
        }

        palin_bttn.setOnClickListener {
            var palindrome: String = palin_txt.getText().toString()

            var check = isPalindrome(palindrome)

            if (check) {
                palin_txt.setText("This word is a palindrome")
            } else {
                palin_txt.setText("This word is not a palindrome")
            }
        }



        buzz_bttn.setOnClickListener {
            fizz_txt.setText(fuzbuz())
        }


        sort_bttn.setOnClickListener {
            val array_to_use = arrayOf(2,3,4,5,5,6,7)
            val numbersByElement = array_to_use.groupingBy { it }.eachCount()
            array_txt.setText(numbersByElement.maxBy { it.value }?.key.toString())
        }







    }

     fun armstrong(): Boolean{
        var num_to_check = arm_text.getText().toString()
            num_to_check.toInt()

         var break_down = arm_text.getText().toString()
         var nums_to_use = break_down.chunked(1)
         var result = nums_to_use.map { it.toInt() }
             result = result.map { it*it*it }
            val num_to_compare = result.sum()

         return num_to_check.toInt() == num_to_compare



    }

    fun isPalindrome(s: String): Boolean {
        s == s.reversed()
        return s == s.reversed()
    }


    fun fuzbuz(): String{
        var returnString = fizz_txt.getText().toString()
        var checknum = returnString.toInt()
        if(checknum%3 == 0 && checknum%5 ==0){
            returnString = "fizz buzz"
        }
        else if (checknum%3 == 0){
            returnString = "fizz"
        }
        else if (checknum%5 == 0){
            returnString = "buzz"
        }
        else{
            returnString = checknum.toString() + " is not divisible by 3 or 5"
        }


        return returnString

    }


    object Singleton{

        fun name(){
            var name = "This is my name"

        }
    }


}
