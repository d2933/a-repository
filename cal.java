import java.io.*;
class Calculator
{
    
         static double sum,mul,div,sub;
    
    //creating Global variables to store values
    
          public static void add(double a ,double b)
        {
        
          sum= a+b;
          //calculates  the sum
          
          System.out.println("Sum is :" + sum);
          //prints the sum of two values
        }
        
        public static void mul(double a,double b)
        {
         if( a == 0 || b==0)
         {
             //checks if any of the number is 0 result is 0
             mul =0;
             }
             else
             {
            mul= a*b;   
          
         }
           System.out.println("Multiplication is : "+ mul);
          //Multiplication of two numbers is being stored
        }
        
        public static void subtract(double a , double b)
        {
            sub =a-b;
        
          System.out.println(" Subtract Value is : " + sub);
          //subtraction of two numbers being stored and printed
        }
        public static void division(double a, double b)
          {
              
              if( b==0)
              {
                  System.out.println("Division Not Possible and value tends to infinity");
                }// checks if we are dividing by 0 and give the error
                else
                {
                    
                 div =a/b;   
                      System.out.println("The Result Of Division  is : " + div);
          
                }
              //Performs division
            }
        
        public static void main()throws IOException
        {
            
            int a,b,choice,ch;
            // Two Variables a and b to perform operations on
            //choice to perfrom the opertaion you want
            //ch to continue the process at  many times you want
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            do
            {
            System.out.println("Enter Two Numbers");
             a = Integer.parseInt(br.readLine());
            
            b= Integer.parseInt(br.readLine());
            
            System.out.println("Enter choice what you want to perform");
            System.out.println(" 1. to ADD");
            System.out.println(" 2. to MULTIPLY");
            System.out.println(" 3. to SUBTRACT");
            System.out.println("4.  to DIVIDE");
            //here all the process which can be performed Are Given
            choice= Integer.parseInt(br.readLine());
           
            switch(choice)
            {
                case 1:
                add(a,b);
                  break;
                  case 2: mul(a,b);
                  break;
                  case 3: subtract(a,b);
                  break;
                 case 4: division(a,b);
                 break;
                 
                 default: 
                 System.out.println("Invalid choice");
                 break;
                 
                }
            System.out.println("Enter 0 to exit and any other number to carry on");
            
            ch= Integer.parseInt(br.readLine());
            //takes value of ch to see if you want to carry on or not
            }while(ch !=0);
           
        }//end of main
    }//end of program