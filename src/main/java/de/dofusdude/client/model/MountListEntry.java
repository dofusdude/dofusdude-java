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

package de.dofusdude.client.model;

import de.dofusdude.client.model.EffectsEntry;
import de.dofusdude.client.model.ImageUrls;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;


public class MountListEntry  {
  
  @JsonbProperty("ankama_id")
  private Integer ankamaId;

  @JsonbProperty("name")
  private String name;

  @JsonbProperty("family_name")
  private String familyName;

  @JsonbProperty("image_urls")
  private ImageUrls imageUrls;

  @JsonbProperty("effects")
  private List<EffectsEntry> effects = null;

 /**
   * Get ankamaId
   * @return ankamaId
  **/
  public Integer getAnkamaId() {
    return ankamaId;
  }

  /**
    * Set ankamaId
  **/
  public void setAnkamaId(Integer ankamaId) {
    this.ankamaId = ankamaId;
  }

  public MountListEntry ankamaId(Integer ankamaId) {
    this.ankamaId = ankamaId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public MountListEntry name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get familyName
   * @return familyName
  **/
  public String getFamilyName() {
    return familyName;
  }

  /**
    * Set familyName
  **/
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public MountListEntry familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

 /**
   * Get imageUrls
   * @return imageUrls
  **/
  public ImageUrls getImageUrls() {
    return imageUrls;
  }

  /**
    * Set imageUrls
  **/
  public void setImageUrls(ImageUrls imageUrls) {
    this.imageUrls = imageUrls;
  }

  public MountListEntry imageUrls(ImageUrls imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

 /**
   * Get effects
   * @return effects
  **/
  public List<EffectsEntry> getEffects() {
    return effects;
  }

  /**
    * Set effects
  **/
  public void setEffects(List<EffectsEntry> effects) {
    this.effects = effects;
  }

  public MountListEntry effects(List<EffectsEntry> effects) {
    this.effects = effects;
    return this;
  }

  public MountListEntry addEffectsItem(EffectsEntry effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<>();
    }
    this.effects.add(effectsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountListEntry {\n");
    
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
