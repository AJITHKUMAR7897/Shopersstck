package genericUtility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class javaUtility 
{
	public int getRandomNumber(int limit)
	{
		Random random=new Random();
		int RandamNumber=random.nextInt(limit);
		return RandamNumber;
	}
		
	public String getSystemDateWithTime()
	{
		Date dateobj=new Date(0);
		String dateActualFormat=dateobj.toString();
		String date=dateActualFormat.replace(" ","_").replace(":", "_");
		return date;
	 }	
	public String getsystemdateinddmmyyyyformat()
	{
		Date dateobj=new Date(0);
		SimpleDateFormat sdft=new SimpleDateFormat("dd-MM-yyyy");
		String date=sdft.format(dateobj);
		return date;
	}	
}

