package 상속기본;

public class 직원 {
	
	String name; // 이름 
	String address; // 주소 
	int salary; // 월급 
	String rrn; // 주민번호 
	
	public void work() {
		System.out.println("직원은 일을 합니다.");
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
	
}
