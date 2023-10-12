package flower.store;


public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("red"), PINK("pink"), WHITE("white");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
    
}
