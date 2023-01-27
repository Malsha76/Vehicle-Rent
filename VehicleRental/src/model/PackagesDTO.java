package model;

public class PackagesDTO {
    private String id;
    private String name;
    private String price;

    public String getPackage_id() {
        return id;
    }

    public void setPackage_id(String package_id) {
        this.id = package_id;
    }

    public PackagesDTO(String package_id, String package_name, String price) {
        this.id = package_id;
        this.name = package_name;
        this.price = price;
    }

    public String getPackage_name() {
        return name;
    }

    public void setPackage_name(String package_name) {
        this.name = package_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
