package homework04;

public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����9��������1,6,2,3,9,4,5,7,8��������
		//������Ȼ����������������ֵ
		int a[]={1,6,2,3,9,4,5,7,8};
		for(int i=0;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j-1]>a[j]){
					a[j]=a[j-1]^a[j];
					a[j-1]=a[j-1]^a[j];
					a[j]=a[j-1]^a[j];
				}
			}
		}
		for(int x:a){
			System.out.print(x);
		}

	}

}
