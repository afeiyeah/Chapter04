package arraydemo01;
import com.data.DataTool;
public class SysInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= new int[4];
		for(int i=0; i<x.length; i++){
			x[i]=DataTool.inputRnd();
		}

	}

}
