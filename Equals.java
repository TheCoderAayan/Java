package com.sunbeam;

public class Equals {

	
		    public static void main(String[] args) {
		        String[] array1 = {"apple", "banana", "cherry", "mango", "grape"};
		        String[] array2 = {"banana", "orange", "mango", "pear", "grape"};

		        System.out.println("Duplicate values in both arrays:");

		        for (int i = 0; i < array1.length; i++) {
		            for (int j = 0; j < array2.length; j++) {
		                if (array1[i].equals(array2[j])) {
		                    System.out.println(array1[i]);
		                }
		            }
		        }
		    }
		}

 
