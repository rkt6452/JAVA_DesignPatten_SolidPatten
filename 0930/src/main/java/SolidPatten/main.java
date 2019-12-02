package SolidPatten;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CalculatePayMachine cp = new CalculatePayMachine();//SRP¸¦ À§¹è
		PayGUI pG = new PayGUI(new PayCalculator1()); 
		PayGUI pG2 = new PayGUI(new PayCalculatorGOOGLE());
		
	}
}
