package yura.lukyanov.versionsComparator.hibernate.primaryKeys;

import yura.lukyanov.versionsComparator.hibernate.Snapshot;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by yuriylukyanov on 3/30/15.
 */

public class AttributePK implements Serializable {

    private BigInteger attrID;
    private Snapshot snapshotID;

    public AttributePK() {
    }

    public AttributePK(Snapshot snapshotID, BigInteger attrID) {
        this.attrID = attrID;
        this.snapshotID = snapshotID;
    }

    public BigInteger getAttrID() {
        return attrID;
    }

    public void setAttrID(BigInteger attrID) {
        this.attrID = attrID;
    }

    public Snapshot getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(Snapshot snapshotID) {
        this.snapshotID = snapshotID;
    }
}
