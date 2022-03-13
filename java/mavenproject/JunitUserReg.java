package mavenproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserReg {
	public String regex;

	public boolean FirstName(String firstName) {

		regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		return m.matches();
	}

	public boolean LastName(String lastName) {

		regex = "[a-z]{2,}[A-Z]{1}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		return m.matches();
	}
}