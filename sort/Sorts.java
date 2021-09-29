import pkg.*;
public final class Sorts {
	private double x;
	static int cou = 0;
	private Sorts(double inp) {
		x = inp;
	}
	
	//bubble sort
	//hand: 0 = lowest on left, 1 = highest on left
	public static void bubbleD(int flag, double[] inp, int hand, int y) {
		boolean swap = true;
		int round = 0;
		double reg;
		int c=0;
		Rectangle line;
		if(hand==0 || hand!=1) {
			while(swap){
				swap = false;
				round++;
				for(int i=0;i<inp.length-round;i++){
					if(inp[i]>inp[i+1]){
						reg = inp[i];
						inp[i] = inp[i+1];
						inp[i+1]=reg;
						swap = true;
					}
					c++;
				}
			}
		}
		else if(hand==1) {
			while(swap){
				swap = false;
				round++;
				for(int i=0;i<inp.length-round;i++){
					if(inp[i]<inp[i+1]){
						reg = inp[i];
						inp[i] = inp[i+1];
						inp[i+1]=reg;
						swap = true;
					}
					c++;
				}
			}
		}
		if(flag == 1) {
			System.out.print("[ ");
			for(int i=0;i<inp.length;i++) {
				System.out.print(inp[i]);
				line = new Rectangle(i*0.75,y,0.1,inp[i]);
				line.draw();
				if(i<inp.length-1){System.out.print(", ");}
			}
			System.out.println(" ]");
			System.out.println("Comparisons: "+c);
		}
	}
	
	//comb sort
	public static void combD(int flag, double[] inp, int hand, int y) {
		int gap = inp.length;
		boolean swap = true;
		double reg;
		int c=0;
		Rectangle line;
		if(hand==0 || hand!=1) {
			while(swap){
				swap = false;
				gap = (int) (gap / 1.3);
				if((gap==9)||(gap==10)){gap=8;}
				if(gap<1){gap=1;}
				for(int i=0;i<inp.length-gap;i++){
					if(inp[i]>inp[i+gap]){
						reg = inp[i];
						inp[i] = inp[i+gap];
						inp[i+gap]=reg;
						swap = true;
					}
					c++;
				}
			}
		}
		else if(hand==1) {
			while(swap){
				swap = false;
				gap = (int) (gap / 1.3);
				if((gap==9)||(gap==10)){gap=8;}
				if(gap<1){gap=1;}
				for(int i=0;i<inp.length-gap;i++){
					if(inp[i]<inp[i+gap]){
						reg = inp[i];
						inp[i] = inp[i+gap];
						inp[i+gap]=reg;
						swap = true;
					}
					c++;
				}
			}
		}
		if(flag == 1) {
			System.out.print("[ ");
			for(int i=0;i<inp.length;i++) {
				System.out.print(inp[i]);
				line = new Rectangle(i*0.75,y,0.1,inp[i]);
				line.draw();
				if(i<inp.length-1){System.out.print(", ");}
			}
			System.out.println(" ]");
			System.out.println("Comparisons: "+c);
		}
	}
	
	//merge arrays
	public static int merge(double[] inp, int left, int mid, int right) {
		int k = left;
		int c = 0;
		int n1 = mid - left + 1;
		int n2 = right - mid;
		double[] L = new double[n1];
		double[] R = new double[n2];
		for(int i=0;i<n1;i++) {L[i]=inp[left+i];}
		for(int j=0;j<n2;j++) {R[j]=inp[mid+1+j];}
		
		int i = 0;
		int j = 0;
		while((i<n1)&&(j<n2)) {
			if(L[i]<=R[j]) {
				inp[k] = L[i];
				i++;
			}
			else {
				inp[k] = R[j];
				j++;
			}
			k++;
			c++;
		}
		while(i<n1) {
			inp[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			inp[k] = R[j];
			j++;
			k++;
		}
		return c;
	}
	
	public static int mergeSort(double[] inp, int left, int right) {
		if(left<right) {
			int mid = left+(right-left)/2;
			mergeSort(inp,left,mid);
			mergeSort(inp,mid+1,right);
			cou+=merge(inp,left,mid,right);
		}
		return cou;
	}
	
	public static void arrayprint(double[] inp, int y, int c) {
		Rectangle line;
		System.out.print("[ ");
		for(int i=0;i<inp.length;i++) {
			System.out.print(inp[i]);
			line = new Rectangle(i*0.75,y,0.1,inp[i]);
			line.draw();
			if(i<inp.length-1){System.out.print(", ");}
		}
		System.out.println(" ]");
		System.out.println("Comparisons: "+c);
	}
}