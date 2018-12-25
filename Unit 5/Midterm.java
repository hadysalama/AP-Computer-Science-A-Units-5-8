/*Midterm
 * Hady Salama
 *12/18/17
 */

import java.util.Scanner;
public class Midterm {

   public static void main(String[] args)
   {
   	Scanner reader = new Scanner(System.in);
   	System.out.println("Please enter the starting integer: ");
   	int start = reader.nextInt();
   	System.out.println("Please enter the ending integer: ");
   	int end = reader.nextInt();
   	System.out.println();
   	System.out.println();
   	String notification = "sdfsdfsdfsdfsdY0p2vk3wvli8tv07vkpmb328vi8:sdfsdfsdfsdfsfdssf";
   	String notification1 = notification.replace('0','o');
   	String notification2 = notification1.replace('7','f');
   	String notification3 = notification2.replace('3','e');
   	String notification4 = notification3.replace('p','u');
   	String notification5 = notification4.replace('8','s');
   	String notification6 = notification5.replace('2','r');
   	String notification7 = notification6.replace('k','n');
   	String notification8 = notification7.replace('v',' ');
   	String notification9 = notification8.substring(14,42);
   	System.out.println(notification9.toUpperCase());
   	for(int i = start; i <= end; i++)
   	{
   		if((i%2) == 0)
   			System.out.println(" " + i + " ");
   	}
   }
  }