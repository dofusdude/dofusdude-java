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


package com.dofusdude.client.model;

import com.dofusdude.client.model.ConditionEntry;
import com.dofusdude.client.model.ConditionTreeNode;
import com.dofusdude.client.model.EffectsEntry;
import com.dofusdude.client.model.ImageUrls;
import com.dofusdude.client.model.ItemListEntryParentSet;
import com.dofusdude.client.model.ItemsListEntryTypedType;
import com.dofusdude.client.model.RecipeEntry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for Equipment
 */
public class EquipmentTest {
    private final Equipment model = new Equipment();

    /**
     * Model tests for Equipment
     */
    @Test
    public void testEquipment() {
        // TODO: test Equipment
    }

    /**
     * Test the property 'ankamaId'
     */
    @Test
    public void ankamaIdTest() {
        // TODO: test ankamaId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'isWeapon'
     */
    @Test
    public void isWeaponTest() {
        // TODO: test isWeapon
    }

    /**
     * Test the property 'level'
     */
    @Test
    public void levelTest() {
        // TODO: test level
    }

    /**
     * Test the property 'pods'
     */
    @Test
    public void podsTest() {
        // TODO: test pods
    }

    /**
     * Test the property 'imageUrls'
     */
    @Test
    public void imageUrlsTest() {
        // TODO: test imageUrls
    }

    /**
     * Test the property 'effects'
     */
    @Test
    public void effectsTest() {
        // TODO: test effects
    }

    /**
     * Test the property 'conditions'
     */
    @Test
    public void conditionsTest() {
        // TODO: test conditions
    }

    /**
     * Test the property 'conditionTree'
     */
    @Test
    public void conditionTreeTest() {
        // TODO: test conditionTree
    }

    /**
     * Test the property 'recipe'
     */
    @Test
    public void recipeTest() {
        // TODO: test recipe
    }

    /**
     * Test the property 'parentSet'
     */
    @Test
    public void parentSetTest() {
        // TODO: test parentSet
    }

}
