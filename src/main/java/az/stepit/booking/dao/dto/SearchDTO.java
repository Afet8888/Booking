package az.stepit.booking.dao.dto;

public class SearchDTO {

    private IdDTO city;
    private IdDTO star;
    private IdDTO type;
    private IdDTO capacity;
    private Float price;

    public IdDTO getCity() {
        return city;
    }

    public void setCity(IdDTO city) {
        this.city = city;
    }

    public IdDTO getStar() {
        return star;
    }

    public void setStar(IdDTO star) {
        this.star = star;
    }

    public IdDTO getType() {
        return type;
    }

    public void setType(IdDTO type) {
        this.type = type;
    }

    public IdDTO getCapacity() {
        return capacity;
    }

    public void setCapacity(IdDTO capacity) {
        this.capacity = capacity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
