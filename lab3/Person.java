//Sam Ballard

package lab3;

public class Person {
	protected String name, address, email, phone;
	Person(String name, String address, String email, String phone) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + ", " + name + ", " + address + ", " + email + ", " + phone;
	}
}
	
	final class Student extends Person {
		private String year;
		Student(String name, String address, String email, String phone, String year) {
			super(name, address, email, phone);
			this.year = year;
		}
		@Override
		public String toString() {
			return  super.toString() + ", " + year;
		}
	}
	
	class Employee extends Person {
		protected boolean office;
		protected String salary, dateHired;
		Employee(String name, String address, String email, String phone,
				boolean office, String salary, String dateHired) {
			super(name, address, email, phone);
			this.office = office;
			this.salary = salary;
			this.dateHired = dateHired;
		}
		@Override
		public String toString() {
			return super.toString() + ", " + office + ", " + salary + ", " + dateHired;
		}
	}	
		final class Faculty extends Employee {
			private String officeHours, rank;
			Faculty(String name, String address, String email, String phone,
					boolean office, String salary, String dateHired, 
					String officeHours, String rank) {
				super(name, address, email, phone, office, salary, dateHired);
				this.officeHours = officeHours;
				this.rank = rank;
			}
			@Override
			public String toString() {
				return super.toString() + ", " + office + ", " + salary + ", " + dateHired + ", " + officeHours + ", " + rank;
			}
		}
		
		final class Staff extends Employee {
			private String title;
			Staff(String name, String address, String email, String phone,
					boolean office, String salary, String dateHired, String title) {
				super(name, address, email, phone, office, salary, dateHired);
				this.title = title;
			}
			@Override
			public String toString() {
				return super.toString() + ", " + office + ", " + salary + ", " + dateHired + ", " + title;
			}
		}
		
class MyDate {
	private int year, day;
	private String month;
	MyDate(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate: " + day + " " + month + " " + year;
	}
}
