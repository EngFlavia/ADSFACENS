//Ex3 . Fa�a um programa que leia duas strings (de tamanho m�ximo 40). Ap�s isso, 
//o programa deve concatenar as informa��es lidas e mostrar o resultado para o usu�rio.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

#define MAX 40

int main(void)
{
    char primeirafrase[40], segundafrase[40], frasefinal[80];
            
    printf("Forne�a a primeira frase: ");
    scanf("%s", primeirafrase);
          
    printf("Forne�a a segunda frase: ");
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