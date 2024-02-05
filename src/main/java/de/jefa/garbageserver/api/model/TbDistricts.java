package de.jefa.garbageserver.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_districts", schema = "public")

public class TbDistricts {

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
    @Column(name = "state_ref")
    @JsonIgnore
    private Long stateRef;

    @Basic
    @JsonIgnore
    @Column(name = "liquibase_state_import_system_id", length = 6)
    private String liquibaseStateImportSystemId;

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

    public Long getStateRef() {
        return stateRef;
    }

    public void setStateRef(Long stateRef) {
        this.stateRef = stateRef;
    }

    public String getLiquibaseStateImportSystemId() {
        return liquibaseStateImportSystemId;
    }

    public void setLiquibaseStateImportSystemId(String liquibaseStateImportSystemId) {
        this.liquibaseStateImportSystemId = liquibaseStateImportSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbDistricts that = (TbDistricts) o;
        return autoid == that.autoid && Objects.equals(systemId, that.systemId) && Objects.equals(displayName, that.displayName) && Objects.equals(stateRef, that.stateRef) && Objects.equals(liquibaseStateImportSystemId, that.liquibaseStateImportSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, systemId, displayName, stateRef, liquibaseStateImportSystemId);
    }
}
