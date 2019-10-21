package homework04;

public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组
		//先排序，然后输出排序后的数组的值
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
