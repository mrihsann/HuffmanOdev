package com.mycompany.huffmanodev;
public class Sorting {
    
    public static String[] sortByBubbleSort(String[] arr,int[] arrr){
    
        for(int i=0;i<arrr.length;i++){
            for(int j=0;j<arrr.length-1;j++){
                if(arrr[j]<arrr[j+1]){
                   
                    String degisken=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=degisken;
                }
                
            }
        }
        return arr;
    
    }
    public static int[] sortBySelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            
        }
        return arr;
    }
      
}


//ihsan arslan
//02210201520