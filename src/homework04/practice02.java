package homework04;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ���ַ������ֵ��������һ���ַ�������
		int a[]={1,2,3,4,5};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int x:b){
			System.out.print(x+" ");
		}
	}

}
