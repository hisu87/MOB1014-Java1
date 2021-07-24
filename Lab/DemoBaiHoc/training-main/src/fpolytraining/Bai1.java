package fpolytraining;

import java.util.*;

public class Bai1 {
    private int countArithmeticSequence(ArrayList<Integer> arr){
        int count = 0;
        int temp = 2;
        for (int i = 2; i < arr.size(); i++){
            if (arr.get(i)-arr.get(i-1) == arr.get(i-1)-arr.get(i-2)){
                ++temp;
            }else{
                count += (temp-2)*(temp-1)/2;
                temp = 2;
            }
        }
        return count;
    }
}
