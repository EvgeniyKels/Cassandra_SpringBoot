package kls.test.kls.test;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.util.Date;
@org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
public class PrimaryKeyClass___ {
    @PrimaryKeyColumn(name = "reseller_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String resellerId;
    @PrimaryKeyColumn(name = "day", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private String day;
    @PrimaryKeyColumn(name = "time", ordinal = 2, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private Date time;
    @PrimaryKeyColumn(name = "ad_id", ordinal = 3, type = PrimaryKeyType.CLUSTERED)
    private String adId;

    public PrimaryKeyClass___() {
    }

    public PrimaryKeyClass___(String resellerId, String day, Date time, String adId) {
        this.resellerId = resellerId;
        this.day = day;
        this.time = time;
        this.adId = adId;
    }

    public String getResellerId() {
        return resellerId;
    }

    public void setResellerId(String resellerId) {
        this.resellerId = resellerId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    @Override
    public String toString() {
        return "kls.test.kls.test.PrimaryKeyClass{" +
                "resellerId='" + resellerId + '\'' +
                ", day='" + day + '\'' +
                ", time=" + time +
                ", adId='" + adId + '\'' +
                '}';
    }
}
