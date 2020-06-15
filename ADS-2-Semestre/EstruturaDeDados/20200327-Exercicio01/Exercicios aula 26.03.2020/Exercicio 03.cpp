//Ex3 . Faça um programa que leia duas strings (de tamanho máximo 40). Após isso, 
//o programa deve concatenar as informações lidas e mostrar o resultado para o usuário.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

#define MAX 40

int main(void)
{
    char primeirafrase[40], segundafrase[40], frasefinal[80];
            
    printf("Forneça a primeira frase: ");
    scanf("%s", primeirafrase);
          
    printf("Forneça a segunda frase: ");
    scanf("%s", segundafrase);

    strcpy(frasefinal,primeirafrase);
    strcat(frasefinal, " ");
    strcat(frasefinal, segundafrase);
    strcat(frasefinal, "\n");

    //printf("%s %s", primeirafrase ,segundafrase ); Sem concatenar

    printf("%s", frasefinal);

    system("PAUSE");
    return 0;
}