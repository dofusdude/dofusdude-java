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
import com.dofusdude.client.model.AlmanaxWebhookDailySettings;
import com.dofusdude.client.model.CreateAlmanaxWebhookMentionsValueInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
 * 
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T10:01:07.705593984Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class AlmanaxWebhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DAILY_SETTINGS = "daily_settings";
  @SerializedName(SERIALIZED_NAME_DAILY_SETTINGS)
  private AlmanaxWebhookDailySettings dailySettings;

  public static final String SERIALIZED_NAME_BONUS_WHITELIST = "bonus_whitelist";
  @SerializedName(SERIALIZED_NAME_BONUS_WHITELIST)
  private List<String> bonusWhitelist;

  public static final String SERIALIZED_NAME_BONUS_BLACKLIST = "bonus_blacklist";
  @SerializedName(SERIALIZED_NAME_BONUS_BLACKLIST)
  private List<String> bonusBlacklist;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<String> subscriptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISO_DATE = "iso_date";
  @SerializedName(SERIALIZED_NAME_ISO_DATE)
  private Boolean isoDate = false;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
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
  private WeeklyWeekdayEnum weeklyWeekday;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_FIRED_AT = "last_fired_at";
  @SerializedName(SERIALIZED_NAME_LAST_FIRED_AT)
  private OffsetDateTime lastFiredAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public AlmanaxWebhook() {
  }

  public AlmanaxWebhook id(UUID id) {
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


  public AlmanaxWebhook dailySettings(AlmanaxWebhookDailySettings dailySettings) {
    this.dailySettings = dailySettings;
    return this;
  }

   /**
   * Get dailySettings
   * @return dailySettings
  **/
  @jakarta.annotation.Nullable
  public AlmanaxWebhookDailySettings getDailySettings() {
    return dailySettings;
  }

  public void setDailySettings(AlmanaxWebhookDailySettings dailySettings) {
    this.dailySettings = dailySettings;
  }


  public AlmanaxWebhook bonusWhitelist(List<String> bonusWhitelist) {
    this.bonusWhitelist = bonusWhitelist;
    return this;
  }

  public AlmanaxWebhook addBonusWhitelistItem(String bonusWhitelistItem) {
    if (this.bonusWhitelist == null) {
      this.bonusWhitelist = new ArrayList<>();
    }
    this.bonusWhitelist.add(bonusWhitelistItem);
    return this;
  }

   /**
   * Only post when these bonuses come up. From all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses.
   * @return bonusWhitelist
  **/
  @jakarta.annotation.Nullable
  public List<String> getBonusWhitelist() {
    return bonusWhitelist;
  }

  public void setBonusWhitelist(List<String> bonusWhitelist) {
    this.bonusWhitelist = bonusWhitelist;
  }


  public AlmanaxWebhook bonusBlacklist(List<String> bonusBlacklist) {
    this.bonusBlacklist = bonusBlacklist;
    return this;
  }

  public AlmanaxWebhook addBonusBlacklistItem(String bonusBlacklistItem) {
    if (this.bonusBlacklist == null) {
      this.bonusBlacklist = new ArrayList<>();
    }
    this.bonusBlacklist.add(bonusBlacklistItem);
    return this;
  }

   /**
   * Skip the day when these bonuses come up. From all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses
   * @return bonusBlacklist
  **/
  @jakarta.annotation.Nullable
  public List<String> getBonusBlacklist() {
    return bonusBlacklist;
  }

  public void setBonusBlacklist(List<String> bonusBlacklist) {
    this.bonusBlacklist = bonusBlacklist;
  }


  public AlmanaxWebhook subscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public AlmanaxWebhook addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get the available subscriptions with /meta/webhooks/almanax
   * @return subscriptions
  **/
  @jakarta.annotation.Nullable
  public List<String> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  public AlmanaxWebhook isoDate(Boolean isoDate) {
    this.isoDate = isoDate;
    return this;
  }

   /**
   * If false, it will use common local time formats and weekday translations. If true, the format is YYYY-MM-DD.
   * @return isoDate
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsoDate() {
    return isoDate;
  }

  public void setIsoDate(Boolean isoDate) {
    this.isoDate = isoDate;
  }


  public AlmanaxWebhook mentions(Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions) {
    this.mentions = mentions;
    return this;
  }

  public AlmanaxWebhook putMentionsItem(String key, List<CreateAlmanaxWebhookMentionsValueInner> mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new HashMap<>();
    }
    this.mentions.put(key, mentionsItem);
    return this;
  }

   /**
   * Almanax bonus ids mapped to array of mentions.
   * @return mentions
  **/
  @jakarta.annotation.Nullable
  public Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> getMentions() {
    return mentions;
  }

  public void setMentions(Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions) {
    this.mentions = mentions;
  }


  public AlmanaxWebhook intervals(Set<IntervalsEnum> intervals) {
    this.intervals = intervals;
    return this;
  }

  public AlmanaxWebhook addIntervalsItem(IntervalsEnum intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new LinkedHashSet<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * - Daily posts each day, filtering with Black/Whitelist and mentions are applied daily. - Weekly posts the next 7 days (excluding the posting day) once per week at the specified time. With only weekly selected, of all mentions, only prior notices will come through daily. The 7 day preview gets filtered by the Black/Whitelist. - Monthly posts a preview of the next month from first to last date. The post will be on the last day of a month (ignoring day of the week) at the specified time. Mentions and filtering works like weekly. The biggest difference between daily and the other two is that daily always posts the current day while monthly and weekly only show future days. You can always combine the intervals by selecting multiple intervals for one hook or create multiple hooks for the same channel with different settings to get every highly specific combination you want.
   * @return intervals
  **/
  @jakarta.annotation.Nullable
  public Set<IntervalsEnum> getIntervals() {
    return intervals;
  }

  public void setIntervals(Set<IntervalsEnum> intervals) {
    this.intervals = intervals;
  }


  public AlmanaxWebhook weeklyWeekday(WeeklyWeekdayEnum weeklyWeekday) {
    this.weeklyWeekday = weeklyWeekday;
    return this;
  }

   /**
   * When to post the weekly preview at the specified time.
   * @return weeklyWeekday
  **/
  @jakarta.annotation.Nullable
  public WeeklyWeekdayEnum getWeeklyWeekday() {
    return weeklyWeekday;
  }

  public void setWeeklyWeekday(WeeklyWeekdayEnum weeklyWeekday) {
    this.weeklyWeekday = weeklyWeekday;
  }


  public AlmanaxWebhook createdAt(OffsetDateTime createdAt) {
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


  public AlmanaxWebhook lastFiredAt(OffsetDateTime lastFiredAt) {
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


  public AlmanaxWebhook updatedAt(OffsetDateTime updatedAt) {
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
    AlmanaxWebhook almanaxWebhook = (AlmanaxWebhook) o;
    return Objects.equals(this.id, almanaxWebhook.id) &&
        Objects.equals(this.dailySettings, almanaxWebhook.dailySettings) &&
        Objects.equals(this.bonusWhitelist, almanaxWebhook.bonusWhitelist) &&
        Objects.equals(this.bonusBlacklist, almanaxWebhook.bonusBlacklist) &&
        Objects.equals(this.subscriptions, almanaxWebhook.subscriptions) &&
        Objects.equals(this.isoDate, almanaxWebhook.isoDate) &&
        Objects.equals(this.mentions, almanaxWebhook.mentions) &&
        Objects.equals(this.intervals, almanaxWebhook.intervals) &&
        Objects.equals(this.weeklyWeekday, almanaxWebhook.weeklyWeekday) &&
        Objects.equals(this.createdAt, almanaxWebhook.createdAt) &&
        Objects.equals(this.lastFiredAt, almanaxWebhook.lastFiredAt) &&
        Objects.equals(this.updatedAt, almanaxWebhook.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dailySettings, bonusWhitelist, bonusBlacklist, subscriptions, isoDate, mentions, intervals, weeklyWeekday, createdAt, lastFiredAt, updatedAt);
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
    sb.append("class AlmanaxWebhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dailySettings: ").append(toIndentedString(dailySettings)).append("\n");
    sb.append("    bonusWhitelist: ").append(toIndentedString(bonusWhitelist)).append("\n");
    sb.append("    bonusBlacklist: ").append(toIndentedString(bonusBlacklist)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    isoDate: ").append(toIndentedString(isoDate)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    weeklyWeekday: ").append(toIndentedString(weeklyWeekday)).append("\n");
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
    openapiFields.add("daily_settings");
    openapiFields.add("bonus_whitelist");
    openapiFields.add("bonus_blacklist");
    openapiFields.add("subscriptions");
    openapiFields.add("iso_date");
    openapiFields.add("mentions");
    openapiFields.add("intervals");
    openapiFields.add("weekly_weekday");
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
  * @throws IOException if the JSON Element is invalid with respect to AlmanaxWebhook
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AlmanaxWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlmanaxWebhook is not found in the empty JSON string", AlmanaxWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AlmanaxWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlmanaxWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `daily_settings`
      if (jsonObj.get("daily_settings") != null && !jsonObj.get("daily_settings").isJsonNull()) {
        AlmanaxWebhookDailySettings.validateJsonElement(jsonObj.get("daily_settings"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bonus_whitelist") != null && !jsonObj.get("bonus_whitelist").isJsonNull() && !jsonObj.get("bonus_whitelist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonus_whitelist` to be an array in the JSON string but got `%s`", jsonObj.get("bonus_whitelist").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bonus_blacklist") != null && !jsonObj.get("bonus_blacklist").isJsonNull() && !jsonObj.get("bonus_blacklist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonus_blacklist` to be an array in the JSON string but got `%s`", jsonObj.get("bonus_blacklist").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull() && !jsonObj.get("subscriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("intervals") != null && !jsonObj.get("intervals").isJsonNull() && !jsonObj.get("intervals").isJsonArray()) {
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
       if (!AlmanaxWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlmanaxWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlmanaxWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlmanaxWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<AlmanaxWebhook>() {
           @Override
           public void write(JsonWriter out, AlmanaxWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlmanaxWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlmanaxWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlmanaxWebhook
  * @throws IOException if the JSON string is invalid with respect to AlmanaxWebhook
  */
  public static AlmanaxWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlmanaxWebhook.class);
  }

 /**
  * Convert an instance of AlmanaxWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

