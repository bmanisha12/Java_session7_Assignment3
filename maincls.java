
public class maincls {

	/**
	 * @param args
	 */
	public int i;
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		maincls m = new maincls();
		m = null;
		m.i=67;
		}
		catch(NullPointerException e)
		{
			System.out.println("\n\n NumberFormatException caught gracefully ");
		}
		
		
	}

}
