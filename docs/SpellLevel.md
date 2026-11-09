

# SpellLevel

One grade of a spell. The levels array contains these spell variants, not player levels. Grade numbers are local to the containing spell and are independent of monster grades.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ankamaId** | **Integer** | ID of the spell-level definition. Different from the parent spell ID and from the grade number. Used by explicit spell-level references such as script spell_level_ids. |  [optional] |
|**grade** | **Integer** | Number identifying this variant within its spell. Select by this value, not by the array position. Used by the spell detail endpoint&#39;s grade parameter. |  [optional] |
|**apCost** | **Integer** | Action points required to cast this spell grade. |  [optional] |
|**criticalHitProbability** | **Integer** | Base critical-hit percentage recorded for this spell grade, before fighter-specific modifiers. |  [optional] |
|**minPlayerLevel** | **Integer** | Player-level requirement recorded for this spell grade. This is not its grade number or a monster combat level. |  [optional] |
|**minRange** | **Integer** | Minimum casting range in combat cells. |  [optional] |
|**maxRange** | **Integer** | Maximum casting range in combat cells as defined by this grade. |  [optional] |
|**maxCastPerTurn** | **Integer** | Per-caster cast limit within a turn as recorded by the source. |  [optional] |
|**maxCastPerTarget** | **Integer** |  |  [optional] |
|**maxGlobalCastPerTurn** | **Integer** |  |  [optional] |
|**maxGlobalCastPerTarget** | **Integer** |  |  [optional] |
|**minCastInterval** | **Integer** | Minimum interval between casts, measured in fight turns. |  [optional] |
|**initialCooldown** | **Integer** | Initial wait before casting, measured in fight turns. |  [optional] |
|**globalCooldown** | **Integer** |  |  [optional] |
|**ignorePrisonGlyph** | **Boolean** |  |  [optional] |
|**spellBreed** | **Integer** |  |  [optional] |
|**statesCriterion** | [**EligibilityNode**](EligibilityNode.md) | Available client-side state requirements for this spell grade. Null does not assert that the server imposes no restriction. |  [optional] |
|**previewZones** | [**List&lt;SpellPreviewZone&gt;**](SpellPreviewZone.md) | Client preview and activation geometry for this grade. Use each effect&#39;s zone for its actual effect-area definition. |  [optional] |
|**effects** | **List&lt;SpellEffect&gt;** | Normal-cast effects for this grade. Each entry has independent targeting and area geometry. |  [optional] |
|**criticalEffects** | **List&lt;SpellEffect&gt;** | Critical-cast effects for this grade. Keep separate from normal effects rather than applying both arrays to every cast. |  [optional] |



