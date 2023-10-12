package flower.store;

public enum FlowerType {
    CHAMOMILE("chamomile"), ROSE("rose"), TULIP("tulip");

    private final String stringRep;

    FlowerType(String stringRep) {
        this.stringRep = stringRep;
    }

    @Override
    public String toString() {
        return stringRep;
    }
}
