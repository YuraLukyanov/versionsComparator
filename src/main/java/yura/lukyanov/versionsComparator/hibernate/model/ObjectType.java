package yura.lukyanov.versionsComparator.hibernate.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

/**
 * Created by yuriylukyanov on 3/23/15.
 */

@Entity
@Table(name = "yulu_object_types")
public class ObjectType implements java.io.Serializable {

    private BigInteger objectTypeID;
    private BigInteger parentID;
    private String name;
    private String description;
    private BigInteger pictureID;
    private Boolean isClass;
    private Boolean isSystem;
    private Boolean isSearchable;
    private BigInteger iconID;
    private String alias;
    private BigInteger flags;
    private String properties;
    private Boolean isAbstract;
    private String internalName;

    private Set<AttrObjectType> attrObjectTypes;

    public ObjectType(BigInteger objectTypeID, String name) {
        this.objectTypeID = objectTypeID;
        this.name = name;
    }

    public ObjectType() {
    }

    @Id
    @Column(name = "object_type_id", unique = true, nullable = false, updatable = false)
    public BigInteger getObjectTypeID() {
        return objectTypeID;
    }

    public void setObjectTypeID(BigInteger objectTypeID) {
        this.objectTypeID = objectTypeID;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "parent_id")
    public BigInteger getParentID() {
        return parentID;
    }

    public void setParentID(BigInteger parentID) {
        this.parentID = parentID;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "picture_id")
    public BigInteger getPictureID() {
        return pictureID;
    }

    public void setPictureID(BigInteger pictureID) {
        this.pictureID = pictureID;
    }

    @Type(type = "true_false")
    @Column(name = "isclass")
    public Boolean getIsClass() {
        return isClass;
    }

    public void setIsClass(Boolean isClass) {
        this.isClass = isClass;
    }

    @Type(type = "true_false")
    @Column(name = "issystem")
    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    @Type(type = "true_false")
    @Column(name = "issearchable")
    public Boolean getIsSearchable() {
        return isSearchable;
    }

    public void setIsSearchable(Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    @Column(name = "icon_id")
    public BigInteger getIconID() {
        return iconID;
    }

    public void setIconID(BigInteger iconID) {
        this.iconID = iconID;
    }

    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Column(name = "flags")
    public BigInteger getFlags() {
        return flags;
    }

    public void setFlags(BigInteger flags) {
        this.flags = flags;
    }

    @Column(name = "properties")
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Type(type = "true_false")
    @Column(name = "isabstract")
    public Boolean getIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    @Column(name = "internal_name")
    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    @OneToMany(mappedBy = "attrObjectTypeID.objectType")
    public Set<AttrObjectType> getAttrObjectTypes() {
        return attrObjectTypes;
    }

    public void setAttrObjectTypes(Set<AttrObjectType> attrObjectTypes) {
        this.attrObjectTypes = attrObjectTypes;
    }
}
