import colored.IColored;
import washable.Laundry;
import washable.LaundryService;
import washable.WashingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        WashingMachine[] washingMachines = {
                new WashingMachine(IColored.Color.Black, 10),
                new WashingMachine(IColored.Color.Black, 10),
                new WashingMachine(IColored.Color.White, 11),
                new WashingMachine(IColored.Color.White, 12),
                new WashingMachine(IColored.Color.Multicolored, 7),
                new WashingMachine(IColored.Color.Multicolored, 6),
        };

        LaundryService service = new LaundryService(washingMachines);

        List<Laundry> laundryList = new ArrayList<>();

        laundryList.add(new Laundry(IColored.Color.Black, 6));
        laundryList.add(new Laundry(IColored.Color.Black, 3));
        laundryList.add(new Laundry(IColored.Color.Black, 7));
        laundryList.add(new Laundry(IColored.Color.Black, 4));
        laundryList.add(new Laundry(IColored.Color.White, 4));
        laundryList.add(new Laundry(IColored.Color.White, 10));
        laundryList.add(new Laundry(IColored.Color.White, 2));
        laundryList.add(new Laundry(IColored.Color.White, 1));
        laundryList.add(new Laundry(IColored.Color.White, 4));
        laundryList.add(new Laundry(IColored.Color.Multicolored, 6));
        laundryList.add(new Laundry(IColored.Color.Multicolored, 7));


        service.wash(laundryList);

        System.out.print(service.getInfo());
    }
}
