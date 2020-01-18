package Lab_2A;
public class PersonTest {

	public static void main(String[] args) {
		Person homo = new Person("Sam", "420 BlazeIt Dr. FreeLSD, DMT 69696",
				"D.A.R.E.@email.com", "4046547796");
		Person homo1 = new Student("Sally", "655 Place Dr. GA", "asdf@email.com",
				"6780043354", "Junior");
		Person homo2 = new Employee("Dan", "445 Kind dr. TN", "fghj@email.com",
				"7701123323", false, "$1", "09 Jan 2018");
		Person homo3 = new Faculty("Jesse", "3434 Lance Dr. KY", "kjhh@email.com",
				"5574434434", true, "$60,000", "18 Jan 2013", "3pm - 5pm, Mon - Thurs", "Arch Code-Breaker");
		Person homo4 = new Staff("Jamie", "7655 Hey Ct. LA", "ertert@email.com",
				"9668556676", false, "$10,000", "03 Jun 2018", "Chief Broom Operator");
		System.out.println(homo.allData());
		System.out.println(homo1.allData());
		System.out.println(homo2.allData());
		System.out.println(homo3.allData());
		System.out.println(homo4.allData());
	}
}
