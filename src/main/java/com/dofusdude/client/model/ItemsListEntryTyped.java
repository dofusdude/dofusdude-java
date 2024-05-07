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
import com.dofusdude.client.model.ImageUrls;
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
 * ItemsListEntryTyped
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T14:09:31.214283751Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ItemsListEntryTyped {
  public static final String SERIALIZED_NAME_ANKAMA_ID = "ankama_id";
  @SerializedName(SERIALIZED_NAME_ANKAMA_ID)
  private Integer ankamaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ItemsListEntryTypedType type;

  public static final String SERIALIZED_NAME_ITEM_SUBTYPE = "item_subtype";
  @SerializedName(SERIALIZED_NAME_ITEM_SUBTYPE)
  private String itemSubtype;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "image_urls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  private ImageUrls imageUrls;

  public ItemsListEntryTyped() {
  }

  public ItemsListEntryTyped ankamaId(Integer ankamaId) {
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


  public ItemsListEntryTyped name(String name) {
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


  public ItemsListEntryTyped type(ItemsListEntryTypedType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public ItemsListEntryTypedType getType() {
    return type;
  }

  public void setType(ItemsListEntryTypedType type) {
    this.type = type;
  }


  public ItemsListEntryTyped itemSubtype(String itemSubtype) {
    this.itemSubtype = itemSubtype;
    return this;
  }

   /**
   * The API item category. Can be used to build the request URL for this particular item. Always english.
   * @return itemSubtype
  **/
  @jakarta.annotation.Nullable
  public String getItemSubtype() {
    return itemSubtype;
  }

  public void setItemSubtype(String itemSubtype) {
    this.itemSubtype = itemSubtype;
  }


  public ItemsListEntryTyped level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @jakarta.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public ItemsListEntryTyped imageUrls(ImageUrls imageUrls) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsListEntryTyped itemsListEntryTyped = (ItemsListEntryTyped) o;
    return Objects.equals(this.ankamaId, itemsListEntryTyped.ankamaId) &&
        Objects.equals(this.name, itemsListEntryTyped.name) &&
        Objects.equals(this.type, itemsListEntryTyped.type) &&
        Objects.equals(this.itemSubtype, itemsListEntryTyped.itemSubtype) &&
        Objects.equals(this.level, itemsListEntryTyped.level) &&
        Objects.equals(this.imageUrls, itemsListEntryTyped.imageUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ankamaId, name, type, itemSubtype, level, imageUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsListEntryTyped {\n");
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemSubtype: ").append(toIndentedString(itemSubtype)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("item_subtype");
    openapiFields.add("level");
    openapiFields.add("image_urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ItemsListEntryTyped
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ItemsListEntryTyped.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemsListEntryTyped is not found in the empty JSON string", ItemsListEntryTyped.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ItemsListEntryTyped.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemsListEntryTyped` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        ItemsListEntryTypedType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("item_subtype") != null && !jsonObj.get("item_subtype").isJsonNull()) && !jsonObj.get("item_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_subtype").toString()));
      }
      // validate the optional field `image_urls`
      if (jsonObj.get("image_urls") != null && !jsonObj.get("image_urls").isJsonNull()) {
        ImageUrls.validateJsonElement(jsonObj.get("image_urls"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemsListEntryTyped.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemsListEntryTyped' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemsListEntryTyped> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemsListEntryTyped.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemsListEntryTyped>() {
           @Override
           public void write(JsonWriter out, ItemsListEntryTyped value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemsListEntryTyped read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemsListEntryTyped given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemsListEntryTyped
  * @throws IOException if the JSON string is invalid with respect to ItemsListEntryTyped
  */
  public static ItemsListEntryTyped fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemsListEntryTyped.class);
  }

 /**
  * Convert an instance of ItemsListEntryTyped to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

