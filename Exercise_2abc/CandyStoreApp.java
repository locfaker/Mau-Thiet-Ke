public class CandyStoreApp {
    public static void main(String[] args) {
        CandyStore store = new ChocolateStore();
        store.orderCandy();

        store = new HardCandyStore();
        store.orderCandy();
    }
}

interface Candy {
    void prepare();
}

class Chocolate implements Candy {
    public void prepare() {
        System.out.println("Đang chuẩn bị Socola...");
    }
}

class HardCandy implements Candy {
    public void prepare() {
        System.out.println("Đang chuẩn bị Kẹo cứng...");
    }
}

abstract class CandyStore {
    public void orderCandy() {
        Candy candy = createCandy();
        candy.prepare();
    }

    public abstract Candy createCandy();
}

class ChocolateStore extends CandyStore {
    public Candy createCandy() {
        return new Chocolate();
    }
}

class HardCandyStore extends CandyStore {
    public Candy createCandy() {
        return new HardCandy();
    }
}
