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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
 * TwitterWebhook
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T13:23:04.641753611Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class TwitterWebhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_WHITELIST = "whitelist";
  @SerializedName(SERIALIZED_NAME_WHITELIST)
  private List<String> whitelist;

  public static final String SERIALIZED_NAME_BLACKLIST = "blacklist";
  @SerializedName(SERIALIZED_NAME_BLACKLIST)
  private List<String> blacklist;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<String> subscriptions = new ArrayList<>();

  /**
   * Gets or Sets format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    DISCORD("discord");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_PREVIEW_LENGTH = "preview_length";
  @SerializedName(SERIALIZED_NAME_PREVIEW_LENGTH)
  private Integer previewLength;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_FIRED_AT = "last_fired_at";
  @SerializedName(SERIALIZED_NAME_LAST_FIRED_AT)
  private OffsetDateTime lastFiredAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public TwitterWebhook() {
  }

  public TwitterWebhook id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public TwitterWebhook whitelist(List<String> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public TwitterWebhook addWhitelistItem(String whitelistItem) {
    if (this.whitelist == null) {
      this.whitelist = new ArrayList<>();
    }
    this.whitelist.add(whitelistItem);
    return this;
  }

   /**
   * Get whitelist
   * @return whitelist
  **/
  @jakarta.annotation.Nullable
  public List<String> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }


  public TwitterWebhook blacklist(List<String> blacklist) {
    this.blacklist = blacklist;
    return this;
  }

  public TwitterWebhook addBlacklistItem(String blacklistItem) {
    if (this.blacklist == null) {
      this.blacklist = new ArrayList<>();
    }
    this.blacklist.add(blacklistItem);
    return this;
  }

   /**
   * Get blacklist
   * @return blacklist
  **/
  @jakarta.annotation.Nullable
  public List<String> getBlacklist() {
    return blacklist;
  }

  public void setBlacklist(List<String> blacklist) {
    this.blacklist = blacklist;
  }


  public TwitterWebhook subscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public TwitterWebhook addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @jakarta.annotation.Nullable
  public List<String> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  public TwitterWebhook format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @jakarta.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public TwitterWebhook previewLength(Integer previewLength) {
    this.previewLength = previewLength;
    return this;
  }

   /**
   * Get previewLength
   * minimum: 0
   * maximum: 280
   * @return previewLength
  **/
  @jakarta.annotation.Nullable
  public Integer getPreviewLength() {
    return previewLength;
  }

  public void setPreviewLength(Integer previewLength) {
    this.previewLength = previewLength;
  }


  public TwitterWebhook createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TwitterWebhook lastFiredAt(OffsetDateTime lastFiredAt) {
    this.lastFiredAt = lastFiredAt;
    return this;
  }

   /**
   * Get lastFiredAt
   * @return lastFiredAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getLastFiredAt() {
    return lastFiredAt;
  }

  public void setLastFiredAt(OffsetDateTime lastFiredAt) {
    this.lastFiredAt = lastFiredAt;
  }


  public TwitterWebhook updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterWebhook twitterWebhook = (TwitterWebhook) o;
    return Objects.equals(this.id, twitterWebhook.id) &&
        Objects.equals(this.whitelist, twitterWebhook.whitelist) &&
        Objects.equals(this.blacklist, twitterWebhook.blacklist) &&
        Objects.equals(this.subscriptions, twitterWebhook.subscriptions) &&
        Objects.equals(this.format, twitterWebhook.format) &&
        Objects.equals(this.previewLength, twitterWebhook.previewLength) &&
        Objects.equals(this.createdAt, twitterWebhook.createdAt) &&
        Objects.equals(this.lastFiredAt, twitterWebhook.lastFiredAt) &&
        Objects.equals(this.updatedAt, twitterWebhook.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, whitelist, blacklist, subscriptions, format, previewLength, createdAt, lastFiredAt, updatedAt);
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
    sb.append("class TwitterWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    previewLength: ").append(toIndentedString(previewLength)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastFiredAt: ").append(toIndentedString(lastFiredAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("whitelist");
    openapiFields.add("blacklist");
    openapiFields.add("subscriptions");
    openapiFields.add("format");
    openapiFields.add("preview_length");
    openapiFields.add("created_at");
    openapiFields.add("last_fired_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TwitterWebhook
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TwitterWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TwitterWebhook is not found in the empty JSON string", TwitterWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TwitterWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TwitterWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("whitelist") != null && !jsonObj.get("whitelist").isJsonNull() && !jsonObj.get("whitelist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `whitelist` to be an array in the JSON string but got `%s`", jsonObj.get("whitelist").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("blacklist") != null && !jsonObj.get("blacklist").isJsonNull() && !jsonObj.get("blacklist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blacklist` to be an array in the JSON string but got `%s`", jsonObj.get("blacklist").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull() && !jsonObj.get("subscriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TwitterWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TwitterWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TwitterWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TwitterWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<TwitterWebhook>() {
           @Override
           public void write(JsonWriter out, TwitterWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TwitterWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TwitterWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TwitterWebhook
  * @throws IOException if the JSON string is invalid with respect to TwitterWebhook
  */
  public static TwitterWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TwitterWebhook.class);
  }

 /**
  * Convert an instance of TwitterWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

