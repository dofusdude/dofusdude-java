

# Effect


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intMinimum** | **Integer** | minimum int value, can be a single if ignore_int_max and no ignore_int_min |  [optional] |
|**intMaximum** | **Integer** | maximum int value, if not ignore_int_max and not ignore_int_min, the effect has a range value |  [optional] |
|**type** | [**EffectType**](EffectType.md) |  |  [optional] |
|**ignoreIntMin** | **Boolean** | ignore the int min field because the actual value is a string. For readability the templated field is the only important field in this case.  |  [optional] |
|**ignoreIntMax** | **Boolean** | ignore the int max field, if ignore_int_min is true, int min is a single value |  [optional] |
|**formatted** | **String** | all fields from above encoded in a single string |  [optional] |


