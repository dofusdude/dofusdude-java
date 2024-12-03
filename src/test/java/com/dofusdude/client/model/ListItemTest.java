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

import com.dofusdude.client.model.ConditionNode;
import com.dofusdude.client.model.Effect;
import com.dofusdude.client.model.Images;
import com.dofusdude.client.model.Range;
import com.dofusdude.client.model.Recipe;
import com.dofusdude.client.model.TranslatedId;
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
 * Model tests for ListItem
 */
public class ListItemTest {
    private final ListItem model = new ListItem();

    /**
     * Model tests for ListItem
     */
    @Test
    public void testListItem() {
        // TODO: test ListItem
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
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'level'
     */
    @Test
    public void levelTest() {
        // TODO: test level
    }

    /**
     * Test the property 'imageUrls'
     */
    @Test
    public void imageUrlsTest() {
        // TODO: test imageUrls
    }

    /**
     * Test the property 'recipe'
     */
    @Test
    public void recipeTest() {
        // TODO: test recipe
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'conditions'
     */
    @Test
    public void conditionsTest() {
        // TODO: test conditions
    }

    /**
     * Test the property 'effects'
     */
    @Test
    public void effectsTest() {
        // TODO: test effects
    }

    /**
     * Test the property 'isWeapon'
     */
    @Test
    public void isWeaponTest() {
        // TODO: test isWeapon
    }

    /**
     * Test the property 'pods'
     */
    @Test
    public void podsTest() {
        // TODO: test pods
    }

    /**
     * Test the property 'parentSet'
     */
    @Test
    public void parentSetTest() {
        // TODO: test parentSet
    }

    /**
     * Test the property 'criticalHitProbability'
     */
    @Test
    public void criticalHitProbabilityTest() {
        // TODO: test criticalHitProbability
    }

    /**
     * Test the property 'criticalHitBonus'
     */
    @Test
    public void criticalHitBonusTest() {
        // TODO: test criticalHitBonus
    }

    /**
     * Test the property 'maxCastPerTurn'
     */
    @Test
    public void maxCastPerTurnTest() {
        // TODO: test maxCastPerTurn
    }

    /**
     * Test the property 'apCost'
     */
    @Test
    public void apCostTest() {
        // TODO: test apCost
    }

    /**
     * Test the property 'range'
     */
    @Test
    public void rangeTest() {
        // TODO: test range
    }

}
