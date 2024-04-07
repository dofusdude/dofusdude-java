/*
 * dofusdude
 * # A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) npm i dofusdude-js --save - [Typescript](https://github.com/dofusdude/dofusdude-ts) npm i dofusdude-ts --save - [Go](https://github.com/dofusdude/dodugo) go get -u github.com/dofusdude/dodugo - [Python](https://github.com/dofusdude/dofusdude-py) pip install dofusdude - [PHP](https://github.com/dofusdude/dofusdude-php)  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 2 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my Discord.   ## Deploy now. Use forever. Everything you see here on this site, you can use now and forever. Updates could introduce new fields, new paths or parameter but never break backwards compatibility.  There is one exception! **The API will _always_ choose being up-to-date over everything else**. So if Ankama decides to drop languages from the game like they did with their website, the API will loose support for them, too.  ## Thank you! I highly welcome everyone on my [Discord](https://discord.gg/3EtHskZD8h) to just talk about projects and use cases or give feedback of any kind.  The servers have a fixed monthly cost to provide very fast responses. If you want to help me keeping them running or simply donate to that cause, consider becoming a [GitHub Sponsor](https://github.com/sponsors/dofusdude).
 *
 * The version of the OpenAPI document: 0.8.3
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.TimeZone;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    private static final StdDateFormat sdf = new StdDateFormat()
        .withTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()))
        .withColonInTimeZone(true);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.AlmanaxEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.AlmanaxEntryBonus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.AlmanaxEntryTribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.AlmanaxEntryTributeItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.AlmanaxWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.AlmanaxWebhookDailySettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ConditionEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ConditionTreeLeaf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ConditionTreeNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ConditionTreeRelation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.Cosmetic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.CosmeticType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.CreateAlmanaxWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.CreateAlmanaxWebhookDailySettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.CreateAlmanaxWebhookMentionsValueInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.CreateRSSWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.CreateTwitterWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.EffectsEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.Equipment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.EquipmentSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.GetGameSearch200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.GetMetaAlmanaxBonuses200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.GetMetaWebhooksTwitter200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ImageUrls.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ItemListEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ItemListEntryParentSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ItemListEntryRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ItemsListEntryTyped.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ItemsListEntryTypedType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.ItemsListPaged.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.LinksPaged.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.Mount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.MountListEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.MountsListPaged.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.PutAlmanaxWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.PutRSSWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.PutTwitterWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.RecipeEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.Resource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.RssWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.SetEffectsEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.SetEffectsEntryType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.SetListEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.SetsListPaged.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.TwitterWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.Weapon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.dofusdude.client.model.WeaponRange.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(sdf.parse(date).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, DateTimeFormatter will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toInstant().atOffset(ZoneOffset.UTC).format(dtf);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return sdf.parse(date);
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}