package homework04;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���һ��double�Ͷ�ά���飨���ȷֱ�Ϊ5��4��ֵ�Լ��趨����ֵ
		//���鶨��ʹ�������ά�����ʼ�����������
		
		//��̬��ʼ��
//		double a[][]= new double[5][4];
		
		//��̬��ʼ��
		double a[][]={{1.0, 2.0, 3, 0},{2.1,2,1.1,3},{2.1,2,3,4},{4.3,3,2,4},{3,3,3,5}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
