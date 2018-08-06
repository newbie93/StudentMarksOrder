package StudentGraph.java;


import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

import java.awt.List;

public class Sort {
	
	
	public static void FuncSort(HashMap<String, ArrayList<Integer>>inp)
	{
		

		Map<String, List<String>> sorted = inp.entrySet().stream()
		        .sorted(comparingByValue(comparingInt(List::size))
		        .collect(toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (a,b) -> {throw new AssertionError();},
		                LinkedHashMap::new
		                
		        ) ); 

	}


}
