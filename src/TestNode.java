

import java.util.Arrays;
import java.util.List;

public class TestNode {

	public static void main(String[] args) {
		Puzzle p = new Puzzle();
		p.readInput("C:\\Users\\ADMIN\\Downloads\\Lab 5_8Puzzle\\txt\\PuzzleMap.txt",
				"C:\\Users\\ADMIN\\Downloads\\Lab 5_8Puzzle\\txt\\PuzzleGoalState.txt");
        
		Node initialState = p.getInitialState();
		Node tmp = new Node(initialState);
		System.out.println(initialState.equals(tmp));
//		Node goalState = p.getGoalState();
//		System.out.println(p.getInitialState());
		System.out.println("H: "+initialState.getH());
//		System.out.println(Arrays.toString(initialState.getWhiteTilePosition()));
//		System.out.println(p.getGoalState());
		System.out.println(initialState);
		
		Node re = p.moveWhiteTile(initialState, 'r');
	
//
		System.out.println(initialState);
		System.out.println(initialState.getH());
		
//		System.out.println(initialState);
		
		Node re2 = new Greedy().execute(p);
		System.out.println(re2);

		
//		System.out.println(Arrays.toString(re.getWhiteTilePosition()));
	

		// System.out.println(p.getInitialState());
		// System.out.println(p.getGoalState());
		//
		// List<Node> children = p.getSuccessors(initialState);
		// System.out.println("Size: "+children.size());
		// for (Node child : children) {
		// System.out.println(child.getH()+" "+p.computeH(child) );
		// }
	}
}
