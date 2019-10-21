package homework04;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出一个double型二维数组（长度分别为5、4，值自己设定）的值
		//数组定义和创建、多维数组初始化、数组遍历
		
		//动态初始化
//		double a[][]= new double[5][4];
		
		//静态初始化
		double a[][]={{1.0, 2.0, 3, 0},{2.1,2,1.1,3},{2.1,2,3,4},{4.3,3,2,4},{3,3,3,5}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
