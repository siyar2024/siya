//Write a class with main method and pass below info

//1. Main to take information of a person: name,email,age,password
//2. Main to take information of a forest: name,area,establishedYear,state
//3. Main to take information of a palace: name,location,builtBy,buildYear

class PersonRunner
{
	public static void main(String[] person)
	{
		if (person.length==4){
			String name=person[0];
			String email=person[1];
			String age=person[2];
			String password=person[3];
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			System.out.println("age:"+age);
			System.out.println("password:"+password);
			}
			else
			{
			System.out.println("invalid");
			}
		}
	
}


