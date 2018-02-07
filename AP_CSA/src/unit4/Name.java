package unit4;

public class Name
{
	private String name;
	public Name()
	{
		setName("Johnny Ren");
	}

	public Name(String s)
	{
		setName(s);

	}

   public void setName(String s)
   {
	   name=s;
   }

	public String getFirst()
	{
		String firstName=name.substring(0, name.indexOf(" "));
		return firstName;
	}

	public String getLast()
	{
		String lastName=name.substring(name.indexOf(" ")+1);
				
		return lastName;
	}

 	public String toString()
 	{
 		return name;
	}
}