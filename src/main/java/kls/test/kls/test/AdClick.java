package kls.test.kls.test;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("ad_click")
public class AdClick {
    @PrimaryKey
    private PrimaryKeyClass___ pk;
    @Column("amount")
    private float amount;

    public PrimaryKeyClass___ getPk() {
        return pk;
    }

    public void setPk(PrimaryKeyClass___ pk) {
        this.pk = pk;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "kls.test.kls.test.AdClick{" +
                "pk=" + pk +
                ", amount=" + amount +
                '}';
    }
}
