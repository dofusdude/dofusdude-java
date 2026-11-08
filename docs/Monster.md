

# Monster


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ankamaId** | **Integer** |  |  |
|**name** | **String** |  |  |
|**imageUrls** | [**Images**](Images.md) |  |  [optional] |
|**race** | [**MonsterRace**](MonsterRace.md) |  |  |
|**grades** | **List&lt;MonsterGrade&gt;** | Monster statistics and spells grouped by the monster grade that uses them. |  |
|**spawnLocations** | [**List&lt;MonsterSpawnLocation&gt;**](MonsterSpawnLocation.md) | Spawn subareas taken from the monster&#39;s authoritative subarea list. |  |
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



