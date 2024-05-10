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
import com.dofusdude.client.model.EffectsEntry;
import com.dofusdude.client.model.ImageUrls;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * MountListEntry
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T16:58:24.837338827Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MountListEntry {
  public static final String SERIALIZED_NAME_ANKAMA_ID = "ankama_id";
  @SerializedName(SERIALIZED_NAME_ANKAMA_ID)
  private Integer ankamaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "image_urls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  private ImageUrls imageUrls;

  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<EffectsEntry> effects;

  public MountListEntry() {
  }

  public MountListEntry ankamaId(Integer ankamaId) {
    this.ankamaId = ankamaId;
    return this;
  }

   /**
   * Get ankamaId
   * @return ankamaId
  **/
  @jakarta.annotation.Nullable
  public Integer getAnkamaId() {
    return ankamaId;
  }

  public void setAnkamaId(Integer ankamaId) {
    this.ankamaId = ankamaId;
  }


  public MountListEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MountListEntry familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @jakarta.annotation.Nullable
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public MountListEntry imageUrls(ImageUrls imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

   /**
   * Get imageUrls
   * @return imageUrls
  **/
  @jakarta.annotation.Nullable
  public ImageUrls getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(ImageUrls imageUrls) {
    this.imageUrls = imageUrls;
  }


  public MountListEntry effects(List<EffectsEntry> effects) {
    this.effects = effects;
    return this;
  }

  public MountListEntry addEffectsItem(EffectsEntry effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<>();
    }
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * Get effects
   * @return effects
  **/
  @jakarta.annotation.Nullable
  public List<EffectsEntry> getEffects() {
    return effects;
  }

  public void setEffects(List<EffectsEntry> effects) {
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
    MountListEntry mountListEntry = (MountListEntry) o;
    return Objects.equals(this.ankamaId, mountListEntry.ankamaId) &&
        Objects.equals(this.name, mountListEntry.name) &&
        Objects.equals(this.familyName, mountListEntry.familyName) &&
        Objects.equals(this.imageUrls, mountListEntry.imageUrls) &&
        Objects.equals(this.effects, mountListEntry.effects);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ankamaId, name, familyName, imageUrls, effects);
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
    sb.append("class MountListEntry {\n");
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
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
    openapiFields.add("family_name");
    openapiFields.add("image_urls");
    openapiFields.add("effects");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MountListEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MountListEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MountListEntry is not found in the empty JSON string", MountListEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MountListEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MountListEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("family_name") != null && !jsonObj.get("family_name").isJsonNull()) && !jsonObj.get("family_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family_name").toString()));
      }
      // validate the optional field `image_urls`
      if (jsonObj.get("image_urls") != null && !jsonObj.get("image_urls").isJsonNull()) {
        ImageUrls.validateJsonElement(jsonObj.get("image_urls"));
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
            EffectsEntry.validateJsonElement(jsonArrayeffects.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MountListEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MountListEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MountListEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MountListEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<MountListEntry>() {
           @Override
           public void write(JsonWriter out, MountListEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MountListEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MountListEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MountListEntry
  * @throws IOException if the JSON string is invalid with respect to MountListEntry
  */
  public static MountListEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MountListEntry.class);
  }

 /**
  * Convert an instance of MountListEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

