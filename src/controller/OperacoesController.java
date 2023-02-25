package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	//Exercício de Fatorial Recursivo, a cada nova chamada da função 
	//irá sempre diminuir em 1 do valor do inteiro escolhido e verificar se
	//o novo valor é igual a 0, armazenando em "Camadas" os
	//resultados obtidos a cada subtração.
	//a função irá parar de se chamar quando o número inteiro escolhido (x) chegar a 0,
	//assim retornando os resultados, um a um, fazendo as multiplicações 
	//com os números obtidos ao decorrer das chamadas, 
	//entregando o resultado dessas multiplicações.
	public int Fatorial(int x) {
		if(x == 0) {
			return 1;
		}else{
			return x * Fatorial (x-1);
		}
	}
	//Exercício de Verificação de Números Inteiros Negativos em um Vetor,
	//a função irá verificar se o tamanho do vetor é maior que 0, sendo maior
	//ele irá verificar se o conteúdo contido naquela posição em específico
	//(Índice/Posição 1 por exemplo) é menor que 0(tornando o Número contido 
	//naquela(e) índice/posição negativo) caso seja menor,
	//a função irá se chamar mais uma vez, somando em 1,
	//quando o índice/posição chegar a 0, a função irá fazer as adições de quantas
	//vezes ela somou em 1 a Qtd. de Números Negativos, entregando o Resultado.
	public int VetNegativo(int[] Vet, int Len) {
		if(Len < 0) {
			return 0;	
		}else if(Vet[Len] < 0){
			return 1 + VetNegativo(Vet, Len - 1);
		}
		return VetNegativo(Vet, Len - 1);
	}
	//Exercício de verificação de Qtd. de digitos, a função irá verificar 
	//se o número escolhido é menor que o contador (1),
	//caso for, a função retorna 1, caso não for, o contador irá ser 
	//multiplicado por 10 e a cada laço será somado em 1 na função, 
	//retornando o valor dividido por 10, a função
	//fará isso até não puder mais dividir por 10, assim retornando 
	//a Qtd de vezes que ela dividiu por 10, somando os digitos
	//do número escolhido.
	public int Digitos(int x) {
		int con = 1;
		if (x <= con || x < 10) {
			return 1;
		}else if(x >= con) {
			con = con*10;
			return 1 + Digitos(x/10);
		}
		return Digitos(x);
	}
	//Exercício de inverter uma Inverter uma string 
	//utilizando método recursivo e substring, a função irá coletar
	//a última letra da String primeiro, depois o restante dela
	//até não restar mais caractéres na String, quando
	//isso ocorrer, a função irá reescrever cada caractér denovo
	//na ordem que foram coletados(do fim para o ínicio) e mostrará o 
	//resultado em seguida.
	public String Inverte(String Str) {
		if (Str == "") {
			return Str;
		}else{
			return Str.charAt(Str.length()-1) + Inverte(Str.substring(0, Str.length()-1));
		}
	}
}	