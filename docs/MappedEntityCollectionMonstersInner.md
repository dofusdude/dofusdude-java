

# MappedEntityCollectionMonstersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ankamaId** | **Integer** |  |  |
|**name** | **String** |  |  |
|**imageUrls** | [**Images**](Images.md) |  |  [optional] |
|**race** | [**MonsterRace**](MonsterRace.md) |  |  |
|**grades** | **List&lt;MonsterGrade&gt;** | Variants of this monster. Each has its own combat level, statistics and assigned spells. The monster grade number is not a spell grade number or combat level. |  |
|**spawnLocations** | [**List&lt;MonsterSpawnLocation&gt;**](MonsterSpawnLocation.md) | Known spawn subareas and their geographic parents. This is not live population data or a per-map spawn probability. Maps listed within a subarea are not guaranteed individual spawn points. |  |
|**drops** | [**List&lt;MonsterDrop&gt;**](MonsterDrop.md) |  |  |
|**globalDrops** | [**List&lt;MonsterGlobalDrop&gt;**](MonsterGlobalDrop.md) |  |  [optional] |
|**appearance** | [**ClassAppearance**](ClassAppearance.md) |  |  [optional] |
|**isBounty** | **Boolean** |  |  [optional] |
|**correspondingMiniBoss** | **CombatReference** |  |  [optional] |
|**summonCost** | **Integer** |  |  [optional] |
|**speedAdjust** | **Integer** |  |  [optional] |
|**scaleGradeReference** | **Integer** |  |  [optional] |
|**achievements** | **List&lt;CombatReference&gt;** |  |  [optional] |
|**souls** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional] |
|**characteristicRatios** | **List&lt;List&lt;Double&gt;&gt;** |  |  [optional] |



