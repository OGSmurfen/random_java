import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Scanner;

class Click{
	public static void main(String[] args){
		Scanner mscanner = new Scanner(System.in);
		System.out.println("Enter time amount to wait (in seconds)");
		String timeInSecondsString = mscanner.nextLine();
		int timeInSeconds = Integer.parseInt(timeInSecondsString);
		int timeMilliseconds = timeInSeconds*1000;
		
		execution(timeMilliseconds);
		}	
		private static void execution(int timeMilliseconds){
			try{
		Robot robot = new Robot();
		
		Thread.sleep(timeMilliseconds);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		System.out.println("Left click executed");
		}catch(Exception e){e.printStackTrace();}
		}
}