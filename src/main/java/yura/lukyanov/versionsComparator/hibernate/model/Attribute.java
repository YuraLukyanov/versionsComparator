package yura.lukyanov.versionsComparator.hibernate.model;

import org.hibernate.annotations.Type;
import yura.lukyanov.versionsComparator.hibernate.Snapshot;
import yura.lukyanov.versionsComparator.hibernate.primaryKeys.AttributePK;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by yuriylukyanov on 3/23/15.
 */

@Entity
@IdClass(AttributePK.class)
@Table(name = "comp_attributes")
public class Attribute implements java.io.Serializable {

    private BigInteger attrID;
    private Snapshot snapshot;
    private BigInteger attrTypeID;
    private AttrTypeDefinition attrTypeDefinition;
    private AttributeSchema attrSchema;
    private Integer attrAccessType;
    private Boolean isExtGenerated;
    private Boolean isMultiple;
    private Boolean isExtStored;
    private String adapterName;
    private String params;
    private BigInteger uniqueLevel;
    private BigInteger showOrder;
    private BigInteger showHistory;
    private Boolean isSearchable;
    private String mask;
    private String defValue;
    private BigInteger flags;
    private String description;
    private String properties;
    private BigInteger rules;
    private String tooltip;
    private String avAdapterName;
    private String avAdapterProperties;
    private String internalName;
    private String name;
    private AttrGroup attrGroup;

    public Attribute() {
    }

    @Id
    @Column(name = "attr_id")
    public BigInteger getAttrID() {
        return attrID;
    }

    public void setAttrID(BigInteger attrID) {
        this.attrID = attrID;
    }

    @Id
    @PrimaryKeyJoinColumn(name = "snapshot_id", referencedColumnName = "snapshot_id")
    public Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "attr_group_id")
    public AttrGroup getAttrGroup() {
        return attrGroup;
    }

    public void setAttrGroup(AttrGroup attrGroup) {
        this.attrGroup = attrGroup;
    }

    @Column(name = "attr_type_id")
    public BigInteger getAttrTypeID() {
        return attrTypeID;
    }

    public void setAttrTypeID(BigInteger attrTypeID) {
        this.attrTypeID = attrTypeID;
    }

    @ManyToOne
    @JoinColumn(name = "attr_type_def_id")
    public AttrTypeDefinition getAttrTypeDefinition() {
        return attrTypeDefinition;
    }

    public void setAttrTypeDefinition(AttrTypeDefinition attrTypeDefinition) {
        this.attrTypeDefinition = attrTypeDefinition;
    }

    @ManyToOne
    @JoinColumn(name = "attr_schema_id")
    public AttributeSchema getAttrSchema() {
        return attrSchema;
    }

    public void setAttrSchema(AttributeSchema attrSchema) {
        this.attrSchema = attrSchema;
    }

    @Column(name = "attr_access_type")
    public Integer getAttrAccessType() {
        return attrAccessType;
    }

    public void setAttrAccessType(Integer attrAccessType) {
        this.attrAccessType = attrAccessType;
    }

    @Type(type = "true_false")
    @Column(name = "ISEXTGENERATED")
    public Boolean getIsExtGenerated() {
        return isExtGenerated;
    }

    public void setIsExtGenerated(Boolean isExtGenerated) {
        this.isExtGenerated = isExtGenerated;
    }

    @Type(type = "true_false")
    @Column(name = "ismultiple")
    public Boolean getIsMultiple() {
        return isMultiple;
    }

    public void setIsMultiple(Boolean isMultiple) {
        this.isMultiple = isMultiple;
    }

    @Type(type = "true_false")
    @Column(name = "isextstored")
    public Boolean getIsExtStored() {
        return isExtStored;
    }

    public void setIsExtStored(Boolean isExtStored) {
        this.isExtStored = isExtStored;
    }

    @Column(name = "adaptername")
    public String getAdapterName() {
        return adapterName;
    }

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    @Column(name = "params")
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Column(name = "unique_level")
    public BigInteger getUniqueLevel() {
        return uniqueLevel;
    }

    public void setUniqueLevel(BigInteger uniqueLevel) {
        this.uniqueLevel = uniqueLevel;
    }

    @Column(name = "show_order")
    public BigInteger getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(BigInteger showOrder) {
        this.showOrder = showOrder;
    }

    @Column(name = "issearchable")
    public Boolean getIsSearchable() {
        return isSearchable;
    }

    public void setIsSearchable(Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    @Column(name = "mask")
    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    @Column(name = "def_value")
    public String getDefValue() {
        return defValue;
    }

    public void setDefValue(String defValue) {
        this.defValue = defValue;
    }

    @Column(name = "flags")
    public BigInteger getFlags() {
        return flags;
    }

    public void setFlags(BigInteger flags) {
        this.flags = flags;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "properties")
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Column(name = "rules")
    public BigInteger getRules() {
        return rules;
    }

    public void setRules(BigInteger rules) {
        this.rules = rules;
    }

    @Column(name = "tooltip")
    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    @Column(name = "AV_ADAPTER_NAME")
    public String getAvAdapterName() {
        return avAdapterName;
    }

    public void setAvAdapterName(String avAdapterName) {
        this.avAdapterName = avAdapterName;
    }

    @Column(name = "AV_ADAPTER_PROPERTIES")
    public String getAvAdapterProperties() {
        return avAdapterProperties;
    }

    public void setAvAdapterProperties(String avAdapterProperties) {
        this.avAdapterProperties = avAdapterProperties;
    }

    @Column(name = "internal_name")
    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    @Column(name = "show_history")
    public BigInteger getShowHistory() {
        return showHistory;
    }

    public void setShowHistory(BigInteger showHistory) {
        this.showHistory = showHistory;
    }
}
