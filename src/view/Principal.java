package view;
import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int opc = 0;
		//Menu de Exercícios
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Exercício:\n1 - Ex 1\n2 - Ex 2\n3 - Ex 3\n4 - Ex 4\n9 - FIM"));
			switch(opc) {
			//Chamada do Exercício 1
			case 1:int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número (Limite = 12) "));
			if(a <= 12) {
				JOptionPane.showMessageDialog(null, "Resultado do Fatorial do Número ["+a+"] ==> "+op.Fatorial(a));
			}else{
				JOptionPane.showMessageDialog(null, "Digite um Número MENOR ou IGUAL a 12!");
			}
			break;
			//Chamada do Exercício 2
			case 2:int[] Vet = new int [5];
			int Len = Vet.length;
			for (int i = 0; i < Vet.length; i++){
			Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Índice "+i+" :"));
			}
			JOptionPane.showMessageDialog(null, "Número de Números Negativos ==> "+op.VetNegativo(Vet, Len - 1));
			break;
			//Chamada do Exercício 3
			case 3:int X = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro: "));
			JOptionPane.showMessageDialog(null, "O Número "+X+" Possui ==> "+op.Digitos(X)+" Digito(s)");
			break;
			///Chamada do Exercício 4
			case 4: String str = JOptionPane.showInputDialog("Escreva a Palavra para Inverter: ");
			JOptionPane.showMessageDialog(null, "A palavra "+str+" Invertida é ==> "+op.Inverte(str));
			break;
			//FECHAR MENU
			case 9:JOptionPane.showMessageDialog(null, "FIM");
			break;
			default:JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
			}
		}
	}
}
