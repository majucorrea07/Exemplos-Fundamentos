package fundamentos;

public class Fundamento {

	public static void main(String[] args) {
		var f = 109;
		final var fc = 32;
		final var cc = 5.0/9.0;
		
		double c = ((f-fc)* (cc));
		
		System.out.println("A temperatura em fahrenheit é: " 
		+ f + " A temperatura em celsius é: " + c);

	}

}
