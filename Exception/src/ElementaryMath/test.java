package ElementaryMath;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tenCalculations cal = new tenCalculations(0,9);
		try{
			cal.calculate();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error");
		}
		
	}

}
