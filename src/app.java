import util.CifradorHill;

public class app {
	
	public static void main(String[] args) {

		String palavra = "helloworld";
		
		int[][] key = {{2, 3},
				   	   {1, 5}};
		
		int blocoSize = 2;
		
		CifradorHill encriptador = new CifradorHill(key, blocoSize);
		String cifrado = encriptador.cifrar(palavra);
		
		System.out.println("Palavra cifrada: "+cifrado);
		
		String decifrado = encriptador.decifrar(cifrado);
		System.out.println("Palavra decifrada: "+decifrado);
		
	}

}
