//1+2+3+4+5+.......100
class Sum
{
	public static void main(String[] args)
	{
		int sum=0;
		int i=1;
		while(i<=100){
			sum=sum+i;
		i++;
		}
		System.out.println("Sum is: "+sum);
	}
}