public class House {
    private int floors;
    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasGarden;

    // Приватный конструктор — создаём объект только через Builder
    private House(HouseBuilder builder) {
        this.floors = builder.floors;
        this.hasGarage = builder.hasGarage;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", hasGarage=" + hasGarage +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    // ======== Builder ========
    public static class HouseBuilder {
        private int floors;
        private boolean hasGarage;
        private boolean hasPool;
        private boolean hasGarden;

        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}