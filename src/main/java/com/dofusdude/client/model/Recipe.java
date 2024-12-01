/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.6
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
 * Recipe
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-01T13:23:28.501689324Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Recipe {
  public static final String SERIALIZED_NAME_ITEM_ANKAMA_ID = "item_ankama_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ANKAMA_ID)
  @jakarta.annotation.Nullable
  private Integer itemAnkamaId;

  public static final String SERIALIZED_NAME_ITEM_SUBTYPE = "item_subtype";
  @SerializedName(SERIALIZED_NAME_ITEM_SUBTYPE)
  @jakarta.annotation.Nullable
  private String itemSubtype;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @jakarta.annotation.Nullable
  private Integer quantity;

  public Recipe() {
  }

  public Recipe itemAnkamaId(@jakarta.annotation.Nullable Integer itemAnkamaId) {
    this.itemAnkamaId = itemAnkamaId;
    return this;
  }

  /**
   * Get itemAnkamaId
   * @return itemAnkamaId
   */
  @jakarta.annotation.Nullable
  public Integer getItemAnkamaId() {
    return itemAnkamaId;
  }

  public void setItemAnkamaId(@jakarta.annotation.Nullable Integer itemAnkamaId) {
    this.itemAnkamaId = itemAnkamaId;
  }


  public Recipe itemSubtype(@jakarta.annotation.Nullable String itemSubtype) {
    this.itemSubtype = itemSubtype;
    return this;
  }

  /**
   * Get itemSubtype
   * @return itemSubtype
   */
  @jakarta.annotation.Nullable
  public String getItemSubtype() {
    return itemSubtype;
  }

  public void setItemSubtype(@jakarta.annotation.Nullable String itemSubtype) {
    this.itemSubtype = itemSubtype;
  }


  public Recipe quantity(@jakarta.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @jakarta.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@jakarta.annotation.Nullable Integer quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipe recipe = (Recipe) o;
    return Objects.equals(this.itemAnkamaId, recipe.itemAnkamaId) &&
        Objects.equals(this.itemSubtype, recipe.itemSubtype) &&
        Objects.equals(this.quantity, recipe.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemAnkamaId, itemSubtype, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    sb.append("    itemAnkamaId: ").append(toIndentedString(itemAnkamaId)).append("\n");
    sb.append("    itemSubtype: ").append(toIndentedString(itemSubtype)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("item_ankama_id");
    openapiFields.add("item_subtype");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Recipe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Recipe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Recipe is not found in the empty JSON string", Recipe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Recipe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Recipe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("item_subtype") != null && !jsonObj.get("item_subtype").isJsonNull()) && !jsonObj.get("item_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_subtype").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Recipe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Recipe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Recipe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Recipe.class));

       return (TypeAdapter<T>) new TypeAdapter<Recipe>() {
           @Override
           public void write(JsonWriter out, Recipe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Recipe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Recipe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Recipe
   * @throws IOException if the JSON string is invalid with respect to Recipe
   */
  public static Recipe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Recipe.class);
  }

  /**
   * Convert an instance of Recipe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

