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
 * All images except icon are rendered in the background which can take some time (up to hours if all data is completely generated from scratch). Because of this, they can be null if they are not yet rendered.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T22:12:41.641491730Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Images {
  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  @jakarta.annotation.Nullable
  private String icon;

  public static final String SERIALIZED_NAME_SD = "sd";
  @SerializedName(SERIALIZED_NAME_SD)
  @jakarta.annotation.Nullable
  private String sd;

  public static final String SERIALIZED_NAME_HQ = "hq";
  @SerializedName(SERIALIZED_NAME_HQ)
  @jakarta.annotation.Nullable
  private String hq;

  public static final String SERIALIZED_NAME_HD = "hd";
  @SerializedName(SERIALIZED_NAME_HD)
  @jakarta.annotation.Nullable
  private String hd;

  public Images() {
  }

  public Images icon(@jakarta.annotation.Nullable String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * 64x64 px, always available
   * @return icon
   */
  @jakarta.annotation.Nullable
  public String getIcon() {
    return icon;
  }

  public void setIcon(@jakarta.annotation.Nullable String icon) {
    this.icon = icon;
  }


  public Images sd(@jakarta.annotation.Nullable String sd) {
    this.sd = sd;
    return this;
  }

  /**
   * around 2x the resolution of icon
   * @return sd
   */
  @jakarta.annotation.Nullable
  public String getSd() {
    return sd;
  }

  public void setSd(@jakarta.annotation.Nullable String sd) {
    this.sd = sd;
  }


  public Images hq(@jakarta.annotation.Nullable String hq) {
    this.hq = hq;
    return this;
  }

  /**
   * around 2x the resolution of sd
   * @return hq
   */
  @jakarta.annotation.Nullable
  public String getHq() {
    return hq;
  }

  public void setHq(@jakarta.annotation.Nullable String hq) {
    this.hq = hq;
  }


  public Images hd(@jakarta.annotation.Nullable String hd) {
    this.hd = hd;
    return this;
  }

  /**
   * around 2x the resolution of hd
   * @return hd
   */
  @jakarta.annotation.Nullable
  public String getHd() {
    return hd;
  }

  public void setHd(@jakarta.annotation.Nullable String hd) {
    this.hd = hd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Images images = (Images) o;
    return Objects.equals(this.icon, images.icon) &&
        Objects.equals(this.sd, images.sd) &&
        Objects.equals(this.hq, images.hq) &&
        Objects.equals(this.hd, images.hd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, sd, hq, hd);
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
    sb.append("class Images {\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
    sb.append("    hq: ").append(toIndentedString(hq)).append("\n");
    sb.append("    hd: ").append(toIndentedString(hd)).append("\n");
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
    openapiFields.add("icon");
    openapiFields.add("sd");
    openapiFields.add("hq");
    openapiFields.add("hd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Images
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Images.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Images is not found in the empty JSON string", Images.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Images.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Images` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("sd") != null && !jsonObj.get("sd").isJsonNull()) && !jsonObj.get("sd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sd").toString()));
      }
      if ((jsonObj.get("hq") != null && !jsonObj.get("hq").isJsonNull()) && !jsonObj.get("hq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hq").toString()));
      }
      if ((jsonObj.get("hd") != null && !jsonObj.get("hd").isJsonNull()) && !jsonObj.get("hd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hd").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Images.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Images' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Images> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Images.class));

       return (TypeAdapter<T>) new TypeAdapter<Images>() {
           @Override
           public void write(JsonWriter out, Images value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Images read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Images given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Images
   * @throws IOException if the JSON string is invalid with respect to Images
   */
  public static Images fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Images.class);
  }

  /**
   * Convert an instance of Images to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
