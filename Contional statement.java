package AllProgram;

public class contionalstatement {
// types --. if --.if else --. if else if 
//based on  certain conditions and generate conditions accordingly
	public static void main(String[] args) {
		int age=20;
		//if(condition)
		//statements
		if(age>18) {
			System.out.println(age+" voting is permitted");
		}
		if(age<18) {
			System.out.println("voting is not permitted");
		}
		else {
			System.out.println("sry, give the valid age");
		}
	}

