package ivtl;
import java.util.*;
public class sumpairequaltozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
	int i=0,j=0,t=0,p1=0,n1=0;
	int ele[]=new int[200];
	int pos[]=new int[100];
	int neg[]=new int[100];
		int n=x.nextInt();
		for(i=0;i<n;i++)
		{
			ele[i]=x.nextInt();
		}
		for(i=0;i<n;i++)
		{
			t=ele[i];
			if(t<0)
			{
				neg[n1]=ele[i];
				n1++;
			}
			else
			{
				pos[p1]=ele[i];
				p1++;
			}
		}
		for(i=0;i<p1;i++)
		{
			for(j=0;j<n1;j++)
			{
				if((pos[i]+neg[j])==0)
				{
					System.out.println(" output pair ="+"("+pos[i]+","+neg[j]+")");
				}
			}
		}
	}

}
