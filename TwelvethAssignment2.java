
public class TwelvethAssignment2 {

	public static void main(String[] args) {
		constr.change();
		constr c=new constr();
		c.show();
		
		}
}

class constr
{
	String name;
	int age;
	int rollno;
	String dept;
	static String college="Annauniversity";
	

static void change()
{
college="VIT";
}

 
void show()
{
name="NAVIN";
age=20;
rollno=100;
dept="CSE";
System.out.println("the details are:"+name+"" +" "+ age+" " + rollno+" " + dept+" " +" "+college);
}
}