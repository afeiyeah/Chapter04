package arraydemo01;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如何求数组元素的最大值最小值
		//引入max和min做法
		//////////////////////////////////////////////////
		int a []={10,20,25,7,4,9,200,160};
		int max=a[0];
		int min=a[0];
		for(int n=1; n<a.length;n++){
			if(max<a[n]){
				max=a[n];
			}
			if(min>a[n]){
				min=a[n];
			}
		}
		System.out.println("数组中的最小值为"+min+"数组中的最大值为"+max);
		///////////////////////////////////////////////////
		//冒泡排序法
		int b []={10,20,25,7,4,9,200,160};
		for(int i=0; i<b.length-1;i++){
			int temp=b[0];
			for(int j=i; j>=0; j--){
				if (b[j+1]<b[j]){
					temp=b[j+1];
					b[j+1]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int k=0; k<b.length; k++){
			System.out.print(b[k]+"  ");
		}
		System.out.println();
		///////////////////////////////////////////////////
		//冒泡排序法
		//异或运算做法
		int c []={10,20,25,7,4,9,200,160};
		for(int i=0; i<c.length-1;i++){
			for(int j=i; j>=0; j--){
				if (c[j+1]<c[j]){
					c[j]=c[j+1]^c[j];
					c[j+1]=c[j+1]^c[j];
					c[j]=c[j+1]^c[j];
				}
			}
		}
		for(int k=0; k<c.length; k++){
			System.out.print(c[k]+"  ");
		}
		System.out.println();

		//////////////////////////////////////////////
		//课堂示例
		int arr[]={50,100,89,45,66,8,200,7};
		for(int i=1;i<=arr.length-1;i++){
			for(int j=1;j<=arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					int t=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=t;
				}
			}
		}
		//增强型for循环
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();

		//课堂练习
		int brr[]={101,99,87,34,3,3,7};
		for(int i=0;i<brr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(brr[j-1]>brr[j]){
					brr[j]=brr[j-1]^brr[j];
					brr[j-1]=brr[j-1]^brr[j];
					brr[j]=brr[j-1]^brr[j];
				}
				
			}
		}
		for(int x:brr){
			System.out.print(x+" ");
		}
		
	}

}
