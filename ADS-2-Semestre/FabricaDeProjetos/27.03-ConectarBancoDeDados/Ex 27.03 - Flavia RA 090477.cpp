#include <>
#include <stdlib.h>

#define MAX 100

int main (int argc, char *argv[]){
    int n, i, v[MAX];

    printf ("Forneça o comprimento do vetor: ");
    scanf("%d", &n);

    printf ("Forneça a sequencia de %d numeros inteiros: ", n);

    for (i = 0; i < n; i++){
        scanf("%d", &v[i]);

    }
     printf ("%d", v[i]);
}