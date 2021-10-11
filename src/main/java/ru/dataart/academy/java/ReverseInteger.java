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

        //output is for result
        int output = 0;
        //temp is for storing negative value if input<0
        int temp=1;
        //case checks, if input is negative
        //if so, input flips and its minus "stores" in temp
        if(inputNumber<0) {
            inputNumber=inputNumber*-1;
            temp=-1;
        }
        //cycle keeps on dividing input by 10, writing residue as a result
        do {
            output=output*10 + inputNumber%10;
            inputNumber=inputNumber/10;
        }while(inputNumber>0);
        //returning possible minus
        output=output*temp;
        return output;
    }
}
