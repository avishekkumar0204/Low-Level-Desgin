package DesginPatterns.Factory.DatabaseExample.Factories;

import DesginPatterns.Factory.DatabaseExample.QueryLanguage.Query;
import DesginPatterns.Factory.DatabaseExample.Transation.Transation;

public interface DBFactory {
    Query createQuery();
    Transation createTransation();
}
