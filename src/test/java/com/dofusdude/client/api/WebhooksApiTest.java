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


package com.dofusdude.client.api;

import com.dofusdude.client.ApiException;
import com.dofusdude.client.model.AlmanaxWebhook;
import com.dofusdude.client.model.CreateAlmanaxWebhook;
import com.dofusdude.client.model.CreateRSSWebhook;
import com.dofusdude.client.model.CreateTwitterWebhook;
import com.dofusdude.client.model.GetMetaWebhooksTwitter200Response;
import com.dofusdude.client.model.PutAlmanaxWebhook;
import com.dofusdude.client.model.PutRSSWebhook;
import com.dofusdude.client.model.PutTwitterWebhook;
import com.dofusdude.client.model.RssWebhook;
import com.dofusdude.client.model.TwitterWebhook;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Unregister Almanax Hook
     *
     * Delete a Webhook from the service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhooksAlmanaxIdTest() throws ApiException {
        String id = null;
        api.deleteWebhooksAlmanaxId(id);
        // TODO: test validations
    }

    /**
     * Unregister RSS Hook
     *
     * Delete a Webhook from the service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhooksRssIdTest() throws ApiException {
        String id = null;
        api.deleteWebhooksRssId(id);
        // TODO: test validations
    }

    /**
     * Unregister Twitter Hook
     *
     * Delete a Webhook from the service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhooksTwitterIdTest() throws ApiException {
        String id = null;
        api.deleteWebhooksTwitterId(id);
        // TODO: test validations
    }

    /**
     * Get Almanax Hook Metainfo
     *
     * Get a list of all available subscriptions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaWebhooksAlmanaxTest() throws ApiException {
        GetMetaWebhooksTwitter200Response response = api.getMetaWebhooksAlmanax();
        // TODO: test validations
    }

    /**
     * Get RSS Hook Metainfo
     *
     * Get a list of all available subscriptions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaWebhooksRssTest() throws ApiException {
        GetMetaWebhooksTwitter200Response response = api.getMetaWebhooksRss();
        // TODO: test validations
    }

    /**
     * Get Twitter Hook Metainfo
     *
     * Get a list of all available subscriptions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaWebhooksTwitterTest() throws ApiException {
        GetMetaWebhooksTwitter200Response response = api.getMetaWebhooksTwitter();
        // TODO: test validations
    }

    /**
     * Get Almanax Hook
     *
     * Retrieve details about an existing Almanax Webhook with a given uuid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksAlmanaxIdTest() throws ApiException {
        String id = null;
        AlmanaxWebhook response = api.getWebhooksAlmanaxId(id);
        // TODO: test validations
    }

    /**
     * Get RSS Hook
     *
     * Retrieve details about an existing RSS Webhook with a given uuid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksRssIdTest() throws ApiException {
        String id = null;
        RssWebhook response = api.getWebhooksRssId(id);
        // TODO: test validations
    }

    /**
     * Get Twitter Hook
     *
     * Retrieve details about an existing Twitter Webhook with a given uuid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksTwitterIdTest() throws ApiException {
        String id = null;
        TwitterWebhook response = api.getWebhooksTwitterId(id);
        // TODO: test validations
    }

    /**
     * Register Almanax Hook
     *
     * Register a new Webhook to post Almanax updates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postWebhooksAlmanaxTest() throws ApiException {
        CreateAlmanaxWebhook createAlmanaxWebhook = null;
        api.postWebhooksAlmanax(createAlmanaxWebhook);
        // TODO: test validations
    }

    /**
     * Register RSS Hook
     *
     * Register a new Webhook to post RSS news as soon as they are posted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postWebhooksRssTest() throws ApiException {
        CreateRSSWebhook createRSSWebhook = null;
        api.postWebhooksRss(createRSSWebhook);
        // TODO: test validations
    }

    /**
     * Register Twitter Hook
     *
     * Register a new Webhook to post Twitter updates as soon as they are posted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postWebhooksTwitterTest() throws ApiException {
        CreateTwitterWebhook createTwitterWebhook = null;
        api.postWebhooksTwitter(createTwitterWebhook);
        // TODO: test validations
    }

    /**
     * Update Almanax Hook
     *
     * Update the details of an Almanax Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putWebhooksAlmanaxIdTest() throws ApiException {
        String id = null;
        PutAlmanaxWebhook putAlmanaxWebhook = null;
        AlmanaxWebhook response = api.putWebhooksAlmanaxId(id, putAlmanaxWebhook);
        // TODO: test validations
    }

    /**
     * Update RSS Hook
     *
     * Update the details of a RSS Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putWebhooksRssIdTest() throws ApiException {
        String id = null;
        PutRSSWebhook putRSSWebhook = null;
        RssWebhook response = api.putWebhooksRssId(id, putRSSWebhook);
        // TODO: test validations
    }

    /**
     * Update Twitter Hook
     *
     * Update the details of a Twitter Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putWebhooksTwitterIdTest() throws ApiException {
        String id = null;
        PutTwitterWebhook putTwitterWebhook = null;
        TwitterWebhook response = api.putWebhooksTwitterId(id, putTwitterWebhook);
        // TODO: test validations
    }

}
