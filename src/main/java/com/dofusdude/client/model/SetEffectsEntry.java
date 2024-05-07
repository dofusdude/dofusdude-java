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
import com.dofusdude.client.model.SetEffectsEntryType;
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
 * SetEffectsEntry
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T13:27:52.033477054Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class SetEffectsEntry {
  public static final String SERIALIZED_NAME_INT_MINIMUM = "int_minimum";
  @SerializedName(SERIALIZED_NAME_INT_MINIMUM)
  private Integer intMinimum;

  public static final String SERIALIZED_NAME_INT_MAXIMUM = "int_maximum";
  @SerializedName(SERIALIZED_NAME_INT_MAXIMUM)
  private Integer intMaximum;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SetEffectsEntryType type;

  public static final String SERIALIZED_NAME_IGNORE_INT_MIN = "ignore_int_min";
  @SerializedName(SERIALIZED_NAME_IGNORE_INT_MIN)
  private Boolean ignoreIntMin;

  public static final String SERIALIZED_NAME_IGNORE_INT_MAX = "ignore_int_max";
  @SerializedName(SERIALIZED_NAME_IGNORE_INT_MAX)
  private Boolean ignoreIntMax;

  public static final String SERIALIZED_NAME_FORMATTED = "formatted";
  @SerializedName(SERIALIZED_NAME_FORMATTED)
  private String formatted;

  public static final String SERIALIZED_NAME_ITEM_COMBINATION = "item_combination";
  @SerializedName(SERIALIZED_NAME_ITEM_COMBINATION)
  private Integer itemCombination;

  public SetEffectsEntry() {
  }

  public SetEffectsEntry intMinimum(Integer intMinimum) {
    this.intMinimum = intMinimum;
    return this;
  }

   /**
   * minimum int value, can be a single if ignore_int_max and no ignore_int_min
   * @return intMinimum
  **/
  @jakarta.annotation.Nullable
  public Integer getIntMinimum() {
    return intMinimum;
  }

  public void setIntMinimum(Integer intMinimum) {
    this.intMinimum = intMinimum;
  }


  public SetEffectsEntry intMaximum(Integer intMaximum) {
    this.intMaximum = intMaximum;
    return this;
  }

   /**
   * maximum int value, if not ignore_int_max and not ignore_int_min, the effect has a range value
   * @return intMaximum
  **/
  @jakarta.annotation.Nullable
  public Integer getIntMaximum() {
    return intMaximum;
  }

  public void setIntMaximum(Integer intMaximum) {
    this.intMaximum = intMaximum;
  }


  public SetEffectsEntry type(SetEffectsEntryType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public SetEffectsEntryType getType() {
    return type;
  }

  public void setType(SetEffectsEntryType type) {
    this.type = type;
  }


  public SetEffectsEntry ignoreIntMin(Boolean ignoreIntMin) {
    this.ignoreIntMin = ignoreIntMin;
    return this;
  }

   /**
   * ignore the int min field because the actual value is a string. For readability the templated field is the only important field in this case. 
   * @return ignoreIntMin
  **/
  @jakarta.annotation.Nullable
  public Boolean getIgnoreIntMin() {
    return ignoreIntMin;
  }

  public void setIgnoreIntMin(Boolean ignoreIntMin) {
    this.ignoreIntMin = ignoreIntMin;
  }


  public SetEffectsEntry ignoreIntMax(Boolean ignoreIntMax) {
    this.ignoreIntMax = ignoreIntMax;
    return this;
  }

   /**
   * ignore the int max field, if ignore_int_min is true, int min is a single value
   * @return ignoreIntMax
  **/
  @jakarta.annotation.Nullable
  public Boolean getIgnoreIntMax() {
    return ignoreIntMax;
  }

  public void setIgnoreIntMax(Boolean ignoreIntMax) {
    this.ignoreIntMax = ignoreIntMax;
  }


  public SetEffectsEntry formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * all fields from above encoded in a single string
   * @return formatted
  **/
  @jakarta.annotation.Nullable
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }


  public SetEffectsEntry itemCombination(Integer itemCombination) {
    this.itemCombination = itemCombination;
    return this;
  }

   /**
   * how many items it needs to trigger this effect with the given set
   * @return itemCombination
  **/
  @jakarta.annotation.Nullable
  public Integer getItemCombination() {
    return itemCombination;
  }

  public void setItemCombination(Integer itemCombination) {
    this.itemCombination = itemCombination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetEffectsEntry setEffectsEntry = (SetEffectsEntry) o;
    return Objects.equals(this.intMinimum, setEffectsEntry.intMinimum) &&
        Objects.equals(this.intMaximum, setEffectsEntry.intMaximum) &&
        Objects.equals(this.type, setEffectsEntry.type) &&
        Objects.equals(this.ignoreIntMin, setEffectsEntry.ignoreIntMin) &&
        Objects.equals(this.ignoreIntMax, setEffectsEntry.ignoreIntMax) &&
        Objects.equals(this.formatted, setEffectsEntry.formatted) &&
        Objects.equals(this.itemCombination, setEffectsEntry.itemCombination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intMinimum, intMaximum, type, ignoreIntMin, ignoreIntMax, formatted, itemCombination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEffectsEntry {\n");
    sb.append("    intMinimum: ").append(toIndentedString(intMinimum)).append("\n");
    sb.append("    intMaximum: ").append(toIndentedString(intMaximum)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ignoreIntMin: ").append(toIndentedString(ignoreIntMin)).append("\n");
    sb.append("    ignoreIntMax: ").append(toIndentedString(ignoreIntMax)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    itemCombination: ").append(toIndentedString(itemCombination)).append("\n");
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
    openapiFields.add("int_minimum");
    openapiFields.add("int_maximum");
    openapiFields.add("type");
    openapiFields.add("ignore_int_min");
    openapiFields.add("ignore_int_max");
    openapiFields.add("formatted");
    openapiFields.add("item_combination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SetEffectsEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetEffectsEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetEffectsEntry is not found in the empty JSON string", SetEffectsEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetEffectsEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetEffectsEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        SetEffectsEntryType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("formatted") != null && !jsonObj.get("formatted").isJsonNull()) && !jsonObj.get("formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formatted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetEffectsEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetEffectsEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetEffectsEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetEffectsEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<SetEffectsEntry>() {
           @Override
           public void write(JsonWriter out, SetEffectsEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetEffectsEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetEffectsEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetEffectsEntry
  * @throws IOException if the JSON string is invalid with respect to SetEffectsEntry
  */
  public static SetEffectsEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetEffectsEntry.class);
  }

 /**
  * Convert an instance of SetEffectsEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

