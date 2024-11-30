/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.5
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * PagedLinks
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T22:46:40.395678040Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PagedLinks {
  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  @jakarta.annotation.Nullable
  private String first;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  @jakarta.annotation.Nullable
  private String prev;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  @jakarta.annotation.Nullable
  private String next;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  @jakarta.annotation.Nullable
  private String last;

  public PagedLinks() {
  }

  public PagedLinks first(@jakarta.annotation.Nullable String first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
   */
  @jakarta.annotation.Nullable
  public String getFirst() {
    return first;
  }

  public void setFirst(@jakarta.annotation.Nullable String first) {
    this.first = first;
  }


  public PagedLinks prev(@jakarta.annotation.Nullable String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
   */
  @jakarta.annotation.Nullable
  public String getPrev() {
    return prev;
  }

  public void setPrev(@jakarta.annotation.Nullable String prev) {
    this.prev = prev;
  }


  public PagedLinks next(@jakarta.annotation.Nullable String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @jakarta.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(@jakarta.annotation.Nullable String next) {
    this.next = next;
  }


  public PagedLinks last(@jakarta.annotation.Nullable String last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   */
  @jakarta.annotation.Nullable
  public String getLast() {
    return last;
  }

  public void setLast(@jakarta.annotation.Nullable String last) {
    this.last = last;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedLinks pagedLinks = (PagedLinks) o;
    return Objects.equals(this.first, pagedLinks.first) &&
        Objects.equals(this.prev, pagedLinks.prev) &&
        Objects.equals(this.next, pagedLinks.next) &&
        Objects.equals(this.last, pagedLinks.last);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, prev, next, last);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
    openapiFields.add("first");
    openapiFields.add("prev");
    openapiFields.add("next");
    openapiFields.add("last");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PagedLinks
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PagedLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedLinks is not found in the empty JSON string", PagedLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PagedLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagedLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("first") != null && !jsonObj.get("first").isJsonNull()) && !jsonObj.get("first").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first").toString()));
      }
      if ((jsonObj.get("prev") != null && !jsonObj.get("prev").isJsonNull()) && !jsonObj.get("prev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev").toString()));
      }
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
      if ((jsonObj.get("last") != null && !jsonObj.get("last").isJsonNull()) && !jsonObj.get("last").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedLinks>() {
           @Override
           public void write(JsonWriter out, PagedLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagedLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PagedLinks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PagedLinks
   * @throws IOException if the JSON string is invalid with respect to PagedLinks
   */
  public static PagedLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedLinks.class);
  }

  /**
   * Convert an instance of PagedLinks to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

