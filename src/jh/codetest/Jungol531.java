package jh.codetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Jungol531 {
    public static void main(String[] args){
        //복싱체급은 몸무게가
        //50.80kg 이하를 Flyweight,
        //61.23kg 이하를 Lightweight,
        //72.57kg 이하를 Middleweight,
        //88.45kg 이하를 Cruiserweight,
        //88.45kg 초과를 Heavyweight
        //라고 하자.
        //몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
        
        // 몸무게 입력
        System.out.println("몸무게를 입력하시오");
        Scanner sc = new Scanner(System.in);
        double kg = sc.nextDouble();

        ArrayList<WeightClassName> wl = new ArrayList<WeightClassName>();
        wl.add(new WeightClassName(50.80, "Flyweight"));
        wl.add(new WeightClassName(61.23, "LightWeight"));
        wl.add(new WeightClassName(72.57, "MiddleWeight"));
        wl.add(new WeightClassName(88.45, "Cruiserweight"));
        wl.add(new WeightClassName(88.46, "Heavyweight"));
        printWeightClassName(kg, wl);
    }

    private static void printWeightClassName(double kg,
                                             ArrayList<WeightClassName> wl) {
        for(WeightClassName w : wl){
            if(kg <= w.getWeight()){
                System.out.println(w.getwClassName());
                return;
            }
        }
    }
}
