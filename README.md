# dofusdude-java

dofusdude
- API version: 0.9.1
  - Build date: 2024-10-06T12:03:55.532645948Z[Etc/UTC]
  - Generator version: 7.9.0-SNAPSHOT

# A project for you - the developer.
The all-in-one toolbelt for your next Ankama related project.

## Client SDKs
- [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save`
- [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save`
- [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo`
- [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude`
- [PHP](https://github.com/dofusdude/dofusdude-php)
- [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup

Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.

Your favorite language is missing? Please let me know!

# Main Features
- 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.

- ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.

- 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.

- 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.

- 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.

- 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.

- 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.

- 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.

... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h).


  For more information, please visit [https://discord.gg/3EtHskZD8h](https://discord.gg/3EtHskZD8h)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.dofusdude</groupId>
  <artifactId>dofusdude-java</artifactId>
  <version>0.9.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'dofusdude-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'dofusdude-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.dofusdude:dofusdude-java:0.9.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dofusdude-java-0.9.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.model.*;
import com.dofusdude.client.api.AlmanaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    AlmanaxApi apiInstance = new AlmanaxApi(defaultClient);
    String language = "en"; // String | code
    LocalDate date = LocalDate.parse("Tue Jul 14 00:00:00 UTC 2020"); // LocalDate | yyyy-mm-dd
    try {
      AlmanaxEntry result = apiInstance.getAlmanaxDate(language, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlmanaxApi#getAlmanaxDate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.dofusdu.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlmanaxApi* | [**getAlmanaxDate**](docs/AlmanaxApi.md#getAlmanaxDate) | **GET** /dofus2/{language}/almanax/{date} | Single Almanax Date
*AlmanaxApi* | [**getAlmanaxRange**](docs/AlmanaxApi.md#getAlmanaxRange) | **GET** /dofus2/{language}/almanax | Almanax Range
*ConsumablesApi* | [**getAllItemsConsumablesList**](docs/ConsumablesApi.md#getAllItemsConsumablesList) | **GET** /{game}/{language}/items/consumables/all | List All Consumables
*ConsumablesApi* | [**getItemsConsumablesList**](docs/ConsumablesApi.md#getItemsConsumablesList) | **GET** /{game}/{language}/items/consumables | List Consumables
*ConsumablesApi* | [**getItemsConsumablesSearch**](docs/ConsumablesApi.md#getItemsConsumablesSearch) | **GET** /{game}/{language}/items/consumables/search | Search Consumables
*ConsumablesApi* | [**getItemsConsumablesSingle**](docs/ConsumablesApi.md#getItemsConsumablesSingle) | **GET** /{game}/{language}/items/consumables/{ankama_id} | Single Consumables
*CosmeticsApi* | [**getAllCosmeticsList**](docs/CosmeticsApi.md#getAllCosmeticsList) | **GET** /{game}/{language}/items/cosmetics/all | List All Cosmetics
*CosmeticsApi* | [**getCosmeticsList**](docs/CosmeticsApi.md#getCosmeticsList) | **GET** /{game}/{language}/items/cosmetics | List Cosmetics
*CosmeticsApi* | [**getCosmeticsSearch**](docs/CosmeticsApi.md#getCosmeticsSearch) | **GET** /{game}/{language}/items/cosmetics/search | Search Cosmetics
*CosmeticsApi* | [**getCosmeticsSingle**](docs/CosmeticsApi.md#getCosmeticsSingle) | **GET** /{game}/{language}/items/cosmetics/{ankama_id} | Single Cosmetics
*EquipmentApi* | [**getAllItemsEquipmentList**](docs/EquipmentApi.md#getAllItemsEquipmentList) | **GET** /{game}/{language}/items/equipment/all | List All Equipment
*EquipmentApi* | [**getItemsEquipmentList**](docs/EquipmentApi.md#getItemsEquipmentList) | **GET** /{game}/{language}/items/equipment | List Equipment
*EquipmentApi* | [**getItemsEquipmentSearch**](docs/EquipmentApi.md#getItemsEquipmentSearch) | **GET** /{game}/{language}/items/equipment/search | Search Equipment
*EquipmentApi* | [**getItemsEquipmentSingle**](docs/EquipmentApi.md#getItemsEquipmentSingle) | **GET** /{game}/{language}/items/equipment/{ankama_id} | Single Equipment
*GameApi* | [**getGameSearch**](docs/GameApi.md#getGameSearch) | **GET** /{game}/{language}/search | Game Search
*GameApi* | [**getItemsAllSearch**](docs/GameApi.md#getItemsAllSearch) | **GET** /{game}/{language}/items/search | Search All Items
*MetaApi* | [**getGameSearchTypes**](docs/MetaApi.md#getGameSearchTypes) | **GET** /dofus2/meta/search/types | Available Game Search Types
*MetaApi* | [**getItemTypes**](docs/MetaApi.md#getItemTypes) | **GET** /dofus2/meta/items/types | Available Item Types
*MetaApi* | [**getMetaAlmanaxBonuses**](docs/MetaApi.md#getMetaAlmanaxBonuses) | **GET** /dofus2/meta/{language}/almanax/bonuses | Available Almanax Bonuses
*MetaApi* | [**getMetaAlmanaxBonusesSearch**](docs/MetaApi.md#getMetaAlmanaxBonusesSearch) | **GET** /dofus2/meta/{language}/almanax/bonuses/search | Search Available Almanax Bonuses
*MetaApi* | [**getMetaElements**](docs/MetaApi.md#getMetaElements) | **GET** /dofus2/meta/elements | Effects and Condition Elements
*MetaApi* | [**getMetaVersion**](docs/MetaApi.md#getMetaVersion) | **GET** /dofus2/meta/version | Game Version
*MountsApi* | [**getAllMountsList**](docs/MountsApi.md#getAllMountsList) | **GET** /{game}/{language}/mounts/all | List All Mounts
*MountsApi* | [**getMountsList**](docs/MountsApi.md#getMountsList) | **GET** /{game}/{language}/mounts | List Mounts
*MountsApi* | [**getMountsSearch**](docs/MountsApi.md#getMountsSearch) | **GET** /{game}/{language}/mounts/search | Search Mounts
*MountsApi* | [**getMountsSingle**](docs/MountsApi.md#getMountsSingle) | **GET** /{game}/{language}/mounts/{ankama_id} | Single Mounts
*QuestItemsApi* | [**getAllItemsQuestList**](docs/QuestItemsApi.md#getAllItemsQuestList) | **GET** /{game}/{language}/items/quest/all | List All Quest Items
*QuestItemsApi* | [**getItemQuestSingle**](docs/QuestItemsApi.md#getItemQuestSingle) | **GET** /{game}/{language}/items/quest/{ankama_id} | Single Quest Items
*QuestItemsApi* | [**getItemsQuestList**](docs/QuestItemsApi.md#getItemsQuestList) | **GET** /{game}/{language}/items/quest | List Quest Items
*QuestItemsApi* | [**getItemsQuestSearch**](docs/QuestItemsApi.md#getItemsQuestSearch) | **GET** /{game}/{language}/items/quest/search | Search Quest Items
*ResourcesApi* | [**getAllItemsResourcesList**](docs/ResourcesApi.md#getAllItemsResourcesList) | **GET** /{game}/{language}/items/resources/all | List All Resources
*ResourcesApi* | [**getItemsResourceSearch**](docs/ResourcesApi.md#getItemsResourceSearch) | **GET** /{game}/{language}/items/resources/search | Search Resources
*ResourcesApi* | [**getItemsResourcesList**](docs/ResourcesApi.md#getItemsResourcesList) | **GET** /{game}/{language}/items/resources | List Resources
*ResourcesApi* | [**getItemsResourcesSingle**](docs/ResourcesApi.md#getItemsResourcesSingle) | **GET** /{game}/{language}/items/resources/{ankama_id} | Single Resources
*SetsApi* | [**getAllSetsList**](docs/SetsApi.md#getAllSetsList) | **GET** /{game}/{language}/sets/all | List All Sets
*SetsApi* | [**getSetsList**](docs/SetsApi.md#getSetsList) | **GET** /{game}/{language}/sets | List Sets
*SetsApi* | [**getSetsSearch**](docs/SetsApi.md#getSetsSearch) | **GET** /{game}/{language}/sets/search | Search Sets
*SetsApi* | [**getSetsSingle**](docs/SetsApi.md#getSetsSingle) | **GET** /{game}/{language}/sets/{ankama_id} | Single Sets
*WebhooksApi* | [**deleteWebhooksAlmanaxId**](docs/WebhooksApi.md#deleteWebhooksAlmanaxId) | **DELETE** /webhooks/almanax/{id} | Unregister Almanax Hook
*WebhooksApi* | [**deleteWebhooksRssId**](docs/WebhooksApi.md#deleteWebhooksRssId) | **DELETE** /webhooks/rss/{id} | Unregister RSS Hook
*WebhooksApi* | [**deleteWebhooksTwitterId**](docs/WebhooksApi.md#deleteWebhooksTwitterId) | **DELETE** /webhooks/twitter/{id} | Unregister Twitter Hook
*WebhooksApi* | [**getMetaWebhooksAlmanax**](docs/WebhooksApi.md#getMetaWebhooksAlmanax) | **GET** /meta/webhooks/almanax | Get Almanax Hook Metainfo
*WebhooksApi* | [**getMetaWebhooksRss**](docs/WebhooksApi.md#getMetaWebhooksRss) | **GET** /meta/webhooks/rss | Get RSS Hook Metainfo
*WebhooksApi* | [**getMetaWebhooksTwitter**](docs/WebhooksApi.md#getMetaWebhooksTwitter) | **GET** /meta/webhooks/twitter | Get Twitter Hook Metainfo
*WebhooksApi* | [**getWebhooksAlmanaxId**](docs/WebhooksApi.md#getWebhooksAlmanaxId) | **GET** /webhooks/almanax/{id} | Get Almanax Hook
*WebhooksApi* | [**getWebhooksRssId**](docs/WebhooksApi.md#getWebhooksRssId) | **GET** /webhooks/rss/{id} | Get RSS Hook
*WebhooksApi* | [**getWebhooksTwitterId**](docs/WebhooksApi.md#getWebhooksTwitterId) | **GET** /webhooks/twitter/{id} | Get Twitter Hook
*WebhooksApi* | [**postWebhooksAlmanax**](docs/WebhooksApi.md#postWebhooksAlmanax) | **POST** /webhooks/almanax | Register Almanax Hook
*WebhooksApi* | [**postWebhooksRss**](docs/WebhooksApi.md#postWebhooksRss) | **POST** /webhooks/rss | Register RSS Hook
*WebhooksApi* | [**postWebhooksTwitter**](docs/WebhooksApi.md#postWebhooksTwitter) | **POST** /webhooks/twitter | Register Twitter Hook
*WebhooksApi* | [**putWebhooksAlmanaxId**](docs/WebhooksApi.md#putWebhooksAlmanaxId) | **PUT** /webhooks/almanax/{id} | Update Almanax Hook
*WebhooksApi* | [**putWebhooksRssId**](docs/WebhooksApi.md#putWebhooksRssId) | **PUT** /webhooks/rss/{id} | Update RSS Hook
*WebhooksApi* | [**putWebhooksTwitterId**](docs/WebhooksApi.md#putWebhooksTwitterId) | **PUT** /webhooks/twitter/{id} | Update Twitter Hook


## Documentation for Models

 - [AlmanaxEntry](docs/AlmanaxEntry.md)
 - [AlmanaxEntryBonus](docs/AlmanaxEntryBonus.md)
 - [AlmanaxEntryTribute](docs/AlmanaxEntryTribute.md)
 - [AlmanaxEntryTributeItem](docs/AlmanaxEntryTributeItem.md)
 - [AlmanaxWebhook](docs/AlmanaxWebhook.md)
 - [AlmanaxWebhookDailySettings](docs/AlmanaxWebhookDailySettings.md)
 - [ConditionEntry](docs/ConditionEntry.md)
 - [ConditionTreeLeaf](docs/ConditionTreeLeaf.md)
 - [ConditionTreeNode](docs/ConditionTreeNode.md)
 - [ConditionTreeRelation](docs/ConditionTreeRelation.md)
 - [Cosmetic](docs/Cosmetic.md)
 - [CosmeticType](docs/CosmeticType.md)
 - [CreateAlmanaxWebhook](docs/CreateAlmanaxWebhook.md)
 - [CreateAlmanaxWebhookDailySettings](docs/CreateAlmanaxWebhookDailySettings.md)
 - [CreateAlmanaxWebhookMentionsValueInner](docs/CreateAlmanaxWebhookMentionsValueInner.md)
 - [CreateRSSWebhook](docs/CreateRSSWebhook.md)
 - [CreateTwitterWebhook](docs/CreateTwitterWebhook.md)
 - [EffectsEntry](docs/EffectsEntry.md)
 - [Equipment](docs/Equipment.md)
 - [EquipmentSet](docs/EquipmentSet.md)
 - [GetGameSearch200ResponseInner](docs/GetGameSearch200ResponseInner.md)
 - [GetMetaAlmanaxBonuses200ResponseInner](docs/GetMetaAlmanaxBonuses200ResponseInner.md)
 - [GetMetaVersion200Response](docs/GetMetaVersion200Response.md)
 - [GetMetaWebhooksTwitter200Response](docs/GetMetaWebhooksTwitter200Response.md)
 - [ImageUrls](docs/ImageUrls.md)
 - [ItemListEntry](docs/ItemListEntry.md)
 - [ItemListEntryParentSet](docs/ItemListEntryParentSet.md)
 - [ItemListEntryRange](docs/ItemListEntryRange.md)
 - [ItemsListEntryTyped](docs/ItemsListEntryTyped.md)
 - [ItemsListEntryTypedType](docs/ItemsListEntryTypedType.md)
 - [ItemsListPaged](docs/ItemsListPaged.md)
 - [LinksPaged](docs/LinksPaged.md)
 - [Mount](docs/Mount.md)
 - [MountListEntry](docs/MountListEntry.md)
 - [MountsListPaged](docs/MountsListPaged.md)
 - [PutAlmanaxWebhook](docs/PutAlmanaxWebhook.md)
 - [PutRSSWebhook](docs/PutRSSWebhook.md)
 - [PutTwitterWebhook](docs/PutTwitterWebhook.md)
 - [RecipeEntry](docs/RecipeEntry.md)
 - [Resource](docs/Resource.md)
 - [RssWebhook](docs/RssWebhook.md)
 - [SetEffectsEntry](docs/SetEffectsEntry.md)
 - [SetEffectsEntryType](docs/SetEffectsEntryType.md)
 - [SetListEntry](docs/SetListEntry.md)
 - [SetsListPaged](docs/SetsListPaged.md)
 - [TwitterWebhook](docs/TwitterWebhook.md)
 - [Weapon](docs/Weapon.md)
 - [WeaponRange](docs/WeaponRange.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

stelzo@steado.de

