package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cart anOrder = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin2", "Animation", 19.99f);

        System.out.printf("Total cost is: %.2f \n", anOrder.totalCost());
        
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.printf("Total cost is: %.2f \n", anOrder.totalCost());

        
	}
}