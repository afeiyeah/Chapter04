package homework04;
import com.data.DataTool;
public class InClassPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��4*6�Ķ�ά��������
		//ʹ����������
		//������������������ֵ�������ҳ����ֵ
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
