package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String word = "javalove";
    public static void main(String arg[]){

        Scanner input = new Scanner(System.in);


        System.out.println(" Угадайка слов");
        int lengthWord = word.length();
        String maskWord = "-".repeat(lengthWord);
        System.out.println(maskWord);

        do{
            System.out.println("Введите букву: ");
            char c = input.next().charAt(0);
            if(word.indexOf(c) >= 0){
                System.out.println("Удача");
                for(char elem: word.toCharArray()){
                    if(elem == c){
                        maskWord = replaceBu(c, maskWord);
                    }
                }
                System.out.println(maskWord);
            }
            else{
                System.out.println("Промах,попроуй еще раз");
                System.out.println(maskWord);
            }
        }while(1 == 1);
    }
    public static String replaceBu(char c, String maskWord){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < maskWord.length(); i++){
            if(maskWord.charAt(i) == c){
                stringBuilder.append(c);
            }
            else if(maskWord.charAt(i) != '-'){
                stringBuilder.append(maskWord.charAt(i));
            }
            else{
                stringBuilder.append('-');
            }
        }
        return stringBuilder.toString();
    }
}