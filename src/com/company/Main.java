package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Result{
    //Metoda ce returneaza ziua aferenta datii respective,pornind de la niste variabile prestabilite
    public static String findDay(int month, int day, int year) {
        LocalDate ld=LocalDate.of(year,month,day);
        java.time.DayOfWeek dayofweek=ld.getDayOfWeek();
        String res=dayofweek.toString();
        return res;
    }
}

//Entry point
public class Main {

    public static void main(String[] args) {
        //Array pentru stocarea informatiilor despre zi,luna si an.
    String data[]=new String[3];
    Scanner sc=new Scanner(System.in);
    //Preluarea input-ului
    System.out.println("First,enter the date here:");
    System.out.print("Day:");
    data[0]=sc.nextLine();
    System.out.print("Month: ");
    data[1]=sc.nextLine();
    System.out.println("Year: ");
    data[2]=sc.nextLine();

    int day=Integer.parseInt(data[0]);
    int month=Integer.parseInt(data[1]);
    int year=Integer.parseInt(data[2]);
    //Stocarea variabilelor din array in variabile intregi si apelul ulterior al metodei definite mai sus
    System.out.println(Result.findDay(month,day,year));


}}
