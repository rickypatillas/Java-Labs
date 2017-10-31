package part_11.qqqqqq;

public class GenericQueueController {

    public static void main(String[] args) {

        GenericQueue<Car> cars = new GenericQueue<>();
        Car toyota = new Car("Toyota", "4runner");
        Car nissan = new Car("Nissan", "Altima");
        Car lamborghini = new Car("Lamborghini", "Spyder");

        try {
            cars.put(toyota);
            cars.put(nissan);
            cars.put(lamborghini);
        } catch (QueueFullException e) {
            e.printStackTrace();
        }
        showCars(cars);

    }

    public static <T extends Car> void showCars(GenericQueue<T> cars) {
        //default empty Car to use while we loop (so we dont create all kinds o them)
        Car nextcar;

        //if there are more cars to show in teh queue
        while (cars.hasNext()) {
            try {
                //nextCar get the next Car in teh queue
                nextcar = cars.get();
                //print out the cars variables
                System.out.println(nextcar.make + " " + nextcar.model + "!");

            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }

        }

        //all Done
        System.out.println("No More Cars to Show");
    }

}

