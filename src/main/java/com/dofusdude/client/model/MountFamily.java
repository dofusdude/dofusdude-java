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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * MountFamily
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T00:38:54.296812490Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class MountFamily {
  public static final String SERIALIZED_NAME_ANKAMA_ID = "ankama_id";
  @SerializedName(SERIALIZED_NAME_ANKAMA_ID)
  @jakarta.annotation.Nullable
  private Integer ankamaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public MountFamily() {
  }

  public MountFamily ankamaId(@jakarta.annotation.Nullable Integer ankamaId) {
    this.ankamaId = ankamaId;
    return this;
  }

  /**
   * Get ankamaId
   * @return ankamaId
   */
  @jakarta.annotation.Nullable
  public Integer getAnkamaId() {
    return ankamaId;
  }

  public void setAnkamaId(@jakarta.annotation.Nullable Integer ankamaId) {
    this.ankamaId = ankamaId;
  }


  public MountFamily name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * localized name
   * @return name
   */
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountFamily mountFamily = (MountFamily) o;
    return Objects.equals(this.ankamaId, mountFamily.ankamaId) &&
        Objects.equals(this.name, mountFamily.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ankamaId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountFamily {\n");
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("ankama_id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MountFamily
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MountFamily.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MountFamily is not found in the empty JSON string", MountFamily.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MountFamily.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MountFamily` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MountFamily.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MountFamily' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MountFamily> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MountFamily.class));

       return (TypeAdapter<T>) new TypeAdapter<MountFamily>() {
           @Override
           public void write(JsonWriter out, MountFamily value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MountFamily read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MountFamily given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MountFamily
   * @throws IOException if the JSON string is invalid with respect to MountFamily
   */
  public static MountFamily fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MountFamily.class);
  }

  /**
   * Convert an instance of MountFamily to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

