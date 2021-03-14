public class Order {

    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private float totalCost = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        itemsOrdered[qtyOrdered]= disc;
        ++qtyOrdered;
        totalCost += disc.getCost();
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        totalCost -= disc.getCost();
        for(int i= 0; i< itemsOrdered.length; ++i){
            if(itemsOrdered[i]== disc){
                for(int j = i; j< itemsOrdered.length-1; j++)
                itemsOrdered[j]= itemsOrdered[j+1];
            }
            break;
        }
        --qtyOrdered;
    }
    public float totalCost(){
        return totalCost;
    }
    public void display()
    {
        for(int i= 0; i< qtyOrdered; i++)
            System.out.println(itemsOrdered[i].getTitle()+"\t"+itemsOrdered[i].getDirector()+"\t"+itemsOrdered[i].getCost());
    }

}

