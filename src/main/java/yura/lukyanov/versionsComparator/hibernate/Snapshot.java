package yura.lukyanov.versionsComparator.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by yuriylukyanov on 3/29/15.
 */
@Entity
@Table(name = "comp_snapshots")
public class Snapshot implements Serializable {

    private BigInteger shapshotID;
    private String versionName;
    private Date versionDate;

    public Snapshot() {
    }

    public Snapshot(BigInteger shapshotID) {
        this.shapshotID = shapshotID;
    }

    @Id
    @Column(name = "shapshot_id")
    public BigInteger getShapshotID() {
        return shapshotID;
    }

    public void setShapshotID(BigInteger shapshotID) {
        this.shapshotID = shapshotID;
    }

    @Column(name = "version_name")
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Column(name = "version_date")
    public Date getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Date versionDate) {
        this.versionDate = versionDate;
    }
}
