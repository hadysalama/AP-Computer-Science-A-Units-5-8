/*
 *DATE: 12/7/2017
 *PROJECT: Polyalphabetic Cipher
 *TEAM: WILLIAM THESKEN & HADY SALAMA
 */
 
 import java.util.Scanner;
 import java.io.*;
 public class PolyCipher
 {	
 	public static void main(String args[])
 	{	
 		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
 		System.out.println("Enter a message: ");
 		Scanner reader = new Scanner(System.in);
 		String message = reader.nextLine();
 	//	System.out.println("Enter an integer key: ");
 	//	int key = reader.nextInt();
 		char[] messageArray = message.toCharArray();
 		messageArray[3] = 'i';
 		int i = 0;
 		if (ouput == alphabet[i])
 		for (char output : messageArray) {
 			System.out.print(alphabet[i]);
 			i++;
 		}
 	}
 }