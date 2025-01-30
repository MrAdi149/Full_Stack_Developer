class ForEach{
	public static void main(String[] args){
		int[] ar = {1,2,3,4,6};
		for(int n : ar){
			System.out.println(n);
		}
		
		System.out.println();
		
		for(int i = 0; i<ar.length; i++){
			System.out.println(ar[i]);
		}
	}
}