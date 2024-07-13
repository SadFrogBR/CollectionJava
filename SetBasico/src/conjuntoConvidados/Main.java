package conjuntoConvidados;

public class Main {

	public static void main(String[] args) {
		ConjuntoConvidados cc = new ConjuntoConvidados();
		
		cc.adicionarConvidado("samuel", 1);
		cc.adicionarConvidado("jose", 2);
		cc.adicionarConvidado("leo", 3);
		cc.adicionarConvidado("josimar", 4);
		cc.exibeConvidados();
		System.out.println(cc.contarConvidados());
		cc.removerConvidadoPorCodigoConvite(2);
		cc.exibeConvidados();
		System.out.println(cc.contarConvidados());
		

	}

}
