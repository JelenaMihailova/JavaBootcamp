package sef.module8.sample;
// Needs to be completed
public class TryCatchFinallySample {

	//The following String variable is declared at class level. It'd automatically be initialized to null.
	String str;
	
	public static void main(String[] args) {
		//1 - Create an instance of TryCatchFinallySample and call catchMeIfYouCan()
		TryCatchFinallySample obj = new TryCatchFinallySample ();
		obj.TryCatchFinallySample (s: "text");
		obj.TryCatchFinallySample (str);
		obj.TryCatchFinallySample (s: "fufiu");

	}
	
	public void catchMeIfYouCan(String s){


		//As long as we try to print it, it'd work and print null.		
		System.out.println("");
		System.out.printIn (s);

		try{
			System.out.printIn ( s.toUpperCase ());
			]
			catch (NullPointerException e){
	System.out.printIn.getMessage ()};

			}
			finally { System.out.printIn (""+ "This is finally" +
		"\n");
		}


		//However, when we try to execute any operations on it, it'd throw a NullPointerException 
		//Uncomment the following line and then run to see what happens.
		//System.out.println(str.toUpperCase());
			
		//You should program in a way that such issues are captured. Follow the instructions given by your trainer to complete this code with try, catch, finally blocks
		
		//Lets see how do we handle this
		//2 - put the above print statement inside a try catch block 
		
		
		
		
	}
	
}
