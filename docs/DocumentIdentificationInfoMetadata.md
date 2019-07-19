
# DocumentIdentificationInfoMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idType** | [**inline**](#IdTypeEnum) |  |  [optional]
**firstName** | **kotlin.String** |  |  [optional]
**middleNames** | **kotlin.String** |  |  [optional]
**lastName** | **kotlin.String** |  |  [optional]
**birthDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional]
**birthPlace** | **kotlin.String** |  |  [optional]
**height** | **kotlin.Int** |  |  [optional]
**serialNumber** | **kotlin.String** |  |  [optional]
**gender** | **kotlin.String** |  |  [optional]
**eyesColor** | **kotlin.String** | Optional if id_type is not a passport |  [optional]
**address** | **kotlin.String** |  |  [optional]
**deliveredBy** | **kotlin.String** |  |  [optional]
**deliveredDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional]
**validUntil** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional]


<a name="IdTypeEnum"></a>
## Enum: id_type
Name | Value
---- | -----
idType | passport, id_card



