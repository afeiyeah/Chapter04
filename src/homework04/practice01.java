package homework04;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//编写一个简单程序，要求数组长度为5，
		//分别赋值10，20，30，40，50，在控制台输出该数组的值
		int a[]= new int [5];
		a[0]=10;
		a[1]=20; 
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int x:a){
			System.out.print(x+" ");
		}

	}

}
