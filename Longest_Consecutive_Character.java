
public class Longest_Consecutive_Character {
	static String s = "AAAAAAZZZZZZZBCDDBBBBEA";
	
	public static void main(String args[]){
		char[] c = s.toCharArray();
		int count = 0;
		int tempCount = 1;
		char con =c[0];
		for (int i = 1; i < c.length-1; i++){
			
			if(c[i] == c[i-1]){
				tempCount++;
				if(tempCount > count){
					con = c[i];
					count = tempCount;
				}
			}else{
				tempCount = 1;
			}
			
		}
		System.out.println("{'" + con + "':" + count + "}");
		
	}
}
