import com.xworkz.bottleapp.bottle.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("Main started!!");
        Bottle b = new Bottle();
        b.setBrand("Symactive");
        b.setMaterial("Plastic");
        b.setBottleType("Standard Bottle");
        b.setColor("Multi-color");
        b.setCapacity("1 litres");
//        System.out.println("Brand: "+b.getBrand());
//        System.out.println("Material: "+b.getMaterial());
//        System.out.println("Bottle Type: "+b.getBottleType());
//        System.out.println("Color: "+b.getColor());
//        System.out.println("Capacity: "+b.getCapacity());

        System.out.println(b);
        System.out.println("Main ended!!");
    }
}
