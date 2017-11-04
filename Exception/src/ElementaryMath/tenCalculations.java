package ElementaryMath;
import java.util.*;

import javax.swing.*;
public class tenCalculations {
	private static final int DEFAULT_LOWERBOUND = 0;
	private static final int DEFAULT_UPPERBOUND = 99;
	private static final char[] list2 = {'/','*','+','-'};
	private List list1, list3;
	
	
	public tenCalculations()
	{
		this(DEFAULT_LOWERBOUND, DEFAULT_UPPERBOUND);
	}
	public tenCalculations(int low, int up){
		setRandomNumbers(low, up);
		setRandomOperator();
		System.out.println(list1);
		System.out.println(list3);
	}
	public void setRandomNumbers(int low, int up){
		list1 = new ArrayList();
		int range = up - low + 1;
		for(int i = 0; i < 10; i++){
			Random ranNum = new Random();
			int num = ranNum.nextInt(range) + low;
			list1.add(num);
		}
	}
	public void setRandomOperator(){
		list3 = new ArrayList();
		String operator;
		for(int i = 0; i < 5; i++){
			Random number = new Random();
			int randNum = number.nextInt(4);
			//System.out.println(list2[randNum]);
			list3.add(list2[randNum]);
		}
	}
	public void calculate() throws Exception{
		int j = 0;
		int count = 0;
		double percent=0.0;
		for(int i=0; i < 10 && j <5 ; i = i +2){
			int a = (int)list1.get(i);
			int b = (int)list1.get(i+1);
			int temp = 0;
			if(b==0){
				if(a != 0 && (char)list3.get(j) == '/'){
					temp = a;
					a = b;
					b = temp;
				}
			}
			if(a < b && (char)list3.get(j) == '-'){
				temp = a;
				a = b;
				b = temp;

			}
			boolean keepGoing = true;
			int ans =0;
			int result = operator(a, b, (char)list3.get(j));
			while(keepGoing){
				String answer = JOptionPane.showInputDialog(null, "Calculate this "+ a + " "+list3.get(j)+" "+b);
				try{
					ans = Integer.parseInt(answer);
					keepGoing = false;
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "'"+answer+ "' is invalid\n"+"Please enter digits only");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			
			//System.out.println(result + " " + ans);
			j++;
			if(ans == result){
				JOptionPane.showConfirmDialog(null, "Correct");
				count ++;
			}else{
				JOptionPane.showConfirmDialog(null, "Incorrect");
			}
		}
		percent = (100*count/5);
		JOptionPane.showMessageDialog(null, "Congradulation, you finished the test with " +  percent+" %");
	}
	public int operator(int a, int b, char op){
		int temp =0;
		//System.out.println(a + " "+b+ " " +op);
		switch(op){
		case '+': temp = a + b; 
				break;
		case '*':
				
			temp = a*b;
				break;
		case '/':temp = a/b;
				break;
		case '-':
			
			temp = a-b;
				break;
		default: temp = 0;
				break;
		}
		//System.out.println(temp);
		return temp;
	}
}
