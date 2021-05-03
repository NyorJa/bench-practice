package com.company;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }


       /* int steps = 3;
        String paths= "UDDDUDUUDDDUUUDDDU";
        char[] pathsArr = paths.toCharArray();
        int valleysPassed = 0;
        int lvl = 0;

        for (int i = 0; i < steps; i++) {
            char currentPath = pathsArr[i];
            if (currentPath == 'U') {
                lvl++;
            }

            if (currentPath == 'D') {
                lvl--;
            }

            if (lvl==0 && (currentPath == 'U')) {
                valleysPassed++;
            }
        }


        System.out.println(valleysPassed);*/






//        int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
 /*       int arr[] = {1, 1, 1};
        Arrays.sort(arr);
        List<Integer> pairedInts = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    pairedInts.add(arr[i]);
                    pairedInts.add(arr[j]);
                }
            }
        }
        System.out.println(pairedInts);*/

////        int[] numArr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
//        int[] numArr = {10, 10, 10};
//        int length = 3;
//        Set<Integer> uniqueInt = new HashSet<>();
//        List<Integer> pairedInt = new ArrayList<>();
//        Arrays.sort(numArr);
//
//        int pairs = 0;
//        for (int i = 0; i < length; i++) {
//            int currNum = numArr[i];
////            int beforeNum = numArr[i + 1];
//            if (!uniqueInt.contains(currNum)) {
//                uniqueInt.add(currNum);
//            } else {
////                pairedInt.add(beforeNum);
////                pairedInt.add(currNum);
//                pairs++;
//                uniqueInt.remove(currNum);
//            }
//        }

//        System.out.println(uniqueInt);
//        System.out.println(pairs);
//        System.out.println(pairedInt);

//        List<Integer> dps = list.stream().distinct().filter(entry -> Collections.frequency(list, entry) > 1).collect(Collectors.toList());
//        List<Integer> dps = Arrays.stream(numArr).boxed().collect(Collectors.toList());
//        List<Integer> dpsNew = dps.stream().filter(entry -> Collections.frequency(dps, entry) > 1).collect(Collectors.toList());

//        System.out.println(dps);
//        System.out.println(dpsNew);
/*
        String a = "anagram";
        String b = "margana";

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        if (Arrays.equals(aChar, bChar)) {
            System.out.println("Anagrams!");
        }
*/


    /*    Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int strLength = A.length();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(A);
        String reversedStr = stringBuilder.reverse().toString();;

        if (A.equals(reversedStr)) {
            System.out.println("Palindrome!");
        }*/
/*
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int k=scan.nextInt();
        SortedSet<String> sets=new TreeSet<>();
        for(int i=0;i<=str.length()-k;i++){
            sets.add(str.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());*/

  /*      Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String result = S.substring(start, end);
        System.out.println();*/
//        double vald = 12000;
/*
        String value = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(vald);
        String value = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String value = NumberFormat.getCurrencyInstance(Locale.US).format(vald);
        String value = NumberFormat.getCurrencyInstance(Locale.US).format(vald);*/

/*        LocalDate date = LocalDate.of(2015, 8,05);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        dayOfWeek.toString();*/
/*
        int n= 1;
        String  s = String.valueOf(n);
*/

/*        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if(n >= 2 && n <= 5 ) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();*/


/*        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
         scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/


/*        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            //Complete this line
        }
        System.out.println("================================");*/


//        Scanner scan = new Scanner(System.in);



    }
}
