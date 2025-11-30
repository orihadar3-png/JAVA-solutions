

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


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("הכנס תו אחד: ");
        char c = sc.next().charAt(0); // לוקח את התו הראשון מהמחרוזת שהוזנה

        System.out.println("התו שהוזן הוא: " + c);
    }
}

