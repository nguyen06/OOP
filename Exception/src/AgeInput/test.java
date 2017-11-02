package AgeInput;

import javax.swing.*;
import java.util.*;
public class test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		GregorianCalendar today;
		int age, thisYear, bornYr, answer;
		age = 0;
		boolean keepGoing= true;
		while(keepGoing){
			try{
				AgeInput input = new AgeInput();
				age = input.getAge("How old are you");
				keepGoing=false;
			}catch(myException e){
				//through myException because it can show move detail of exception
				JOptionPane.showMessageDialog(null, "Error: "+ e.value()+" is Enter. It is out side the value range of [ " + e.lowerBound() +", "+ e.upperBound() +" ]");
			}
		}
		
		today = new GregorianCalendar();
		thisYear = today.get(Calendar.YEAR);
		
		bornYr = thisYear - age;
		answer = JOptionPane.showConfirmDialog(null, "Already had your birthday this year?"," ",JOptionPane.YES_NO_OPTION);
		
		if(answer == JOptionPane.NO_OPTION){
			bornYr --;
		}
		JOptionPane.showMessageDialog(null, "You are born in " + bornYr);
		
	}

}
