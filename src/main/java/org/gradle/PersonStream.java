package org.gradle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonStream {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Lety",39,"St Louis"));
		list.add(new Person("Michael",20,"Virginia"));
		list.add(new Person("Sarah",31,"L.A."));
		
		List<Person> personList = list.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
		
		
		for(Person person: personList) {
			System.out.println(person.getName());
		}
	}


	
}
