package section7;

public class methods {

	public static void main(String[] args) {
		loop1();
		System.out.println("***************");
		loop2();
	}

	public static void loop1() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void loop2() {
		int j = 20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}
	}

}
/*OR 
public static void main(string[] args){
loop(1,10);
system.out.println("***************");
loop(2,40);
}
public static void loop(int step,int finalvalue){
while(step <= finalvalue){
system.out.println(step);
step++;
}
}
*/