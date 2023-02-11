package w3;

public class w32 {
	public static void main(String[] arg) {
		String userWord = "hola";
		int xx = userWord.length;
		String [] charArray = new String [xx];
		charArray = userWord.split("");
		
		
		for (int i =0; i < charArray.length; i++){
		    System.out.println(charArray [i]);
		}
		
	}		
}
