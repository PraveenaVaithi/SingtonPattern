package com.poc.factory;

public class EngineFactory {

    public Engine generateEngine(String engineType){
        if(engineType.equals("Regular"))
            return new RegularEngine();
        else if (engineType.equals("Advanced"))
            return new AdvancedEngine();
        else
            return null;

    }
}
