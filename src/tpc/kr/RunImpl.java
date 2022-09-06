package tpc.kr;

import tpc.RunInterface;

public class RunImpl {

    public static void main(String[] args) {
        RunInterface runInterface = () -> {
            System.out.println("Run!");
            System.out.println("Run2!");
        };
    }
}
