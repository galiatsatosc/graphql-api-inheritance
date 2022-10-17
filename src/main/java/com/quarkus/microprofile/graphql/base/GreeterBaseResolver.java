package com.quarkus.microprofile.graphql.base;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.enterprise.context.Dependent;

@Dependent
@GraphQLApi
public class GreeterBaseResolver {

    @Query("greetings")
    public String greetings() {
        return "Greetings, stranger!";
    }
}