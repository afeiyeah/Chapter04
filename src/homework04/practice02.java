package homework04;

public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将一个字符数组的值拷贝到另一个字符数组中
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
