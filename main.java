import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
    //从后往前
    //如果是9，变成0，继续循环
    //如果其他，+1 return；
    //如果有进位，建立length+1新列表，【0】为 1；
        
    for(int i=digits.length-1;i>=0;i--){
        if(digits[i]==9){
            digits[i]=0;
        }
        else{
            digits[i]++;
            return digits;
        }
        
    }     
    
    digits=new int[digits.length+1];
    digits[0]=1;
    return digits;
    }
}
