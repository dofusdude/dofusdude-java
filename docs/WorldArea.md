

# WorldArea

Geographic data from a super-area, area or subarea endpoint. The hierarchy is super-area to area to subarea to map. Field availability depends on the selected geographic resource. Unrelated to combat-cell effect zones.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ankamaId** | **Integer** |  |  |
|**name** | **String** |  |  |
|**worldMapId** | **Integer** | World-map context supplied on super-area records. |  [optional] |
|**areas** | **List&lt;CombatReference&gt;** | Child area references supplied on super-area records. |  [optional] |
|**level** | **Integer** | Suggested geographic difficulty level supplied on subarea records. Not a monster grade or the level of every monster there. |  [optional] |
|**dungeonId** | **Integer** | Dungeon association when supplied by the subarea data. |  [optional] |
|**maps** | [**List&lt;WorldMapReference&gt;**](WorldMapReference.md) | Map membership supplied on subarea records. Does not imply a spawn on every map. |  [optional] |
|**superArea** | **CombatReference** |  |  [optional] |
|**area** | **CombatReference** |  |  [optional] |
|**subareas** | **List&lt;CombatReference&gt;** |  |  [optional] |
|**monsters** | **List&lt;CombatReference&gt;** |  |  [optional] |



