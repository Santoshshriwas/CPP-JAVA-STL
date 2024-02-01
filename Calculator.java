import java.util.Scanner;
/* 
public class Calculator {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a : ");
    int a =sc.nextInt();
    System.out.println("Enter b : ");
    int b =sc.nextInt();
    System.out.println("Enter c : ");
    int c =sc.nextInt();
    System.out.println("Enter operator : ");
    char operator =sc.next().charAt(0);

    switch (operator) {
      case '+':System.out.println(a+b+c);
        break;
      // case '+':System.out.println(a+b+c);
      //   break;
      case '-':System.out.println(a-b);
        break;
      case '*':System.out.println(a*b);
        break;
      case '/':System.out.println(a/b);
        break;
      case '%':System.out.println(a%b);
        break;
      default:System.out.println("wrong operator");
    }
  }
}
*/
/* 
public class Calculator {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();

    if (a>0) {
       System.out.println("Positive Value");
    }else {
      System.out.println("Nigetive Value");
    }
  }
}
*/
/*
public class Calculator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Week of a No  (1,2,3,4,5,6,7)");
    int week = sc.nextInt();

    switch (week) {
      case 1:System.out.println("Monday");
        break;
      case 2:System.out.println("Tuesday");
        break;
      case 3:System.out.println("Wednesday");
        break;
      case 4:System.out.println("Thursday");
        break;
      case 5:System.out.println("Friday");
        break;
      case 6:System.out.println("Saturday");
        break;
      case 7:System.out.println("Sunday");
        break;
      default:System.out.println("not a week day");
        break;
    }
   }
}
*/
public class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Input the year: ");
int year = sc.nextInt();
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));
if (x && (y || z)) {
System.out.println(year + " is a leap year");
} else {
System.out.println(year + " is not a leap year");
}
}
}