package com.shubham.LowLevelDesign.DesignPatterns.CompositeDesignPattern.Solution2WithCompositeDesign;

import java.lang.Number;

public class Main {

    public static void main(String args[]){

        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        ArithmeticExpression two = new java.lang.Number(2);

        ArithmeticExpression one = new java.lang.Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(one,seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two,addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());


    }
}
