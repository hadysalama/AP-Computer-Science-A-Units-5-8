/*String Down
 *Hady Salama
 *12/8/2017
 */
 
 import java.util.Scanner;
 public class CreditCardBill
 {	
 	public static void main(String args[])
 	{
 		System.out.println("Please enter the monthly payment: ");
 		Scanner reader = new Scanner(System.in);
 		double n = reader.nextDouble();
 		double balance = 1000;
 		double totalPayments = 0;
 		double interest  = 0;
 		int month = 0;
 		while (balance > 0){
 			if (balance>=100)
 			{
 				interest = balance * .015;
 				balance = balance - n + interest;
 				month++;
 				totalPayments = month * n;
 			}
 			else {
 				totalPayments+=balance;
 				balance-=balance;
 				month++;
 			}
 			System.out.println("Month: " + month + " Balance: $" + balance + " Total Payments: $" + totalPayments);
 		}
 			
 	}
 }