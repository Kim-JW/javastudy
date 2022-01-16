package prob04;

public class StringUtil {
public static String concatenate(String[] str) {
		String ret = "";
		
		for(String st :str) {
			ret += st;
		}
	
		return ret;
	}
}
