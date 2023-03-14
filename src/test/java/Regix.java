import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.platform.engine.support.discovery.SelectorResolver.Match;

public class Regix {

	public static void main(String[] args) {
		String email="ssaravanan@gmail.com";
		String pat="[a-z0-9]+@[a-z]+.[a-z]{2,3}";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(email);
		System.out.println(matcher.matches());

	
	
	String s="akjdhsakjd18ksjhdue2jsahd#$%^&";
	String pat1="\\d+";
	Matcher matcher2 = Pattern.compile(pat1).matcher(s);
	ArrayList<String> list=new ArrayList<>();
	while(matcher2.find()) {
		System.out.println("Group "+matcher2.group());
		String num = matcher2.group().toString();
		list.add(num);
	}
	long num=0;
	for(String ob:list) {
		num=num+Long.parseLong(ob);
		
	}
	System.out.println("Num "+num);
}}
