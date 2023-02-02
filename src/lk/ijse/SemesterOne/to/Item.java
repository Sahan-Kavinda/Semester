package lk.ijse.SemesterOne.to;

public class Item {
    private String item_code;
    private String item_description;
    private String item_name;
    private String unit_price;
    private String qty_on_hand;

    public Item() {
    }

    public Item(String item_code, String item_description, String item_name, String unit_price, String qty_on_hand) {
        this.item_code = item_code;
        this.item_description = item_description;
        this.item_name = item_name;
        this.unit_price = unit_price;
        this.qty_on_hand = qty_on_hand;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getQty_on_hand() {
        return qty_on_hand;
    }

    public void setQty_on_hand(String qty_on_hand) {
        this.qty_on_hand = qty_on_hand;
    }

    @Override
    public String toString() {
        return "item{" +
                "item_code='" + item_code + '\'' +
                ", item_description='" + item_description + '\'' +
                ", item_name='" + item_name + '\'' +
                ", unit_price='" + unit_price + '\'' +
                ", qty_on_hand='" + qty_on_hand + '\'' +
                '}';
    }
}
