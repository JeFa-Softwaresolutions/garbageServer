package de.jefa.garbageserver.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_streets", schema = "public")
public class TbStreets {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "autoid", nullable = false)
    @JsonIgnore
    private long autoid;

    @Basic
    @Column(name = "system_id", nullable = false, length = 8)
    private String systemId;

    @Basic
    @Column(name = "display_name", nullable = false, length = 64)
    private String displayName;

    @Basic
    @Column(name = "city_ref")
    @JsonIgnore
    private Long cityRef;

    @Basic
    @Column(name = "pickup_district_ref")
    @JsonIgnore
    private Long pickupDistrictRef;

    @Basic
    @Column(name = "liquibase_city_import_system_id", length = 6)
    @JsonIgnore
    private String liquibaseCityImportSystemId;

    @Basic
    @Column(name = "liquibase_pickup_districts_import_system_id", length = 6)
    @JsonIgnore
    private String liquibasePickupDistrictsImportSystemId;

    public long getAutoid() {
        return autoid;
    }

    public void setAutoid(long autoid) {
        this.autoid = autoid;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getCityRef() {
        return cityRef;
    }

    public void setCityRef(Long cityRef) {
        this.cityRef = cityRef;
    }

    public Long getPickupDistrictRef() {
        return pickupDistrictRef;
    }

    public void setPickupDistrictRef(Long pickupDistrictRef) {
        this.pickupDistrictRef = pickupDistrictRef;
    }

    public String getLiquibaseCityImportSystemId() {
        return liquibaseCityImportSystemId;
    }

    public void setLiquibaseCityImportSystemId(String liquibaseCityImportSystemId) {
        this.liquibaseCityImportSystemId = liquibaseCityImportSystemId;
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
        TbStreets tbStreets = (TbStreets) o;
        return autoid == tbStreets.autoid && Objects.equals(systemId, tbStreets.systemId) && Objects.equals(displayName, tbStreets.displayName) && Objects.equals(cityRef, tbStreets.cityRef) && Objects.equals(pickupDistrictRef, tbStreets.pickupDistrictRef) && Objects.equals(liquibaseCityImportSystemId, tbStreets.liquibaseCityImportSystemId) && Objects.equals(liquibasePickupDistrictsImportSystemId, tbStreets.liquibasePickupDistrictsImportSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, systemId, displayName, cityRef, pickupDistrictRef, liquibaseCityImportSystemId, liquibasePickupDistrictsImportSystemId);
    }
}
