import java.util.Scanner;

class Sample{
 // Entry point
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int kor,math,eng;

   System.out.print("input kor:"); 
   kor = sc.nextInt();

   System.out.print("input math:");
   math = sc.nextInt();
   
   System.out.print("input eng:");
   eng = sc.nextInt();

   int sum = kor + math + eng;
   int total = kor + math + eng;
   int avg = sum/3; 

   System.out.println("총점:"+ sum +", 평균:"+avg);

   int score = (int)(total/3.0*100+0.5);
   System.out.println("avg2 :"+ score/100.0);
   System.out.format("avg3 : %.2f\n", total/3.0);

   /*System.out.print("input age:");
   age = sc.nextInt();
   System.out.print("input height:");
   height = sc.nextInt();
   System.out.print("나이가 스무살 이상이고 키가 170이상인 사람인가?:");
   if(age>=20 && height>=170){
       System.out.println("예");
   }else System.out.println("아니오");
   // boolean result = (age >=20 && heigh >=170);
   //System.out.print("나이가 스무살 이상이고 키가 170이상인 사람인가?:"+result);
   */

   /* int a,b;

   System.out.print("input number :");
   a = sc.nextInt();
   System.out.print("input number :");
   b = sc.nextInt();
   
   System.out.println("a>b:"+(a>b));
   System.out.println("a>=b:"+(a>=b));
   System.out.println("a==b:"+(a==b));
   System.out.println("a<=b:"+(a<=b));
   System.out.println("a<b:"+(a<b));
  */
  }
}
