package oops;

import oops.Composition.Bed;
import oops.Composition.Bedsheet;
import oops.Composition.Lamp;
import oops.Composition.Room;
import oops.Encapsulation.Printer;
import oops.Inheritance.Porche;
import oops.Polymorphism.Car;

public class OOpsMain {
    public static void main(String[] args) {
/*        ConstructorandClassesBank pkAccount=new ConstructorandClassesBank("01ccxx","9031446811","talk2prajjwal@gmail.com",299,"Prajjwal kumar");
        pkAccount.DepositFunds(200);
        pkAccount.WithDrawFunds(500);

        ConstructorandClassesBank.VipAccount vipAccount=new ConstructorandClassesBank.VipAccount("pk","talk2prajjwal@gmail.com");
        System.out.println(vipAccount.getCreditLimit()+" "+vipAccount.getEmail()+" "+vipAccount.getName());
        */
/*
        Porche porche = new Porche("12XXrt21", "400km/h", "M-911");
        porche.Move();*/
/*        Lamp lamp = new Lamp("yellow", true);
        Bed bed = new Bed(21, new Bedsheet("voilet"));
        Room room = new Room("blue", bed, lamp);
        room.statusOfLampIsItOn();
        room.SwitchOffLamp();
        room.statusOfLampIsItOn();
        room.switchOnLamp();
        room.statusOfLampIsItOn();
        room.whatIsbedsheetlengthandcolor();
        room.changebedsheet("dark red");
        System.out.println((room.getBed().getBedsheet().getColor()));*/
/*
        Printer printer=new Printer(30,"Duplex",30);
        printer.filllToner(60);
        printer.printPages(30);
        System.out.println(printer.getNoOfPagesPrinted());*/


        for (int i = 0; i < 10; i++) {
            Car car = Car.randomCar();
            System.out.println(car.StartEngine());
            System.out.println(car.Accelerate());
            System.out.println(car.Brake());
        }

    }
}
