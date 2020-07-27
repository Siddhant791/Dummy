package BookingSystem;
//import java.util.*;
import java.time.*;
public class Admin {
	private String adminId;
	private String adminName;
	private String adminPassword;
	private LocalDate dateOfBirth;
	private String adminContact;
	
	public Admin(String adminId, String adminName, String adminPassword, LocalDate dateOfBirth, String adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.dateOfBirth = dateOfBirth;
		this.adminContact = adminContact;
	}
	public Theater addTheater(Theater t) {
		Theater theater;
		theater=t;
		return theater;
	}
}
