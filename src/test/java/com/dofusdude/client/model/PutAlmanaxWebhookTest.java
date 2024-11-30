/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.5
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PutAlmanaxWebhook
 */
public class PutAlmanaxWebhookTest {
    private final PutAlmanaxWebhook model = new PutAlmanaxWebhook();

    /**
     * Model tests for PutAlmanaxWebhook
     */
    @Test
    public void testPutAlmanaxWebhook() {
        // TODO: test PutAlmanaxWebhook
    }

    /**
     * Test the property 'bonusWhitelist'
     */
    @Test
    public void bonusWhitelistTest() {
        // TODO: test bonusWhitelist
    }

    /**
     * Test the property 'bonusBlacklist'
     */
    @Test
    public void bonusBlacklistTest() {
        // TODO: test bonusBlacklist
    }

    /**
     * Test the property 'subscriptions'
     */
    @Test
    public void subscriptionsTest() {
        // TODO: test subscriptions
    }

    /**
     * Test the property 'dailySettings'
     */
    @Test
    public void dailySettingsTest() {
        // TODO: test dailySettings
    }

    /**
     * Test the property 'isoDate'
     */
    @Test
    public void isoDateTest() {
        // TODO: test isoDate
    }

    /**
     * Test the property 'mentions'
     */
    @Test
    public void mentionsTest() {
        // TODO: test mentions
    }

    /**
     * Test the property 'intervals'
     */
    @Test
    public void intervalsTest() {
        // TODO: test intervals
    }

    /**
     * Test the property 'weeklyWeekday'
     */
    @Test
    public void weeklyWeekdayTest() {
        // TODO: test weeklyWeekday
    }

}
