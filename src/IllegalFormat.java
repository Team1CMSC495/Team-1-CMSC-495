/**The IllegalFormat class creates an exception.
@ author Luis Dall
*/

public class IllegalFormat extends NoSuchFieldException
{
	public IllegalFormat( String message )
	{
		super(message);
	}
}