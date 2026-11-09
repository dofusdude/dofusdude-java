

# MonsterGrade

One variant of this monster, combining combat level, statistics and spell assignments. Match grade-specific drop rates using its grade value. Do not use it to infer a spell grade.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grade** | **Integer** | Number identifying this variant within the monster. Not the combat level, array position or grade of an assigned spell. |  |
|**level** | **Integer** | Combat level of this monster variant. Distinct from its grade number. |  |
|**lifePoints** | **Integer** |  |  [optional] |
|**actionPoints** | **Integer** |  |  [optional] |
|**movementPoints** | **Integer** |  |  [optional] |
|**gradeXp** | **Integer** |  |  [optional] |
|**neutralResistance** | **Integer** |  |  [optional] |
|**earthResistance** | **Integer** |  |  [optional] |
|**fireResistance** | **Integer** |  |  [optional] |
|**waterResistance** | **Integer** |  |  [optional] |
|**airResistance** | **Integer** |  |  [optional] |
|**paDodge** | **Integer** |  |  [optional] |
|**pmDodge** | **Integer** |  |  [optional] |
|**damageBonus** | **Integer** |  |  [optional] |
|**percentDamageBonus** | **Integer** |  |  [optional] |
|**criticalHitBonus** | **Integer** |  |  [optional] |
|**initiativeBonus** | **Integer** |  |  [optional] |
|**tackleBonus** | **Integer** |  |  [optional] |
|**tackleEvade** | **Integer** |  |  [optional] |
|**maxSummon** | **Integer** |  |  [optional] |
|**bonusCharacteristics** | **Map&lt;String, Integer&gt;** |  |  [optional] |
|**spells** | [**List&lt;MonsterGradeSpellsInner&gt;**](MonsterGradeSpellsInner.md) | Spells assigned to this exact monster grade. |  |



