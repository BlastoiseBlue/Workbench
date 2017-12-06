package sandbox;

import java.util.Scanner;

public class Invert {
	public static void invert(int[] a) {
		int[] a2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			a2[i] = a[a.length - 1 - i];
		}
		for (int i = 0; i < a.length; i++)
			a[i] = a2[i];
	}

	static void output(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int[] arr1 = new int[4000];
		int n = 0;
		for (int i = 0; i < 4000; i++) {
			arr1[i] = kbd.nextInt();
			if (arr1[i] != 0)
				n++;
			else
				break;
		}
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = arr1[i];
		}
		invert(arr2);
		output(arr2);
	}

}
