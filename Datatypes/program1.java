 class Datatype{

	 public static void main (String[]args){

			char ch;
			ch=65;
							  
		      	System.out.println("ch="+ch);
							             
		     	System.out.println("ch="+ch+1);// ASCII value of 65 is A and 1 adds to the ascii/ unicode value(String)
											
		       
		       	System.out.println("ch="+(ch+1));// Due to () ch considered as int so final ans is in integer 66
		  		
		       
		       	System.out.println("ch="+(char)(ch+1));/* Due to type casting it add 1 to 65 = 66 and unicode of 66 is
								B so final ans is B*/							


	 }											        
 
 }



