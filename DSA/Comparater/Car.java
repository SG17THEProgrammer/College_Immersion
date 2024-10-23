package Comparater;

public class Car {//implements Comparable<Car> //{ 

        int price;
        int speed;
        String color;
    
        public Car(int price, int speed, String color) {
            this.price = price;
            this.speed = speed;
            this.color = color;
        }

        @Override
	public String toString() {
		return "Price : " + this.price + " Speed: " + this.speed + " Color:" + this.color;

	}

    
        public static void main(String[] args) {
            
        }

        // @Override
        // public int compareTo(Car o) {
        // //        return this.price -o.price; //price ke basis pe sorting (ascending)
        //        return o.speed -this.speed;//speed ke basis pe sorting (descending)
        // }

        // comparable se  sorting ho rhi hai 
        // Lekin problem is hume baar baar change krna padega ki kis basis pe sort krna hai 
        //if client needs sorting on diff basis toh wo return mein jo likha hai wo change krna padega 

        //to overcome that we have comparator 

        // note - commenting out comparable code to see comparator one 
}
