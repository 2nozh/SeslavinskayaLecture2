package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        //temp is for the length of current found substring,
        //result is for the longest one
        int temp=0,result=0;
        //start is current substring first symbol index
        //cycle goes through each symbol,making it first for substring
        //so, each possible substring will be measured in the cycle
        for (int start = 0; start < checkString.length(); start++) {
            //currentIndex is for symbol, which is checking at the moment
            //cycle breaks when current symbol equals any other symbol in current substring
            for (int currentIndex = start; currentIndex < checkString.length(); currentIndex++) {
                //case that increments temp, if it is first symbol in current substring, or method returns true
                //method returns true if current symbol is not equal to any other symbol in current substring
                if ((currentIndex==start)||(checkCurrentSubstring(checkString,start,currentIndex))){
                    temp++;
                }
                else break;
            }
            //wrighting only the biggest substring length
            if(temp>result)result=temp;
            //zeroing temp, to measure next found substring
            temp=0;
        }
        return result;
    }
    //method returns true if current symbol is not equal to any other symbol in current substring
    boolean checkCurrentSubstring(String checkString,int start,int currentIndex){
        for (int checkIndex = start; checkIndex < currentIndex; checkIndex++){
            if(checkString.charAt(currentIndex)==checkString.charAt(checkIndex)) return false;
            else if(checkIndex==currentIndex-1) return true;
        }
        return false;
    }
}
