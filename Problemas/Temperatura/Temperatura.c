#include <stdio.h>

int main(void)
{
    /* Compile with C99 */
    int temp=0;

    asm
    (   ".intel_syntax;"
        "mov %0, 69;"
        ".att_syntax;"
        : "=r"(temp)
        :                   /* no input*/
    );
    printf("temp=%d\n", temp);
}

  /* int nInput; */
  /* scanf("%i", &nInput); */
  /* int i; */
  /* for (i = 0; i < nInput; i++) */
  /*   { */
  /*     int nTemperaturas; */
  /*     scanf("%i", &nTemperaturas); */
  /*     int temperaturas[nTemperaturas]; */
  /*     int j; */
  /*     for (j = 0; j < nTemperaturas; j++) */
  /*       { */
  /*         scanf("%i", &temperaturas[j]); */
  /*       } */
  /*     int nValles = 0; */
  /*     int nPicos = 0; */
  /*     for (j = 1; j < nTemperaturas - 1; j++) */
  /*       { */
  /*         if (temperaturas[j - 1] < temperaturas[j] && temperaturas[j] > temperaturas[j + 1]) { */
  /*           nPicos++; */
  /*         } */
  /*         if (temperaturas[j - 1] > temperaturas[j] && temperaturas[j] < temperaturas[j + 1]) { */
  /*           nValles++; */
  /*         } */
  /*       } */
  /*     printf("%i %i\n", nPicos, nValles); */
  /*   } */
