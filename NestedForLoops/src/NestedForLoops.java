
public class NestedForLoops {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("It's cold outside!");
		}
		
		String[] colors = {"Red", "Blue", "Green"};
		
		for(int i=0; i<3; i++) {
			System.out.println(colors[i]);
		}
		
		String[][] fancyColors ={ {"Red", "Blue", "Green"},
				{"Redy", "Bluey", "Greeny"} };
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(fancyColors[i][j]);
			}
		}

	}

}
