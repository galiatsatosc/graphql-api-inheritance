package com.quarkus.microprofile.graphql;

import com.quarkus.microprofile.graphql.base.GreeterBaseResolver;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

@Priority(1)
@Alternative
@GraphQLApi
public class GreeterResolver extends GreeterBaseResolver {

    @Query("greetings")
    public String greetings() {
        return "Greetings, stranger. I'm not surprised to see your kind here.";
    }
}