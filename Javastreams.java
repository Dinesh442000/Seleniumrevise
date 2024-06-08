package NewPac;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Javastreams {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String> ();
		a1.add("Dinesh");
		a1.add("nesh");
		a1.add("inesh");
		a1.add("esh");
		a1.add("sh");
//		int cnt=0;
//		for(int i=0;i<a1.size();i++) {
//			String actual = a1.get(i);
//			if(actual.startsWith("D")) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		int cnt = (int) a1.stream().filter(s->s.startsWith("D")).count();
		System.out.println(cnt);
		//System.out.println(type(a1.stream().filter(s->s.startsWith("D")).count()));
		
		long d = Stream.of("A","B","AB","C").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		a1.stream().filter(s->s.length()<4).forEach(s->System.out.println(s));
		a1.stream().forEach(s->System.out.println(s+" Esha"));
		
	}



}
