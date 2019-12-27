package codegym.tulam_quan_ly_tinh.model;

import javax.persistence.*;

@Entity
@Table( name = "tinh")
public class province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProvince;
    private String nameProvince;

    public province() {
    }

    public province(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    public Long getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(Long idProvince) {
        this.idProvince = idProvince;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }
}
