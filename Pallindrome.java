package com.sunbeam;
import java.util.Scanner;
public class Pallindrome {

	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        int len = input.length();
		        len = len - 1;
		        //System.out.println(len);
		        int i = 0;
		        boolean flag = true;
		        while (i <= len)
		        {
		        	if(input.charAt(i) != input.charAt(len))
		        	{
		        		flag = false;
		        		break;
		        	}
		        	else
		        	{
		        		i++;
		        		len--;
		        	}
		        }

		      if(!flag)
		      {
		    	  System.out.println("Not a pallindrome.");
		      }
		      else
		      {
			        System.out.println("Pallindrome" );
  
		      }
		      sc.close();
		    }
		


	}


