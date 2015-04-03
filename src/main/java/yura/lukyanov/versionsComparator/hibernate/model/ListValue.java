package yura.lukyanov.versionsComparator.hibernate.model;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by yuriylukyanov on 3/23/15.
 */

@Entity
@Table(name = "yulu_list_value")
public class ListValue {

    private BigInteger listValueID;
    private AttrTypeDefinition attrTypeDefinition;
    private String value;
    private Integer showOrder;
    private String additional;
    private BigInteger flags;

    @Id
    @Column(name = "list_value_id")
    public BigInteger getListValueID() {
        return listValueID;
    }

    public void setListValueID(BigInteger listValueID) {
        this.listValueID = listValueID;
    }

    @ManyToOne
    @JoinColumn(name = "attr_type_def_id", nullable = false)
    public AttrTypeDefinition getAttrTypeDefinition() {
        return attrTypeDefinition;
    }

    public void setAttrTypeDefinition(AttrTypeDefinition attrTypeDefinition) {
        this.attrTypeDefinition = attrTypeDefinition;
    }

    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "show_order")
    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    @Column(name = "additional")
    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    @Column(name = "flags")
    public BigInteger getFlags() {
        return flags;
    }

    public void setFlags(BigInteger flags) {
        this.flags = flags;
    }
}
