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

import java.util.Objects;
import com.dofusdude.client.model.ConditionEntry;
import com.dofusdude.client.model.ConditionTreeNode;
import com.dofusdude.client.model.CosmeticType;
import com.dofusdude.client.model.EffectsEntry;
import com.dofusdude.client.model.ImageUrls;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * 
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-07T13:48:16.474050177Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class Resource {
  public static final String SERIALIZED_NAME_ANKAMA_ID = "ankama_id";
  @SerializedName(SERIALIZED_NAME_ANKAMA_ID)
  private Integer ankamaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CosmeticType type;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private Integer pods;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "image_urls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  private ImageUrls imageUrls;

  public static final String SERIALIZED_NAME_EFFECTS = "effects";
  @SerializedName(SERIALIZED_NAME_EFFECTS)
  private List<EffectsEntry> effects;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<ConditionEntry> conditions;

  public static final String SERIALIZED_NAME_CONDITION_TREE = "condition_tree";
  @SerializedName(SERIALIZED_NAME_CONDITION_TREE)
  private ConditionTreeNode conditionTree;

  public static final String SERIALIZED_NAME_RECIPE = "recipe";
  @SerializedName(SERIALIZED_NAME_RECIPE)
  private List<RecipeEntry> recipe;

  public Resource() {
  }

  public Resource ankamaId(Integer ankamaId) {
    this.ankamaId = ankamaId;
    return this;
  }

   /**
   * Get ankamaId
   * @return ankamaId
  **/
  @jakarta.annotation.Nullable
  public Integer getAnkamaId() {
    return ankamaId;
  }

  public void setAnkamaId(Integer ankamaId) {
    this.ankamaId = ankamaId;
  }


  public Resource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Resource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Resource type(CosmeticType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public CosmeticType getType() {
    return type;
  }

  public void setType(CosmeticType type) {
    this.type = type;
  }


  public Resource level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @jakarta.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public Resource pods(Integer pods) {
    this.pods = pods;
    return this;
  }

   /**
   * Get pods
   * @return pods
  **/
  @jakarta.annotation.Nullable
  public Integer getPods() {
    return pods;
  }

  public void setPods(Integer pods) {
    this.pods = pods;
  }


  public Resource imageUrls(ImageUrls imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

   /**
   * Get imageUrls
   * @return imageUrls
  **/
  @jakarta.annotation.Nullable
  public ImageUrls getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(ImageUrls imageUrls) {
    this.imageUrls = imageUrls;
  }


  public Resource effects(List<EffectsEntry> effects) {
    this.effects = effects;
    return this;
  }

  public Resource addEffectsItem(EffectsEntry effectsItem) {
    if (this.effects == null) {
      this.effects = new ArrayList<>();
    }
    this.effects.add(effectsItem);
    return this;
  }

   /**
   * Get effects
   * @return effects
  **/
  @jakarta.annotation.Nullable
  public List<EffectsEntry> getEffects() {
    return effects;
  }

  public void setEffects(List<EffectsEntry> effects) {
    this.effects = effects;
  }


  @Deprecated
  public Resource conditions(List<ConditionEntry> conditions) {
    this.conditions = conditions;
    return this;
  }

  public Resource addConditionsItem(ConditionEntry conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  public List<ConditionEntry> getConditions() {
    return conditions;
  }

  @Deprecated
  public void setConditions(List<ConditionEntry> conditions) {
    this.conditions = conditions;
  }


  public Resource conditionTree(ConditionTreeNode conditionTree) {
    this.conditionTree = conditionTree;
    return this;
  }

   /**
   * Get conditionTree
   * @return conditionTree
  **/
  @jakarta.annotation.Nullable
  public ConditionTreeNode getConditionTree() {
    return conditionTree;
  }

  public void setConditionTree(ConditionTreeNode conditionTree) {
    this.conditionTree = conditionTree;
  }


  public Resource recipe(List<RecipeEntry> recipe) {
    this.recipe = recipe;
    return this;
  }

  public Resource addRecipeItem(RecipeEntry recipeItem) {
    if (this.recipe == null) {
      this.recipe = new ArrayList<>();
    }
    this.recipe.add(recipeItem);
    return this;
  }

   /**
   * Get recipe
   * @return recipe
  **/
  @jakarta.annotation.Nullable
  public List<RecipeEntry> getRecipe() {
    return recipe;
  }

  public void setRecipe(List<RecipeEntry> recipe) {
    this.recipe = recipe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.ankamaId, resource.ankamaId) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.description, resource.description) &&
        Objects.equals(this.type, resource.type) &&
        Objects.equals(this.level, resource.level) &&
        Objects.equals(this.pods, resource.pods) &&
        Objects.equals(this.imageUrls, resource.imageUrls) &&
        Objects.equals(this.effects, resource.effects) &&
        Objects.equals(this.conditions, resource.conditions) &&
        Objects.equals(this.conditionTree, resource.conditionTree) &&
        Objects.equals(this.recipe, resource.recipe);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ankamaId, name, description, type, level, pods, imageUrls, effects, conditions, conditionTree, recipe);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conditionTree: ").append(toIndentedString(conditionTree)).append("\n");
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ankama_id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("level");
    openapiFields.add("pods");
    openapiFields.add("image_urls");
    openapiFields.add("effects");
    openapiFields.add("conditions");
    openapiFields.add("condition_tree");
    openapiFields.add("recipe");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resource is not found in the empty JSON string", Resource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        CosmeticType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `image_urls`
      if (jsonObj.get("image_urls") != null && !jsonObj.get("image_urls").isJsonNull()) {
        ImageUrls.validateJsonElement(jsonObj.get("image_urls"));
      }
      if (jsonObj.get("effects") != null && !jsonObj.get("effects").isJsonNull()) {
        JsonArray jsonArrayeffects = jsonObj.getAsJsonArray("effects");
        if (jsonArrayeffects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("effects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `effects` to be an array in the JSON string but got `%s`", jsonObj.get("effects").toString()));
          }

          // validate the optional field `effects` (array)
          for (int i = 0; i < jsonArrayeffects.size(); i++) {
            EffectsEntry.validateJsonElement(jsonArrayeffects.get(i));
          };
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            ConditionEntry.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      // validate the optional field `condition_tree`
      if (jsonObj.get("condition_tree") != null && !jsonObj.get("condition_tree").isJsonNull()) {
        ConditionTreeNode.validateJsonElement(jsonObj.get("condition_tree"));
      }
      if (jsonObj.get("recipe") != null && !jsonObj.get("recipe").isJsonNull()) {
        JsonArray jsonArrayrecipe = jsonObj.getAsJsonArray("recipe");
        if (jsonArrayrecipe != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recipe").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recipe` to be an array in the JSON string but got `%s`", jsonObj.get("recipe").toString()));
          }

          // validate the optional field `recipe` (array)
          for (int i = 0; i < jsonArrayrecipe.size(); i++) {
            RecipeEntry.validateJsonElement(jsonArrayrecipe.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resource.class));

       return (TypeAdapter<T>) new TypeAdapter<Resource>() {
           @Override
           public void write(JsonWriter out, Resource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resource
  * @throws IOException if the JSON string is invalid with respect to Resource
  */
  public static Resource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resource.class);
  }

 /**
  * Convert an instance of Resource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

