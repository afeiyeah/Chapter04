package arraydemo01;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x []={4,5,6};
		char arr[]=new char[5];
		arr[0]='a';
		arr[1]='b';
		arr[2]='c';
		for(int i=0;i<=arr.length-1;i++){
			//字符型数组如果不给显示赋值，则默认取空白字符
			
			System.out.println(arr[i]+" "+(int)(arr[i]));
		}
		//字符串型数组如果不给显示赋值，则默认取null
		String [] strs=new String[3];
		strs[0]="hello";
		for(String s:strs){
			System.out.println(s);
		}
		//布尔数组如果不给显示赋值，则默认取False
		boolean [] bs=new boolean[3];
		bs[0]=true;
		for(boolean b:bs){
			System.out.println(b);
		}
		//数值型组如果不给显示赋值，则默认取0
		int d []=new int[2];
		d[0]=1;
		System.out.println(d[0]+" "+d[1]);
		

	}

}
