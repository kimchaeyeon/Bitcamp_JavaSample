import java.util.Scanner;
class Solution3{
    
    public static void main(String[] args){

	//1부터 100까지 정수중에 소수(prime number)를 구하시오
	//소수는 0과1을 제외한 오로지 자기 자신만으로 나누어지는 수
	//어떤수 n이 다른 primenumber로 나누어지지 않으면 소수이다
	
	int[] numbers = new int[100]; //number[]에 소수가 들어감
	int count =0; //소수의 개수
	boolean isPrime;

	for(int n=2; n<=100; n++){
	    isPrime = true;
	    for(int i=0; i< count; i++){
		if(n%numbers[i] ==0){
		    isPrime = false;
		    break;
		}
	    }
	    if(isPrime){
		numbers[count] = n;
		count++;
        	}
          }
        for(int i=0; i<count; i++){
	   System.out.format("%d is a prime number\n", numbers[i]);
	}


	for(int i=1; i<=100; i++){
	    System.out.format("%d : %s \n",i,(i%2==0 ?"짝수":"홀수")  );

	}
    }
}
