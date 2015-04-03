package yura.lukyanov.versionsComparator.hibernate.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by yuriylukyanov on 3/25/15.
 */
@Embeddable
public class AttrObjectTypeID implements java.io.Serializable {

    private ObjectType objectType;
    private Attribute attr;
    private AttributeSchema attributeSchema;

    @ManyToOne
    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    @ManyToOne
    public Attribute getAttr() {
        return attr;
    }

    public void setAttr(Attribute attr) {
        this.attr = attr;
    }

    @ManyToOne
    public AttributeSchema getAttributeSchema() {
        return attributeSchema;
    }

    public void setAttributeSchema(AttributeSchema attributeSchema) {
        this.attributeSchema = attributeSchema;
    }
}
