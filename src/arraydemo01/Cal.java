package arraydemo01;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int z=25;
		int arr []={10,20,25,7,4,9,200,160};
		int brr []={1,2,3,4,5,6};
		System.out.println("����arr�еĵ�һ��Ԫ��"+arr[0]);
		System.out.println("����arr�еĵڶ���Ԫ��"+arr[1]);
		System.out.println("����arr�еĵ�����Ԫ��"+arr[2]);
		for(int i=0; i<brr.length; i++){
			System.out.println("����brr�еĵ�"+(i+1)+"��Ԫ��Ϊ"+brr[i]);
		}
		//��ѭ����������Ԫ��
		for(int i=0;i<arr.length;i++){
			System.out.println("��������arr�ĵ�"+(i+1)+"��Ԫ�ص���ֵ��"+arr[i]);
		}
		int sum=0;
		//������arr������Ԫ�ؽ����ۼ����
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
		sum=0;
		for(int i=0; i<brr.length;i++){
			sum=sum+brr[i];
		}
		System.out.println(sum);
		//��arr����Ԫ�ص�ƽ��ֵ
		sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		System.out.println(avg);
		//������arr������ż�����ܺ�
		sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 ==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		//������brr�����������ĳ˻�
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
