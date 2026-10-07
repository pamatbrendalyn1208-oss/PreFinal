/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author User
 */
public class InsertionSort {

    static void print() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }
    int[] numbers;
    
    // Constructor to initialize the array
    public InsertionSort(int[] numbers) {
        this.numbers = numbers; 
    }
        
    // Method to sort the array using Insertion Sort
    public void sort() {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            
            System.out.println("Temp: " + temp);
            System.out.printf("Comparing: %d and %d%n", numbers[j], temp);
            
            
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            
           
            numbers[j + 1] = temp;
        }
    }
     
  
    public void display() {
        for (int number : this.numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

 
    }


    
    

