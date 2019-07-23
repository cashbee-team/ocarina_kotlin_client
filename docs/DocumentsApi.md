# DocumentsApi

All URIs are relative to *https://api-hyrule.cashbee.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentIdentification**](DocumentsApi.md#documentIdentification) | **POST** /documents | 
[**documentIdentificationInfo**](DocumentsApi.md#documentIdentificationInfo) | **GET** /documents/{uuid} | 
[**documentsDirectUpload**](DocumentsApi.md#documentsDirectUpload) | **POST** /documents/direct_upload | 


<a name="documentIdentification"></a>
# **documentIdentification**
> DocumentIdentificationResponse documentIdentification(documentsIdentificationRequest)



Ask for a document identification

### Example
```kotlin
// Import classes:
//import fr.cashbee.ocarina.client.infrastructure.*
//import fr.cashbee.ocarina.client.models.*

val apiInstance = DocumentsApi()
val documentsIdentificationRequest : DocumentsIdentificationRequest =  // DocumentsIdentificationRequest | Document metadata
try {
    val result : DocumentIdentificationResponse = apiInstance.documentIdentification(documentsIdentificationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#documentIdentification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#documentIdentification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentsIdentificationRequest** | [**DocumentsIdentificationRequest**](DocumentsIdentificationRequest.md)| Document metadata | [optional]

### Return type

[**DocumentIdentificationResponse**](DocumentIdentificationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="documentIdentificationInfo"></a>
# **documentIdentificationInfo**
> DocumentIdentificationInfo documentIdentificationInfo(uuid)



Get document identification information

### Example
```kotlin
// Import classes:
//import fr.cashbee.ocarina.client.infrastructure.*
//import fr.cashbee.ocarina.client.models.*

val apiInstance = DocumentsApi()
val uuid : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DocumentIdentificationInfo = apiInstance.documentIdentificationInfo(uuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#documentIdentificationInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#documentIdentificationInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**java.util.UUID**](.md)|  |

### Return type

[**DocumentIdentificationInfo**](DocumentIdentificationInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="documentsDirectUpload"></a>
# **documentsDirectUpload**
> DirectUploadResponse documentsDirectUpload(directUploadRequest)



Request upload link

### Example
```kotlin
// Import classes:
//import fr.cashbee.ocarina.client.infrastructure.*
//import fr.cashbee.ocarina.client.models.*

val apiInstance = DocumentsApi()
val directUploadRequest : DirectUploadRequest =  // DirectUploadRequest | Size in bytes and checksum of the document
try {
    val result : DirectUploadResponse = apiInstance.documentsDirectUpload(directUploadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsApi#documentsDirectUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsApi#documentsDirectUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directUploadRequest** | [**DirectUploadRequest**](DirectUploadRequest.md)| Size in bytes and checksum of the document | [optional]

### Return type

[**DirectUploadResponse**](DirectUploadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

