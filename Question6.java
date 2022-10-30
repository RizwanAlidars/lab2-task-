
// rizwan ali
// roll num:84

//Create a restaurant manu in switch case where if we select any option the program should the price of that food item....



import java.util.*;
class Question6{
	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println(" Welcom to five star restaurant...");
	System.out.println(" ");
	System.out.println("This is manu: \n \n1)potato chips.\n2)Zinger Burger.\n3)tea.\n4)chicken biryani.\n5)chicken roll.\n6)chivken karahi.\n7)green tea.\n8)pakola juice.");
System.out.println("\nPlease order! Would you wanna know prize about items\n" +
 " Enter the number of item.. ");
     int z=ob.nextInt();
	switch(z){
		case 1:
	 	System.out.println("potato chips. \f Rs.50.0"); 
		break;
		case 2:
		 System.out.println("zinger burgur. \f Rs.400.0"); 
		 break;
		 	case 3:
	 	System.out.println("tea.\f Rs.150.0"); 
	 	break;
	 		case 4:
	 	System.out.println("Chicken biryani\f Rs.1200.0"); 
	 	break;
	 		case 5:
	 	System.out.println("chiken roll.\f Rs.1300.0"); 
	 	break;
	 		case 6:
	 	System.out.println("chivken karahi.\f Rs.400.0"); 
	 	break;
	 		case 7:	
	 	System.out.println("green tea.\f Rs.120"); 
	 	break;
	 		case 8:
	 	System.out.println("pakola juice.\fRs.80"); 
		default:
		System.out.println("Sorry, This item is not available. please select among above items..");
	}
	                                                                                                                                     	                		
	}
}
