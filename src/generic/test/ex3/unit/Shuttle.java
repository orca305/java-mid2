package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {

    private T t;

    public void in(T t) {
        this.t = t;
    }

    public T out() {
        return t;
    }

    public void showInfo() {
        System.out.println("탑승 유닛 = " + t.getName() + ", hp = " + t.getHp());
    }
}
