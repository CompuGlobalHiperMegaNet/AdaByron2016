#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char*argv[]) {
  char str[2048];
  char *token;
  char *search = " ";
  int primero;
  int segundo;
  int nOp = -1;
  while(fgets (str, 2048, stdin) && nOp != 0){
    if (nOp == -1) { nOp = (int) strtol(str, (char **)NULL, 10); }
    else {
      token = strtok(str, search);
      primero = strtol(token, (char**)NULL, 10);
      token = strtok(NULL, search);
      segundo = strtol(token, (char**)NULL, 10);;
      if (((primero+segundo) >= 0) && ((-10000 <=primero<=10000) || ((-10000 <=segundo<=10000)) )) { puts("SI");}
      else if (((primero+segundo) < 0) && (-10000 <=primero<=10000) || ((-10000 <=segundo<=10000))) { puts("NO");}
      nOp--;
    }
  }
}
