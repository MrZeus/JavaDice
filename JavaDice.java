package javadice;
import java.util.Random;
public class JavaDice{

	public static void main(String[] args){
		Random randomize = new Random();
	int en, två, tre, fyra, fem, sex;
	en = två = tre = fyra = fem = sex = 0;
	
	for( int får1 = 0; får1 <= 1000; får1++){
		int dice = randomize.nextInt(6)+1;
	    
		switch(dice){
		case 1:
			en++;
		    break;
		case 2:
			två++;
			break;
		case 3:
			tre++;
		    break;
		case 4:
			fyra++;
			break;
		case 5:
			fem++;
			break;
		case 6:
			sex++;
			break;
			
			
		}
		
	}
	youtube("Here are the results!");
	youtube("1: "+ en+" times");
	youtube("2: "+ två+" times");
	youtube("3: "+ tre+" times");
	youtube("4: "+ fyra+" times");
	youtube("5: "+ fem+" times");
	youtube("6: "+ sex+" times");
	}
	public static void youtube(String d){
		System.out.println(d);
	}
}
