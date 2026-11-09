

# MonsterGradeSpellsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ankamaId** | **Integer** |  |  |
|**name** | **String** |  |  |
|**grade** | **Integer** | Grade of the assigned spell. It does not need to equal the enclosing MonsterGrade.grade. |  |
|**url** | **URI** | URL for the assigned spell grade. Includes the &#x60;grade&#x60; query parameter. |  |
|**imageUrls** | [**Images**](Images.md) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**iconId** | **Integer** |  |  [optional] |
|**adminName** | **String** |  |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**type** | [**SpellType**](SpellType.md) |  |  [optional] |
|**basePreviewZone** | [**EffectZone**](EffectZone.md) |  |  [optional] |
|**classes** | **List&lt;CombatReference&gt;** | Reverse references to playable classes associated with this spell. These are compact references, not complete class documents. |  [optional] |
|**monsters** | **List&lt;CombatReference&gt;** | Reverse references to monsters associated with this spell. Use a monster&#39;s grade-specific assignments to determine which spell grade it uses. |  [optional] |
|**levels** | **List&lt;SpellLevel&gt;** | Available spell grades. Despite the field name, entries are not player levels. A grade-filtered detail response contains only the requested entry while retaining the parent spell object. |  |
|**scripts** | [**List&lt;SpellScriptUsage&gt;**](SpellScriptUsage.md) |  |  [optional] |
|**criticalScripts** | [**List&lt;SpellScriptUsage&gt;**](SpellScriptUsage.md) |  |  [optional] |



