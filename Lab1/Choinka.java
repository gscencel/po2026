public class Choinka{
public static void main(String[] args){
	String symbol = "*";
	for (int i=1; i<=Integer.parseInt(args[0]); i++){
		for (int j=0; j<i; j++){
			System.out.print("*");
		}
		System.out.println("");
	}
}
}