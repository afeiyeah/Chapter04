package homework04;
import com.data.DataTool;
public class InClassPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成一个4*6的二维整型数组
		//使用随机数填充
		//遍历输出该数组的所有值，并且找出最大值
		int a[][]= new int[4][6];
		int max=a[0][0];
		for(int i=0;i<4;i++){
			for(int j=0;j<6;j++){
				a[i][j]=DataTool.inputRnd();
				if(a[i][j]>max){
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print(max);

	}

}
