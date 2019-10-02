import java.util.Scanner;

class Triangle{
        public static void main(String[] args){
	     int A;
         int B;
         Scanner sc = new Scanner(System.in);
         System.out.println("삼각형의 밑변을 입력하시오:");
         A = sc.nextInt();
         System.out.println("삼각형의 높이를 입력하시오:");
         B = sc.nextInt();
         System.out.println("삼각형의 넓이는:"+(A*B/2.0)+" 입니다.");
	}
}
