package fpolytraining;

import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    
    static int countWord(String str, String word) {
        return 0;
        
        // bài của bạn Huy
        // int min = str.length();
        // for (int i = 0; i < word.length(); i++) {
        //     int khop = 0, demTu = 0, demDay = 0;
        //     for (int j = 0; j < str.length(); j++) {
        //         if(word.charAt(i) == str.charAt(j)){
        //             for (int k = 0; k < word.length(); k++) {
        //                 if(word.charAt(k) == word.charAt(i)){
        //                     demTu ++;
        //                 }
        //             }
        //             for (int k = 0; k < str.length(); k++) {
        //                 if(str.charAt(k) == word.charAt(i)){
        //                     demDay ++;
        //                 }
        //             }
        //             khop = demDay /demTu;
        //         }
        //     }
        //     if(khop < min){
        //         min = khop;
        //     }
        // }
        // return min;



        // code cua bạn Cường
        // int count = str.length() / word.length();
        //     str = str.replaceAll("[^" + word + "]", "");
        //     Map<Character, Integer> left = new HashMap<>();
        //     Map<Character, Integer> right = new HashMap<>();

        //     for (char item : word.toCharArray()) {
        //         if (right.get(item) == null) {
        //             right.put(item, 1);
        //         } else {
        //             right.put(item, right.get(item) + 1);
        //         }
        //     }

        //     for (char item : str.toCharArray()) {
        //         if (left.get(item) == null) {
        //             left.put(item, 1);
        //         } else {
        //             left.put(item, left.get(item) + 1);
        //         }
        //     }

        //     for (char item : word.toCharArray()) {
        //         if (left.get(item) == null) {
        //             return 0;
        //         } else {
        //             int div = left.get(item) / right.get(item);
        //             if (count > div) {
        //                 count = div;
        //             }
        //             if(div == 0){
        //                 return count;
        //             }
        //             if (count == 0) {
        //                 return count;
        //             }
        //         }
        //     }

        //     return count;



        // code của bạn Vinh
        // int count = str.length()/word.length();        
        // int lgStr = str.length(), lgWord = word.length();        
        // while(word.length() != 0)
        // {
        //     char s = word.charAt(0);
        //     word = word.replace(s+"", "");
        //     str = str.replace(s+"", "");
            
        //     int temp = (lgStr - str.length())/(lgWord - word.length());
        //     if(temp < count) count = temp;
        //     if(count == 0) return count;
        //     lgStr = str.length();
        //     lgWord = word.length();
        // }
        
        // return count;
        



        // code của thầy, còn sai mấy test case cuối
        // int[] check = new int[word.length()];
        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = 0; j < word.length(); j++) {
        //         if(word.charAt(j) == str.charAt(i)){
        //             check[j]++;
        //         }
        //     }
        // }
        // int min = check[0];
        // for (int i = 0; i < check.length; i++) {
        //     if(check[i] < min){
        //         min = check[i];
        //     }
        // }
        // return min;
        
        
        
        // Bài của bạn Trúc

        // // display all characters 
		
		// String[] arrayStr = str.split("(?!^)");
		// String[] arrayWord = word.split("(?!^)");
		
		// // fetch unique characters of word
		
		// List<String> merge = new ArrayList<String>();
	    // for (int i = 0; i < word.length(); i++){
	    //     String current = String.valueOf(word.charAt(i));
	        
	    //     if (!merge.contains(current)){
	    //         merge.add(current);
	    //     }
	    // }
	    
		// // count occurences of word
		
	    // int[] countWord = new int[merge.size()];
	    
	    // for(int i=0; i<merge.size(); i++) {
	    	
    	// 	for(int j=0; j<arrayWord.length; j++) {
    	//     	if(merge.get(i).equals(arrayWord[j]))
    	//     		countWord[i] += 1;
    	//     }
	    // }
	    
	    // // count occurences of str
		
	    // int[] countStr = new int[merge.size()];
	    
	    // for(int i=0; i<merge.size(); i++) {
	    	
    	// 	for(int j=0; j<arrayStr.length; j++) {
    	//     	if(merge.get(i).equals(arrayStr[j]))
    	//     		countStr[i] += 1;
    	//     }
	    // }
		
	    // // merge 
	    
	    // int[] lastMerge = new int[merge.size()];
	    
	    // for(int i=0; i<merge.size(); i++) {
	    // 	lastMerge[i] = countStr[i] / countWord[i];
	    // }
	    
	    // for (int i = 0; i < lastMerge.length-1; i++) 
        //     for (int j = 0; j < lastMerge.length-i-1; j++) 
        //         if (lastMerge[j] > lastMerge[j+1]) { 
        //             int temp = lastMerge[j]; 
        //             lastMerge[j] = lastMerge[j+1]; 
        //             lastMerge[j+1] = temp; 
        //         }
		
        // return lastMerge[0];
    }
}