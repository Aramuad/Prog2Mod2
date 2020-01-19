package lab_2A;

public class Person {
	protected String name, address, email, phone;
	Person() {
	}
	Person(String name, String address, String email, String phone) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String allData() {
		return "Person, " + name + ", " + address + ", " + email + ", " + phone;
	}
}
	
	final class Student extends Person {
		private String year;
		Student(String name, String address, String email, String phone, String year) {
			setName(name);
			setAddress(address);
			setEmail(email);
			setPhone(phone);
			this.year = year;
		}
		public String allData() {
			return "Student, " + name + ", " + address + ", " + email + ", " + phone + ", " + year;
		}
	}
	
	class Employee extends Person {
		protected boolean office;
		protected String salary, dateHired;
		Employee() {
		}
		Employee(String name, String address, String email, String phone,
				boolean office, String salary, String dateHired) {
			setName(name);
			setAddress(address);
			setEmail(email);
			setPhone(phone);
			this.office = office;
			this.salary = salary;
			this.dateHired = dateHired;
		}
		public void hasOffice(boolean office) {
			this.office = office;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public void setDateHired(String dateHired) {
			this.dateHired = dateHired;
		}
		public String allData() {
			return "Employee, " + name + ", " + address + ", " + email + ", " + phone +
					", " + office + ", " + salary + ", " + dateHired;
		}
	}	
		final class Faculty extends Employee {
			private String officeHours, rank;
			Faculty() {
			}
			Faculty(String name, String address, String email, String phone,
					boolean office, String salary, String dateHired, 
					String officeHours, String rank) {
				setName(name);
				setAddress(address);
				setEmail(email);
				setPhone(phone);
				hasOffice(office);
				setSalary(salary);
				setDateHired(dateHired);
				this.officeHours = officeHours;
				this.rank = rank;
			}
			public String allData() {
				return "Faculty, " + name + ", " + address + ", " + email + ", " + phone +
						", " + office + ", " + salary + ", " + dateHired + 
						", " + officeHours + ", " + rank;
			}
		}
		
		final class Staff extends Employee {
			private String title;
			Staff() {
			}
			Staff(String name, String address, String email, String phone,
					boolean office, String salary, String dateHired, String title) {
				setName(name);
				setAddress(address);
				setEmail(email);
				setPhone(phone);
				hasOffice(office);
				setSalary(salary);
				setDateHired(dateHired);
				this.title = title;
			}
			public String allData() {
				return "Staff, " + name + ", " + address + ", " + email + ", " + phone +
						", " + office + ", " + salary + ", " + dateHired + ", " + title;
			}
		}
		
class MyDate {
	private int year, day;
	private String month;
	MyDate() {
	}
	MyDate(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String allData() {
		return "MyDate: " + day + " " + month + " " + year;
	}
}
