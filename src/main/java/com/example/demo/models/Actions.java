package com.example.demo.models;

public class Actions {
    public double num1;
    public double num2;
    public String action;

    public Actions(String input1, String input2, String action){
        try {
            num1 = Double.parseDouble(input1);
            num2 = Double.parseDouble(input2);
        } catch (Exception exception){
            num1 = 0;
            num2 = 0;
        }
        this.action = action;
    }

    public double Calcualte(){
        double result = 0.0;
        switch (action){
            case "1":
                result = num1+num2;
                break;
            case "2":
                result = num1-num2;
                break;
            case "3":
                result = num1*num2;
                break;
            case "4":
                result = num1/num2;
                break;
            default:
                break;
        }
        return result;
    }

}
