package Comparater;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

    public static void Display(Car[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
	// aisa waise koi bhi T nhi aayega aisa T aayega jo comparison ka logic likhke baitha ho 
    public static <T extends Comparable<T>> void Sort(T[] arr) {

		// pass
		for (int  turn = 1; turn< arr.length; turn++) {

			for (int i = 0; i < arr.length - turn; i++) {// 6-1
				// if (arr[i]> arr[i + 1]) { // yeh nhi kr skte as address can't be compared
				if (arr[i].compareTo(arr[i + 1]) >0 ) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}

		}
    }
    public static void main(String[] args) {
        Car[] arr = new Car[5];

		arr[0] = new Car(200, 10, "White");
		arr[1] = new Car(1000, 20, "Black");
		arr[2] = new Car(345, 3, "Yellow");
		arr[3] = new Car(34, 89, "Grey");
		arr[4] = new Car(8907, 6, "Red");
		//comparable
		// Sort(arr);

		//comparator 
		Arrays.sort(arr , new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o1.price-o2.price;
			}
			
		});
		Arrays.sort(arr , new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o2.speed-o1.speed;
			}
			
		});

        Display(arr);
    }
}
