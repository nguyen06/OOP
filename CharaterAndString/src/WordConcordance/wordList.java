package WordConcordance;
import java.util.*;
import java.text.*;
public class wordList {
	SortedMap table;
	public wordList(){
		table = new TreeMap();
	}
	public void add(String word){
		Integer val;
		if(table.containsKey(word)){
			val = (Integer) table.get(word);
			val = new Integer(val.intValue()+1);
		}else{
			val = new Integer(1);
		}
	}
}
