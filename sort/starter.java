import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		int flag = 0b0111111111;
		
		int[] arr = new int[10];
		nMath tnum = new nMath(0);
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) tnum.rand(flag,10);
			Canvas.pause(1);
			if(i<arr.length-1){
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
		
		Sorts.bubbleI(1,arr,0);
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
