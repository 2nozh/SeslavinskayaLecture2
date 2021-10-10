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
        int temp=0,result=0;
        for (int start = 0; start < checkString.length(); start++) {
            for (int currentIndex = start; currentIndex < checkString.length(); currentIndex++) {
                if ((currentIndex==start)||(checkCurrentSubstring(checkString,start,currentIndex))){
                    temp++;
                }
                else break;
            }
            if(temp>result)result=temp;
            temp=0;
        }
        return result;
    }
    boolean checkCurrentSubstring(String checkString,int start,int currentIndex){
        for (int checkIndex = start; checkIndex < currentIndex; checkIndex++){
            if(checkString.charAt(currentIndex)==checkString.charAt(checkIndex)) return false;
            else if(checkIndex==currentIndex-1) return true;
        }
        return false;
    }
}
