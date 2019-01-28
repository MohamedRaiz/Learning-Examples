package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ronnie"), new Student(100, "Adam"), new Student(2, "Eve"));

		// now we want to sort this list. thus we convert into arraylist which allows
		// modifications
		List<Student> studentsAl = new ArrayList<Student>(students);

		System.out.println(studentsAl);

		Collections.sort(studentsAl); // can only pass in arraylist with those classes that implements the comparable
										// interface. Integer and string class automatically implements it already by
										// default. So now must implement comparable interface in student

		System.out.println("Desc" + studentsAl);

		Collections.sort(studentsAl, new AscendingStudentComparator());
		System.out.println("Asc" + studentsAl);

		// Another way of sorting by using the arrayList instead of the collections
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println(studentsAl);

	}
}
