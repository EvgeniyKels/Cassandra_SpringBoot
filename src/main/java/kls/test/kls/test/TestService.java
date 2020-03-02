package kls.test.kls.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService implements ITest {
    @Autowired
    private IAdClickRepo adClickRepo;
    @Override
    public List <AdClick> getAll() {
        System.out.println("-----------------------------");
        List <AdClick> all = adClickRepo.findAll();
        return all;
    }

    @Override
    public List <AdClick> get() {
        System.out.println("-----------------------------");
                return adClickRepo.findByPkResellerIdAndPkDay("supaboobs", "2013-12-01");
//                return adClickRepo.findByPkResellerId("supaboobs");
    }
}
