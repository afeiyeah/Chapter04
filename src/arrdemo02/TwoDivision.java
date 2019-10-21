package arrdemo02;

public class TwoDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二维数组的第一种声明方式
		int x[][]={{1,2},{3,4},{5,6}};
		System.out.println(x[0][0]+" "+x[0][1]);
		
		System.out.println(x[1][0]+" "+x[1][1]);
		
		System.out.println(x[2][0]+" "+x[2][1]);
		//x.length得到二维数组的行数
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
			
		}
		//二维数组的第二种声明方式
		int y[][]=new int[3][4];
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				y[i][j]=i+j;
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
			
		}
		//二维数组的第三种声明方式
		//锯齿形数组
		//只指定行数不指定列数
		int z[][]=new int[3][];
		z[0]=new int[]{10,12};
		z[1]=new int[]{13,14,15};
		z[2]=new int[]{16,17,18,19};
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				//z[i][j]=i+j;
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		//第四种声明方式
		int w[][]=new int[][]{{10,12},{13,14,15},{16,17,18,19}};
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				//z[i][j]=i+j;
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	}

}
