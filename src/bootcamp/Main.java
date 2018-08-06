package bootcamp;

import java.util.ArrayList;
import java.util.HashMap;

import bootcamp.graph.StudentGraph;

public class Main {
	
	public static void main(String args[]) {
		HashMap<String,ArrayList<Integer>>map=new HashMap<>();
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(12);
		list1.add(14);
		list1.add(16);
		ArrayList<Integer>list2=new ArrayList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		ArrayList<Integer>list3=new ArrayList<>();
		list3.add(17);
		list3.add(20);
		list3.add(23);
		ArrayList<Integer>list4=new ArrayList<>();
		list4.add(2);
		list4.add(40);
		list4.add(12);
		ArrayList<Integer>list5=new ArrayList<>();
		list5.add(3);
		list5.add(41);
		list5.add(13);
		ArrayList<Integer>list6=new ArrayList<>();
		list6.add(7);
		list6.add(8);
		list6.add(9);
		ArrayList<Integer>list7=new ArrayList<>();
		list7.add(4);
		list7.add(5);
		list7.add(6);
		map.put("A", list1);
		map.put("B", list2);
		map.put("C", list3);
		map.put("D", list4);
		map.put("E", list5);
		map.put("F", list6);
		map.put("G", list7);
		
		StudentGraph studentGraph=new StudentGraph(map);
		studentGraph.displayGraph();
		
	}

}
