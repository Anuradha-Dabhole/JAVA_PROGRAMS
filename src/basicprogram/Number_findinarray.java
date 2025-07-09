package basicprogram;

public class Number_findinarray {

	public static void main(String[] args) {
		int student[]=new int[4];
		student[0]=23;
		student[1]=22;
		student[2]=34;
		student[3]=45;
int notocheck=45;
for(int i=0;i<4;i++)
{
	if(notocheck==student[i])
	{
		System.out.println(notocheck + "is a in array at position" + i);
	}
	
}

	}

}
