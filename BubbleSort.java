package sort;
/**
 *
 * @author  LiJing 
 * @date    2017年9月5日 下午2:57:39
 * @Version 1.0
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr={7,6,5,4,3,2,1,0};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int p:arr){
			System.out.println(p+"   ");
		}
	}
	
	public static void change(int a,int b){
		int temp=a;
		a=b;
		b=temp;	
	}
}
