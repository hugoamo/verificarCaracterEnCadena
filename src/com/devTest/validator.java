package com.devTest;

public class validator {

    public static void main(String[] args) {

        String a="(1+3)(2+4)";
            int contIzq = 0;
            int contParentDer = 0;
            char temp;
            for (int n = 0; n < a.length(); n++) {
                temp=a.charAt(n);
                if (temp == '(') {
                    contIzq++;
                } else if (temp == ')') {
                    contParentDer++;
                }
            }
            if (contIzq == contParentDer) {
                System.out.println("is correct");
            } else {
                System.out.println("is incorrect");
            }

          //  return "not implemented";
        }

    //}

}
