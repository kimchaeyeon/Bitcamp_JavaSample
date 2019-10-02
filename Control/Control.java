import java.util.Scanner;

class Control{

    public static void main(String[] args){
	//정수를 입력받아서 양의 점수 입력시 양수라 출력하고, 음의 정수라면 음수라 출력하시오
	// 0이면 출력하지 않음
    
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자를 입력하시오: ");
	int N = sc.nextInt();

	if(N>0){
	    System.out.println("양수");
	}else if(N<0){
	    System.out.println("음수");
	}

	//문제 2
	//성별을 입력받아 m이면 남자라고 출력하고, w이면 여성이라 출력하시오
	//대소문자
	
        System.out.print("성별을 입력하시오: ");
	String S = sc.next();
	if(S.equalsIgnoreCase("M")){
	    System.out.println("남자");
	}else if(S.equalsIgnoreCase("W")){
	    System.out.println("여자");
	}
    }
    
}
