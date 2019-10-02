import java.util.Scanner;
class Calo{

	private static final double PI = 3.141592;

	public static void main(String[] args) throws Exception{
	    int radius;
	    int radius2;
 	    final double PI = 3.141592;
	    Scanner sc = new Scanner(System.in); // Scanner 객체타입 선언

	    System.out.println("input radius: ");
	    radius =  sc.nextInt();
            System.out.println("Area of square :"+(radius*radius));
            
            System.out.println("input circle radius: ");
            radius2 = sc.nextInt();
            System.out.println("Area of circle:"+PI*(radius2*radius2));
            //정적멤버로 접근할 때
            System.out.println("Area of circle:"+Calo.PI*(radius2*radius2));
	}
}
