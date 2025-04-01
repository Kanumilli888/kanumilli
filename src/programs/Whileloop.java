package programs;

public class Whileloop {
	
public static void main (String [] args) {
	
	int i=0;

	while(i<10)
	{
	System.out.println(1);
	i++;
	if (i==5)
	{
		continue;
	}
	System.out.println("A");

	
	if(i>8)
	{
		break;
	}
	System.out.println("@");
}}}
