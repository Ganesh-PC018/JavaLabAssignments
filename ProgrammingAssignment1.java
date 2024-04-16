class SY2023bit501
{
public int getValidRegistrationsCount(String []enroll)
{
	int count =0;
	boolean isValid =true;
	if(enroll == null)
	{
		return -1;
	}
	for(int i=0;i<enroll.length;i++)
	{
		isValid =true;
		if(enroll[i] == null || enroll[i].length() != 10)
		{
			continue;
		}
		if(!(isValidYear(enroll[i].substring(0,4))))
		{
			isValid = false;
			continue;
		}
		if(!(isValidDepartment(enroll[i].substring(4,7))))
		{
			isValid = false;
			continue;
		}
		if(!(isDataValid(enroll[i].substring(7,10))))
		{
			isValid = false;
			continue;
		}
		if(isValid)
		{
			count++;
		}
	}	
	return count;
}
/*--------------------------------------------------------------------------isDataValid------------------------------------------------------------------------------------ */
public static boolean isDataValid(String s)
{
	int enroll = 0;
	for(int i=0;i<s.length();i++)
	{
		int data = (((int)s.charAt(i))-48);
		enroll = enroll*10  + data;
	}
	if( enroll >= 1 && enroll <= 50)
	{
		return true;
	}
	return false;
}
/*--------------------------------------------------------------------------isValid Year------------------------------------------------------------------------------------ */
public static boolean isValidYear(String enroll)
{
	boolean isDigit = true;
	for(int i=0;i<enroll.length();i++)
	{
		char charAtInd = enroll.charAt(i);
					if(!Character.isDigit(charAtInd))
					{	
					    isDigit = false;
						break;
					}
	}
	int year = Integer.parseInt(enroll);
	if(isDigit && (year >= 2000 && year <= 2024))
	{
		return true;
	}
	return false;
}
/*--------------------------------------------------------------------------isValid isValidDepartment------------------------------------------------------------------------------------ */

public static boolean isValidDepartment(String dept)
{
	String []departmentID = {"bit","bcs","bch","bmh"};
	for(int i=0;i<departmentID.length;i++)
	{
		if(departmentID[i].equalsIgnoreCase(dept))
		{
			return true;
		}
	}
	return false;
}
public static void main(String[] args)
{
	// String []enrollment = {null,"2023bit002","2023bit1bc","2023bit100","2022bit024","1224789644743764"};
	String []enrollment = new String[1000000];
	CodeOpt obj = new CodeOpt();
	obj.generateRandomYear(enrollment);
	obj.generateRandomDepartmentId(enrollment);
	obj.generateRandomSerialNumber(enrollment);
	SY2023bit501 data = new SY2023bit501();
	int count  =data.getValidRegistrationsCount(enrollment);
	System.out.println(count);
}
}