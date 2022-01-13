package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(Integer i=1; i<= 99; i++) {
			char[] str = i.toString().toCharArray();
			
			String ret = "";
				
			for(int j=0; j<str.length; j++) {
				if(str[j] == '3' || str[j] == '6' || str[j] == '9') {
					ret = ret + "짝";
				}
			}
			if(ret != "") {
				System.out.println(i + " " +ret);
			}
		}
		System.out.println();
	}
}
