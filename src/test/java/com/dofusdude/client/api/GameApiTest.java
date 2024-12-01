/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.7
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.api;

import com.dofusdude.client.ApiException;
import com.dofusdude.client.model.Error;
import com.dofusdude.client.model.GameSearch;
import com.dofusdude.client.model.ListItemGeneral;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameApi
 */
@Disabled
public class GameApiTest {

    private final GameApi api = new GameApi();

    /**
     * Game Search
     *
     * Search in all names and descriptions of all supported types in the game. For the list of supported types see the endpoint /dofus3/meta/search/types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGameSearchTest() throws ApiException {
        String language = null;
        String game = null;
        String query = null;
        Set<String> filterSearchIndex = null;
        Integer limit = null;
        Set<String> fieldsItem = null;
        Set<String> filterTypeNameId = null;
        List<GameSearch> response = api.getGameSearch(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId);
        // TODO: test validations
    }

    /**
     * Search All Items
     *
     * Search in all names and descriptions of Dofus items (including all subtypes) with a query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemsAllSearchTest() throws ApiException {
        String language = null;
        String game = null;
        String query = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        Integer limit = null;
        Set<String> filterTypeNameId = null;
        List<ListItemGeneral> response = api.getItemsAllSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId);
        // TODO: test validations
    }

}
