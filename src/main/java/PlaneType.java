public enum PlaneType {
    BOEING747(657, 488),
    AIRBUS380(1000,600);

    private final int capacity;
    private final int weight;


    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
