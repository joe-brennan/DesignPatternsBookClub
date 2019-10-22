package AbstractFactory;

import java.math.BigInteger;
import java.util.*;

public class AbstractFactory {

    public interface Chair{
        boolean hasLegs();
    }

    public interface CoffeeTable{
        boolean hasLegs();

    }

    public class ModernChair implements Chair {
        @Override
        public boolean hasLegs() {
            return true;
        }
    }

    public class VictorianChair implements Chair{
        @Override
        public boolean hasLegs()
        {
            ArrayList arr = new ArrayList();
            BigInteger bigInt = new BigInteger(String.valueOf(5));
            return true;
        }
    }



    public class ModernCoffeeTable implements CoffeeTable{
        @Override
        public boolean hasLegs() {
            return true;
        }
    }

    public class VictorianCoffeeTable implements CoffeeTable{
        @Override
        public boolean hasLegs() {
            return true;
        }
    }

    public interface FurnitureFactory{
        Chair createChair();
        CoffeeTable createCoffeeTable();

    }

    public class ModernFurnitureFactory implements FurnitureFactory{

        @Override
        public Chair createChair() {
            return new ModernChair();

        }



        @Override
        public CoffeeTable createCoffeeTable() {
            return new ModernCoffeeTable();

        }
    }

    public class VictorianFurnitureFactory implements FurnitureFactory{

        @Override
        public Chair createChair() {
            return new VictorianChair();
        }

        @Override
        public CoffeeTable createCoffeeTable() {
            return new VictorianCoffeeTable();

        }
    }
}
