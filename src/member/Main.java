package member;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberService ms = new MemberService();
		
		ms.join(sc);
		
	}

}
