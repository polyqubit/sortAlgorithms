public final class Sorts {
	private double x;
	private Sorts(double inp) {
		x = inp;
	}
	
	//hand: 0 = lowest on left, 1 = highest on left
	public static void bubbleI(int flag, int[] inp, int hand) {
		
		boolean swap = true;
		int round = 0;
		int reg;
		if(hand==0 || hand!=1) {
				while(swap){
					swap = false;
					round++;
					for(int i=0;i<inp.length-round;i++){
						if(inp[i]>inp[i=1]){
							reg = inp[i];
							inp[i] = inp[i+1];
							inp[i+1]=reg;
							swap = true;
						}
					}
				}
				
		}
		
		else if(hand==1) {
				while(swap){
					swap = false;
					round++;
					for(int i=0;i<inp.length-round;i++){
						if(inp[i]<inp[i=1]){
							reg = inp[i];
							inp[i] = inp[i+1];
							inp[i+1]=reg;
							swap = true;
						}
					}
				}
		}
		//if(flag == 1) {
			System.out.print("[ ");
			for(int i=0;i<inp.length;i++) {
				System.out.print(inp[i]);
				if(i<inp.length-1){
					System.out.print(", ");
				}
			}
			System.out.println(" ]");
		//}
	}
	
	public static void bubbleD(int flag, double[] inp, int hand) {
		boolean swap = true;
		int round = 0;
		double reg;
		if(hand==0 || hand!=1) {
				while(swap){
					swap = false;
					round++;
					for(int i=0;i<inp.length-round;i++){
						if(inp[i]>inp[i=1]){
							reg = inp[i];
							inp[i] = inp[i+1];
							inp[i+1]=reg;
							swap = true;
						}
					}
				}
		}
		else if(hand==1) {
				while(swap){
					swap = false;
					round++;
					for(int i=0;i<inp.length-round;i++){
						if(inp[i]<inp[i=1]){
							reg = inp[i];
							inp[i] = inp[i+1];
							inp[i+1]=reg;
							swap = true;
						}
					}
				}
		}
		//if(flag == 1) {
			System.out.print("[ ");
			for(int i=0;i<inp.length;i++) {
				System.out.print(inp[i]);
				if(i<inp.length-1){
					System.out.print(", ");
				}
			}
			System.out.println(" ]");
		//}
	}
}