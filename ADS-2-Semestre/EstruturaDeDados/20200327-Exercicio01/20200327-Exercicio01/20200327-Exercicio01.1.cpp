#include <stdio.h>

#define MAX 100

int main() {
    int n,               /* numero de elementos da sequencia  */
        i, j,
        comp,              /* comprimento corrente do vetor seq */
        conta, vezes;
    float seq[MAX];

    printf("\nDigite o numero de elementos da sequencia: ");
    scanf("%d", &n);
    printf("Digite uma sequencia de %d numeros reais: ", n);
    for (i = 0; i < n; i++)
        scanf("%f", &seq[i]);
    for (i = 0; i < n; i++) {
        /* conta o numero de vezes que seq[i] aparece no vetor a partir da posição i */
        vezes = 1;
        j = i + 1;
        while (j < n)
            if (seq[j] != seq[i])
                j++;
            else {
                vezes++;
                /* quando repete, remove */
                n--;
                seq[j] = seq[n];
            }
        printf("%f ocorre %d vezes\n", seq[i], vezes);
    }
    return 0;
}