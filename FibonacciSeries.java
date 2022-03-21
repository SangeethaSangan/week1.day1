package week1.day1assign;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firNum = 0;
		int secNum = 1;
		int i = 8;
		for (i = 1; i <= 8; i++) {
			
			int nextNum = firNum + secNum; // 0+1
			System.out.println(nextNum);
			firNum = secNum;// 1
			secNum = nextNum;// 1

			//// 0,1,1,2,3,5,

		}
	}

}
