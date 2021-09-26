import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		int flag = 0b1111111111;
		double[] arr = new double[2000];
		nMath tnum = new nMath(0);
		System.out.print("\n\nGenerating random list...\n");
		for(int i=0;i<arr.length;i++) {
			arr[i] = tnum.rand(flag,10);
			Canvas.pause(1);
		}
		double[] arrr = Arrays.copyOf(arr,2000);
		System.out.print("Done!\n\n");
		System.out.println("\n\nBubble Sorted Array:\n");
		Sorts.bubbleD(1,arr,0);
		System.out.println("\n\nComb Sorted Array:\n");
		Sorts.combD(1,arrr,0);
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
