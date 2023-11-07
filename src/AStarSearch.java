/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 */
public class AStarSearch implements IPuzzleAlgo{
	public Node execute(Puzzle model) {
		PriorityQueue<Node>frontier = new PriorityQueue<Node>(new PuzzleUtils().HeuristicComparatorByF);
		ArrayList<Node>explored = new ArrayList<Node>();
		frontier.add(model.getInitialState());
		while(frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getH()==0)return current;
			explored.add(current);
			List<Node>childrent = model.getSuccessors(current);
			for (Node child : childrent) {
				if(!frontier.contains(child)&& !explored.contains(child)) {
					child.setG(current.getG()+1);
					frontier.add(child);
				}
			}
		}
		return null;
	}
}
