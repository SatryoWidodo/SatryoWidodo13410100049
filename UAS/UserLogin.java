public class UserLogin
{
	private String userName;
	private String password;
	private String type;
	
	public UserLogin(String userName, String password, String type)
	{
		this.userName = userName;
		this.password = password;
		this.type = type;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getType()
	{
		return type;
	}
	
	public boolean cekType(String tipe)
	{
		return (tipe.equalsIgnoreCase(type));
	}
	
	public boolean checkPassUser(String user, String pass, String userType)
	{
		return (user.equals(userName) && (pass.equals(password)) && (userType.equals(type)));
	}
	
	public void setPassword(String pass)
	{
		password = pass;
	}
}