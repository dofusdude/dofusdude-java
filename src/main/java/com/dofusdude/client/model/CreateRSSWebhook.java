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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * 
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T22:12:41.641491730Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class CreateRSSWebhook {
  public static final String SERIALIZED_NAME_WHITELIST = "whitelist";
  @SerializedName(SERIALIZED_NAME_WHITELIST)
  @jakarta.annotation.Nullable
  private List<String> whitelist;

  public static final String SERIALIZED_NAME_BLACKLIST = "blacklist";
  @SerializedName(SERIALIZED_NAME_BLACKLIST)
  @jakarta.annotation.Nullable
  private List<String> blacklist;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  @jakarta.annotation.Nonnull
  private Set<String> subscriptions = new LinkedHashSet<>();

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
  @jakarta.annotation.Nonnull
  private FormatEnum format;

  public static final String SERIALIZED_NAME_PREVIEW_LENGTH = "preview_length";
  @SerializedName(SERIALIZED_NAME_PREVIEW_LENGTH)
  @jakarta.annotation.Nullable
  private Integer previewLength;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  @jakarta.annotation.Nonnull
  private URI callback;

  public CreateRSSWebhook() {
  }

  public CreateRSSWebhook whitelist(@jakarta.annotation.Nullable List<String> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public CreateRSSWebhook addWhitelistItem(String whitelistItem) {
    if (this.whitelist == null) {
      this.whitelist = new ArrayList<>();
    }
    this.whitelist.add(whitelistItem);
    return this;
  }

  /**
   * Get whitelist
   * @return whitelist
   */
  @jakarta.annotation.Nullable
  public List<String> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(@jakarta.annotation.Nullable List<String> whitelist) {
    this.whitelist = whitelist;
  }


  public CreateRSSWebhook blacklist(@jakarta.annotation.Nullable List<String> blacklist) {
    this.blacklist = blacklist;
    return this;
  }

  public CreateRSSWebhook addBlacklistItem(String blacklistItem) {
    if (this.blacklist == null) {
      this.blacklist = new ArrayList<>();
    }
    this.blacklist.add(blacklistItem);
    return this;
  }

  /**
   * Get blacklist
   * @return blacklist
   */
  @jakarta.annotation.Nullable
  public List<String> getBlacklist() {
    return blacklist;
  }

  public void setBlacklist(@jakarta.annotation.Nullable List<String> blacklist) {
    this.blacklist = blacklist;
  }


  public CreateRSSWebhook subscriptions(@jakarta.annotation.Nonnull Set<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public CreateRSSWebhook addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new LinkedHashSet<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get the available subscriptions with /meta/webhooks/rss
   * @return subscriptions
   */
  @jakarta.annotation.Nonnull
  public Set<String> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(@jakarta.annotation.Nonnull Set<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  public CreateRSSWebhook format(@jakarta.annotation.Nonnull FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @jakarta.annotation.Nonnull
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(@jakarta.annotation.Nonnull FormatEnum format) {
    this.format = format;
  }


  public CreateRSSWebhook previewLength(@jakarta.annotation.Nullable Integer previewLength) {
    this.previewLength = previewLength;
    return this;
  }

  /**
   * Get previewLength
   * minimum: 0
   * maximum: 4000
   * @return previewLength
   */
  @jakarta.annotation.Nullable
  public Integer getPreviewLength() {
    return previewLength;
  }

  public void setPreviewLength(@jakarta.annotation.Nullable Integer previewLength) {
    this.previewLength = previewLength;
  }


  public CreateRSSWebhook callback(@jakarta.annotation.Nonnull URI callback) {
    this.callback = callback;
    return this;
  }

  /**
   * Discord Webhook URL
   * @return callback
   */
  @jakarta.annotation.Nonnull
  public URI getCallback() {
    return callback;
  }

  public void setCallback(@jakarta.annotation.Nonnull URI callback) {
    this.callback = callback;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRSSWebhook createRSSWebhook = (CreateRSSWebhook) o;
    return Objects.equals(this.whitelist, createRSSWebhook.whitelist) &&
        Objects.equals(this.blacklist, createRSSWebhook.blacklist) &&
        Objects.equals(this.subscriptions, createRSSWebhook.subscriptions) &&
        Objects.equals(this.format, createRSSWebhook.format) &&
        Objects.equals(this.previewLength, createRSSWebhook.previewLength) &&
        Objects.equals(this.callback, createRSSWebhook.callback);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelist, blacklist, subscriptions, format, previewLength, callback);
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
    sb.append("class CreateRSSWebhook {\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    previewLength: ").append(toIndentedString(previewLength)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
    openapiFields.add("whitelist");
    openapiFields.add("blacklist");
    openapiFields.add("subscriptions");
    openapiFields.add("format");
    openapiFields.add("preview_length");
    openapiFields.add("callback");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriptions");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("callback");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateRSSWebhook
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateRSSWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRSSWebhook is not found in the empty JSON string", CreateRSSWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateRSSWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateRSSWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRSSWebhook.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("whitelist") != null && !jsonObj.get("whitelist").isJsonNull() && !jsonObj.get("whitelist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `whitelist` to be an array in the JSON string but got `%s`", jsonObj.get("whitelist").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("blacklist") != null && !jsonObj.get("blacklist").isJsonNull() && !jsonObj.get("blacklist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blacklist` to be an array in the JSON string but got `%s`", jsonObj.get("blacklist").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("subscriptions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("subscriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the required field `format`
      FormatEnum.validateJsonElement(jsonObj.get("format"));
      if (!jsonObj.get("callback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callback").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRSSWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRSSWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRSSWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRSSWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRSSWebhook>() {
           @Override
           public void write(JsonWriter out, CreateRSSWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRSSWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateRSSWebhook given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateRSSWebhook
   * @throws IOException if the JSON string is invalid with respect to CreateRSSWebhook
   */
  public static CreateRSSWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRSSWebhook.class);
  }

  /**
   * Convert an instance of CreateRSSWebhook to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

