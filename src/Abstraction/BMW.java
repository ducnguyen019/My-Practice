package Abstraction;

public abstract class BMW { 

	void commonFunc() {
		System.out.println("Inside commonFunc method");
	}

	abstract void accelerate();

	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}
}

/* 
 * BMW là class cha. ko thể kết hợp abstract & final khi tạo class, 
 * vì khi đánh dấu nó là final thì sẽ ko có class nào kế thừa nó được nữa. 
 * Static cũng ko thể đc khởi tạo khi kết hợp vs abstract.
 * Khi đánh dấu 1 class con là final thì phải đảm bảo là nó đã override 
   	tất cả các method của abstract cha.
*/