package jh.codetest;

public class WeightClassName {
    private double weight;
    private String wClassName; // 체급 이름.

    public WeightClassName(double weight, String wClassName){
        this.weight = weight;
        this.wClassName = wClassName;
    }

    public double getWeight() {
        return weight;
    }

    public String getwClassName() {
        return wClassName;
    }
}
