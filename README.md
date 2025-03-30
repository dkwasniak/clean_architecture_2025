# Clean Architecture Impl 2025

## Before Start

To run this project, you need two additional files:
- `releasekey.jks`: Keystore file for signing the app
- `secret.properties`: Contains sensitive configuration values

These files are not included in the repository for security reasons. Please contact **dkwasniak** to obtain these files.

## Architecture

This project implements **Clean Architecture** principles, separating the codebase into three distinct layers:

- **Domain**: Contains business logic, entities, and use cases. Independent of other layers.
- **Data**: Implements repositories defined in Domain. Handles data sources and transformations.
- **App**: Contains UI components and presenters. Depends on both Domain and Data layers.

This separation ensures maintainability, testability, and flexibility while allowing the core business logic to remain unaffected by external changes.