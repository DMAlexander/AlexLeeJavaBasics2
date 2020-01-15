import java.util.ArrayList;

public class ArrayListProject {

	public static void main(String[] args) {
		//ArrayLists are flexible, because they can grow and shrink.
		//With an array, you have to know how many elements will
		//be in it when you create it. 
		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		System.out.println(fruits[1]);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		System.out.println(fruitList);

	}

}
