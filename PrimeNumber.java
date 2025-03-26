import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int count=0;
		int i=1;
		while(i<=n/2){
			if(n%i==0){
				count++;
			}	
		i++;
		}
		if(count==1)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is not a Prime Number");

	}
}



