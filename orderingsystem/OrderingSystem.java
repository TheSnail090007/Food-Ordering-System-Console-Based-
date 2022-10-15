/*
 *INSTITUTIONAL ASSESSMENT 
 * JAVA CONSOLE ORDERING SYSTEM APPLICATION
 *
 *
 */

package orderingsystem;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class OrderingSystem {

           //mag-declare ng variable na may total value of 0 / STANDARD INITIALIZATION
           //To publicly access the quantity as it updates every time you wish to buy again
           public static int total_quantity=0;
           //Dito mo ilagay ang lahat ng products
           public static String[] products = {null,        "\t\t\t\t   (1)   Taro Milktea                 P30.00   ",
	 	                                             "\t\t\t\t   (2)   Big Mac                      P139.00  ",
	 		                           "\t\t\t\t   (3)   Cheese Burger                P35.00   ",
	 		                           "\t\t\t\t   (4)   Spagetti                     P50.00   ",
                                                                                 "\t\t\t\t   (5)   Nuggets                      P45.00   ",
                                                                                 "\t\t\t\t   (6)   Sprite                       P15.00   " };
           //Prices in accordance of their elements
           public static int[] product_price ={0,30,139,35,50,45,15};
           //This is the cart for the check-out of all order you have
           public static int[] final_qty=new int[7];
           
           
           
           
public static void main(String[] args)  throws InterruptedException{
           
         
          
          // TODO code application logic here
            Scanner read = new Scanner(System.in);
		int choose, quantity,change,payment;
		int p1=0,  p2=0, p3=0, p4=0, p5=0, p6=0;
		char decision = 0;
                                    String name;
                                    
            //Get the costumers's name.
            System.out.print("\t\t\t\tEnter your name         : ");
            name = read.nextLine();                      
            System.out.println("\n");              
            
            // START THE EXECUTION HERE! 
            System.out.println("\t\t\t\t       Welcome to Burgeran ni Daniel, What do you want to order?"); 
            System.out.println("\t\t\t\t*******************************************************************");
            System.out.println("\t\t\t\t                         ''MENU''                                 ");
            System.out.println("\t\t\t\t    Code    Meal                       Price                       ");
                                    do
		{
                                    //EXECUTE TO DISPLAY ALL THE PRODUCTS 
		for (int i = 0; i < products.length; i++)
		{
                                    if(products[i] != null)
		System.out.println(products[i]);
                                    }
                                    System.out.println("\t\t\t\t                                                                   ");
                                    System.out.println("\t\t\t\t*******************************************************************");

                                    //PUMILI NG CODE ORDER
                                    System.out.print("\t\t\t\tEnter menu number       : ");
		choose=read.nextInt();
                
                                    //ILAGAY ANG QUANTITY NG ITEM 
		System.out.print("\t\t\t\tEnter Quantity          : ");
		quantity=read.nextInt();
                                    
                                    switch(choose)
		{
		case 1:
		p1 += quantity;
		final_qty[1]=p1;
		break;
 
		case 2:
		p2 += quantity;
		final_qty[2]=p2;
		break;
 
		case 3: 
		p3 += quantity;
		final_qty[3]=p3;
		break;
 
		case 4: 
		p4 += quantity;
		final_qty[4]=p4;
		break;
                    
                                    case 5: 
		p5 += quantity;
		final_qty[5]=p5;
		break;
                        
                                    case 6: 
		p6 += quantity;
		final_qty[6]=p6;
		break;
		}
                                    
                                    System.out.print("\t\t\t\tOrder more?[Y]Yes[N]No  : ");
                                    decision = read.next().charAt(0);       
                                    }
                                    while(decision != 'n' && decision != 'N');
                                    
                                    ///DITO ANG CONSOLE BASED PROGRESS 
                                    System.out.print("\t\t\t\tYour order is being processed please wait");
                                    //sleep ()  static method
                                    //to show processing of order 
                                    final int max = 4;
                                    for( int i =0; max >= i; i++){
                                    System.out.print('*');
                                    Thread.currentThread().sleep(1000);
                                    }
                                                            
                                    System.out.println("\n");
                                    System.out.println("\t\t\t\t=============================Final Cart============================");
                                    System.out.println("\n");
                                    System.out.println("\t\t\t\t                         Burgeran ni Daniel");
                                    System.out.println("\t\t\t\t       056 BAYAN-BAYANAN AVE. CONCEPTION 1, MARIKINA CITY  ");
                                    System.out.println("\t\t\t\tCostumer's Fullname     : "  +name);
                                    //GET THE CURRENT TIME
                                    Date currentDate = new Date();
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
                                    System.out.print("\t\t\t\tDate/Time of purchase   : " );
                                    System.out.print(dateFormat.format(currentDate));
                                  
                                  
                                    System.out.println("\n");
		System.out.println("\t\t\t\t    Item    \t\t\t      Price\t  Qty\t Total");
		int sum=0;
		for (int i=0; i < final_qty.length; i++)
		{
			if(final_qty[i] != 0)
			{
			System.out.println(products[i]+"    "+final_qty[i]+"      "+final_qty[i]*product_price[i]);
			sum = sum + final_qty[i]*product_price[i];
			}
		}
                                    System.out.println("\n");
		System.out.println("\t\t\t\tTotal Purchased items   : "+(p1+p2+p3+p4+p5+p6));
		System.out.println("\t\t\t\tTotal Purchase          : "+sum);
		System.out.print("\t\t\t\tEnter Payment           : ");
                                    payment=read.nextInt();

                                   if( payment >= sum)  {
                                   change = payment - sum;
                                   System.out.println("\t\t\t\tChange                  : " +change);
                                   System.out.println("\t\t\t\tThank you for buying! We are glad to serve you again");
                                  } else
                                  {
                                  System.out.println("\t\t\t\tNot enough payment" );
                                  }
                                  }
	                }



