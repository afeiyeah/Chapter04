package homework04;

public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ����8��������18��25��7��36��13��2��89��63����������
		//�ҳ����������������±ꡣ
		int a[]={18,25,7,36,13,2,89,63};
		int max=a[0];
		int loc=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				loc=i;
			}
		}
		System.out.print(max+", "+loc);

	}

}
