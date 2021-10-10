package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        //Task implementation
        int output = 0;
        int temp=1;
        if(inputNumber<0) {
            inputNumber=inputNumber*-1;
            temp=-1;
        };
        do {
            output=output*10 + inputNumber%10;
            inputNumber=inputNumber/10;
        }while(inputNumber>0);
        output=output*temp;
        return output;
    }
}
