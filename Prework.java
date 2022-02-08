import java.util.Scanner;

public class Prework{

	int n=0;

      	public void checkPalindrome() {

		System.out.print("Enter number to check if it is palindrome or not: ");
                Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int rn=0,tmp=n;
		while(n!=0)
		{
			rn=(rn*10)+(n%10);
			n /=10;
		}
		if(tmp==rn)
			System.out.println("Number is Palindrome.\n");
		else
			System.out.println("Number is not Palindrome.\n");
      	}
	
	public void printPattern() {
		System.out.print("Enter number of levels: ");
                Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n; i>0; i--){
		for(int j=i; j>0; j--)
		{	
			System.out.print("*");
		}
		System.out.print("\n");}
  	}
	
	public void checkPrimeNumber() {
		System.out.print("Enter number to check if it is prime or not: ");
		int i=0,f=0;
                Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=2; i<=(n/2); i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println(n+" is Composite number.\n");
		else
			System.out.println(n+" is Prime number.\n");
        }


        public void printFibonacciSeries() {
		System.out.print("Enter the number: ");
                Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
           	int first = 0, second = 1, sum=0, j=n-2;
		System.out.print("0 1 ");
		for(int i=0; i<j; i++)
		{	
			sum=first+second;
			first=second;
			second=sum;
			System.out.print(sum+" ");
		}
		System.out.print("\n");
         }

      	public static void main(String[] args) {

                Prework obj = new Prework();

                int choice;

                Scanner sc = new Scanner(System.in);

		do 
		{
		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

		+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

		+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

		System.out.println();

 

		choice = sc.nextInt();

			switch (choice) 
			{
			case 0:
				choice=0;
				break;
			
			case 1: 
				obj.checkPalindrome();
				break;
			
			case 2: 
				obj.printPattern();
				break;
			
			case 3: 
				obj.checkPrimeNumber();
				break;

			case 4: 
				obj.printFibonacciSeries();
				break;

			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
	
		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}//Main 
}//Prework

