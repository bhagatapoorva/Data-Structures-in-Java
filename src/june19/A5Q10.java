package june19;

import java.util.Scanner;

public class A5Q10 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s = scn.nextLine();
		System.out.println(countduplicate(s));

	}

	public static String countduplicate(String s) {
		char ch = '\0';
		int previous = 0;
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			ch = s.charAt(previous);

			if (s.charAt(i) == s.charAt(previous)) {
				count += 1;
				continue;
			} else {
				if (count != 1) {
					sb.append(ch);
					sb.append(count);
				}

				else {
					sb.append(ch);
				}
				previous = i;
				count = 1;

			}
		}
		
		sb.append(s.charAt(s.length()-1));
		if(count>1){
			sb.append(count);
		}
		return sb.toString();
	}
}
