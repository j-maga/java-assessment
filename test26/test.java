package test26;

public class test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] mark1= {100,71,68,31,100,84};
			int[] mark2= {45,35,22,67,92,83};
			int count=0,tot1=0,tot2=0;
			float avg1,avg2;//i=0,max=0;-no get the value in while loop
			for(int i=0;i<mark1.length;i++)
			{
		if(mark1[i]>=60)
			{
			//System.out.println("student got centum   " + i+1 + "sad");
				System.out.println("mark  " +mark1[i]);
				System.out.println("centum position  " +i);
				if(mark1[i]==100)
				{
					count++;
				}
			}
		System.out.println("no. of centum" +count );
			}
			int i=0,max=0;
			while(i<mark1.length)
			{
			if(mark1[i]>max)
				max=mark1[i];
				i++;
		}
			System.out.println("maximum  " +max);
		tot1+=mark1[i];
		 tot2+=mark2[i];
		 
		 int len1=mark1.length;
		 int len2=mark2.length;
		avg1=(float)tot1/len1;
		avg2=(float)tot2/len2;
		System.out.println("average 1 " +avg1);
		System.out.println("average 2 " +avg2);


	}

}
