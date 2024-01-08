package stringclass;

public class CommandLineSample{
	
	    public static void main(String[] args) 
		{
	    	for(int i = 1; i <=10;i++)
			{
				if (i==5)
				continue;
				//break;
				System.out.println(i);
			}
			for (int i = 2; i <= 10; i++)
			{
				if (i==7)
				continue;
				System.out.println(i);
			}
			for (int i = 3; i <= 10; i++)
			{
				if (i%2==0)
				continue;
				System.out.println(i);
			}
			for (int i = 4; i <= 10; i++)
			{
				if (i%3==0)
				continue;
				System.out.println(i);
			}}}
