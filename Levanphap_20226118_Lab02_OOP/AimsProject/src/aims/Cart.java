package aims;

public class Cart {
    private static final int maxCapacity = 20;
    private DigitalVideoDisc[] dvdList = new DigitalVideoDisc[maxCapacity];
    
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < maxCapacity) {
            dvdList[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (dvdList[i] == disc) {
                dvdList[i] = dvdList[qtyOrdered - 1];
                dvdList[qtyOrdered - 1] = null;
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0.00f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += dvdList[i].getCost();
        }
        return total;
    }
}
