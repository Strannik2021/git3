package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public void input() throws Exception {
        System.out.println("Input:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arifm = reader.readLine().split(" ");
        if(bool(arifm[0]) ) {
            String a = arifm[1];

            Arifmetik y = new Arifmetik (Integer.parseInt(arifm[0]),a,Integer.parseInt(arifm[2]));
            System.out.println("Output :");
            System.out.println(y.Arif());


        }else {
            Roman roman=new Roman();
            int first = roman.rim(arifm[0] );
            int second = roman.rim(arifm[2] );
            Arifmetik y = new Arifmetik (first,arifm[1],second);
            System.out.println("Output :");
            System.out.println(ToRoman(y.Arif()));

        }

    }
    public static String ToRoman (int x) { // Подаем на вход результат арифметической операции
        if (x>101 || x<1 ) {
            return "0";

        }
        String s = "";

        while (x>=100) {
            s = s+"C";
            x = x - 100;

        }
        while (x>=90) {
            s =s+"XC";
            x = x-90;

        }
        while (x>=50) {
            s = s +"L";
            x = x-50;
        }
        while (x>=40) {
            s = s +"XL";
            x = x -40;
        }
        while (x>=10){
            s = s + "X";
            x = x- 10;
        }
        while (x>=9){
            s = s +"IX";
            x = x-9;

        }
        while (x>=5){
            s = s +"V";
            x = x -5;

        }
        while (x>=4){
            s = s +"IV";
            x = x -4;
        }
        while (x>=1){
            s = s + "I";
            x = x -1;
        }
        return s;

    }
    private boolean bool (String z) {
        String[] s = {"0","1","2","3","4","5","6","7","8","9","10"};
        for (int i =0; i<11;i++) {
            if(s[i].equals(z))    {
                return true;
            }


        }
        return false;
    }
}
