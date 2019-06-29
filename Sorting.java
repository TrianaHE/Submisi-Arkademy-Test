import java.util.ArrayList;
import java.util.List;


public class Sorting {

	/**
	 * @param args
	 */
	public static void insertionSortAsc(ArrayList<Integer>arr){
		int index;
		for(index=1; index<arr.size(); index++){
			while((index>0)&&(arr.indexOf(index)<arr.indexOf(index-1))){
				int sementara=arr.get(index);
				int temp1 = arr.get(index-1);
				int temp2 = arr.get(index);
				arr.set(index, arr.get(index-1));
				arr.set(index-1, sementara);
				index--;
			}
		}
		for(int urut=0; urut<arr.size();urut++){
			System.out.print(arr.get(urut)+" ");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputan = "5956560159466056";
		int input[] = {5,9,5,6,5,6,0,1,5,9,4,6,6,0,5,6};
		ArrayList<Integer>tempOutput = new ArrayList<Integer>();
		for(int i = 0; i<input.length; i++){
			if(input[i]==0){
				for(int j = 0; j<i;j++){
					tempOutput.add(input[j]);
					insertionSortAsc(tempOutput);
				}

			}

		}


	}

}
