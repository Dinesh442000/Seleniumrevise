package NewPac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
	public static void main(String[] args) {
		 Stream.of("Abhi","Bhaavin","Akashy","Chetan").filter(s->s.endsWith("n"))
		 .map(s->s.toUpperCase())
		 .forEach(s->System.out.println(s));
		 
		 List<Integer> numbers = Arrays.asList(3,2,4,5,5,6,6,8);
		 
		numbers.stream().distinct().forEach(s->System.out.println(s));
		System.out.println();
		List li =numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(li.get(3));
	}
}
