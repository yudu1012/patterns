public class Main {
    public static void main(String[] args) {
        // Строим обычный дом
        House house1 = new House.HouseBuilder()
                .setFloors(2)
                .setGarage(true)
                .setGarden(true)
                .build();

        // Строим дом с бассейном
        House house2 = new House.HouseBuilder()
                .setFloors(3)
                .setGarage(false)
                .setPool(true)
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
