import java.util.*;

public class First_Recurring {
	
	private char[] given = {'A', 'B', 'C', 'D', 'A'};
	private HashSet<Character> h = new HashSet<>();
	
	public char main(){
		char[] database = new char[given.length];
		for(int i = 0; i < given.length - 1; i++){
			if(h.contains(given[i])){
				return given[i];
			}
			h.add(given[i]);
		}
		return '\0';
	}
}
