package pragmatic.homework.String;

import java.util.regex.*;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class UpperCase {

	public static void main(String[] args) {
		String example = ("The code between a special tag is always uppercase");
		String regEx = "[A-Z]+";
		Pattern pattern = Pattern.compile(regEx);
		java.util.regex.Matcher matcher = pattern.matcher(example);
		
System.out.println(example);
	}

}
