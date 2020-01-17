import java.util.Stack;

public class StacksAreFun {

	public static void main(String[] args) {
		
		Stack<String> games = new Stack<String>();
		games.add("Call of Duty");
		games.add("Guitar Hero");
		games.add("Super Monkey Ball");
		
		System.out.println(games); //print stack
		System.out.println(games.pop()); //Remove game at the top of stack
		System.out.println(games.peek()); //print game at top of stack
		System.out.println(games);
		
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');

	}

}
