/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.3
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

import java.util.Objects;
import com.dofusdude.client.model.CreateAlmanaxWebhookDailySettings;
import com.dofusdude.client.model.CreateAlmanaxWebhookMentionsValueInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
 * CreateAlmanaxWebhook
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-30T00:48:41.481361237Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class CreateAlmanaxWebhook {
  public static final String SERIALIZED_NAME_BONUS_WHITELIST = "bonus_whitelist";
  @SerializedName(SERIALIZED_NAME_BONUS_WHITELIST)
  @jakarta.annotation.Nullable
  private List<String> bonusWhitelist;

  public static final String SERIALIZED_NAME_BONUS_BLACKLIST = "bonus_blacklist";
  @SerializedName(SERIALIZED_NAME_BONUS_BLACKLIST)
  @jakarta.annotation.Nullable
  private List<String> bonusBlacklist;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  @jakarta.annotation.Nonnull
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
  @jakarta.annotation.Nonnull
  private FormatEnum format;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  @jakarta.annotation.Nonnull
  private URI callback;

  public static final String SERIALIZED_NAME_DAILY_SETTINGS = "daily_settings";
  @SerializedName(SERIALIZED_NAME_DAILY_SETTINGS)
  @jakarta.annotation.Nullable
  private CreateAlmanaxWebhookDailySettings dailySettings;

  public static final String SERIALIZED_NAME_ISO_DATE = "iso_date";
  @SerializedName(SERIALIZED_NAME_ISO_DATE)
  @jakarta.annotation.Nullable
  private Boolean isoDate = false;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  @jakarta.annotation.Nullable
  private Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions;

  /**
   * Gets or Sets intervals
   */
  @JsonAdapter(IntervalsEnum.Adapter.class)
  public enum IntervalsEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly");

    private String value;

    IntervalsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalsEnum fromValue(String value) {
      for (IntervalsEnum b : IntervalsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IntervalsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IntervalsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IntervalsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INTERVALS = "intervals";
  @SerializedName(SERIALIZED_NAME_INTERVALS)
  @jakarta.annotation.Nonnull
  private Set<IntervalsEnum> intervals = new LinkedHashSet<>();

  /**
   * When to post the weekly preview at the specified time.
   */
  @JsonAdapter(WeeklyWeekdayEnum.Adapter.class)
  public enum WeeklyWeekdayEnum {
    SUNDAY("sunday"),
    
    MONDAY("monday"),
    
    TUESDAY("tuesday"),
    
    WEDNESDAY("wednesday"),
    
    THURSDAY("thursday"),
    
    FRIDAY("friday"),
    
    SATURDAY("saturday");

    private String value;

    WeeklyWeekdayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WeeklyWeekdayEnum fromValue(String value) {
      for (WeeklyWeekdayEnum b : WeeklyWeekdayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WeeklyWeekdayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WeeklyWeekdayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WeeklyWeekdayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WeeklyWeekdayEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WeeklyWeekdayEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WEEKLY_WEEKDAY = "weekly_weekday";
  @SerializedName(SERIALIZED_NAME_WEEKLY_WEEKDAY)
  @jakarta.annotation.Nullable
  private WeeklyWeekdayEnum weeklyWeekday;

  public CreateAlmanaxWebhook() {
  }

  public CreateAlmanaxWebhook bonusWhitelist(@jakarta.annotation.Nullable List<String> bonusWhitelist) {
    this.bonusWhitelist = bonusWhitelist;
    return this;
  }

  public CreateAlmanaxWebhook addBonusWhitelistItem(String bonusWhitelistItem) {
    if (this.bonusWhitelist == null) {
      this.bonusWhitelist = new ArrayList<>();
    }
    this.bonusWhitelist.add(bonusWhitelistItem);
    return this;
  }

  /**
   * from all available bonuses (ids) from /dofus3/meta/{language}/almanax/bonuses
   * @return bonusWhitelist
   */
  @jakarta.annotation.Nullable
  public List<String> getBonusWhitelist() {
    return bonusWhitelist;
  }

  public void setBonusWhitelist(@jakarta.annotation.Nullable List<String> bonusWhitelist) {
    this.bonusWhitelist = bonusWhitelist;
  }


  public CreateAlmanaxWebhook bonusBlacklist(@jakarta.annotation.Nullable List<String> bonusBlacklist) {
    this.bonusBlacklist = bonusBlacklist;
    return this;
  }

  public CreateAlmanaxWebhook addBonusBlacklistItem(String bonusBlacklistItem) {
    if (this.bonusBlacklist == null) {
      this.bonusBlacklist = new ArrayList<>();
    }
    this.bonusBlacklist.add(bonusBlacklistItem);
    return this;
  }

  /**
   * from all available bonuses (ids) from /dofus3/meta/{language}/almanax/bonuses
   * @return bonusBlacklist
   */
  @jakarta.annotation.Nullable
  public List<String> getBonusBlacklist() {
    return bonusBlacklist;
  }

  public void setBonusBlacklist(@jakarta.annotation.Nullable List<String> bonusBlacklist) {
    this.bonusBlacklist = bonusBlacklist;
  }


  public CreateAlmanaxWebhook subscriptions(@jakarta.annotation.Nonnull List<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public CreateAlmanaxWebhook addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get the available subscriptions with /meta/webhooks/almanax
   * @return subscriptions
   */
  @jakarta.annotation.Nonnull
  public List<String> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(@jakarta.annotation.Nonnull List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  public CreateAlmanaxWebhook format(@jakarta.annotation.Nonnull FormatEnum format) {
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


  public CreateAlmanaxWebhook callback(@jakarta.annotation.Nonnull URI callback) {
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


  public CreateAlmanaxWebhook dailySettings(@jakarta.annotation.Nullable CreateAlmanaxWebhookDailySettings dailySettings) {
    this.dailySettings = dailySettings;
    return this;
  }

  /**
   * Get dailySettings
   * @return dailySettings
   */
  @jakarta.annotation.Nullable
  public CreateAlmanaxWebhookDailySettings getDailySettings() {
    return dailySettings;
  }

  public void setDailySettings(@jakarta.annotation.Nullable CreateAlmanaxWebhookDailySettings dailySettings) {
    this.dailySettings = dailySettings;
  }


  public CreateAlmanaxWebhook isoDate(@jakarta.annotation.Nullable Boolean isoDate) {
    this.isoDate = isoDate;
    return this;
  }

  /**
   * If false, it will use common local time formats and weekday translations. If true, the format is YYYY-MM-DD.
   * @return isoDate
   */
  @jakarta.annotation.Nullable
  public Boolean getIsoDate() {
    return isoDate;
  }

  public void setIsoDate(@jakarta.annotation.Nullable Boolean isoDate) {
    this.isoDate = isoDate;
  }


  public CreateAlmanaxWebhook mentions(@jakarta.annotation.Nullable Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions) {
    this.mentions = mentions;
    return this;
  }

  public CreateAlmanaxWebhook putMentionsItem(String key, List<CreateAlmanaxWebhookMentionsValueInner> mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new HashMap<>();
    }
    this.mentions.put(key, mentionsItem);
    return this;
  }

  /**
   * Almanax bonus ids mapped to array of mentions.
   * @return mentions
   */
  @jakarta.annotation.Nullable
  public Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> getMentions() {
    return mentions;
  }

  public void setMentions(@jakarta.annotation.Nullable Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions) {
    this.mentions = mentions;
  }


  public CreateAlmanaxWebhook intervals(@jakarta.annotation.Nonnull Set<IntervalsEnum> intervals) {
    this.intervals = intervals;
    return this;
  }

  public CreateAlmanaxWebhook addIntervalsItem(IntervalsEnum intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new LinkedHashSet<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

  /**
   * - Daily posts each day, filtering with Black/Whitelist and mentions are applied daily. - Weekly posts the next 7 days (excluding the posting day) once per week at the specified time. With only weekly selected, of all mentions, only prior notices will come through daily. The 7 day preview gets filtered by the Black/Whitelist. - Monthly posts a preview of the next month from first to last date. The post will be on the last day of a month (ignoring day of the week) at the specified time. Mentions and filtering works like weekly. The biggest difference between daily and the other two is that daily always posts the current day while monthly and weekly only show future days. You can always combine the intervals by selecting multiple intervals for one hook or create multiple hooks for the same channel with different settings to get every highly specific combination you want.
   * @return intervals
   */
  @jakarta.annotation.Nonnull
  public Set<IntervalsEnum> getIntervals() {
    return intervals;
  }

  public void setIntervals(@jakarta.annotation.Nonnull Set<IntervalsEnum> intervals) {
    this.intervals = intervals;
  }


  public CreateAlmanaxWebhook weeklyWeekday(@jakarta.annotation.Nullable WeeklyWeekdayEnum weeklyWeekday) {
    this.weeklyWeekday = weeklyWeekday;
    return this;
  }

  /**
   * When to post the weekly preview at the specified time.
   * @return weeklyWeekday
   */
  @jakarta.annotation.Nullable
  public WeeklyWeekdayEnum getWeeklyWeekday() {
    return weeklyWeekday;
  }

  public void setWeeklyWeekday(@jakarta.annotation.Nullable WeeklyWeekdayEnum weeklyWeekday) {
    this.weeklyWeekday = weeklyWeekday;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAlmanaxWebhook createAlmanaxWebhook = (CreateAlmanaxWebhook) o;
    return Objects.equals(this.bonusWhitelist, createAlmanaxWebhook.bonusWhitelist) &&
        Objects.equals(this.bonusBlacklist, createAlmanaxWebhook.bonusBlacklist) &&
        Objects.equals(this.subscriptions, createAlmanaxWebhook.subscriptions) &&
        Objects.equals(this.format, createAlmanaxWebhook.format) &&
        Objects.equals(this.callback, createAlmanaxWebhook.callback) &&
        Objects.equals(this.dailySettings, createAlmanaxWebhook.dailySettings) &&
        Objects.equals(this.isoDate, createAlmanaxWebhook.isoDate) &&
        Objects.equals(this.mentions, createAlmanaxWebhook.mentions) &&
        Objects.equals(this.intervals, createAlmanaxWebhook.intervals) &&
        Objects.equals(this.weeklyWeekday, createAlmanaxWebhook.weeklyWeekday);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonusWhitelist, bonusBlacklist, subscriptions, format, callback, dailySettings, isoDate, mentions, intervals, weeklyWeekday);
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
    sb.append("class CreateAlmanaxWebhook {\n");
    sb.append("    bonusWhitelist: ").append(toIndentedString(bonusWhitelist)).append("\n");
    sb.append("    bonusBlacklist: ").append(toIndentedString(bonusBlacklist)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    dailySettings: ").append(toIndentedString(dailySettings)).append("\n");
    sb.append("    isoDate: ").append(toIndentedString(isoDate)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    weeklyWeekday: ").append(toIndentedString(weeklyWeekday)).append("\n");
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
    openapiFields.add("bonus_whitelist");
    openapiFields.add("bonus_blacklist");
    openapiFields.add("subscriptions");
    openapiFields.add("format");
    openapiFields.add("callback");
    openapiFields.add("daily_settings");
    openapiFields.add("iso_date");
    openapiFields.add("mentions");
    openapiFields.add("intervals");
    openapiFields.add("weekly_weekday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriptions");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("callback");
    openapiRequiredFields.add("intervals");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateAlmanaxWebhook
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAlmanaxWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAlmanaxWebhook is not found in the empty JSON string", CreateAlmanaxWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAlmanaxWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAlmanaxWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAlmanaxWebhook.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("bonus_whitelist") != null && !jsonObj.get("bonus_whitelist").isJsonNull() && !jsonObj.get("bonus_whitelist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonus_whitelist` to be an array in the JSON string but got `%s`", jsonObj.get("bonus_whitelist").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bonus_blacklist") != null && !jsonObj.get("bonus_blacklist").isJsonNull() && !jsonObj.get("bonus_blacklist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonus_blacklist` to be an array in the JSON string but got `%s`", jsonObj.get("bonus_blacklist").toString()));
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
      // validate the optional field `daily_settings`
      if (jsonObj.get("daily_settings") != null && !jsonObj.get("daily_settings").isJsonNull()) {
        CreateAlmanaxWebhookDailySettings.validateJsonElement(jsonObj.get("daily_settings"));
      }
      // ensure the required json array is present
      if (jsonObj.get("intervals") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("intervals").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `intervals` to be an array in the JSON string but got `%s`", jsonObj.get("intervals").toString()));
      }
      if ((jsonObj.get("weekly_weekday") != null && !jsonObj.get("weekly_weekday").isJsonNull()) && !jsonObj.get("weekly_weekday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weekly_weekday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weekly_weekday").toString()));
      }
      // validate the optional field `weekly_weekday`
      if (jsonObj.get("weekly_weekday") != null && !jsonObj.get("weekly_weekday").isJsonNull()) {
        WeeklyWeekdayEnum.validateJsonElement(jsonObj.get("weekly_weekday"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAlmanaxWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAlmanaxWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAlmanaxWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAlmanaxWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAlmanaxWebhook>() {
           @Override
           public void write(JsonWriter out, CreateAlmanaxWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAlmanaxWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateAlmanaxWebhook given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAlmanaxWebhook
   * @throws IOException if the JSON string is invalid with respect to CreateAlmanaxWebhook
   */
  public static CreateAlmanaxWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAlmanaxWebhook.class);
  }

  /**
   * Convert an instance of CreateAlmanaxWebhook to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

