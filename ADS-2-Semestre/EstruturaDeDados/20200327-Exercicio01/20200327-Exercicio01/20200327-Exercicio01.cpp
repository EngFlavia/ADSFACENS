// 20200327-Exercicio01.cpp : This file contains the 'main' function. Program execution begins and ends there.


#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int main()
{
    int n, i, j, vezes;
    float seq[MAX];

    printf("Forneça o comprimento do vetor: ");
    scanf_s("%d", &n);
    printf("\n");    

    for (i = 0; i < n; i++) {
        printf("Forneça a sequencia de %d numeros inteiros: ", n);
        scanf_s("%f", &seq[i]);
    }

    printf("\n O vetor formado foi : ");

    for (i = 0; i < n; i++) {
        printf("%.0f , ", seq[i]);
        
    }
    printf("\n");
    for (i = 0; i < n; i++) {
        
        vezes = 1;
        j = i + 1;
        while (j < n)
            if (seq[j] != seq[i])
                j++;
            else {
                vezes++;
                
                n--;
                seq[j] = seq[n];
            }
        printf("\n");
        printf("O vetor %.0f ocorre %d vezes\n", seq[i], vezes);
    }
    return 0;
    printf("\n");
    

}