package codebreaker;

public class codeBreaker {
	
	public String adivinar(String numero) {
		if(numero.length()>4 || numero.length()<4) {
			return "Falso";
		}
		if((numero.matches("[a-zA-Z]+"))){
			return "Falso";
		}
		String num = "1234";
		char b = ' ';
		char c = ' ';	
		String respuesta = "";
		
		for (int i = 0; i< numero.length(); i++) {
			b = numero.charAt(i);
			for(int j = 0; j < num.length(); j++) {
				c = num.charAt(j);
				if(b == c && i == j) {
					respuesta = respuesta+"X";
					//System.out.println("hola");
				}
				else if(b== c && i!=j){
					respuesta = respuesta+"_";
					//System.out.println("askldjh");
				} 
			}
		}
		
		return respuesta;
		
		
	}

}
