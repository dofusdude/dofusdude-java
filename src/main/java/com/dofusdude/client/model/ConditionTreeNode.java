/*
 * dofusdude
 * # A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [PHP](https://github.com/dofusdude/dofusdude-php) - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 0.9.0
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

import java.util.Objects;
import com.dofusdude.client.model.ConditionEntry;
import com.dofusdude.client.model.ConditionTreeLeaf;
import com.dofusdude.client.model.ConditionTreeRelation;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T13:27:52.033477054Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ConditionTreeNode extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ConditionTreeNode.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConditionTreeNode.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConditionTreeNode' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConditionTreeRelation> adapterConditionTreeRelation = gson.getDelegateAdapter(this, TypeToken.get(ConditionTreeRelation.class));
            final TypeAdapter<ConditionTreeLeaf> adapterConditionTreeLeaf = gson.getDelegateAdapter(this, TypeToken.get(ConditionTreeLeaf.class));

            return (TypeAdapter<T>) new TypeAdapter<ConditionTreeNode>() {
                @Override
                public void write(JsonWriter out, ConditionTreeNode value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ConditionTreeRelation`
                    if (value.getActualInstance() instanceof ConditionTreeRelation) {
                        JsonElement element = adapterConditionTreeRelation.toJsonTree((ConditionTreeRelation)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ConditionTreeLeaf`
                    if (value.getActualInstance() instanceof ConditionTreeLeaf) {
                        JsonElement element = adapterConditionTreeLeaf.toJsonTree((ConditionTreeLeaf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ConditionTreeLeaf, ConditionTreeRelation");
                }

                @Override
                public ConditionTreeNode read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ConditionTreeRelation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConditionTreeRelation.validateJsonElement(jsonElement);
                        actualAdapter = adapterConditionTreeRelation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ConditionTreeRelation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ConditionTreeRelation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ConditionTreeRelation'", e);
                    }
                    // deserialize ConditionTreeLeaf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConditionTreeLeaf.validateJsonElement(jsonElement);
                        actualAdapter = adapterConditionTreeLeaf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ConditionTreeLeaf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ConditionTreeLeaf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ConditionTreeLeaf'", e);
                    }

                    if (match == 1) {
                        ConditionTreeNode ret = new ConditionTreeNode();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ConditionTreeNode: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ConditionTreeNode() {
        super("oneOf", Boolean.FALSE);
    }

    public ConditionTreeNode(ConditionTreeLeaf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ConditionTreeNode(ConditionTreeRelation o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConditionTreeRelation", ConditionTreeRelation.class);
        schemas.put("ConditionTreeLeaf", ConditionTreeLeaf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ConditionTreeNode.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ConditionTreeLeaf, ConditionTreeRelation
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ConditionTreeRelation) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ConditionTreeLeaf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ConditionTreeLeaf, ConditionTreeRelation");
    }

    /**
     * Get the actual instance, which can be the following:
     * ConditionTreeLeaf, ConditionTreeRelation
     *
     * @return The actual instance (ConditionTreeLeaf, ConditionTreeRelation)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConditionTreeRelation`. If the actual instance is not `ConditionTreeRelation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConditionTreeRelation`
     * @throws ClassCastException if the instance is not `ConditionTreeRelation`
     */
    public ConditionTreeRelation getConditionTreeRelation() throws ClassCastException {
        return (ConditionTreeRelation)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ConditionTreeLeaf`. If the actual instance is not `ConditionTreeLeaf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConditionTreeLeaf`
     * @throws ClassCastException if the instance is not `ConditionTreeLeaf`
     */
    public ConditionTreeLeaf getConditionTreeLeaf() throws ClassCastException {
        return (ConditionTreeLeaf)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ConditionTreeNode
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ConditionTreeRelation
        try {
            ConditionTreeRelation.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ConditionTreeRelation failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ConditionTreeLeaf
        try {
            ConditionTreeLeaf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ConditionTreeLeaf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ConditionTreeNode with oneOf schemas: ConditionTreeLeaf, ConditionTreeRelation. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ConditionTreeNode given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConditionTreeNode
     * @throws IOException if the JSON string is invalid with respect to ConditionTreeNode
     */
    public static ConditionTreeNode fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConditionTreeNode.class);
    }

    /**
     * Convert an instance of ConditionTreeNode to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

