package homework04;

public class optional03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将一个数组中的重复元素保留一个其他的清零
		int a[]={1,2,3,4,1,3,4,2,4};
		for(int i=0; i<a.length; i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					a[j]=0;
				}
			}
		}
		for(int x:a){
			System.out.print(x+" ");
		}

	}

}
