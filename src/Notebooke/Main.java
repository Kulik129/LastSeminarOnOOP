package Notebooke;

import Notebooke.impl.BasePC;


public class Main {
    public static void main(String[] args) {
        BasePC mashine = new BasePC();
        System.out.println(mashine.getCPU("M1"));

        StringBuilder pc = new StringBuilder();
        pc.append("setSsd(\"8\")");
        pc.append("setRam(\"256\")");
        pc.append("setCpu(\"M1\")");

        System.out.println(pc.toString());

    }
}
