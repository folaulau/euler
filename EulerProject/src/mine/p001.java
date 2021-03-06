package mine;
/* 
 * Solution to Project Euler problem 1
 * by Project Nayuki
 * 
 * http://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


public final class p001 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p001().run());
	}
	
	
	public String run() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return Integer.toString(sum);
	}
	
}
