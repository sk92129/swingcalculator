package main;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

/**
 * Created by seankang on 4/13/2015.
 */


public class MVCCalculator {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView,theModel);

        theView.setVisible(true);

    }
}