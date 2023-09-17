package javas;

//this : 외부 클래스에서 사용가능
class abc{
	String data = ""; //일반 변수
	static String data2="";  //메모리 변수값을 생성
	int  number=100;
	int aa,bb,cc = 0;  //기본값 적용
	final String adata = "이순신";   //상수 값 변경이 불가능
	
	
	public abc() {  //즉시 실행 메소드
		this.data="20";
		this.data2 = "30";
		System.out.println(this.data);
	}
	public void data() {   //일반 메소드
		String user ="홍길동";
		System.out.println(user);
		System.out.println(this.aa);
		System.out.println(this.bb);
		System.out.println(this.cc);
	}
	public static void data2() {  //메모리 등록 메소드
		String user ="이순신";
		System.out.println(user);
	}
	
	String data3(int a, int b) { //리턴 메소드
		int sum = a+b;
		this.data2= String.valueOf(sum);   //숫자를 문자로 변환
		return this.data2;
	}
	
	public int data4(String a, String b) {
		int sum = Integer.parseInt(a)+ Integer.parseInt(b);
		return sum;
	}
}