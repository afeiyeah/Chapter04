package homework04;

public class optional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将一个数组中的元素逆序存放
		int a[]={1,2,3,4,5,6,7,8,9};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[a.length-1-i]=a[i];
			
		}
		for(int x:b){
			System.out.print(x+" ");
		}
		
	}

}
