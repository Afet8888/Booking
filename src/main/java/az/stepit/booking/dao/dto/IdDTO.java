package az.stepit.booking.dao.dto;

public class IdDTO {
    private Long id;

    public IdDTO(){}

    public IdDTO(Long id){
        setId(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
