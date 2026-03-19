package com.dufuna.berlin.toluolanrewaju.tax.repository;

import com.dufuna.berlin.toluolanrewaju.tax.model.TaxBracket;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TaxBracketRepository {
    TaxBracket save (TaxBracket bracket);
    List<TaxBracket> findAll();
}
