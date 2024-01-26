package de.jefa.garbageserver.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_states", schema = "public")
public class TbStates {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbStates tbStates = (TbStates) o;
        return autoid == tbStates.autoid && Objects.equals(systemId, tbStates.systemId) && Objects.equals(displayName, tbStates.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoid, systemId, displayName);
    }
}
