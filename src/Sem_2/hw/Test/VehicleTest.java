
import Sem_2.hw.Car;
import Sem_2.hw.Motorcycle;
import Sem_2.hw.Vehicle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MATCHER;


class VehicleTest {

    // - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void checkObjectCarIsInstanceOfVehile(){
        Car testcar = new Car("Lada", "VESTA", 2020);
        assertThat(testcar).isInstanceOf(Vehicle.class);

    }

    // - проверка того, объект Car создается с 4-мя колесами
    @Test
    void checkObjectCarHaveFourWheels(){
        Car testcar = new Car("Mazda", "CX-5", 2019);
        assertThat(testcar.getNumWheels()).isEqualTo(4);

    }

    // - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void checkObjectMotorcycleHaveTwoWheels(){
        Motorcycle testmotorcycle= new Motorcycle("IZH", "Планета-5", 1990);
        assertThat(testmotorcycle.getNumWheels()).isEqualTo(2);
    }

    // - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void checkObjectCarCanAccelerateTo60kmphInTestDrive(){
        Car testcar = new Car("Hyndai", "Solaris", 2015);
        testcar.testDrive();
        assertThat(testcar.getSpeed()).isEqualTo(60);

    }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void checkObjectMotorcyclerCanAccelerateTo75kmphInTestDrive(){
        Motorcycle testmotorcycle = new Motorcycle("BMW ", "S1000 RR", 2023);
        testmotorcycle.testDrive();
        assertThat(testmotorcycle.getSpeed()).isEqualTo(75);
    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void checkObjectCarHaveZeroSpeedInParckingMode(){
        Car testcar = new Car("Jeep", "Cherokee", 2020);
        testcar.testDrive();
        testcar.park();
        assertThat(testcar.getSpeed()).isEqualTo(0);

    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void checkObjectMotorcycleHaveZeroSpeedInParckingMode(){
        Motorcycle testmotorcycle = new Motorcycle("Suzuki", "Hayabusa", 2020);
        testmotorcycle.testDrive();
        testmotorcycle.park();
        assertThat(testmotorcycle.getSpeed()).isEqualTo(0);

    }

}
