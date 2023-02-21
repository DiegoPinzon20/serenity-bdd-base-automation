package com.reliquias.software.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterTypeDef {

    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setupInitial(){
        OnStage.setTheStage(new OnlineCast());
    }
}
