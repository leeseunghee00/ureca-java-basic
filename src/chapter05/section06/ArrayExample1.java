package chapter05.section06;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] n;    // 일반적인 표현

		int[] intArray = new int[5];    // 변수와 heap 배열 공간 확보
		int[] intArray2 = {1, 2, 3, 4, 5};  // 변수와 heap 배열 공간 + value
		int[] intArray3 = new int[] {1, 2, 3, 4, 5}; // 변수, heap 공간, value
		int[] intArray4 = {1, 2, 3, 4, 5};

		System.out.println(intArray[2]);
		System.out.println(intArray2 == intArray4);

		String[] strArray1 = {"Hello", " Java"};
		String[] strArray2 = new String[3];
		String[] strArray3 = new String[] {"a", "b", "c"};

		System.out.println(strArray2[2]);
		System.out.println(strArray2.length);
		// System.out.println(strArray2[0].length());	// NPE
	}
}
