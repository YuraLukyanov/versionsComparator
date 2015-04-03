package yura.lukyanov.versionsComparator.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by yuriylukyanov on 3/23/15.
 */

@Entity
@Table(name = "yulu_attr_schemes")
public class AttributeSchema {

    private BigInteger attrSchemaID;
    private BigInteger parentID;
    private String name;
    private String attrAccessType;
    private Boolean isSystem;
    private String description;
    private BigInteger flags;
    private String internalName;

    public AttributeSchema() {
    }

    @Id
    @Column(name = "attr_schema_id")
    public BigInteger getAttrSchemaID() {
        return attrSchemaID;
    }

    public void setAttrSchemaID(BigInteger attrSchemaID) {
        this.attrSchemaID = attrSchemaID;
    }

    @Column(name = "parent_id")
    public BigInteger getParentID() {
        return parentID;
    }

    public void setParentID(BigInteger parentID) {
        this.parentID = parentID;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "attr_access_type")
    public String getAttrAccessType() {
        return attrAccessType;
    }

    public void setAttrAccessType(String attrAccessType) {
        this.attrAccessType = attrAccessType;
    }

    @Column(name = "issystem")
    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "flags")
    public BigInteger getFlags() {
        return flags;
    }

    public void setFlags(BigInteger flags) {
        this.flags = flags;
    }

    @Column(name = "internal_name")
    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
}
