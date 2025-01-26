/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.10
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
 * CreateAlmanaxWebhookDailySettings
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-26T15:14:32.635328151Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class CreateAlmanaxWebhookDailySettings {
  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @jakarta.annotation.Nullable
  private String timezone = "Europe/Paris";

  public static final String SERIALIZED_NAME_MIDNIGHT_OFFSET = "midnight_offset";
  @SerializedName(SERIALIZED_NAME_MIDNIGHT_OFFSET)
  @jakarta.annotation.Nullable
  private Integer midnightOffset = 0;

  public CreateAlmanaxWebhookDailySettings() {
  }

  public CreateAlmanaxWebhookDailySettings timezone(@jakarta.annotation.Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Timezone of your community to determine midnight.
   * @return timezone
   */
  @jakarta.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(@jakarta.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public CreateAlmanaxWebhookDailySettings midnightOffset(@jakarta.annotation.Nullable Integer midnightOffset) {
    this.midnightOffset = midnightOffset;
    return this;
  }

  /**
   * Hours added to midnight at the selected timezone. 8 &#x3D; 8:00 in the morning.
   * minimum: 0
   * maximum: 23
   * @return midnightOffset
   */
  @jakarta.annotation.Nullable
  public Integer getMidnightOffset() {
    return midnightOffset;
  }

  public void setMidnightOffset(@jakarta.annotation.Nullable Integer midnightOffset) {
    this.midnightOffset = midnightOffset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAlmanaxWebhookDailySettings createAlmanaxWebhookDailySettings = (CreateAlmanaxWebhookDailySettings) o;
    return Objects.equals(this.timezone, createAlmanaxWebhookDailySettings.timezone) &&
        Objects.equals(this.midnightOffset, createAlmanaxWebhookDailySettings.midnightOffset);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, midnightOffset);
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
    sb.append("class CreateAlmanaxWebhookDailySettings {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    midnightOffset: ").append(toIndentedString(midnightOffset)).append("\n");
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
    openapiFields.add("timezone");
    openapiFields.add("midnight_offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAlmanaxWebhookDailySettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAlmanaxWebhookDailySettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAlmanaxWebhookDailySettings is not found in the empty JSON string", CreateAlmanaxWebhookDailySettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAlmanaxWebhookDailySettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAlmanaxWebhookDailySettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAlmanaxWebhookDailySettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAlmanaxWebhookDailySettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAlmanaxWebhookDailySettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAlmanaxWebhookDailySettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAlmanaxWebhookDailySettings>() {
           @Override
           public void write(JsonWriter out, CreateAlmanaxWebhookDailySettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAlmanaxWebhookDailySettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAlmanaxWebhookDailySettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAlmanaxWebhookDailySettings
   * @throws IOException if the JSON string is invalid with respect to CreateAlmanaxWebhookDailySettings
   */
  public static CreateAlmanaxWebhookDailySettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAlmanaxWebhookDailySettings.class);
  }

  /**
   * Convert an instance of CreateAlmanaxWebhookDailySettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

