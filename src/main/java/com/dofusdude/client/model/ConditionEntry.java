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
import com.dofusdude.client.model.ItemsListEntryTypedType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * 
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T13:27:52.033477054Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ConditionEntry {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_INT_VALUE = "int_value";
  @SerializedName(SERIALIZED_NAME_INT_VALUE)
  private Integer intValue;

  public static final String SERIALIZED_NAME_ELEMENT = "element";
  @SerializedName(SERIALIZED_NAME_ELEMENT)
  private ItemsListEntryTypedType element;

  public ConditionEntry() {
  }

  public ConditionEntry operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @jakarta.annotation.Nullable
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public ConditionEntry intValue(Integer intValue) {
    this.intValue = intValue;
    return this;
  }

   /**
   * Get intValue
   * @return intValue
  **/
  @jakarta.annotation.Nullable
  public Integer getIntValue() {
    return intValue;
  }

  public void setIntValue(Integer intValue) {
    this.intValue = intValue;
  }


  public ConditionEntry element(ItemsListEntryTypedType element) {
    this.element = element;
    return this;
  }

   /**
   * Get element
   * @return element
  **/
  @jakarta.annotation.Nullable
  public ItemsListEntryTypedType getElement() {
    return element;
  }

  public void setElement(ItemsListEntryTypedType element) {
    this.element = element;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionEntry conditionEntry = (ConditionEntry) o;
    return Objects.equals(this.operator, conditionEntry.operator) &&
        Objects.equals(this.intValue, conditionEntry.intValue) &&
        Objects.equals(this.element, conditionEntry.element);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, intValue, element);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionEntry {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    intValue: ").append(toIndentedString(intValue)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("operator");
    openapiFields.add("int_value");
    openapiFields.add("element");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConditionEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConditionEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConditionEntry is not found in the empty JSON string", ConditionEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConditionEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConditionEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the optional field `element`
      if (jsonObj.get("element") != null && !jsonObj.get("element").isJsonNull()) {
        ItemsListEntryTypedType.validateJsonElement(jsonObj.get("element"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConditionEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConditionEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConditionEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConditionEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ConditionEntry>() {
           @Override
           public void write(JsonWriter out, ConditionEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConditionEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConditionEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConditionEntry
  * @throws IOException if the JSON string is invalid with respect to ConditionEntry
  */
  public static ConditionEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConditionEntry.class);
  }

 /**
  * Convert an instance of ConditionEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

