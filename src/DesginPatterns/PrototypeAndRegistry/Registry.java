package DesginPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<Prototypes, Student> prototypes = new HashMap<>();

    public void setPrototype(Prototypes key, Student val){
        prototypes.put(key, val);
    }
    public Student getPrototype(Prototypes key){
        return prototypes.get(key).clone();
    }
}
