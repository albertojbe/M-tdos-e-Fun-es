#include <stdio.h>
char operador;
float num1, num2;

float somador(float *n1, float *n2){
	return *n1 + *n2;
}
float subtracao(float *n1, float *n2){
    return *n1 - *n2;
}
float multiplicacao(float *n1, float *n2){
    return *n1 * *n2;
}
float divisao(float *n1, float *n2){
    return *n1 / *n2;
}

void operacao(char operador){
    switch (operador) {
    	case '+':
        	printf("Resultado: %.2f\n", somador(&num1, &num2));
        	break;
    	case '-':
        	printf("Resultado: %.2f\n", subtracao(&num1, &num2));
        	break;
    	case '*':
        	printf("Resultado: %.2f\n", multiplicacao(&num1, &num2));
        	break;
    	case '/':
        	if (num2 != 0) {
            	printf("Resultado: %.2f\n", divisao(&num1, &num2));
        	} else {
            	printf("Erro! Divisão por zero.\n");
        	}
        	break;
    	default:
        	printf("Operador inválido.\n");
	}
}

void tela(){
	printf("Digite a operação (+, -, *, /): ");
	scanf("%c", &operador);
	printf("Digite o primeiro número: ");
	scanf("%f", &num1);
	printf("Digite o segundo número: ");
	scanf("%f", &num2);
}

int main() {
	tela();
	operacao(operador);
	return 0;
}
