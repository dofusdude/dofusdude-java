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


package com.dofusdude.client.model;

import java.util.Objects;
import com.dofusdude.client.model.ConditionEntry;
import com.dofusdude.client.model.ConditionTreeNode;
import com.dofusdude.client.model.EffectsEntry;
import com.dofusdude.client.model.ImageUrls;
import com.dofusdude.client.model.ItemListEntryParentSet;
import com.dofusdude.client.model.ItemsListEntryTypedType;
import com.dofusdude.client.model.RecipeEntry;
import com.dofusdude.client.model.WeaponRange;
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
 * Weapon
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T16:17:13.173014837Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class Weapon {
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
  private ItemsListEntryTypedType type;

  public static final String SERIALIZED_NAME_IS_WEAPON = "is_weapon";
  @SerializedName(SERIALIZED_NAME_IS_WEAPON)
  private Boolean isWeapon;

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

  public static final String SERIALIZED_NAME_CRITICAL_HIT_PROBABILITY = "critical_hit_probability";
  @SerializedName(SERIALIZED_NAME_CRITICAL_HIT_PROBABILITY)
  private Integer criticalHitProbability;

  public static final String SERIALIZED_NAME_CRITICAL_HIT_BONUS = "critical_hit_bonus";
  @SerializedName(SERIALIZED_NAME_CRITICAL_HIT_BONUS)
  private Integer criticalHitBonus;

  public static final String SERIALIZED_NAME_IS_TWO_HANDED = "is_two_handed";
  @SerializedName(SERIALIZED_NAME_IS_TWO_HANDED)
  private Boolean isTwoHanded;

  public static final String SERIALIZED_NAME_MAX_CAST_PER_TURN = "max_cast_per_turn";
  @SerializedName(SERIALIZED_NAME_MAX_CAST_PER_TURN)
  private Integer maxCastPerTurn;

  public static final String SERIALIZED_NAME_AP_COST = "ap_cost";
  @SerializedName(SERIALIZED_NAME_AP_COST)
  private Integer apCost;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private WeaponRange range;

  public static final String SERIALIZED_NAME_RECIPE = "recipe";
  @SerializedName(SERIALIZED_NAME_RECIPE)
  private List<RecipeEntry> recipe;

  public static final String SERIALIZED_NAME_PARENT_SET = "parent_set";
  @SerializedName(SERIALIZED_NAME_PARENT_SET)
  private ItemListEntryParentSet parentSet;

  public Weapon() {
  }

  public Weapon ankamaId(Integer ankamaId) {
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


  public Weapon name(String name) {
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


  public Weapon description(String description) {
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


  public Weapon type(ItemsListEntryTypedType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public ItemsListEntryTypedType getType() {
    return type;
  }

  public void setType(ItemsListEntryTypedType type) {
    this.type = type;
  }


  public Weapon isWeapon(Boolean isWeapon) {
    this.isWeapon = isWeapon;
    return this;
  }

   /**
   * always true when the item is a weapon. Many fields are now available. Always check for this flag first when getting single equipment items.
   * @return isWeapon
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsWeapon() {
    return isWeapon;
  }

  public void setIsWeapon(Boolean isWeapon) {
    this.isWeapon = isWeapon;
  }


  public Weapon level(Integer level) {
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


  public Weapon pods(Integer pods) {
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


  public Weapon imageUrls(ImageUrls imageUrls) {
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


  public Weapon effects(List<EffectsEntry> effects) {
    this.effects = effects;
    return this;
  }

  public Weapon addEffectsItem(EffectsEntry effectsItem) {
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
  public Weapon conditions(List<ConditionEntry> conditions) {
    this.conditions = conditions;
    return this;
  }

  public Weapon addConditionsItem(ConditionEntry conditionsItem) {
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


  public Weapon conditionTree(ConditionTreeNode conditionTree) {
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


  public Weapon criticalHitProbability(Integer criticalHitProbability) {
    this.criticalHitProbability = criticalHitProbability;
    return this;
  }

   /**
   * Get criticalHitProbability
   * @return criticalHitProbability
  **/
  @jakarta.annotation.Nullable
  public Integer getCriticalHitProbability() {
    return criticalHitProbability;
  }

  public void setCriticalHitProbability(Integer criticalHitProbability) {
    this.criticalHitProbability = criticalHitProbability;
  }


  public Weapon criticalHitBonus(Integer criticalHitBonus) {
    this.criticalHitBonus = criticalHitBonus;
    return this;
  }

   /**
   * Get criticalHitBonus
   * @return criticalHitBonus
  **/
  @jakarta.annotation.Nullable
  public Integer getCriticalHitBonus() {
    return criticalHitBonus;
  }

  public void setCriticalHitBonus(Integer criticalHitBonus) {
    this.criticalHitBonus = criticalHitBonus;
  }


  public Weapon isTwoHanded(Boolean isTwoHanded) {
    this.isTwoHanded = isTwoHanded;
    return this;
  }

   /**
   * Get isTwoHanded
   * @return isTwoHanded
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsTwoHanded() {
    return isTwoHanded;
  }

  public void setIsTwoHanded(Boolean isTwoHanded) {
    this.isTwoHanded = isTwoHanded;
  }


  public Weapon maxCastPerTurn(Integer maxCastPerTurn) {
    this.maxCastPerTurn = maxCastPerTurn;
    return this;
  }

   /**
   * Get maxCastPerTurn
   * @return maxCastPerTurn
  **/
  @jakarta.annotation.Nullable
  public Integer getMaxCastPerTurn() {
    return maxCastPerTurn;
  }

  public void setMaxCastPerTurn(Integer maxCastPerTurn) {
    this.maxCastPerTurn = maxCastPerTurn;
  }


  public Weapon apCost(Integer apCost) {
    this.apCost = apCost;
    return this;
  }

   /**
   * Get apCost
   * @return apCost
  **/
  @jakarta.annotation.Nullable
  public Integer getApCost() {
    return apCost;
  }

  public void setApCost(Integer apCost) {
    this.apCost = apCost;
  }


  public Weapon range(WeaponRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @jakarta.annotation.Nullable
  public WeaponRange getRange() {
    return range;
  }

  public void setRange(WeaponRange range) {
    this.range = range;
  }


  public Weapon recipe(List<RecipeEntry> recipe) {
    this.recipe = recipe;
    return this;
  }

  public Weapon addRecipeItem(RecipeEntry recipeItem) {
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


  public Weapon parentSet(ItemListEntryParentSet parentSet) {
    this.parentSet = parentSet;
    return this;
  }

   /**
   * Get parentSet
   * @return parentSet
  **/
  @jakarta.annotation.Nullable
  public ItemListEntryParentSet getParentSet() {
    return parentSet;
  }

  public void setParentSet(ItemListEntryParentSet parentSet) {
    this.parentSet = parentSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weapon weapon = (Weapon) o;
    return Objects.equals(this.ankamaId, weapon.ankamaId) &&
        Objects.equals(this.name, weapon.name) &&
        Objects.equals(this.description, weapon.description) &&
        Objects.equals(this.type, weapon.type) &&
        Objects.equals(this.isWeapon, weapon.isWeapon) &&
        Objects.equals(this.level, weapon.level) &&
        Objects.equals(this.pods, weapon.pods) &&
        Objects.equals(this.imageUrls, weapon.imageUrls) &&
        Objects.equals(this.effects, weapon.effects) &&
        Objects.equals(this.conditions, weapon.conditions) &&
        Objects.equals(this.conditionTree, weapon.conditionTree) &&
        Objects.equals(this.criticalHitProbability, weapon.criticalHitProbability) &&
        Objects.equals(this.criticalHitBonus, weapon.criticalHitBonus) &&
        Objects.equals(this.isTwoHanded, weapon.isTwoHanded) &&
        Objects.equals(this.maxCastPerTurn, weapon.maxCastPerTurn) &&
        Objects.equals(this.apCost, weapon.apCost) &&
        Objects.equals(this.range, weapon.range) &&
        Objects.equals(this.recipe, weapon.recipe) &&
        Objects.equals(this.parentSet, weapon.parentSet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ankamaId, name, description, type, isWeapon, level, pods, imageUrls, effects, conditions, conditionTree, criticalHitProbability, criticalHitBonus, isTwoHanded, maxCastPerTurn, apCost, range, recipe, parentSet);
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
    sb.append("class Weapon {\n");
    sb.append("    ankamaId: ").append(toIndentedString(ankamaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isWeapon: ").append(toIndentedString(isWeapon)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conditionTree: ").append(toIndentedString(conditionTree)).append("\n");
    sb.append("    criticalHitProbability: ").append(toIndentedString(criticalHitProbability)).append("\n");
    sb.append("    criticalHitBonus: ").append(toIndentedString(criticalHitBonus)).append("\n");
    sb.append("    isTwoHanded: ").append(toIndentedString(isTwoHanded)).append("\n");
    sb.append("    maxCastPerTurn: ").append(toIndentedString(maxCastPerTurn)).append("\n");
    sb.append("    apCost: ").append(toIndentedString(apCost)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
    sb.append("    parentSet: ").append(toIndentedString(parentSet)).append("\n");
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
    openapiFields.add("is_weapon");
    openapiFields.add("level");
    openapiFields.add("pods");
    openapiFields.add("image_urls");
    openapiFields.add("effects");
    openapiFields.add("conditions");
    openapiFields.add("condition_tree");
    openapiFields.add("critical_hit_probability");
    openapiFields.add("critical_hit_bonus");
    openapiFields.add("is_two_handed");
    openapiFields.add("max_cast_per_turn");
    openapiFields.add("ap_cost");
    openapiFields.add("range");
    openapiFields.add("recipe");
    openapiFields.add("parent_set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Weapon
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Weapon.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Weapon is not found in the empty JSON string", Weapon.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Weapon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Weapon` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        ItemsListEntryTypedType.validateJsonElement(jsonObj.get("type"));
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
      // validate the optional field `range`
      if (jsonObj.get("range") != null && !jsonObj.get("range").isJsonNull()) {
        WeaponRange.validateJsonElement(jsonObj.get("range"));
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
      // validate the optional field `parent_set`
      if (jsonObj.get("parent_set") != null && !jsonObj.get("parent_set").isJsonNull()) {
        ItemListEntryParentSet.validateJsonElement(jsonObj.get("parent_set"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Weapon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Weapon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Weapon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Weapon.class));

       return (TypeAdapter<T>) new TypeAdapter<Weapon>() {
           @Override
           public void write(JsonWriter out, Weapon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Weapon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Weapon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Weapon
  * @throws IOException if the JSON string is invalid with respect to Weapon
  */
  public static Weapon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Weapon.class);
  }

 /**
  * Convert an instance of Weapon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

