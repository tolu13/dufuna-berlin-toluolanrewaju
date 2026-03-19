package com.dufuna.berlin.toluolanrewaju.tax.repository;

import com.dufuna.berlin.toluolanrewaju.tax.model.TaxBracket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaxBracketImpl implements TaxBracketRepository {
    private List<TaxBracket> brackets = new ArrayList<>();

    @Override
    public TaxBracket save(TaxBracket bracket) {
        brackets.add(bracket);
        return bracket;
    }

    @Override
    public List<TaxBracket> findAll() {
        return new ArrayList<>(brackets);
    }
}
