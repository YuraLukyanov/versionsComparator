package yura.lukyanov.versionsComparator.hibernate.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by yuriylukyanov on 3/25/15.
 */
@Entity
@Table(name = "yulu_attr_object_types")
@AssociationOverrides({
        @AssociationOverride(name = "attrObjectTypeID.objectType", joinColumns = @JoinColumn(name = "object_type_id")),
        @AssociationOverride(name = "attrObjectTypeID.attr", joinColumns = @JoinColumn(name = "attr_id")),
        @AssociationOverride(name = "attrObjectTypeID.attributeSchema", joinColumns = @JoinColumn(name = "attr_schema_id"))
    })
public class AttrObjectType implements java.io.Serializable {

    private AttrObjectTypeID attrObjectTypeID;
    private String defaultValue;
    private Boolean isDisplayed;
    private Boolean required;
    private BigInteger options;
    private BigInteger flags;

    @Transient
    public Attribute getAttribute() {
        return attrObjectTypeID.getAttr();
    }

/*    public void setAttribute(Attribute attribute) {
        attrObjectTypeID.setAttr(attribute);
    }*/

    @Transient
    public ObjectType getObjectType() {
        return attrObjectTypeID.getObjectType();
    }

/*    public void setObjectType(ObjectType objectType) {
        attrObjectTypeID.setObjectType(objectType);
    }*/

    @Transient
    public AttributeSchema getAttributeSchema() {
        return attrObjectTypeID.getAttributeSchema();
    }

    @EmbeddedId
    public AttrObjectTypeID getAttrObjectTypeID() {
        return attrObjectTypeID;
    }

    public void setAttrObjectTypeID(AttrObjectTypeID attrObjectTypeID) {
        this.attrObjectTypeID = attrObjectTypeID;
    }

    @Column(name = "default_value")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Type(type = "true_false")
    @Column(name = "isdisplayed")
    public Boolean getIsDisplayed() {
        return isDisplayed;
    }

    public void setIsDisplayed(Boolean isDisplayed) {
        this.isDisplayed = isDisplayed;
    }

    @Type(type = "true_false")
    @Column(name = "required")
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    @Column(name = "options")
    public BigInteger getOptions() {
        return options;
    }

    public void setOptions(BigInteger options) {
        this.options = options;
    }

    @Column(name = "flags")
    public BigInteger getFlags() {
        return flags;
    }

    public void setFlags(BigInteger flags) {
        this.flags = flags;
    }
}
