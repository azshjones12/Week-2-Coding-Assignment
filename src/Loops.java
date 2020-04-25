public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A while loop that prints all even numbers from 0 to 100
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x+=2;
		}
		
		System.out.println("-------");
		
		//A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int i = 100; 
		while (i >=0) {
			System.out.println(i);
			i-=3;
		}
		
		System.out.println("-------");
		
		//A for loop that prints every other number from 1 to 100
		for (int y = 1; y <= 100; y+=2) {
			System.out.println(y);
		}
		
		System.out.println("-------");
		
		//A for loop that prints every number from 0 to 100, 
		//but if the number is divisible by 3, it prints “Hello” instead of the number, 
		//and if the number is divisible by 5, it prints “World” instead of the number, 
		//and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		for (int z = 0; z <= 100; z++) {
			if (z % 3 == 0 && z % 5 == 0) {
				System.out.println("HelloWorld");
			} else if (z % 3 == 0) {
				System.out.println("Hello");
			} else if (z % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(z);
			}
		}

	}

}
