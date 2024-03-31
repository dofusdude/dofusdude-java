/**
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


package de.dofusdude.client.api;

import de.dofusdude.client.model.Cosmetic;
import de.dofusdude.client.model.ItemListEntry;
import de.dofusdude.client.model.ItemsListPaged;
import java.util.Set;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * dofusdude Test
 *
 * API tests for CosmeticsApi
 */
public class CosmeticsApiTest {

    private CosmeticsApi client;
    private String baseUrl = "http://localhost:9080";

    @Before
    public void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(CosmeticsApi.class);
    }

    
    /**
     * List All Cosmetics
     *
     * Retrieve all cosmetic items with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCosmeticsListTest() {
        // TODO: test validations
        String language = null;
        String game = null;
        String sortLevel = null;
        String filterTypeName = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        String acceptEncoding = null;
        //ItemsListPaged response = api.getAllCosmeticsList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding);
        //assertNotNull(response);


    }
    
    /**
     * List Cosmetics
     *
     * Retrieve a list of cosmetic items.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCosmeticsListTest() {
        // TODO: test validations
        String language = null;
        String game = null;
        String sortLevel = null;
        String filterTypeName = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        Set<String> fieldsItem = null;
        //ItemsListPaged response = api.getCosmeticsList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem);
        //assertNotNull(response);


    }
    
    /**
     * Search Cosmetics
     *
     * Search in all names and descriptions of cosmetic items with a query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCosmeticsSearchTest() {
        // TODO: test validations
        String language = null;
        String game = null;
        String query = null;
        String filterTypeName = null;
        Integer filterMinLevel = null;
        Integer filterMaxLevel = null;
        Integer limit = null;
        //List<ItemListEntry> response = api.getCosmeticsSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit);
        //assertNotNull(response);


    }
    
    /**
     * Single Cosmetics
     *
     * Retrieve a specific cosmetic item with id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCosmeticsSingleTest() {
        // TODO: test validations
        String language = null;
        Integer ankamaId = null;
        String game = null;
        //Cosmetic response = api.getCosmeticsSingle(language, ankamaId, game);
        //assertNotNull(response);


    }
    
}
