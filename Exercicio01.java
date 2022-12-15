import java.util.Scanner;
// 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
//pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.  
public class Exercicio01 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("informe a sua idade em anos");

int anos= sc.nextInt();

System.out.println("informe a sua idade em meses");

int meses= sc.nextInt();

System.out.println("informe a sua idade em dias");

int dias= sc.nextInt();

System.out.println (anos*360 + meses*30 + dias );

}}

