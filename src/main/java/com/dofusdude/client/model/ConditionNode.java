/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.2
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

import java.util.Objects;
import com.dofusdude.client.model.Condition;
import com.dofusdude.client.model.ConditionLeaf;
import com.dofusdude.client.model.ConditionRelation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.dofusdude.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T23:09:16.084170801Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class ConditionNode extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ConditionNode.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConditionNode.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConditionNode' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConditionRelation> adapterConditionRelation = gson.getDelegateAdapter(this, TypeToken.get(ConditionRelation.class));
            final TypeAdapter<ConditionLeaf> adapterConditionLeaf = gson.getDelegateAdapter(this, TypeToken.get(ConditionLeaf.class));

            return (TypeAdapter<T>) new TypeAdapter<ConditionNode>() {
                @Override
                public void write(JsonWriter out, ConditionNode value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ConditionRelation`
                    if (value.getActualInstance() instanceof ConditionRelation) {
                        JsonElement element = adapterConditionRelation.toJsonTree((ConditionRelation)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ConditionLeaf`
                    if (value.getActualInstance() instanceof ConditionLeaf) {
                        JsonElement element = adapterConditionLeaf.toJsonTree((ConditionLeaf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ConditionLeaf, ConditionRelation");
                }

                @Override
                public ConditionNode read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ConditionRelation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConditionRelation.validateJsonElement(jsonElement);
                        actualAdapter = adapterConditionRelation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ConditionRelation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ConditionRelation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ConditionRelation'", e);
                    }
                    // deserialize ConditionLeaf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConditionLeaf.validateJsonElement(jsonElement);
                        actualAdapter = adapterConditionLeaf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ConditionLeaf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ConditionLeaf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ConditionLeaf'", e);
                    }

                    if (match == 1) {
                        ConditionNode ret = new ConditionNode();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ConditionNode: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ConditionNode() {
        super("oneOf", Boolean.FALSE);
    }

    public ConditionNode(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConditionRelation", ConditionRelation.class);
        schemas.put("ConditionLeaf", ConditionLeaf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ConditionNode.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ConditionLeaf, ConditionRelation
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ConditionRelation) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ConditionLeaf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ConditionLeaf, ConditionRelation");
    }

    /**
     * Get the actual instance, which can be the following:
     * ConditionLeaf, ConditionRelation
     *
     * @return The actual instance (ConditionLeaf, ConditionRelation)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConditionRelation`. If the actual instance is not `ConditionRelation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConditionRelation`
     * @throws ClassCastException if the instance is not `ConditionRelation`
     */
    public ConditionRelation getConditionRelation() throws ClassCastException {
        return (ConditionRelation)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConditionLeaf`. If the actual instance is not `ConditionLeaf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConditionLeaf`
     * @throws ClassCastException if the instance is not `ConditionLeaf`
     */
    public ConditionLeaf getConditionLeaf() throws ClassCastException {
        return (ConditionLeaf)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConditionNode
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ConditionRelation
        try {
            ConditionRelation.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ConditionRelation failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ConditionLeaf
        try {
            ConditionLeaf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ConditionLeaf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ConditionNode with oneOf schemas: ConditionLeaf, ConditionRelation. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ConditionNode given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConditionNode
     * @throws IOException if the JSON string is invalid with respect to ConditionNode
     */
    public static ConditionNode fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConditionNode.class);
    }

    /**
     * Convert an instance of ConditionNode to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

