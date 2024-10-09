package DesginPatterns.Factory.Databases;

import DesginPatterns.Factory.QueryLanguage.Query;

public interface Database {
    Query createQuery();
}
