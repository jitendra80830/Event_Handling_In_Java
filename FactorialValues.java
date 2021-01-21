//Factotial programming
import java.util.Scanner;

public class FactorialValues{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		in Factorial(int n){
			if(n==0){
				return(1);
			else
				return (n*Factorial(n-1));
			}
		}
	}
}