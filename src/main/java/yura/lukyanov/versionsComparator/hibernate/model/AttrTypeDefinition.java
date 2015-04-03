package yura.lukyanov.versionsComparator.hibernate.model;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by yuriylukyanov on 3/28/15.
 */

@Entity
@Table(name = "yulu_attr_type_defs")
public class AttrTypeDefinition {

    private BigInteger attrTypeDefID;
    private BigInteger attrTypeId;
    private AttributeSchema attributeSchema;
    private ObjectType objectType;
    private String name;
    private String dtd;
    private Integer attrAccessType;
    private Attribute objectRefAttr;
    private Attribute attrRef;
    private BigInteger flags;

    public AttrTypeDefinition() {
    }

    @Id
    @Column(name = "attr_type_def_id")
    public BigInteger getAttrTypeDefID() {
        return attrTypeDefID;
    }

    public void setAttrTypeDefID(BigInteger attrTypeDefID) {
        this.attrTypeDefID = attrTypeDefID;
    }

    @Column(name = "attr_type_id")
    public BigInteger getAttrTypeId() {
        return attrTypeId;
    }

    public void setAttrTypeId(BigInteger attrTypeId) {
        this.attrTypeId = attrTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "attr_schema_id")
    public AttributeSchema getAttributeSchema() {
        return attributeSchema;
    }

    public void setAttributeSchema(AttributeSchema attributeSchema) {
        this.attributeSchema = attributeSchema;
    }

    @ManyToOne
    @JoinColumn(name = "object_type_id")
    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "dtd")
    public String getDtd() {
        return dtd;
    }

    public void setDtd(String dtd) {
        this.dtd = dtd;
    }

    @Column(name = "attr_access_type")
    public Integer getAttrAccessType() {
        return attrAccessType;
    }

    public void setAttrAccessType(Integer attrAccessType) {
        this.attrAccessType = attrAccessType;
    }

    @ManyToOne
    @JoinColumn(name = "object_ref_attr_id")
    public Attribute getObjectRefAttr() {
        return objectRefAttr;
    }

    public void setObjectRefAttr(Attribute objectRefAttr) {
        this.objectRefAttr = objectRefAttr;
    }

    @ManyToOne
    @JoinColumn(name = "attr_ref_id")
    public Attribute getAttrRef() {
        return attrRef;
    }

    public void setAttrRef(Attribute attrRef) {
        this.attrRef = attrRef;
    }

    @Column(name = "flags")
    public BigInteger getFlags() {
        return flags;
    }

    public void setFlags(BigInteger flags) {
        this.flags = flags;
    }
}
