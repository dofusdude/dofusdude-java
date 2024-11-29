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
import com.dofusdude.client.model.Effect;
import com.dofusdude.client.model.Images;
import com.dofusdude.client.model.MountFamily;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Mount
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T23:09:16.084170801Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Mount {
  public static final String SERIALIZED_NAME_ANKAMA_ID = "ankama_id";
  @SerializedName(SERIALIZED_NAME_ANKAMA_ID)
  @jakarta.annotation.Nullable
  private Integer ankamaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  @jakarta.annotation.Nullable
  private MountFamily family;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "image_urls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  @jakarta.annotation.Nullable
  private Images imageUrls;

  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  @jakarta.annotation.Nullable
  private List<Effect> effects;

  public Mount() {
  }

  public Mount ankamaId(@jakarta.annotation.Nullable Integer ankamaId) {
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


  public Mount name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public Mount family(@jakarta.annotation.Nullable MountFamily family) {
    this.family = family;
    return this;
  }

  /**
   * Get family
   * @return family
   */
  @jakarta.annotation.Nullable
  public MountFamily getFamily() {
    return family;
  }

  public void setFamily(@jakarta.annotation.Nullable MountFamily family) {
    this.family = family;
  }


  public Mount imageUrls(@jakarta.annotation.Nullable Images imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  /**
   * Get imageUrls
   * @return imageUrls
   */
  @jakarta.annotation.Nullable
  public Images getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(@jakarta.annotation.Nullable Images imageUrls) {
    this.imageUrls = imageUrls;
  }


  public Mount effects(@jakarta.annotation.Nullable List<Effect> effects) {
    this.effects = effects;
    return this;
  }

  public Mount addEffectsItem(Effect effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<>();
    }
    this.effects.add(effectsItem);
    return this;
  }

  /**
   * Get effects
   * @return effects
   */
  @jakarta.annotation.Nullable
  public List<Effect> getEffects() {
    return effects;
  }

  public void setEffects(@jakarta.annotation.Nullable List<Effect> effects) {
    this.effects = effects;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mount mount = (Mount) o;
    return Objects.equals(this.ankamaId, mount.ankamaId) &&
        Objects.equals(this.name, mount.name) &&
        Objects.equals(this.family, mount.family) &&
        Objects.equals(this.imageUrls, mount.imageUrls) &&
        Objects.equals(this.effects, mount.effects);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ankamaId, name, family, imageUrls, effects);
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
    sb.append("class Mount {\n");
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
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
    openapiFields.add("family");
    openapiFields.add("image_urls");
    openapiFields.add("effects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Mount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Mount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mount is not found in the empty JSON string", Mount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Mount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Mount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `family`
      if (jsonObj.get("family") != null && !jsonObj.get("family").isJsonNull()) {
        MountFamily.validateJsonElement(jsonObj.get("family"));
      }
      // validate the optional field `image_urls`
      if (jsonObj.get("image_urls") != null && !jsonObj.get("image_urls").isJsonNull()) {
        Images.validateJsonElement(jsonObj.get("image_urls"));
      }
      if (jsonObj.get("effects") != null && !jsonObj.get("effects").isJsonNull()) {
        JsonArray jsonArrayeffects = jsonObj.getAsJsonArray("effects");
        if (jsonArrayeffects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("effects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `effects` to be an array in the JSON string but got `%s`", jsonObj.get("effects").toString()));
          }

          // validate the optional field `effects` (array)
          for (int i = 0; i < jsonArrayeffects.size(); i++) {
            Effect.validateJsonElement(jsonArrayeffects.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mount.class));

       return (TypeAdapter<T>) new TypeAdapter<Mount>() {
           @Override
           public void write(JsonWriter out, Mount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Mount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Mount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Mount
   * @throws IOException if the JSON string is invalid with respect to Mount
   */
  public static Mount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mount.class);
  }

  /**
   * Convert an instance of Mount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

