

/////////////////////////////////////////////////////////
/*
   הצגת  הודעה  על המסך  
*/  
public class Main {
    public static void main(String[] args) {
        System.out.println("  שלום      לכולם " );
       }
    }
///////////////////////////////////////////////////////
/* 
קטע   קוד   קולט   שני מספרים   ומציג  על המסך  
*/  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס את המספר הראשון: ");
        // int num1 = scanner.nextInt();
        double num1=scanner.nextDouble();

        System.out.print("הכנס את המספר השני: ");
        //int num2 = scanner.nextInt();
        double num2=scanner.nextDouble();

        System.out.println("המספרים שהוזנו הם: " + num1 + " ו-" + num2);

    }
}
/////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////
  System.out.println(Math.sqrt(10));
      System.out.println(Math.pow(10,2));
      System.out.println(Math.abs(-10));
	  
	  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int  numberRandom=0;
      for(int i=0;i<100;i++) {
          numberRandom =(int) (((Math.random())*900)+100);
          System.out.println(numberRandom);
      }
      }
  }
 /////////////////////////////////////////////////////
  
Java תוכל להגריל מספר רנדומלי בין 10 ל-100 כך:

int random = (int)(Math.random() * (100 - 10 + 1)) + 10;
System.out.println(random);


////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int [] array=new int [12];
    int [] array1=new int [12];
    int sum=0,max=0;
    int leng =array.length;
    for(int i=0;i<array.length;i++){
        array[i]=(int) (Math.random()*10000);
        if((int) (Math.random()*10)<5)
            array[i]=(array[i] *(-1));
    }


    max=array[0];
    for(int i=0;i<array.length;i++){
       if(max<array[i]){
          max=array[i];
       }
   }
    System.out.println("max ="+max);

    System.out.println("leng  "+leng);
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+ "\t");
           }
        System.out.println(" ");
        System.out.println(array[array.length-1]);
        }

    }
///////////////////////////////////////////////////////

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("הכנס תו אחד: ");
        char c = sc.next().charAt(0); // לוקח את התו הראשון מהמחרוזת שהוזנה

        System.out.println("התו שהוזן הוא: " + c);
    }
}
///////////

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
     System.out.println("   הכנסה  שם  ");
     String input1 =scanner.nextLine();
     //String input2 =scanner.nextLine();
        String string2=" ";
        System.out.println(input1.length());
        for(int i=0;i<input1.length();i++){
           if(input1.charAt(i)=='a')
               string2+='#';
            else
                string2+=input1.charAt(i);
        }
        System.out.print(string2);
      }
    }
////////////////////////////////////////////////////////////////
