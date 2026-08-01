public class Service {
    private int id;
    private  String nameOfService;
    private int price;

    public Service(int id, String nameOfService, int price) {
        this.id = id;
        this.nameOfService = nameOfService;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
