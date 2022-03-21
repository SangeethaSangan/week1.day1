package week1.day1assign;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num=25;
          boolean flag=true;
        
          
          
          for (int i=2;i<num;i++)
          
          {if (num%i==0) {
        	  System.out.println( "not prime no");
        	  flag=false;
          break;
          }}
         if (flag) 
          {System.out.println("it prime no");}
           
	

}}
