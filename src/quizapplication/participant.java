package quizapplication;
import java.util.Scanner;
public class participant {
		String email;
		String password;
		String name;
		int age;
		String address;
		String occupation;
		public void setEmail(String email) {
			this.email=email;
		}
		public String getEmail() {
			return email;
		}
		public void setPassword(String password) {
			this.password=password;
		}
		public String getPassword() {
			return password;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void setAddress(String address) {
			this.address=address;
		}
		public String getAddress() {
			return address;
		}
		public void setOccupation(String occupation) {
			this.occupation=occupation;
		}
		public String getOccupation() {
			return occupation;
		}
}