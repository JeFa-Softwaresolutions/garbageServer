package de.jefa.garbageserver.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_trash_types", schema = "public", catalog = "db_garbage_test")
public class TbTrashTypes {

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
    @JsonIgnore
    @Column(name = "city_ref")
    private Long cityRef;

    @Basic
    @JsonIgnore
    @Column(name = "liquibase_city_import_system_id", nullable = false, length = 6)
    private String liquibaseCityImportSystemId;

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

    public String getLiquibaseCityImportSystemId() {
        return liquibaseCityImportSystemId;
    }

    public void setLiquibaseCityImportSystemId(String liquibaseCityImportSystemId) {
        this.liquibaseCityImportSystemId = liquibaseCityImportSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbTrashTypes that = (TbTrashTypes) o;
        return autoid == that.autoid && Objects.equals(systemId, that.systemId) && Objects.equals(displayName, that.displayName) && Objects.equals(cityRef, that.cityRef) && Objects.equals(liquibaseCityImportSystemId, that.liquibaseCityImportSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, systemId, displayName, cityRef, liquibaseCityImportSystemId);
    }
}
