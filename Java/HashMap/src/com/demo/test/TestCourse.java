package com.demo.test;
import java.util.*;
import com.demo.service.*;
import com.demo.beans.Course;

public class TestCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseService cservice = new CourseServiceImpl();
		int ch;

		do {
			System.out.println("1. Add new Course\n2. display all\n3. find by course name"
					+ "\n4. find by course capacity\n5. modify course name"
					+ "\n6. display in sorted order of key\n7. display in sorted order of value\n"
					+ "8. delete by course name\n9. delete by capacity\n10. exit\n choice: ");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();


			switch(ch) {
					case 1 ->{
						cservice.addNewCourse();

					}
					case 2 -> {
						Map<String, Course> hm = cservice.displayAll();
						if (hm.isEmpty()) {
							System.out.println("No courses available");
						} else {
							for (Map.Entry<String, Course> entry : hm.entrySet()) {
								System.out.println(entry.getKey() + " : " + entry.getValue());
							}
						}
					}
					case 3 -> {
						System.out.println("Enter course name:");
						String name = sc.next();
						Course c = cservice.findByName(name);
						if (c != null) {
							System.out.println(c);
						} else {
							System.out.println("Course not found");
						}
					}
					case 4 -> {
						System.out.println("Enter capacity:");
						int cap = sc.nextInt();
						List<Course> clist = cservice.findByCapacity(cap);
						if (clist.isEmpty()) {
							System.out.println("No courses with that capacity");
						} else {
							for (Course c : clist) {
								System.out.println(c);
							}
						}
					}
					case 5 -> {
						System.out.println("Enter old course name:");
						String oldName = sc.next();
						System.out.println("Enter new course name:");
						String newName = sc.next();
						cservice.modifyCourseName(oldName, newName);
						System.out.println("Course name modified");
					}
					case 6 -> {
						Map<String, Course> hm = cservice.displaySortedByKey();
						if (hm.isEmpty()) {
							System.out.println("No courses available");
						} else {
							for (Map.Entry<String, Course> entry : hm.entrySet()) {
								System.out.println(entry.getKey() + " : " + entry.getValue());
							}
						}
					}
					case 7 -> {
						Map<String, Course> hm = cservice.displaySortedByValue();
						if (hm.isEmpty()) {
							System.out.println("No courses available");
						} else {
							for (Map.Entry<String, Course> entry : hm.entrySet()) {
								System.out.println(entry.getKey() + " : " + entry.getValue());
							}
						}
					}
					case 8 -> {
						System.out.println("Enter course name to delete:");
						String name = sc.next();
						cservice.deleteByName(name);
						System.out.println("Course deleted");
					}
					case 9 -> {
						System.out.println("Enter capacity to delete:");
						int cap = sc.nextInt();
						cservice.deleteByCapacity(cap);
						System.out.println("Courses with capacity " + cap + " deleted");
					}
					case 10 -> {
						System.out.println("Exiting...");
					}
					default -> {
						System.out.println("Invalid choice");
					}
			}

		}while(ch != 10);

	}

}
