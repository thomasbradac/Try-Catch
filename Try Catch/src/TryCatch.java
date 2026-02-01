
public class TryCatch
	{

		public static void main(String[] args)
			{
				// Make try catch statement. I want to make exception index out of bounds from an array.
			
			String names[] = new String[5];
			
			try
			{
				names[15] = "Mike McGuire";
			}
			
			catch (ArrayIndexOutOfBoundsException exc)
			{
				System.out.println("Try again, that index is out of bounds for the given array.");
			}
			

			}

	}
