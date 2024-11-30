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


package com.dofusdude.client.api;

import com.dofusdude.client.ApiException;
import com.dofusdude.client.model.GetMetaAlmanaxBonuses200ResponseInner;
import com.dofusdude.client.model.Version;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetaApi
 */
@Disabled
public class MetaApiTest {

    private final MetaApi api = new MetaApi();

    /**
     * Available Game Search Types
     *
     * Get all types for /{game}/v1/{lang}/search available for filtering. All names are english for comparing them inside applications. Order is fixed so you can compare indices instead of strings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGameSearchTypesTest() throws ApiException {
        List<String> response = api.getGameSearchTypes();
        // TODO: test validations
    }

    /**
     * Available Item Types
     *
     * Get all types of all items. Primarily used for filtering more detailed types in listings or search endpoints. All names are english for comparing them inside applications. Ordering is not guaranteed to persist with game updates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemTypesTest() throws ApiException {
        List<String> response = api.getItemTypes();
        // TODO: test validations
    }

    /**
     * Available Almanax Bonuses
     *
     * Get all the available bonuses and their id for filtering them in the range endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaAlmanaxBonusesTest() throws ApiException {
        String language = null;
        List<GetMetaAlmanaxBonuses200ResponseInner> response = api.getMetaAlmanaxBonuses(language);
        // TODO: test validations
    }

    /**
     * Search Available Almanax Bonuses
     *
     * Search all the available bonuses and their id for filtering them in the range endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaAlmanaxBonusesSearchTest() throws ApiException {
        String language = null;
        String query = null;
        Integer limit = null;
        List<GetMetaAlmanaxBonuses200ResponseInner> response = api.getMetaAlmanaxBonusesSearch(language, query, limit);
        // TODO: test validations
    }

    /**
     * Effects and Condition Elements
     *
     * Get the mappings for all specific elements that are linked in the dataset. All names are english. Translations are not needed because of a global unique id which is the index inside the array. Future elements will get a higher id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaElementsTest() throws ApiException {
        List<String> response = api.getMetaElements();
        // TODO: test validations
    }

    /**
     * Game Version
     *
     * The current game version of the hosted data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaVersionTest() throws ApiException {
        String game = null;
        Version response = api.getMetaVersion(game);
        // TODO: test validations
    }

}
