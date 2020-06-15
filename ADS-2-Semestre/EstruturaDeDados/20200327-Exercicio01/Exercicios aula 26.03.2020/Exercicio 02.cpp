//ex2. construa uma estrutura de dados que receba do usuário um nome, 
//calcule e retorne quantas letras tem esse mesmo nome e imprima a o nome na ordem inversa.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h> 

#define MAX 100

int main(void)
{
    char nome[MAX], aux, invertido[MAX], tamanhoaux;
    int tamanho, i, j;
   
    printf("Digite seu nome: ");
    //scanf_s("%s", nome);
    fgets(nome, MAX, stdin);

    printf("%s", nome);

    tamanho = (strlen(nome)-1);
    
    printf("Tamanho do vetor de string: %i.\n\n", tamanho);

    for (i = tamanho-1; i >= 0; i--) {

        printf("%c", nome[i]);
    }
}

   
    //return 0;
