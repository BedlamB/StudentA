
public class StudentTest extends junit.framework.TestCase {
	public void testCreate() {
		final String firstStudentName = "Janes Does";
		final String secondStudentName = "Joe Blows";
		
		Student firstStudent = new Student(firstStudentName);
		assertEquals(firstStudentName, firstStudent.getName());
		
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
	}

}
