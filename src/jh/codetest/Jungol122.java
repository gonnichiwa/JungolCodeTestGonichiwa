package jh.codetest;

import java.util.Scanner;

public class Jungol122 {
    public static void main(String[] args){
        // 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
        // http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=22&sca=1050
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        if(isLeapYear(x)){
            System.out.println("leap year");
        } else {
            System.out.println("common year");
        }
    }

    private static boolean isLeapYear(int year) {
        return year%400==0||(year%4==0&&year%100!=0);
    }
}
