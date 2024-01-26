package de.jefa.garbageserver.api.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_cities", schema = "public")
public class TbCities {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "autoid", nullable = false)
    private long autoid;

    @Basic
    @Column(name = "system_id", nullable = false, length = 6)
    private String systemId;

    @Basic
    @Column(name = "display_name", nullable = false, length = 64)
    private String displayName;

    @Basic
    @Column(name = "district_ref")
    private Long districtRef;

    @Basic
    @Column(name = "liquibase_district_import_system_id", nullable = false, length = 6)
    private String liquibaseDistrictImportSystemId;

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

    public Long getDistrictRef() {
        return districtRef;
    }

    public void setDistrictRef(Long districtRef) {
        this.districtRef = districtRef;
    }

    public String getLiquibaseDistrictImportSystemId() {
        return liquibaseDistrictImportSystemId;
    }

    public void setLiquibaseDistrictImportSystemId(String liquibaseDistrictImportSystemId) {
        this.liquibaseDistrictImportSystemId = liquibaseDistrictImportSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCities tbCities = (TbCities) o;
        return autoid == tbCities.autoid && Objects.equals(systemId, tbCities.systemId) && Objects.equals(displayName, tbCities.displayName) && Objects.equals(districtRef, tbCities.districtRef) && Objects.equals(liquibaseDistrictImportSystemId, tbCities.liquibaseDistrictImportSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, systemId, displayName, districtRef, liquibaseDistrictImportSystemId);
    }
}
