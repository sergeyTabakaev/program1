class Vehicle {
    private String name;
    private int yearOfProduction;
    protected int mileage;

    // Конструкторы
    Vehicle() {
        name = "Unknown";
        yearOfProduction = 0;
        mileage = 0;
    }

    Vehicle(String name, int year, int mileage) {
        this.name = name;
        this.yearOfProduction = year;
        this.mileage = mileage;
    }

    Vehicle(Vehicle ob) {
        this.name = ob.name;
        this.yearOfProduction = ob.yearOfProduction;
        this.mileage = ob.mileage;
    }

    // Геттер для имени
    String getName() {
        return name;
    }

    // Проверка возраста транспортного средства
    boolean isOld(int currentYear) {
        return currentYear - yearOfProduction > 10;
    }

    // Метод для расчёта пробега относительно года
    protected int calculateAge(int currentYear) {
        return currentYear - yearOfProduction;
    }
}

class Car extends Vehicle {
    private int fuelConsumption; // литры на 100 км

    // Конструкторы
    Car() {
        super();
        fuelConsumption = 0;
    }

    Car(String name, int year, int mileage, int fuelConsumption) {
        super(name, year, mileage);
        this.fuelConsumption = fuelConsumption;
    }

    Car(Car ob) {
        super(ob);
        this.fuelConsumption = ob.fuelConsumption;
    }

    // Проверка износа автомобиля
    boolean isWornOut(int currentYear) {
        return calculateAge(currentYear) * fuelConsumption / 10 > mileage / 100;
    }
}

class Bike extends Vehicle {
    private boolean isElectric;

    // Конструкторы
    Bike() {
        super();
        isElectric = false;
    }

    Bike(String name, int year, int mileage, boolean isElectric) {
        super(name, year, mileage);
        this.isElectric = isElectric;
    }

    Bike(Bike ob) {
        super(ob);
        this.isElectric = ob.isElectric;
    }

    // Проверка необходимости замены аккумулятора
    boolean needsBatteryReplacement(int currentYear) {
        return isElectric && calculateAge(currentYear) > 5;
    }
}

class Vehicles {
    public static void main(String[] args) {
        // Создание массива транспортных средств
        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Vehicle("Generic Vehicle", 2005, 120000);
        vehicles[1] = new Car("Sedan", 2015, 80000, 7);
        vehicles[2] = new Bike("Electric Bike", 2020, 5000, true);
        vehicles[3] = new Car("SUV", 2010, 150000, 10);
        vehicles[4] = new Bike("Mountain Bike", 2018, 3000, false);

        // Текущий год
        int currentYear = 2024;

        // Методы в действии
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getName() + " is old: " + vehicles[i].isOld(currentYear));

            if (vehicles[i] instanceof Car) {
                System.out.println(vehicles[i].getName() + " is worn out: " + ((Car) vehicles[i]).isWornOut(currentYear));
            } else if (vehicles[i] instanceof Bike) {
                System.out.println(vehicles[i].getName() + " needs battery replacement: " + ((Bike) vehicles[i]).needsBatteryReplacement(currentYear));
            }
        }
    }
}
