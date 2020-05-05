package uniqueTable;

public class Phone {
    private String model;
    private int price;

    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public Phone() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getprice() {
        return price;
    }

    String showInfo() {
        return model + " " + price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (!(object instanceof Phone))
            return false;
        Phone other = (Phone) object;
        if (model == null) {
            if (other.getModel()!=null)
                return false;
        }else if (!model.equals(other.getModel()))
            return false;
        if (price != other.getprice())
            return false;
        return true;
    }
}
