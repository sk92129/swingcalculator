package model;

/**
 * Created by seankang on 4/13/2015.
 */
public class CalculatorModel {


    // Holds the value of the sum of the numbers
    // entered in the view

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){

        calculationValue = firstNumber + secondNumber;

    }

    public int getCalculationValue(){

        return calculationValue;

    }

}
