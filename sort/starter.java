import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		int c = 1;
		int flag = 0b1111111111;
		int randn = 50;
		Rectangle line;
		double[] arr = new double[512];
		nMath tnum = new nMath(0);
		System.out.print("\n\nGenerating random list...\n");
		for(int i=0;i<arr.length;i++) {
			arr[i] = tnum.rand(flag,randn,c);
			line = new Rectangle(i*0.75,20,0.1,arr[i]);
			line.draw();
			Canvas.pause(1);
			c += System.currentTimeMillis();
		}
		double[] arrr = Arrays.copyOf(arr,arr.length);
		double[] arrrr = Arrays.copyOf(arr,arr.length);
		double[] arrrrr = Arrays.copyOf(arr,arr.length);
		System.out.print("Done!\n\n");
		System.out.println("\n\nBubble Sorted Array:\n");
		Sorts.bubbleD(1,arr,0,randn+30);
		System.out.println("\n\nComb Sorted Array:\n");
		Sorts.combD(1,arrr,0,2*randn+40);
		System.out.println("\n\nMerge Sorted Array:\n");
		Sorts.arrayprint(arrrr,3*randn+50,Sorts.mergeSort(arrrr,0,arrrr.length-1));
		System.out.println("\n\nSelection Sorted Array:\n");
		Sorts.selectSort(1,arrrrr,4*randn+60);
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
