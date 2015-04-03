package yura.lukyanov.versionsComparator.hibernate.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

/**
 * Created by yuriylukyanov on 3/23/15.
 */

@Entity
@Table(name = "yulu_attr_groups")
public class AttrGroup {

    private BigInteger attrGroupID;
    private AttributeSchema attrSchema;
    private String name;
    private BigInteger showOrder;
    private Integer attrAccessType;
    private BigInteger flags;
    private String description;
    private String subgroup;
    private String alias;
    private String params;

    private Set<Attribute> attributes;

    public AttrGroup() {
    }

    @Id
    @Column(name = "attr_group_id")
    public BigInteger getAttrGroupID() {
        return attrGroupID;
    }

    public void setAttrGroupID(BigInteger attrGroupID) {
        this.attrGroupID = attrGroupID;
    }

    @ManyToOne
    @JoinColumn(name = "attr_schema_id")
    public AttributeSchema getAttrSchema() {
        return attrSchema;
    }

    public void setAttrSchema(AttributeSchema attrSchema) {
        this.attrSchema = attrSchema;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "show_order")
    public BigInteger getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(BigInteger showOrder) {
        this.showOrder = showOrder;
    }

    @Column(name = "attr_access_type")
    public Integer getAttrAccessType() {
        return attrAccessType;
    }

    public void setAttrAccessType(Integer attrAccessType) {
        this.attrAccessType = attrAccessType;
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

    @Column(name = "subgroup")
    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Column(name = "params")
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @OneToMany
    @JoinColumn(name = "attr_group_id")
    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }
}
