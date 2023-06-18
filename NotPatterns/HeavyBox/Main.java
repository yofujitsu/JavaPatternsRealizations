package NotPatterns.HeavyBox;

class HeavyBox {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

interface BoxConsumer {
    void accept(HeavyBox box);

    default BoxConsumer andThen(BoxConsumer after) {
        return box -> {
            accept(box);
            after.accept(box);
        };
    }
}

public class Main {
    public static void main(String[] args) {
        HeavyBox box = new HeavyBox(50);

        BoxConsumer shipmentConsumer = b -> System.out.println("Отгрузили ящик с весом " + b.getWeight());
        BoxConsumer sendingConsumer = b -> System.out.println("Отправляем ящик с весом " + b.getWeight());

        BoxConsumer combinedConsumer = shipmentConsumer.andThen(sendingConsumer);
        combinedConsumer.accept(box);
    }
}

