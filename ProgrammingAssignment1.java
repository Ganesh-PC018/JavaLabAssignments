public class ProgrammingAssignment1
{
public int getValidRegistrationsCount(String []enroll)
{
	int count =0;
	boolean isValid =true;
	for(int i=0;i<enroll.length;i++)
	{
		isValid =true;
		if(enroll[i].length() != 10)
		{
			continue;
		}
		else
		{
			for(int j=0;j<enroll[i].length();j++)
			{
				if(j < 4 || (j >= 7 && j < enroll[i].length()))
				{
					char charAtInd = enroll[i].charAt(j);
					if(!Character.isDigit(charAtInd))
					{	
						isValid = false;
						break;
					}
				}
				if(j >= 4 && j < 7)
				{
					String departmentId = enroll[i].substring(4,7);
					if(!(departmentId.equalsIgnoreCase("bit") || departmentId.equalsIgnoreCase("bcs") || departmentId.equalsIgnoreCase("bme") || departmentId.equalsIgnoreCase("bch")))
					{
						isValid = false;
						break;
					}
			       }
			}
			if(isValid)
			{
				count++;
			}
		}
		
	}	
	return count;
}
public static void main(String[] args)
{
	String []enrollment = {"2023bcd501","2023bit501","2023bcs501","2023bch501","2023bme501","2023abc501","202334566","abcdefghij","2023BIT5@5",""};
        ProgrammingAssignment1 data = new ProgrammingAssignment1();
	int count  =data.getValidRegistrationsCount(enrollment);
	System.out.println(count);
}
}