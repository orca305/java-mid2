package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.UnitUtil;
import generic.test.ex3.unit.Zealot;

public class UnitUtilTest {

    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 45);
        Marine resultMarine = UnitUtil.maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);

        Zealot zealot1 = new Zealot("질럿1", 150);
        Zealot zealot2 = new Zealot("질럿2", 160);
        Zealot resultZealot = UnitUtil.maxHp(zealot1, zealot2);
        System.out.println("resultZealot = " + resultZealot);
    }
}
