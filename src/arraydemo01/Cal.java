package arraydemo01;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int z=25;
		int arr []={10,20,25,7,4,9,200,160};
		int brr []={1,2,3,4,5,6};
		System.out.println("数组arr中的第一个元素"+arr[0]);
		System.out.println("数组arr中的第二个元素"+arr[1]);
		System.out.println("数组arr中的第三个元素"+arr[2]);
		for(int i=0; i<brr.length; i++){
			System.out.println("数组brr中的第"+(i+1)+"个元素为"+brr[i]);
		}
		//用循环遍历数组元素
		for(int i=0;i<arr.length;i++){
			System.out.println("整型数组arr的第"+(i+1)+"个元素的数值是"+arr[i]);
		}
		int sum=0;
		//对数组arr中所有元素进行累计求和
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
		sum=0;
		for(int i=0; i<brr.length;i++){
			sum=sum+brr[i];
		}
		System.out.println(sum);
		//求arr所有元素的平均值
		sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		System.out.println(avg);
		//求数组arr中所有偶数的总和
		sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 ==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		//求数组brr中所有奇数的乘积
		int pri=1;
		for(int i=0;i<brr.length;i++){
			if(brr[i]%2 !=0)
			{
				pri=pri*brr[i];
			}
		}
		System.out.println(pri);
		

		
		
		
		
	}

}
