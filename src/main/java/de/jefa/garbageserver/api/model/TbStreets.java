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
    @Column(name = "system_id", nullable = false, length = 6)
    private String systemId;

    @Basic
    @Column(name = "display_name", nullable = false, length = 64)
    private String displayName;

    @Basic
    @Column(name = "town_ref")
    @JsonIgnore
    private Long townRef;

    @Basic
    @Column(name = "pickup_district_ref")
    @JsonIgnore
    private Long pickupDistrictRef;

    @Basic
    @Column(name = "liquibase_town_import_system_id", nullable = false, length = 6)
    @JsonIgnore
    private String liquibaseTownImportSystemId;

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

    public Long getTownRef() {
        return townRef;
    }

    public void setTownRef(Long townRef) {
        this.townRef = townRef;
    }

    public Long getPickupDistrictRef() {
        return pickupDistrictRef;
    }

    public void setPickupDistrictRef(Long pickupDistrictRef) {
        this.pickupDistrictRef = pickupDistrictRef;
    }

    public String getLiquibaseTownImportSystemId() {
        return liquibaseTownImportSystemId;
    }

    public void setLiquibaseTownImportSystemId(String liquibaseTownImportSystemId) {
        this.liquibaseTownImportSystemId = liquibaseTownImportSystemId;
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
        return autoid == tbStreets.autoid && Objects.equals(systemId, tbStreets.systemId) && Objects.equals(displayName, tbStreets.displayName) && Objects.equals(townRef, tbStreets.townRef) && Objects.equals(pickupDistrictRef, tbStreets.pickupDistrictRef) && Objects.equals(liquibaseTownImportSystemId, tbStreets.liquibaseTownImportSystemId) && Objects.equals(liquibasePickupDistrictsImportSystemId, tbStreets.liquibasePickupDistrictsImportSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, systemId, displayName, townRef, pickupDistrictRef, liquibaseTownImportSystemId, liquibasePickupDistrictsImportSystemId);
    }
}
