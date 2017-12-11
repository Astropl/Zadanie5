package Zadanie5;

import java.util.Scanner;

/*
Zadanie 5. W sklepie ze sprzętem AGD oferowana jest sprzedaż
ratalna. Napisz program umożliwiający wyliczenie wysokości
miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla
programu są:
• cena towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).
Kredyt jest oprocentowany w zależności od liczby rat:
• od 6–12 wynosi 2.5% , • od 13–24 wynosi 5%, • od 25–48 wynosi
10%.
Obliczona miesięczna rata powinna zawierać również odsetki.
Program powinien sprawdzać, czy podane dane mieszczą się w
określonych powyżej zakresach, a w przypadku błędu pytać prosić
użytkownika ponownie o podanie danych.
 */
public class AgdOdsetki
{
    public static void main(String[] args) {
        int cenaTowaru = 0;
        int liczbaRat = 0;
        int odsetki = 1;
        double oprocentowanie = 0;

        // podaj cene towaru
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while ( i == 0)
        {   i++;
        System.out.println(" Podaj cene towaru : ( od 100 zł do 10 tys. zł ");
        cenaTowaru = sc.nextInt();
        {
        if ((cenaTowaru<100) || (cenaTowaru > 10000))
        {
            System.out.println(" Zły zakres ceny");
            //return;
            i=0;
        }}
        }

        System.out.println(" Podaj ilosc rat ( od 6 do 48");
        liczbaRat = sc.nextInt();
        if ((liczbaRat< 6)||(liczbaRat>48))
        {
            System.out.println(" Zła ilosc rat !!");
            return;
        }
        else
        {
            if ( (liczbaRat >5) && ( liczbaRat <12))
            {
                oprocentowanie = 0.025;

            }
            else if ( (liczbaRat >13) && ( liczbaRat <24))
            {
                oprocentowanie = 0.05;

            }
            else if ( (liczbaRat >25) && ( liczbaRat <48))
            {
                oprocentowanie = 0.10;

            }
        }


        System.out.println(" Cena Towaru : " + cenaTowaru);
        System.out.println(" Twoje Odsetki to " + odsetki);
        System.out.println(" oprocentowanie wynosi " + oprocentowanie);
        System.out.println(" Twoja rata wynosi :" + ( (cenaTowaru/liczbaRat) * oprocentowanie + odsetki));


    }
}
