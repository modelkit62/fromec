package barc_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Person p1 = createStudent();

		// subjectsIteration(p1);
		iterarTwo(p1);

	}

	private static Person createStudent() {
		Person p1 = new Person();

		p1.setName("William");
		p1.setSurname("surname");
		// Arrays.asList("Maths","Physics");

		Subject s1 = new Subject();
		s1.setCode(1);
		s1.setName("Maths");
		Subject s2 = new Subject();
		s2.setCode(2);
		s2.setName("Religion");

		List<Subject> subjectsWilliam = new ArrayList<>();
		subjectsWilliam.add(s1);
		subjectsWilliam.add(s2);

		p1.setSubjects(subjectsWilliam);
		return p1;
	}

	public static void iterarTwo(Person p2) {
		if (p2.getSubjects() != null && p2.getSubjects().size() > 0) {
			Iterator it = p2.getSubjects().iterator();

			List<Subject> lista = new ArrayList<>();
			Subject subject;

			while (it.hasNext()) {
				subject = new Subject();
				Subject next = (Subject) it.next();

				if (next != null) {
					subject.setName(next.getName());
				}

				lista.add(subject);

			}
			for (Subject s : lista) {
				System.out.println(s.getName());
			}

		}

	}

	public static void subjectsIteration(Person p1) {

		if (p1.getSubjects() != null && p1.getSubjects().size() > 0) {

			Iterator<Subject> iterator = p1.getSubjects().iterator();

			List<Subject> subjects = new ArrayList<>();
			Subject subject;

			while (iterator.hasNext()) {
				subject = new Subject();

				Subject next = (Subject) iterator.next();

				if (next != null) {
					subject.setName(next.getName());
				}
				subjects.add(subject);

			}

			for (Subject s : subjects) {
				System.out.println(s.getName());
			}

			// p1.setSubjects(subjects);
			System.out.println(p1.getName());
			System.out.println(p1.getSubjects());

		}

	}

}
