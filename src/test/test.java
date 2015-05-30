package test;

public class test {
	private static int[] array = { 5, 3, 6, 2, 8 };

	public static void main(String[] args) {
		ja();
		loop();
	}
	
	public static void ja() {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int value1 = array[i];
					int value2 = array[j];
					array[i] = value2;
					array[j] = value1;
					}
				}
			}
		}
	
	public static void loop() {
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
	}
}
