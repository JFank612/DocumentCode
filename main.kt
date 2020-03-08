/**
 * @author Joel Fankhauser
 * Date: 3/8/2020
 * Main Function
 */



import java.lang.NumberFormatException


fun main() {
    //Try function looks for character error in user input
    try {


        do{
        // do looping function calling for user input from options below
        println("1. Residential")
        println("2. Commercial")
        println("3. Done")
        print("Enter your selection:")
        val userInput = readLine()!!.toInt()
        // if function accepts user input and calls residential class
        if (userInput == 1) {
            try{ //try function looks for character error in user input
            println("\nResidential")
            print("Enter your name: ")
            val rName = readLine()!!.toString()
            print("Enter your phone number: ")
            val rPhone = readLine()!!.toString()
            print("Enter your address: ")
            val rAddress = readLine()!!.toString()
            print("Enter your square feet: ")
            val rSquareFeet = readLine()!!.toDouble()
            print("Enter 1 if you are a senior citizen or 0 to continue:")
            val rAnswer = readLine()!!.toInt()
            var rSenior = false

            if(rAnswer == 1)
            {
                rSenior = true
            } // if function accepts user input and applies discount if the input equals 1

            val customer1 = Residential(rName, rPhone,
                rAddress, rSquareFeet,rSenior) //turns all the user input into one value

            println("\n")
            customer1.showInfo()
            customer1.charges() // the users input is collected and displayed
            println("\n")
        } catch (e: NumberFormatException) {
            println("${e.message} is an invalid character") //try function response to incorrect input
        }

        }
        else if ( userInput == 2) // else if function accepts user input and calls commercial class
        {
            try{ //try function looks for character error in user input
            println("\nCommercial")
            print("Enter your property name: ")
            val cProperty = readLine()!!.toString()
            print("Enter your name: ")
            val cName = readLine()!!.toString()
            print("Enter your phone number: ")
            val cPhone = readLine()!!.toString()
            print("Enter your address: ")
            val cAddress = readLine()!!.toString()
            print("Enter your square feet: ")
            val cSquareFeet = readLine()!!.toDouble()
            print("Enter 1 for multiple properties or 0 to continue:")
            val cAnswer = readLine()!!.toInt()
            var cMultiProperty = false

            if(cAnswer == 1)
            {
                cMultiProperty = true
            } // if function accepts user input and applies discount if the input equals 1

            val customer1 = Commercial(cName, cPhone,
                cAddress, cSquareFeet,
                cProperty, cMultiProperty) //turns all the user input into one value

            println("\n")
            customer1.showInfo()
            customer1.charges() // the users input is collected and displayed
            println("\n")
        } catch (e: NumberFormatException) {
            println("${e.message} is an invalid character") //try function response to incorrect input
        }
        }
        else if(userInput == 3)
            println("Your order has been placed.")
        else
            println("Invalid Input")
        }
        while(userInput!=3)
    }
    catch(e: NumberFormatException)
    {
        println("${e.message} is an invalid character. Input number.") //try function response to incorrect input
    }
}
