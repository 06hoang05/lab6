package lab6;

public enum Category {
    FOOD ("Thuc Pham"), HOUSEWARE ("Do gia dung"), COSMETICS("My Pham"), FASHION ("Thoi Trang");
    private String value;
    private Category(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
