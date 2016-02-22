#include <stdio.h>

int main(int argc, char*argv[]) {
  int primero;
  int segundo;
  int nOp;
  scanf("%d", &nOp);
  while(nOp > 0) {
    scanf("%d %d", &primero, &segundo);
    if ((primero+segundo) >= 0) { puts("SI");}
    else { puts("NO");}
    nOp--;
  }
}
