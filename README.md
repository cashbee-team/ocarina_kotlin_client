# fr.cashbee.ocarina.client - Kotlin client library for Ocarina API

## Requires

* Kotlin 1.3.31
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api-hyrule.cashbee.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**documentIdentification**](docs/DocumentsApi.md#documentidentification) | **POST** /documents | 
*DocumentsApi* | [**documentIdentificationInfo**](docs/DocumentsApi.md#documentidentificationinfo) | **GET** /documents/{uuid} | 
*DocumentsApi* | [**documentsDirectUpload**](docs/DocumentsApi.md#documentsdirectupload) | **POST** /documents/direct_upload | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [fr.cashbee.ocarina.client.models.DirectUploadResponse](docs/DirectUploadResponse.md)
 - [fr.cashbee.ocarina.client.models.DocumentIdentificationInfo](docs/DocumentIdentificationInfo.md)
 - [fr.cashbee.ocarina.client.models.DocumentIdentificationInfoMetadata](docs/DocumentIdentificationInfoMetadata.md)
 - [fr.cashbee.ocarina.client.models.DocumentIdentificationResponse](docs/DocumentIdentificationResponse.md)
 - [fr.cashbee.ocarina.client.models.DocumentsIdentificationRequest](docs/DocumentsIdentificationRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
