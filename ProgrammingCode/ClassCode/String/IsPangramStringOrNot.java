//wajp to find given string is pangram string or not
//if the given string contains all the character irrespective of case such strings are called pangram stri//ng

import java.util.Scanner;

public class IsPangramStringOrNot {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine(); 
        int[] count= new int[26]; 

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
                count[s.charAt(i)-65]++; 
            else if(ch>='a' && ch<='z')
                count[s.charAt(i)-97]++; 

        }

        boolean flag=false;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
                flag=true;
        }

        if(flag==false)
            System.out.println("Pangram String");
        else
            System.out.println("Not a Pangram String");
        sc.close();
    }
}