import java.util.Scanner;

import javax.swing.JOptionPane;

public class TRLApp {

	public static void main(String[] args) {
	
		Scanner scaner=new Scanner(System.in);
		String inputID="";
		String inputName="";
		System.out.println("Please input worker id");
		inputID=scaner.next();
		System.out.println("Please input worker name");
		inputName=scaner.next();
		Worker worker=new Worker(inputName,inputID);
		worker.startNewSession();
		System.out.println("Please input Patron id");
		inputID=scaner.next();
		System.out.println("Please input Patron name");
		inputName=scaner.next();
		Patron patron=new Patron(inputID,inputName);
		
		boolean checkHold=true;
		checkHold=worker.checkHold(inputID);
		if (checkHold==true){
			JOptionPane.showMessageDialog(null, "Alert");
			String holdStatus="Sorry you have a hold. You cannot borrow any book.";
			
			System.out.println("alert");
			System.out.println(holdStatus);
			
		}if(checkHold==false){
			System.out.println("You can check out books.");
			System.out.println("Please enter copy title");
			String title=scaner.next();
			System.out.println("Pleae enter the barcode");
			String barcode=scaner.next();
			Copy copy=new Copy(title,barcode);
		}
		
		
		
	}

}
