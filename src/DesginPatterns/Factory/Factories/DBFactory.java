package DesginPatterns.Factory.Factories;

import DesginPatterns.Factory.QueryLanguage.Query;
import DesginPatterns.Factory.Transation.Transation;

public interface DBFactory {
    Query createQuery();
    Transation createTransation();
}
