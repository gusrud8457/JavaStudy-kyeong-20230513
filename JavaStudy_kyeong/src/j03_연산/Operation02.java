package j03_연산;

public class Operation02 {
	
	/*
	 * 논리 연산자
	 * 
	 * AND 		=>		&&		- 	곱	
	 * => 모든 조건이 참일 때 True의 결과.
	 * => 하나라도 거짓이면 False의 결과.
	 * 
	 * OR	 =>		||		- 	합
	 * => 모든 조건이 거짓일 때 False의 결과.
	 * => 하나라도 참이면 True의 결과.
	 * 
	 * NOT =>	!		- 	부정
	 * => !(t && t) => f
	 * => !(f || f) => t
	 * 
	 * 0(false)
	 * !0(true)
	 * 
	 * t(1) && t(1) => t(1)
	 * t(1) %% f(0) => f(0)
	 * 
	 * t(1) || t(1) => t(2)
	 * t(1) || t(0) => t(1)
	 * f(0) || f(0) => f(0)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		
		boolean result1 = num > 5;
		boolean result2 = num == 10;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		System.out.println("result1 AND result2 : " + (result1 && result2));
		

	}

}
