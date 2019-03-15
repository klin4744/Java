import java.util.Scanner;

public class LeapYears

{

public static void main(String[] args)

{

	int start,end, num =0;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the starting year:");
	
	start=sc.nextInt();
	
	System.out.print("Enter the ending year:");
	
	end=sc.nextInt();
	
	sc.close();



for(int i=start,count=0;i<=end;i++)

	{
	
	
	
	if(i%4==0)
	
		{
		
		System.out.print(i+" ");
		
		count++;
		num++;
		
		}
	
	
	
	if(count%10 == 0 && count>0)
	
		{
		
		System.out.println();
		
		
		
		count=0;
		
		}
	
	}
	System.out.println("\nThere were " + num + " leap years from " + start + " to " + end);
	}

}