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
import com.dofusdude.client.model.EquipmentSet;
import com.dofusdude.client.model.Error;
import com.dofusdude.client.model.ListEquipmentSet;
import com.dofusdude.client.model.ListEquipmentSets;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SetsApi
 */
@Disabled
public class SetsApiTest {

    private final SetsApi api = new SetsApi();

    /**
     * List All Sets
     *
     * Retrieve all sets with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllSetsListTest() throws ApiException {
        String language = null;
        String game = null;
        String sortLevel = null;
        Integer filterMinHighestEquipmentLevel = null;
        Integer filterMaxHighestEquipmentLevel = null;
        String acceptEncoding = null;
        Boolean filterContainsCosmeticsOnly = null;
        Boolean filterContainsCosmetics = null;
        ListEquipmentSets response = api.getAllSetsList(language, game, sortLevel, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, acceptEncoding, filterContainsCosmeticsOnly, filterContainsCosmetics);
        // TODO: test validations
    }

    /**
     * List Sets
     *
     * Retrieve a list of sets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSetsListTest() throws ApiException {
        String language = null;
        String game = null;
        String sortLevel = null;
        Integer filterMinHighestEquipmentLevel = null;
        Integer filterMaxHighestEquipmentLevel = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        Set<String> fieldsSet = null;
        Boolean filterContainsCosmeticsOnly = null;
        Boolean filterContainsCosmetics = null;
        ListEquipmentSets response = api.getSetsList(language, game, sortLevel, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, pageSize, pageNumber, fieldsSet, filterContainsCosmeticsOnly, filterContainsCosmetics);
        // TODO: test validations
    }

    /**
     * Search Sets
     *
     * Search in all names and descriptions of sets with a query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSetsSearchTest() throws ApiException {
        String language = null;
        String game = null;
        String query = null;
        Integer filterMinHighestEquipmentLevel = null;
        Integer filterMaxHighestEquipmentLevel = null;
        Integer limit = null;
        Boolean filterContainsCosmeticsOnly = null;
        Boolean filterContainsCosmetics = null;
        List<ListEquipmentSet> response = api.getSetsSearch(language, game, query, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, limit, filterContainsCosmeticsOnly, filterContainsCosmetics);
        // TODO: test validations
    }

    /**
     * Single Sets
     *
     * Retrieve a specific set with id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSetsSingleTest() throws ApiException {
        String language = null;
        Integer ankamaId = null;
        String game = null;
        EquipmentSet response = api.getSetsSingle(language, ankamaId, game);
        // TODO: test validations
    }

}
