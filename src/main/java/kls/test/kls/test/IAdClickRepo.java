package kls.test.kls.test;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAdClickRepo extends CassandraRepository<AdClick, PrimaryKeyClass___> {
    List <AdClick> findByPkResellerIdAndPkDay (String resellerId, String day);
    List <AdClick> findByPkResellerId (String resellerId);
    List <AdClick> findByPkResellerIdAndPkDayAndPkTime (String resellerId, String day, Date time);
}
