
/*

   שאלה 1  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countPairs = 0;
        int countPositivePairs = 0;
        int sumNegatives = 0;

        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();

          
            if (a == 0 && b == 0) {
                break;
            }

            countPairs++;

          
            if (a > 0 && b > 0) {
                countPositivePairs++;
            }

        
            if (a < 0) sumNegatives += a;
            if (b < 0) sumNegatives += b;
        }

        System.out.println("מספר הזוגות שנקלטו: " + countPairs);
        System.out.println("מספר הזוגות החיוביים: " + countPositivePairs);
        System.out.println("סכום המספרים השליליים: " + sumNegatives);
    }
}




*/  
/*
שאלה  2  
import java.util.*;

 class Main {
public static int[] createArray(int size) {
    int[] arr = new int[size];
    int number=1;	
    for (int i = 0; i < size; i++) {
       int tens = (int)(Math.random() * 9);      
       int ones = tens + 1 + (int)(Math.random() * (9-tens));  
       number = tens * 10 + ones;
       arr[i]= number;     
    }  
    return arr;
}
 public static void main(String[] args) {
        int[] result = createArray(5);
        for (int i=0;i<5;i++) {
           System.out.println(result[i]);
        }
    }
}


*/ 

/*
 ///שאלה 3 א  
 
  class Main {

 public static boolean isBalanced(int[] arr) {
    int evenSum = 0;
    int oddSum = 0;

    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) {
            evenSum += arr[i];
        } else {
            oddSum += arr[i];
        }
    }

    return evenSum == oddSum;
}

///   שאלה ב 
 public static int[] fill(int size, int x, int y) {
    int[] arr = new int[size];
     int evenSum = 0;
    int oddSum = 0;
    while (true) {
		oddSum = 0;
		evenSum = 0; 
        for (int i = 1; i < size; i += 2) {
            arr[i] = (int)(Math.random() * (y - x + 1)) + x;
        }
  
        for (int i = 1; i < size; i += 2) {
            oddSum += arr[i];
        }
        for (int i = 0; i < size - 2; i += 2) {
            arr[i] = (int)(Math.random() * (y - x + 1)) + x;
            evenSum += arr[i];
          }
		  if(evenSum==oddSum){
			System.out.print("evenSum="+evenSum+"\t"+"oddSum="+oddSum); 
			return arr;   
		  }
		} 
		//return arr;  
    }
	
    public static void main(String[] args) {
	int  []arr=fill(5,3,10);
	System.out.println();  
	for(int i=0;i<5;i++)
       System.out.print(arr[i]+"\t"); 		
	   }
	}
	
////
*/
///   א    שאלה 4 
/*
///   ב    o(n)  
class Main {
public static boolean isTriangular(int[] arr) {

    if (arr.length % 3 != 0)
        return false;
    int part = arr.length / 3;
    for (int i = 0; i < part; i++) {
        if (arr[i] != arr[i + part] || arr[i] != arr[i + 2 * part]) {
            return false;
        }
    }

    return true;
}
    public static void main(String[] args) {
	
	   }
	}
	
	
	*/ 
	/*
	
	///  5  
	import java.util.*;
	class Main {
    public static boolean isItBrothers(int num1, int num2) {
    int digits1=0;
    int digits2=0;
	int temp1=num1;  
	int temp2=num2; 
	int sum2=0;
    int sum1=0;	
    while(temp1>0){
	  temp1/=10; 
	  digits1++;  
		
	}
	 while(temp2>0){
	  temp2/=10; 
	  digits2++;  
		
	}
    if (digits1 != digits2)
        return false;
	
    while (temp1 > 0) {
        sum1 += temp1 % 10;
        temp1 /= 10;
    }
    while (temp2 > 0) {
        sum2 += temp2 % 10;
        temp2 /= 10;
    }
    return sum1 == sum2;
}
///    שאלה ב5 
public static boolean isItBrothers(int [] arr){
	 boolean temp=true; 
	for(int i=0;i<(arr.length-1);i++){
		temp=isItBrothers(arr[i],arr[i+1]); 
		if(temp==false)   return false;  
	}
	return true;  
}
    public static void main(String[] args) {
	    int []arr=new int[10]; 
		 for(int i=0;i<arr.length;i++)
			 arr[i]=(int)(Math.random()*1000);  
     	System.out.print(isItBrothers(arr));
	   //System.out.print(isItBrothers(123,234));  
	   }
	}
	
*/ 
 ///     שאלה 6  א  
 /*
 import java.util.*;
	class Main {
    public static boolean isItBrothers(int [] arr) {
		  for(int i=0;i<arr.length;i++){
			   int temp=arr[i];
               int num1;
               int flag=1; 			   
               num1=temp%10; 
               temp=temp/10;  			   
			   while(temp>0){
				   if((temp%10)>=num1){
                     flag=0;
                     break;  				   
			       } 
				    num1=temp%10;
				   temp/=10; 
                  				   
			   }
			   if( flag==1) {
				     System.out.print(arr[i]);  
				     return  true;   
			   }
				 
		  }
		  return false;    
	}
   
    public static void main(String[] args) {
	    int []arr=new int[10]; 
		 for(int i=0;i<arr.length;i++)
			 arr[i]=(int)(Math.random()*1000);
      		 
     	System.out.print(isItBrothers(arr));
		  System.out.print( "\n\n" +"----------"+"\n\n");  
	    for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");  
	   }
	}
	
*/   
/*
//// שאלה 7  
class Main {
    public static void main(String[] args) {
        int min = 999; 
        for (int i = 0; i < 50; i++) {
            int num = (int)(Math.random() * 900) + 100;

            if (num < min) {
                min = num;
            }
        }
        int sum = 0;
        int temp = min;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("המספר הקטן ביותר: " + min);
        System.out.println("סכום ספרותיו: " + sum);
    }
}
*/ 


/// א  שאלה 8   
class Main {
	public static boolean exist(int num, int digit) { 
	int []arr1=new int[10]; 
   int i=0; 	
    while (num > 0) {
		arr1[i]=(num%10);
        i++;  		
        num /= 10;
    }

	int index1=0; 
	while(index1<10){
		if(arr1[index1]==digit){
		    return true;  
		}
	    else 
			index1++;  
	}
    return false;
}


    /// שאלה   8   ב   
  public static boolean isItBrothers(int num1,int num2){
   int []arr1=new int[10];  
   int []arr2=new int[10]; 
   int index1=0;
   int index2=0;		 
   while (num1 > 0) {
     arr1[index1]=(num1%10);
     index1++;  		
     num1 /= 10;
    } 
   while (num2 > 0) {
     arr2[index2]=(num2%10);
     index2++;  		
     num2 /= 10;
    } 
	for(int i=0;i<index2;i++)	{
      for(int j=0;j<index1;j++){
		if(arr1[i]==arr2[j])
	       return false;    
	  }
		
	}
	 return  true;  	
 }
 
 /// 8 ג   
public static boolean isItBrothers(int []  arr){
   for(int i=0;i<arr.length-1;i++)
	if(isItBrothers(arr[i],arr[i+1])==false){
		return  false;  
	}  
	   return   true;  
  }
    public static void main(String[] args) {
 
     int [] arr=new int [10]; 
     for(int i=0; i<10;i++)
		 arr[i]=(int)(Math.random() * 1000); 
	 System.out.print(isItBrothers(arr)); 
	 for(int i=0;i<10;i++)
	    System.out.print(arr[i]+"\t");  	  
       ///System.out.print(exist(178, 3));  
       //System.out.print(isItBrothers(123,454));  	   
    }
}
