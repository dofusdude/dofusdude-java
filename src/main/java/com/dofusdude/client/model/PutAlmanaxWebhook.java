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
import com.dofusdude.client.model.CreateAlmanaxWebhookDailySettings;
import com.dofusdude.client.model.CreateAlmanaxWebhookMentionsValueInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * PutAlmanaxWebhook
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T16:58:24.837338827Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PutAlmanaxWebhook {
  public static final String SERIALIZED_NAME_BONUS_WHITELIST = "bonus_whitelist";
  @SerializedName(SERIALIZED_NAME_BONUS_WHITELIST)
  private List<String> bonusWhitelist;

  public static final String SERIALIZED_NAME_BONUS_BLACKLIST = "bonus_blacklist";
  @SerializedName(SERIALIZED_NAME_BONUS_BLACKLIST)
  private List<String> bonusBlacklist;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<String> subscriptions;

  public static final String SERIALIZED_NAME_DAILY_SETTINGS = "daily_settings";
  @SerializedName(SERIALIZED_NAME_DAILY_SETTINGS)
  private CreateAlmanaxWebhookDailySettings dailySettings;

  public static final String SERIALIZED_NAME_ISO_DATE = "iso_date";
  @SerializedName(SERIALIZED_NAME_ISO_DATE)
  private Boolean isoDate = false;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  private Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions = new HashMap<>();

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
  private Set<IntervalsEnum> intervals;

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

  public PutAlmanaxWebhook() {
  }

  public PutAlmanaxWebhook bonusWhitelist(List<String> bonusWhitelist) {
    this.bonusWhitelist = bonusWhitelist;
    return this;
  }

  public PutAlmanaxWebhook addBonusWhitelistItem(String bonusWhitelistItem) {
    if (this.bonusWhitelist == null) {
      this.bonusWhitelist = new ArrayList<>();
    }
    this.bonusWhitelist.add(bonusWhitelistItem);
    return this;
  }

   /**
   * from all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses. Delete old entries with empty array []. Just null changes nothing.
   * @return bonusWhitelist
  **/
  @jakarta.annotation.Nullable
  public List<String> getBonusWhitelist() {
    return bonusWhitelist;
  }

  public void setBonusWhitelist(List<String> bonusWhitelist) {
    this.bonusWhitelist = bonusWhitelist;
  }


  public PutAlmanaxWebhook bonusBlacklist(List<String> bonusBlacklist) {
    this.bonusBlacklist = bonusBlacklist;
    return this;
  }

  public PutAlmanaxWebhook addBonusBlacklistItem(String bonusBlacklistItem) {
    if (this.bonusBlacklist == null) {
      this.bonusBlacklist = new ArrayList<>();
    }
    this.bonusBlacklist.add(bonusBlacklistItem);
    return this;
  }

   /**
   * from all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses. Delete old entries with empty array []. Just null changes nothing.
   * @return bonusBlacklist
  **/
  @jakarta.annotation.Nullable
  public List<String> getBonusBlacklist() {
    return bonusBlacklist;
  }

  public void setBonusBlacklist(List<String> bonusBlacklist) {
    this.bonusBlacklist = bonusBlacklist;
  }


  public PutAlmanaxWebhook subscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public PutAlmanaxWebhook addSubscriptionsItem(String subscriptionsItem) {
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


  public PutAlmanaxWebhook dailySettings(CreateAlmanaxWebhookDailySettings dailySettings) {
    this.dailySettings = dailySettings;
    return this;
  }

   /**
   * Get dailySettings
   * @return dailySettings
  **/
  @jakarta.annotation.Nullable
  public CreateAlmanaxWebhookDailySettings getDailySettings() {
    return dailySettings;
  }

  public void setDailySettings(CreateAlmanaxWebhookDailySettings dailySettings) {
    this.dailySettings = dailySettings;
  }


  public PutAlmanaxWebhook isoDate(Boolean isoDate) {
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


  public PutAlmanaxWebhook mentions(Map<String, List<CreateAlmanaxWebhookMentionsValueInner>> mentions) {
    this.mentions = mentions;
    return this;
  }

  public PutAlmanaxWebhook putMentionsItem(String key, List<CreateAlmanaxWebhookMentionsValueInner> mentionsItem) {
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


  public PutAlmanaxWebhook intervals(Set<IntervalsEnum> intervals) {
    this.intervals = intervals;
    return this;
  }

  public PutAlmanaxWebhook addIntervalsItem(IntervalsEnum intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new LinkedHashSet<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Get intervals
   * @return intervals
  **/
  @jakarta.annotation.Nullable
  public Set<IntervalsEnum> getIntervals() {
    return intervals;
  }

  public void setIntervals(Set<IntervalsEnum> intervals) {
    this.intervals = intervals;
  }


  public PutAlmanaxWebhook weeklyWeekday(WeeklyWeekdayEnum weeklyWeekday) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutAlmanaxWebhook putAlmanaxWebhook = (PutAlmanaxWebhook) o;
    return Objects.equals(this.bonusWhitelist, putAlmanaxWebhook.bonusWhitelist) &&
        Objects.equals(this.bonusBlacklist, putAlmanaxWebhook.bonusBlacklist) &&
        Objects.equals(this.subscriptions, putAlmanaxWebhook.subscriptions) &&
        Objects.equals(this.dailySettings, putAlmanaxWebhook.dailySettings) &&
        Objects.equals(this.isoDate, putAlmanaxWebhook.isoDate) &&
        Objects.equals(this.mentions, putAlmanaxWebhook.mentions) &&
        Objects.equals(this.intervals, putAlmanaxWebhook.intervals) &&
        Objects.equals(this.weeklyWeekday, putAlmanaxWebhook.weeklyWeekday);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonusWhitelist, bonusBlacklist, subscriptions, dailySettings, isoDate, mentions, intervals, weeklyWeekday);
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
    sb.append("class PutAlmanaxWebhook {\n");
    sb.append("    bonusWhitelist: ").append(toIndentedString(bonusWhitelist)).append("\n");
    sb.append("    bonusBlacklist: ").append(toIndentedString(bonusBlacklist)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
    openapiFields.add("daily_settings");
    openapiFields.add("iso_date");
    openapiFields.add("mentions");
    openapiFields.add("intervals");
    openapiFields.add("weekly_weekday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PutAlmanaxWebhook
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PutAlmanaxWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutAlmanaxWebhook is not found in the empty JSON string", PutAlmanaxWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PutAlmanaxWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutAlmanaxWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull() && !jsonObj.get("subscriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
      }
      // validate the optional field `daily_settings`
      if (jsonObj.get("daily_settings") != null && !jsonObj.get("daily_settings").isJsonNull()) {
        CreateAlmanaxWebhookDailySettings.validateJsonElement(jsonObj.get("daily_settings"));
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
       if (!PutAlmanaxWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutAlmanaxWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutAlmanaxWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutAlmanaxWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<PutAlmanaxWebhook>() {
           @Override
           public void write(JsonWriter out, PutAlmanaxWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutAlmanaxWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PutAlmanaxWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PutAlmanaxWebhook
  * @throws IOException if the JSON string is invalid with respect to PutAlmanaxWebhook
  */
  public static PutAlmanaxWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutAlmanaxWebhook.class);
  }

 /**
  * Convert an instance of PutAlmanaxWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

