/*
 * dofusdude
 * # A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [PHP](https://github.com/dofusdude/dofusdude-php) - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 0.9.3
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.api;

import com.dofusdude.client.ApiException;
import com.dofusdude.client.model.ItemListEntry;
import com.dofusdude.client.model.ItemsListPaged;
import com.dofusdude.client.model.Resource;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuestItemsApi
 */
@Disabled
public class QuestItemsApiTest {

    private final QuestItemsApi api = new QuestItemsApi();

    /**
     * List All Quest Items
     *
     * Retrieve all quest items with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllItemsQuestListTest() throws ApiException {
        String language = null;
        String game = null;
        String sortLevel = null;
        String filterTypeName = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        String acceptEncoding = null;
        Set<String> filterTypeEnum = null;
        ItemsListPaged response = api.getAllItemsQuestList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding, filterTypeEnum);
        // TODO: test validations
    }

    /**
     * Single Quest Items
     *
     * Retrieve a specific quest item with id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemQuestSingleTest() throws ApiException {
        String language = null;
        Integer ankamaId = null;
        String game = null;
        Resource response = api.getItemQuestSingle(language, ankamaId, game);
        // TODO: test validations
    }

    /**
     * List Quest Items
     *
     * Retrieve a list of quest items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemsQuestListTest() throws ApiException {
        String language = null;
        String game = null;
        String sortLevel = null;
        String filterTypeName = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        Set<String> fieldsItem = null;
        Set<String> filterTypeEnum = null;
        ItemsListPaged response = api.getItemsQuestList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeEnum);
        // TODO: test validations
    }

    /**
     * Search Quest Items
     *
     * Search in all names and descriptions of quest items with a query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemsQuestSearchTest() throws ApiException {
        String language = null;
        String game = null;
        String query = null;
        String filterTypeName = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        Integer limit = null;
        Set<String> filterTypeEnum = null;
        List<ItemListEntry> response = api.getItemsQuestSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit, filterTypeEnum);
        // TODO: test validations
    }

}
