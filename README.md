# openApiGenerate

I tried to generate the classes with the openApiGenerate gradle task, there were a lot of fields that are not in the
example, also it gave me a lot of warnings. This is why I sticked to the fields in the example.

#### openApiGenerate output

```
'AttachmentRefOrValue' defines discriminator '@type', but the referenced schema 'Attachment' is incorrect. @type is missing from the schema, define it as required and type string
'AttachmentRefOrValue' defines discriminator '@type', but the referenced schema 'AttachmentRef' is incorrect. @type is missing from the schema, define it as required and type string
'AttachmentRefOrValue_FVO' defines discriminator '@type', but the referenced schema 'Attachment_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'AttachmentRefOrValue_FVO' defines discriminator '@type', but the referenced schema 'AttachmentRef_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'AttachmentRefOrValue_MVO' defines discriminator '@type', but the referenced schema 'Attachment_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'AttachmentRefOrValue_MVO' defines discriminator '@type', but the referenced schema 'AttachmentRef_MVO' is incorrect. @type is missing from the schema, define it as required and type string
More than one inline schema specified in allOf:. Only the first one is recognized. All others are ignored.
More than one inline schema specified in allOf:. Only the first one is recognized. All others are ignored.
More than one inline schema specified in allOf:. Only the first one is recognized. All others are ignored.
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'PartyRef' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'PartyRoleRef' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'Individual' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'Organization' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'PartyRole' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'Supplier' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'BusinessPartner' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'Consumer' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole' defines discriminator '@type', but the referenced schema 'Producer' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'PartyRef_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'PartyRoleRef_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'Individual_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'Organization_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'PartyRole_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'Supplier_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'BusinessPartner_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'Consumer_FVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_FVO' defines discriminator '@type', but the referenced schema 'Producer_FVO' is incorrect. @type is missing from the schema, define it as required and type string
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'PartyRef_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'PartyRoleRef_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'Individual_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'Organization_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'PartyRole_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'Supplier_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'BusinessPartner_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'Consumer_MVO' is incorrect. @type is missing from the schema, define it as required and type string
'PartyOrPartyRole_MVO' defines discriminator '@type', but the referenced schema 'Producer_MVO' is incorrect. @type is missing from the schema, define it as required and type string
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
Required var engagedParty not in properties
Required var name not in properties
'PartyRefOrPartyRoleRef' defines discriminator '@type', but the referenced schema 'PartyRef' is incorrect. @type is missing from the schema, define it as required and type string
'PartyRefOrPartyRoleRef' defines discriminator '@type', but the referenced schema 'PartyRoleRef' is incorrect. @type is missing from the schema, define it as required and type string
Ignoring complex example on request body
################################################################################
# Thanks for using OpenAPI Generator.                                          #
# Please consider donation to help us maintain this project ?                 #
# https://opencollective.com/openapi_generator/donate                          #
################################################################################
Successfully generated code to D:\dev\sandbox\yettel\digital-gateway/build/generated

BUILD SUCCESSFUL in 3s
1 actionable task: 1 executed
```

# API Endpoint Summary

This document provides a summary of the design choices and current status of the API endpoints, based on the `tm-api.yaml` specification.

### GraphQL Endpoint

The GraphQL endpoint is implemented to give clients the flexibility to request specific fields, rather than receiving a fixed response payload. This is a significant improvement over traditional REST `GET` endpoints, allowing for more efficient data retrieval and reducing network overhead.

**Benefits:**

* **Field Selection:** Clients can precisely specify which fields they need, eliminating over-fetching.

* **Reduced Payloads:** The response body only contains the requested data, which is especially useful for mobile applications or clients with limited bandwidth.

**Considerations:**

* For more complex scenarios, such as when specific fields or business logic depend on user roles (e.g., from a JWT), a traditional, hand-written or generated REST controller might be preferred. This approach offers more granular control over the application flow and security.

### DELETE Endpoint

The `DELETE /customer/{id}` endpoint is implemented to forward the response from the Customer Management API (CMA) directly to the client as a first approach.

**Strategy:**

* **Direct Forwarding:** The service calls the external API and immediately returns the response.

* **Future Improvements:** If needed, a parsing logic layer could be introduced to handle and map status codes, hide internal exceptions, or modify the response body before returning it to the client.

### POST and PATCH Endpoints

The `POST` and `PATCH` endpoints were not fully tested due to limitations of the mock backend created from the YAML specification. The mock implementation was unable to provide a meaningful response for these requests.

**Current Status:**

* The service functions for these endpoints have been created but have not been validated against a working external API.

* Further testing and potential modifications will be required once a functional backend for these operations becomes available.

### Docker Configuration

This project uses Docker to containerize and manage the build and runtime of both the `digital-gateway` and `customer-management-api` applications. The configuration consists of a `Dockerfile` for each application and a `docker-compose.yaml` file to orchestrate them.

**Dockerfile**

Each Spring Boot application has its own `Dockerfile` designed for a multi-stage build. This approach uses an `openjdk:17-jdk-slim` image to build the application with Gradle and then copies the resulting JAR into a final, lightweight runtime image, which keeps the container size minimal.

**docker-compose.yaml**

The `docker-compose.yaml` file is placed in the `digital-gateway` directory and is configured to manage both services. It defines the build process for each service, exposes the necessary ports, and establishes a dependency so that `customer-management-api` starts before `digital-gateway`.

To start both applications, navigate to the `digital-gateway` directory in your terminal and execute one of the following commands:

-   **To run in the foreground (with visible logs):**
    ```sh
    docker compose up
    ```

-   **To run in the background (detached mode):**
    ```sh
    docker compose up -d
    ```

After the containers are running, you can access the applications at:
-   **Digital Gateway:** `http://localhost:8080`
-   **Customer Management API:** `http://localhost:8081`
