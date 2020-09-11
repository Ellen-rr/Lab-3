import java.util.Scanner;//import scanner
class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);

   int number;
   System.out.println("Enter a number to count down or up from: ");//user input their number
   number = s.nextInt();//store the number

   if (number >=0) {//if number >=0, number--
     while( number >=0 ){
       System.out.println(number);
       number--;
     }
   }
   else {//if number<=0, number ++
     while (number <= 0){
       System.out.println(number);
       number++;
     }
   }
   System.out.println("Blast off!");//when they reach 0, print blast off



  }
}