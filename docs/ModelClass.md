

# ModelClass

A playable class with its characteristics, appearance and class spell assignments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ankamaId** | **Integer** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**gameplayDescription** | **String** |  |  [optional] |
|**complexity** | **Integer** |  |  [optional] |
|**sortIndex** | **Integer** |  |  [optional] |
|**creatureBonesId** | **Integer** |  |  [optional] |
|**roles** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional] |
|**characteristicCosts** | **Map&lt;String, List&lt;ClassCharacteristicCostsValueInner&gt;&gt;** | Characteristic point-cost tiers keyed by characteristic name. |  [optional] |
|**imageUrls** | [**Images**](Images.md) |  |  [optional] |
|**looks** | [**ClassLooks**](ClassLooks.md) |  |  |
|**spells** | **List&lt;Spell&gt;** | Full spell definitions assigned to this playable class, including their own grades, effects and targeting. A class has no monster-grade dimension. The same spells are independently available from the spells endpoint. |  |



