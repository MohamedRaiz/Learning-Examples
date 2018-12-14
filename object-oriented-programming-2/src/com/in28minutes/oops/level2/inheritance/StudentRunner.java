package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Raiz");
//		student.setEmail("hahha");
//
//		Person person = new Person();
//		person.setEmail("johnny");
//		person.setName("Raiz");
//		person.setPhoneNumber("2133");
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee("Raiz", "Programmer Analyst");
		employee.setEmail("johnny");
		employee.setPhoneNumber("2133");
		employee.setEmplyeeGrade('A');
		employee.setTitle("Programmer Analyst");
		employee.setEmployerName("ranga");

		System.out.println(employee);
	}
}
