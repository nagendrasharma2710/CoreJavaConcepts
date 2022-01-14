package Loops;

	import java.util.Scanner;
	class CCheck
	{
	     public static void main(String args[])
	     {
	      
	     Scanner s1=new Scanner(System.in);
	     System.out.println("1.Addition");
	     System.out.println("2.subtraction");
	     System.out.println("3.multiplication");
	     System.out.println("4.division");
	     System.out.println("5.exit");

	     System.out.println("enter your choice(1-5)");
	     int choice=s1.nextInt();
	    if(choice<=4) {
	     System.out.println("enter the first number");
	     int num1=s1.nextInt();
	     System.out.println("enter the second number");
	     int num2=s1.nextInt();
	   
	     switch(choice)
	     {
	     case 1:
	              System.out.println("Addition is:"+(num1+num2));
	     break;

	     case 2:
	              System.out.println("subtraction is:"+(num1-num2));
	     break;
	     case 3:
	              System.out.println("multiplication is:"+(num1*num2));
	     break;

	     case 4:
	              System.out.println("division is:"+(num1/num2));
	     break;
	     case 5:
	              System.out.println("exit");
	     break;

	    }
	  }else {
		  System.out.println("Invalid Request");
		  }
	  }
	}


