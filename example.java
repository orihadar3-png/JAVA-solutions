

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
public class person {
    private  String name="--";
    private  int  age=0;
    public person(){
        this.name="---";
        this.age=0;
    }
    public person(String name){
        this.name=name;
        this.age=0;
    }
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }





    public  void setName(String name){  //  48 - 57     97 --122
        for(int i=0;i<name.length();i++){
            int temp=name.charAt(i);
            if(temp<97||temp>122) {
                this.name = "---";
                return;
            }
        }
        this.name=name;
    }
    public void setAge(int age){
        if(age>0&&age<120)
            this.age=age;
    }
    public String getName(){
        return  this.name;
    }
    public int getage(){
        return  this.age;
    }
}
 

Main.java

public class Main {

    public static void main(String[] args) {
        //System.out.print("hello java ");
        person [] Person =new person[6];
        for(int i=0;i<6;i++) {
            Person[i] = new person();
        }
        Person[0].setName("ori");
        Person[0].setAge(35);
        Person[1].setName("avi");
        Person[1].setAge(24);
        Person[2].setName("hadar");
        Person[2].setAge(122);
        int maxage=0;
        int objPersonMax=0;
        for(int i=0;i<3;i++){
            if(Person[i].getage()>maxage){
                maxage=Person[i].getage();
                objPersonMax=i;

            }

        }
        System.out.print(Person[objPersonMax].getName());


        /*

        Person[0]=new  person("ori",35);
        Person[1]=new  person("avi",56);
        Person[2]=new  person ("dudo",67);

        person[0]=new Main ();
        person[1]=new Main ();
        person[2]=new Main ();
        */
        /*
        person[0]=new Main ("ori");
        person[1]=new Main ("avi");
        person[2]=new Main ("dudo");
        */

            for(int  i=0;i< Person.length;i++){
              //  System.out.print(Person[i].getName()+"\t");
              //  System.out.println(Person[i].getage());
            }
        }
    }


/*
public class Main {
   private String name="--";
   private int age=0;
   public  void setAge(int a){
        if(a>0&&a<120){
           this.age=a;
        }
        else
            this.age=-1;
   }
   public   void setName(String name){
       int temp=0;
       for(int i=0;i<name.length();i++){
          temp=name.charAt(i);
           if( (temp<97)||(temp>122)){
               this.name="---";
               return;
           }
       }

        this.name=name;
   }
   public String getName(){
       return  this.name;
   }
    public int getage(){
        return  this.age;
    }
    public static void main(String[] args) {
        Main [] Person =new  Main[3];

        Person[0]=new Main();
        Person[0].setName("ori");
        //Person[0].name="hadar";
        Person[0].setAge(40);

        Person[1]=new Main();
        Person[1].setName("dudo");
        Person[1].setAge(50);

        Person[2]=new Main();
        Person[2].setName("avi");
        Person[2].setAge(23);

        for(int i=0;i<3;i++){
            System.out.print(Person[i].getName()+"\t");
            System.out.println(Person[i].getage());
        }
        ///  aaaaabbb = 4a3b



    }
}

*/

/*
public class Main {
    String name;
    int age=0;
    public void printName() {
        System.out.println("\t" + name + "\t" + age + "\t");
    }
    public static void main(String[] args) {
        Main obj1=new Main();
        Main obj2=new Main();
        Main obj3=new Main();
        obj1.name="אורי";
        obj1.age=30;
        obj2.name="הדר";
        obj2.age=32;
        obj3.name=" דוד";
        obj3.age=45;
        if( obj3.age> obj1.age&& obj3.age> obj2.age){
            obj3.printName();
        }

        //obj2.printName();
        //obj3.printName();
        //obj1.printName();
        //System.out.print(obj.sum(1,2));

    }
}

public class Main {
    String name;
    int age=0;
    public void printName() {
        System.out.println("\t" + name + "\t" + age + "\t");
    }
    public static void main(String[] args) {
        Main obj1=new Main();
        Main obj2=new Main();
        Main obj3=new Main();
        obj1.name="אורי";
        obj1.age=30;
        obj2.name="הדר";
        obj2.age=32;
        obj3.name=" דוד";
        obj3.age=45;
        if( obj3.age> obj1.age&& obj3.age> obj2.age){
            obj3.printName();
        }

        //obj2.printName();
        //obj3.printName();
        //obj1.printName();
        //System.out.print(obj.sum(1,2));

    }
}





/*

public class Main {
    public static int sumNumber(int  a){ // a=5
        if(a==0) return  0;
        return   a+sumNumber(a-1);   //15=5+4+3+2+1+0
    }
   public  static void printFromZero(int n){  // n=1
           if(n==0){
               System.out.println(" ");
               return ;
           }
       System.out.print(n+ "\t");
       printFromZero(n-1);
       System.out.print(n+ "\t");
   }
    public static int  power(int a, int n){ /// a^n
        if(n==0)  return 1;
        return  a*power(a,n-1);
    }
    public static boolean isPalindrome(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j))   return false;
        return isPalindrome(s,i+1, j-1);
    }

    public static int sumDigits(int n){
        if(n==0)   return  0;
        return (n%10)+sumDigits(n/10);
    }  //
    public static int countDigits(int n){
        if(n==0)   return 0 ;
        return 1+countDigits(n/10);
    }
    public static int  fib(int n,int  a,int b){

          return  0;
        }


    public static void main(String[] args) {
        int []  arr={1,2,3,3,4,23,34,-3,-2};
         // System.out.println(countDigits(1234);
        //System.out.print (sumNumber(10)); // 55
         printFromZero(5);
        // System.out.print(power(5,2));
        // String a="abcbaw";
        // System.out.print(isPalindrome(a,0,a.length()-1));
    }
}







 public   static int sumNum(int n){   // 123=6
        if(n==0)  return  0;
        return  (n%10)+ sumNum(n/10);
    }


    public static void printfrom(int  n){
        if(n<0)  return;
       // System.out.print(n+"\t");
        printfrom(n-1);
        System.out.print(n+"\t");
    }
    //5
    public static  int  pow(int a,int  n){//n=3  a^n
        if(n==0)   return 1;
        return  a*pow(a,n-1);
        //3*3*3*1
    }
    public static void printnumber(int a){// 0 1 2 3 ..10



    }
    public static void printchar(String s,int i){
        if(s.length()==i)   return;
        System.out.print(s.charAt(i));
        printchar(s,i+1);
    }

    public static boolean ispalindrome(String  st,int i, int j){
        if(st.charAt(i)!=st.charAt(j)) return  false;
        if(i>=j) return  true;
        return ispalindrome(st,i+1, j-1);
    }

   public static  int max(int  [] arr,int numberMax,int i){
       if(arr.length==i) return numberMax;
       if(arr[i]> numberMax)
           numberMax=arr[i];
       return  max(arr,numberMax,i+1);

   }
 */
