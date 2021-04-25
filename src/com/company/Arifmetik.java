package com.company;

public class Arifmetik {
    int Firsts;
    int Seconds;
    String x;
       public Arifmetik (int Ferst, String operation,int Second  ) {
           Firsts = Ferst;
           x = operation;
           Seconds = Second;

    }
    public int Arif() throws Exception {
           if (Firsts>0 && Firsts<11 && Seconds>0 && Seconds<11){
               switch (x){
                   case ("-"):
                       return Firsts-Seconds;
                   case ("+"):
                       return Firsts+Seconds;
                   case ("*"):
                       return Firsts*Seconds;
                   case ("/"):
                       return Firsts/Seconds;
                   default:
                       throw new Exception();
               }
           }else {
               throw new Exception("Одно из чисел превышает 10, меньше 1 или неверная арифмитическая операция");
           }

    }

}
