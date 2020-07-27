package BookingSystem;

import java.util.Scanner;

public class User {
	private Integer userId;
	private String userName;
	private String password;
	public User(Integer userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public User registerNewUser()
	{
		Scanner sc=new Scanner(System.in);
		User user;
		Integer userId=sc.nextInt();
		String userName=sc.nextLine();
		String password=sc.nextLine();
		sc.close();
		user=new User(userId,userName,password);
		return user;
	}
	public Boolean signIn(String userName,String password)
	{
		if(this.userName==userName && this.password==password)
		{
			return true;
		}else {
			return false;
		}
	}
	public Boolean signOut(){
		return true;
	}
}
