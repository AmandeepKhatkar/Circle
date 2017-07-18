
	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class TestBook {

		public static void main(String[] args)
		{
			
			String sex;
			
			int count=0;
		
			Book [] book = new Book[30];//array of object
			Scanner input = new Scanner(System.in);
			for(int i =0;i<30;i++)
			{
				book[i]=new Book();//invoking default constructor
			}
			
			for(int i=0;i<30;i++)//intilize objects 
			{
				System.out.println("enter name of Book: ");
				book[i].bookname= input.nextLine();
				System.out.println("enter name of author: ");
				book[i].authorName= input.nextLine();
				System.out.println("enter email: ");
				book[i].email = input.nextLine();
				System.out.println("enter gender( m or f): ");
				do{
		        sex = input.next();
		        if((sex.charAt(0)=='m'||sex.charAt(0)=='M')||(sex.charAt(0)=='f'||sex.charAt(0)=='F')){
		        book[i].gender = sex.charAt(0);
		        break;
		        }
		        else
		        {
		        	System.out.println("enter only m or f");
		        	continue;
		        }
				}
		        while((sex.charAt(0)!='m'||sex.charAt(0)!='M')||(sex.charAt(0)!='f'||sex.charAt(0)!='F'));
		        
				do
				{
	            try
	            {
				
		        System.out.println("enter price of book: ");
				book[i].price= input.nextInt();
				 
					break;
	            }//end of try block
	            catch(final InputMismatchException e)
		         {
		       	System.out.println("You have entered an Invalid Choice.Please re-enter your choice");
		    	input.nextLine();
		    	continue;
		        }//end of catch block
				}
	            while(true);
	            do
	            {
	            	try{
	            		System.out.println("enter quantaties of book: ");
	    				book[i].qty= input.nextInt();
	    				break;
	            	}
	            	 catch(final InputMismatchException e)
	   	         {
	   	       	System.out.println("You have entered an Invalid Choice.Please re-enter your choice");
	   	    	input.nextLine();
	   	    	continue;
	   	        }//end of catch block
	            
				}
	            while(true);
	            System.out.println("do you want to CONTINUE or EXIT");
		        System.out.println("press c to enter new data, or press e to exit");
		        String choice = input.next();
		        count++;//to keep track of number of inputs
		          do
		          {
			  
		            if(choice.charAt(0)=='e')
		        	
		        	 break;
		        	 else if(choice.charAt(0)=='c')
		        	 {
		        	  input.nextLine();
		        	  break;
		        	  }
		        	else
		        	{
		        		System.out.println("you have enter invalid input. try again");
		        		input.nextLine();
		                 continue;
		        	}
		            
		        }while((choice.charAt(0)!='c'||choice.charAt(0)!='C')||(choice.charAt(0)!='e'||choice.charAt(0)!='E'));
		          if(choice.charAt(0)=='e')
		        	  break;
		          else
		      continue;
				}
				
		        	
			System.out.println("So you have entered\n");
				for(int j =0;j<count;j++)
				{
					System.out.println("\n"+book[j]);
				}
			input.close();
			
				
				
				
				
				
			
			}
		}
		






