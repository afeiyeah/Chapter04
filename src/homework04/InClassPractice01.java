package homework04;

public class InClassPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��֪����һά���飺{1,2,3,4,5}��{6,7,8}��
		//��������һά����ϲ���һ��һά����{1,2,3,4,5,6,7,8}
		int a[]={1,2,3,4,5};
		int b[]={6,7,8};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=a.length; i<a.length+b.length; i++){
			c[i]=b[i-a.length];
		}
		for(int x:c){
			System.out.print(x);
		}

	}

}
