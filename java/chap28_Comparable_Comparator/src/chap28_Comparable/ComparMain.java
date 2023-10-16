package chap28_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.kh.practice.*;

public class ComparMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("학생1", 78));
		people.add(new Person("학생2", 79));
		people.add(new Person("학생3", 71));
		
		// 나이를 기준으로 정렬
		Collections.sort(people);
		
		for(Person person : people) {
			System.out.println(person);
		}
		
		List<Student> student = new ArrayList<>();
		student.add(new Student("고병찬",1));
		student.add(new Student("나세희",3));
		student.add(new Student("서광원",2));
		
		Collections.sort(student);
		for(Student s : student) {
			System.out.println(s);
		}
		
		
		
		
	}

}
