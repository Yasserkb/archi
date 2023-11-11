package org.proj.Metier;


import org.proj.Data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements Imetier {

    @Autowired
    @Qualifier("data")
    private Data data;

    @Override
    public double calcul() {
        double dat = data.getData();
        double res = dat*15.6;
        return res;
    }

    public MetierImpl(Data data) {
        this.data = data;
    }
//    public void setDao(Data dao) {
//        this.data = dao;
//    }
}
