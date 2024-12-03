/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.8
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

import java.util.Objects;
import com.dofusdude.client.model.AlmanaxBonus;
import com.dofusdude.client.model.AlmanaxTribute;
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
 * Almanax
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-03T12:20:40.270086531Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Almanax {
  public static final String SERIALIZED_NAME_BONUS = "bonus";
  @SerializedName(SERIALIZED_NAME_BONUS)
  @jakarta.annotation.Nullable
  private AlmanaxBonus bonus;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @jakarta.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_TRIBUTE = "tribute";
  @SerializedName(SERIALIZED_NAME_TRIBUTE)
  @jakarta.annotation.Nullable
  private AlmanaxTribute tribute;

  public static final String SERIALIZED_NAME_REWARD_KAMAS = "reward_kamas";
  @SerializedName(SERIALIZED_NAME_REWARD_KAMAS)
  @jakarta.annotation.Nullable
  private Integer rewardKamas;

  public Almanax() {
  }

  public Almanax bonus(@jakarta.annotation.Nullable AlmanaxBonus bonus) {
    this.bonus = bonus;
    return this;
  }

  /**
   * Get bonus
   * @return bonus
   */
  @jakarta.annotation.Nullable
  public AlmanaxBonus getBonus() {
    return bonus;
  }

  public void setBonus(@jakarta.annotation.Nullable AlmanaxBonus bonus) {
    this.bonus = bonus;
  }


  public Almanax date(@jakarta.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @jakarta.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@jakarta.annotation.Nullable String date) {
    this.date = date;
  }


  public Almanax tribute(@jakarta.annotation.Nullable AlmanaxTribute tribute) {
    this.tribute = tribute;
    return this;
  }

  /**
   * Get tribute
   * @return tribute
   */
  @jakarta.annotation.Nullable
  public AlmanaxTribute getTribute() {
    return tribute;
  }

  public void setTribute(@jakarta.annotation.Nullable AlmanaxTribute tribute) {
    this.tribute = tribute;
  }


  public Almanax rewardKamas(@jakarta.annotation.Nullable Integer rewardKamas) {
    this.rewardKamas = rewardKamas;
    return this;
  }

  /**
   * Amount of Kamas you get as reward for finishing this Almanax quest.
   * @return rewardKamas
   */
  @jakarta.annotation.Nullable
  public Integer getRewardKamas() {
    return rewardKamas;
  }

  public void setRewardKamas(@jakarta.annotation.Nullable Integer rewardKamas) {
    this.rewardKamas = rewardKamas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Almanax almanax = (Almanax) o;
    return Objects.equals(this.bonus, almanax.bonus) &&
        Objects.equals(this.date, almanax.date) &&
        Objects.equals(this.tribute, almanax.tribute) &&
        Objects.equals(this.rewardKamas, almanax.rewardKamas);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonus, date, tribute, rewardKamas);
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
    sb.append("class Almanax {\n");
    sb.append("    bonus: ").append(toIndentedString(bonus)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    tribute: ").append(toIndentedString(tribute)).append("\n");
    sb.append("    rewardKamas: ").append(toIndentedString(rewardKamas)).append("\n");
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
    openapiFields.add("bonus");
    openapiFields.add("date");
    openapiFields.add("tribute");
    openapiFields.add("reward_kamas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Almanax
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Almanax.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Almanax is not found in the empty JSON string", Almanax.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Almanax.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Almanax` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bonus`
      if (jsonObj.get("bonus") != null && !jsonObj.get("bonus").isJsonNull()) {
        AlmanaxBonus.validateJsonElement(jsonObj.get("bonus"));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      // validate the optional field `tribute`
      if (jsonObj.get("tribute") != null && !jsonObj.get("tribute").isJsonNull()) {
        AlmanaxTribute.validateJsonElement(jsonObj.get("tribute"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Almanax.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Almanax' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Almanax> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Almanax.class));

       return (TypeAdapter<T>) new TypeAdapter<Almanax>() {
           @Override
           public void write(JsonWriter out, Almanax value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Almanax read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Almanax given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Almanax
   * @throws IOException if the JSON string is invalid with respect to Almanax
   */
  public static Almanax fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Almanax.class);
  }

  /**
   * Convert an instance of Almanax to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

