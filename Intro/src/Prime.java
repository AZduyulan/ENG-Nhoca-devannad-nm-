import java.util.Scanner;

public class Prime {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter your prime number");
	        int number = input.nextInt();
	        int primeCheck=0;
	        if(number<=2){
	            System.out.println("give me moooooooore bigger things :)");
	        }
	        if(number>=3 && number>0){
	            for(int i=2;i<number;++i){
	                if(number%i==0)
	                    primeCheck+=1;
	            }
	            if(primeCheck==0){
	                System.out.println(number + " is a prime number");
	            }
	            else{
	                System.out.println(number+" yok gardaş yok.");
	            }
	        }
	        else{
	            System.out.println("please write an number / just number");
	        }
	    }
}
