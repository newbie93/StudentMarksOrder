package bootcamp.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class StudentGraph {
	
	private HashMap<String, ArrayList<String>>studentMap;
	
	// returns true if all elements in a > all elements in b
	private static boolean isAdjacent(ArrayList<Integer>a,ArrayList<Integer>b) {
		int check=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)>b.get(i))
				check++;
		}
		return (check==a.size());
	}
	
	
	private void init(HashMap<String, ArrayList<Integer>>inp) {
		studentMap=new HashMap<>();
		generateEdges(inp);
	}
	
	private void generateEdges(HashMap<String, ArrayList<Integer>>inp) {
		ArrayList<String>list;
		Set<String>temp=inp.keySet();
		Object[]studentNameCol=temp.toArray();
		for(int i=0;i<studentNameCol.length;i++) {
			for(int j=0;j<studentNameCol.length;j++) {
				if(isAdjacent(inp.get((String)studentNameCol[i]), inp.get((String)studentNameCol[j]))) {
					if(studentMap.containsKey((String)studentNameCol[i]))
						studentMap.get((String)studentNameCol[i]).add((String)studentNameCol[j]);
					else {
						list=new ArrayList<>();
						list.add((String)studentNameCol[j]);
						studentMap.put((String)studentNameCol[i], list);
					}
				}
			}
		}
	}
	
	public StudentGraph(HashMap<String, ArrayList<Integer>>inp) {
		init(inp);
	}
	
	public void displayGraph() {
		for(String str:studentMap.keySet()) {
			System.out.print(str+", ");
			for(String str2:studentMap.get(str))
				System.out.print(str2+", ");
			System.out.println();
		}
	}
	

}
