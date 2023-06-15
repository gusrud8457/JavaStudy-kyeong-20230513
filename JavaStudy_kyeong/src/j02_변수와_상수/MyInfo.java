package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		//주석
		/*
		 * 메모, 필기
		 * 
		 * 1. 문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 */
		
		char name1 = '정';
		char name2 = '현';
		char name3 = '경';
		
		int age = 28;
		
		String phone = "010-3144-8457";
		
		String address = "부산광역시 해운대구 해운대로 81번길 137";
		
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);

	}

}
