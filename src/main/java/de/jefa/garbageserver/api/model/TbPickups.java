package de.jefa.garbageserver.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_pickups", schema = "public")
public class TbPickups {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "autoid", nullable = false)
    @JsonIgnore
    private long autoid;

    @Basic
    @Column(name = "date", nullable = false)
    private Date date;

    @Basic
    @Column(name = "pickup_district_ref")
    @JsonIgnore
    private Long pickupDistrictRef;

    @Basic
    @Column(name = "trash_type_ref")
    @JsonIgnore
    private Long trashTypeRef;

    @Basic
    @Column(name = "liquibase_trash_types_import_system_id", nullable = false, length = 6)
    @JsonIgnore
    private String liquibaseTrashTypesImportSystemId;

    @Basic
    @Column(name = "liquibase_pickup_districts_import_system_id", nullable = false, length = 6)
    @JsonIgnore
    private String liquibasePickupDistrictsImportSystemId;


    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getPickupDistrictRef() {
        return pickupDistrictRef;
    }

    public void setPickupDistrictRef(Long pickupDistrictRef) {
        this.pickupDistrictRef = pickupDistrictRef;
    }

    public Long getTrashTypeRef() {
        return trashTypeRef;
    }

    public void setTrashTypeRef(Long trashTypeRef) {
        this.trashTypeRef = trashTypeRef;
    }

    public String getLiquibaseTrashTypesImportSystemId() {
        return liquibaseTrashTypesImportSystemId;
    }

    public void setLiquibaseTrashTypesImportSystemId(String liquibaseTrashTypesImportSystemId) {
        this.liquibaseTrashTypesImportSystemId = liquibaseTrashTypesImportSystemId;
    }

    public String getLiquibasePickupDistrictsImportSystemId() {
        return liquibasePickupDistrictsImportSystemId;
    }

    public void setLiquibasePickupDistrictsImportSystemId(String liquibasePickupDistrictsImportSystemId) {
        this.liquibasePickupDistrictsImportSystemId = liquibasePickupDistrictsImportSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbPickups tbPickups = (TbPickups) o;
        return autoid == tbPickups.autoid && Objects.equals(date, tbPickups.date) && Objects.equals(pickupDistrictRef, tbPickups.pickupDistrictRef) && Objects.equals(trashTypeRef, tbPickups.trashTypeRef) && Objects.equals(liquibaseTrashTypesImportSystemId, tbPickups.liquibaseTrashTypesImportSystemId) && Objects.equals(liquibasePickupDistrictsImportSystemId, tbPickups.liquibasePickupDistrictsImportSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, date, pickupDistrictRef, trashTypeRef, liquibaseTrashTypesImportSystemId, liquibasePickupDistrictsImportSystemId);
    }
}
