VA + SPRING BOOT BACKEND ENGINEERING — DEPENDENCY-BASED MASTER ROADMAP



## 1. GOAL



Develop production-oriented Java backend engineering and tech-lead-level reasoning through hands-on implementation, internal execution tracing, failure analysis, testing, performance optimization, and deployment.



Main project: Existing Product Catalog Service.



Target profile: Java Full Stack / Backend / DevOps-oriented Engineer.



Technology baseline:

- Java 21

- Spring Boot 3.5.x as the planned baseline; verify the actual project version before making changes

- Maven

- application.properties for new configuration exercises, unless the existing project already uses another format

- PostgreSQL

- Spring Data JPA and Hibernate

- Spring Security

- JUnit 5 and Mockito

- Testcontainers

- Actuator and Micrometer

- Docker, Jenkins, Helm, and Docker Desktop Kubernetes

- Redis, Kafka, and other technologies only when justified by a real application requirement



Available learning time: Approximately 10 hours per day. Use an intensive but sustainable schedule with implementation, testing, debugging, review, and breaks.



## 2. LEARNING RULES



1. Follow the dependency-based sequence below.

2. Teach one concept or closely related group at a time.

3. Use the existing Product Catalog Service as the main learning environment.

4. Explain the problem, prerequisites, internal mechanism, execution path, and trade-offs before implementation.

5. Connect Java concepts to actual Spring Boot behavior. Avoid disconnected memorization.

6. Give Windows PowerShell commands when practical and explain each command and argument.

7. During hands-on exercises, give one manageable step and wait for my output before proceeding.

8. Do not reveal the complete implementation immediately when I am expected to design or solve a problem myself.

9. Verify behavior with tests, debugger sessions, logs, SQL, metrics, profilers, or reproducible commands.

10. Introduce controlled failures and diagnose root causes instead of learning only successful scenarios.

11. Preserve existing working code. Prefer small, incremental, version-controlled changes.

12. Introduce infrastructure only when the concept requires it.

13. Introduce PostgreSQL after Spring startup and HTTP request processing are understood.

14. Introduce distributed systems only after local transactions, failure handling, and concurrency are understood.

15. Maintain a progress tracker with three distinct states: LEARNED, PRACTICED, and VALIDATED.

16. Do not mark a concept VALIDATED merely because it was explained. Require practical evidence.

17. Documentation is consolidated near the end, after sufficient practical work.

18. If a deviation is useful, explain why, agree on the change, and return to the roadmap afterward.

19. Do not repeat completed exercises unnecessarily. Verify previous work only when needed.

20. Prioritize concepts by practical frequency, production impact, prerequisite relationships, and relevance to the target role.



## 3. DEPENDENCY-BASED LEARNING SEQUENCE



PHASE 0 — EXISTING PROJECT INSPECTION AND BASELINE



Purpose: Understand the existing application before changing it.



Topics:

- Inspect repository structure and Git status.

- Confirm Java, Spring Boot, and Maven versions.

- Inspect pom.xml, dependencies, plugins, and build configuration.

- Identify the application entry point and configuration files.

- Identify controllers, services, repositories, entities, DTOs, and existing endpoints.

- Inspect current database configuration without prematurely introducing database changes.

- Run the application and inspect startup logs.

- Run the existing test suite and establish the baseline.

- Record existing failures separately from newly introduced failures.



Exit criteria:

- Application structure and actual versions are known.

- Existing startup and test status are recorded.

- Request entry points are identified.

- No unnecessary project changes have been made.



PHASE 1 — JAVA ESSENTIALS THROUGH APPLICATION BEHAVIOR



Dependency order:

1. Classes, objects, references, and object identity.

2. Interfaces, abstraction, composition, and polymorphism.

3. Exceptions and exception propagation.

4. Collections, generics, equality, and hashCode.

5. Immutability and defensive copying.

6. Lambdas, functional interfaces, and streams.

7. Resource management and try-with-resources.

8. Enums, records, and useful Java 21 language features.



Teaching method:

- Introduce concepts when they explain existing application code or a concrete requirement.

- Connect them to DTOs, services, dependency injection, collections, error handling, and API processing.

- Defer advanced language internals until they become useful.



Exit criteria:

- Can explain the relevant Java behavior in actual application code.

- Can implement and test it without relying on memorized examples.



PHASE 2 — SPRING CORE, IOC, AND BOOT STARTUP



Prerequisite: Phase 0 and the relevant Java fundamentals.



Dependency order:

1. Object creation and the problems Spring IoC solves.

2. Dependency injection and constructor injection.

3. Component scanning and bean registration.

4. Bean definitions, scopes, lifecycle, and initialization.

5. Configuration classes and @Bean methods.

6. Configuration ordering and dependency relationships.

7. Spring Boot startup and application context refresh.

8. Auto-configuration discovery and conditional evaluation.

9. @ConditionalOnClass, @ConditionalOnBean, @ConditionalOnMissingBean, and @ConditionalOnProperty.

10. Externalized configuration and configuration properties.

11. Auto-configuration metadata and reusable library packaging.

12. Startup diagnostics and condition evaluation reports.



Existing progress:

- A custom Catalogue Audit auto-configuration JAR has been created, installed, consumed by the Product Catalog Service, and tested.

- Do not repeat that exercise from scratch.

- Revisit the implementation when deeper configuration or bean lifecycle concepts require it.



Exit criteria:

- Can trace how a dependency becomes a Spring-managed bean.

- Can explain why an auto-configuration activates or backs off.

- Can diagnose missing beans and unexpected bean registrations.



PHASE 3 — HTTP AND SPRING MVC REQUEST PROCESSING



Prerequisite: Understanding of Java object behavior and Spring bean management.



Dependency order:

1. HTTP requests, methods, headers, status codes, and JSON.

2. Embedded server startup and DispatcherServlet's role.

3. Request mapping and controller invocation.

4. DTOs, entity boundaries, and serialization.

5. Service-layer responsibilities and repository boundaries.

6. Validation and error responses.

7. Exception propagation and centralized exception handling.

8. Servlet filters versus Spring MVC interceptors.

9. Request lifecycle and response completion.

10. Content negotiation and relevant HTTP semantics.

11. Request context, correlation IDs, and safe request logging.



Exit criteria:

- Can trace an HTTP request through the application and back to the client.

- Can identify where validation, exceptions, filters, interceptors, and serialization operate.

- Can troubleshoot common HTTP and application-layer failures.



PHASE 4 — POSTGRESQL AND SQL FUNDAMENTALS



Prerequisite: Understand the application request path and the purpose of persistence.



Dependency order:

1. Relational tables, data types, and nullability.

2. Primary keys, foreign keys, unique constraints, and check constraints.

3. INSERT, UPDATE, DELETE, SELECT, filtering, sorting, and pagination.

4. Joins, aggregations, and subqueries.

5. Database constraints and data integrity.

6. Transactions and ACID properties.

7. Isolation levels and concurrent transactions.

8. Indexes and index trade-offs.

9. EXPLAIN and EXPLAIN ANALYZE.

10. Row locks, deadlocks, and lock contention.



Exit criteria:

- Can write and troubleshoot the SQL required by the service.

- Can explain data-integrity and transaction behavior.

- Can investigate a slow query using an execution plan.



PHASE 5 — JDBC, CONNECTION POOLS, JPA, HIBERNATE, AND TRANSACTIONS



Prerequisite: PostgreSQL fundamentals and Spring bean/proxy understanding.



Dependency order:

1. JDBC and how Java communicates with a relational database.

2. Connection pools and pool exhaustion.

3. Spring Data repository abstractions.

4. Entity mapping and Hibernate's role.

5. Persistence context and entity lifecycle states.

6. Managed versus detached entities.

7. Dirty checking and SQL generation.

8. Flush versus transaction commit.

9. @Transactional and proxy-based interception.

10. Transaction boundaries, propagation, and rollback rules.

11. Read-only transactions and their limitations.

12. Lazy/eager loading and the N+1 query problem.

13. Fetch joins, projections, and pagination trade-offs.

14. Optimistic and pessimistic locking.

15. Concurrent updates and lost-update prevention.

16. Database constraint violations and exception translation.



Exit criteria:

- Can predict when SQL executes and when a transaction commits or rolls back.

- Can diagnose common Hibernate and transaction failures.

- Can fix inefficient fetching and concurrency bugs with evidence.



PHASE 6 — SPRING SECURITY AND SECURE API DESIGN



Prerequisite: HTTP lifecycle, filters, bean management, and exception handling.



Dependency order:

1. Authentication versus authorization.

2. Servlet filters and the Spring Security filter chain.

3. SecurityContext and security-context propagation.

4. Password hashing and credential handling.

5. Endpoint authorization rules.

6. JWT structure, validation, expiration, and trust boundaries.

7. Method-level security.

8. CORS and CSRF, including when each matters.

9. Secure error responses and sensitive-data handling.

10. Security testing.



Exit criteria:

- Can trace a request through security processing.

- Can distinguish authentication failures from authorization failures.

- Can test access rules and identify common security mistakes.



PHASE 7 — TESTING AND QUALITY GATES



Testing is introduced incrementally from the beginning. This phase consolidates the strategy.



Dependency order:

1. JUnit 5 and assertions.

2. Unit tests and Mockito.

3. Testing service logic and failure paths.

4. Spring application-context tests.

5. MockMvc and controller integration tests.

6. PostgreSQL Testcontainers.

7. Repository and transaction integration tests.

8. Test data and isolation.

9. Concurrency and regression tests.

10. Maven verification and Jenkins CI quality gates.



Exit criteria:

- Can choose the correct test type for a behavior.

- Can test application logic, HTTP behavior, and real PostgreSQL integration.

- Can detect regressions through automated quality gates.



PHASE 8 — JVM, CONCURRENCY, AND PERFORMANCE



Prerequisite: Working application, request lifecycle, database behavior, and basic testing.



Dependency order:

1. JVM execution model and runtime memory areas.

2. Stack, heap, object allocation, and references.

3. Garbage collection fundamentals.

4. Thread states and scheduling.

5. Java Memory Model and visibility.

6. Synchronization, locks, and contention.

7. Executors, futures, and asynchronous execution.

8. ThreadLocal lifecycle and cleanup.

9. MDC and diagnostic context propagation.

10. Virtual threads and their appropriate use cases.

11. CPU versus memory versus I/O bottlenecks.

12. Profiling, thread dumps, heap analysis, and load testing.



Exit criteria:

- Can explain relevant concurrency behavior in a Spring Boot service.

- Can investigate thread contention, memory pressure, and resource exhaustion.

- Can use measurements rather than assumptions to optimize performance.



PHASE 9 — PRODUCTION OBSERVABILITY



Prerequisite: HTTP lifecycle, exception handling, concurrency, and testing.



Dependency order:

1. Structured logging and log levels.

2. Correlation IDs and request context.

3. Spring Boot Actuator.

4. Micrometer metrics.

5. Request latency and percentile interpretation.

6. Distributed tracing and span propagation.

7. Logs, metrics, and traces: complementary roles.

8. Instrumentation boundaries and cardinality control.

9. Health checks and readiness.

10. Profiling and production troubleshooting.

11. Load testing and bottleneck analysis.

12. Reusable observability auto-configuration where justified.



Important distinction:

- Prefer established libraries and standard instrumentation over rebuilding tracing infrastructure.

- Implement a custom feature only when it solves a clearly defined gap.

- Avoid logging secrets, passwords, tokens, and sensitive request content.



Exit criteria:

- Can measure and investigate request failures and latency.

- Can distinguish application instrumentation from monitoring infrastructure.

- Can design safe, configurable observability components.



PHASE 10 — EXTERNAL DEPENDENCIES AND DISTRIBUTED SYSTEMS



Prerequisite: Transactions, concurrency, testing, and basic observability.



Dependency order:

1. Outbound HTTP calls and client configuration.

2. Connection/read timeouts and failure handling.

3. Retries, backoff, and retry safety.

4. Circuit breakers and bulkheads.

5. Redis fundamentals and caching.

6. Cache invalidation and consistency.

7. Kafka fundamentals and asynchronous messaging.

8. Delivery semantics and duplicate messages.

9. Idempotent operations.

10. Transactional outbox.

11. Eventual consistency.

12. Saga orchestration versus choreography.

13. Distributed transaction trade-offs.

14. Failure recovery and operational diagnostics.



Exit criteria:

- Can explain partial failure and duplicate processing.

- Can select appropriate resilience and consistency strategies.

- Can justify when a distributed pattern is needed rather than applying it by default.



PHASE 11 — ARCHITECTURE, DELIVERY, AND PRODUCTION READINESS



Prerequisite: Reliable application behavior, testing, database understanding, and observability.



Dependency order:

1. Layered architecture and clear responsibilities.

2. Modular monoliths and module boundaries.

3. API and database design trade-offs.

4. Design patterns applied to actual requirements.

5. Microservice decomposition and its costs.

6. Docker images and container configuration.

7. Jenkins CI/CD pipelines.

8. Helm charts and Kubernetes resources.

9. Configuration, secrets, and environment separation.

10. Health probes, resources, and deployment behavior.

11. Rolling updates, rollback, and release safety.

12. Incident simulation and troubleshooting.

13. Production-readiness review.

14. Final capstone and consolidated architecture documentation.



Exit criteria:

- Can build, test, package, deploy, and troubleshoot the service.

- Can explain operational and architectural trade-offs.

- Can document the final design based on verified implementation.



## 4. PRIORITY RULES



P0 — Essential:

- Dependency injection and bean lifecycle

- HTTP request processing

- REST API design and validation

- Exception handling

- SQL and database constraints

- Transactions

- JPA/Hibernate behavior

- Security fundamentals

- Testing and debugging



P1 — High-value production engineering:

- Query and connection-pool performance

- Transaction propagation and concurrency

- Integration testing

- Observability

- JVM profiling

- HTTP resilience

- Docker and CI/CD



P2 — Advanced and requirement-driven:

- Redis caching

- Kafka

- Outbox and Saga patterns

- Virtual threads and advanced concurrency

- Microservice decomposition

- Advanced deployment and incident scenarios



Priority indicates study order and depth, not permanent omission. All roadmap phases remain in scope unless an explicit change is agreed.



## 5. DAILY LEARNING METHOD



For each lesson:

1. State the concrete problem.

2. Identify prerequisites.

3. Explain the internal mechanism.

4. Trace the execution path.

5. Ask me to predict the behavior.

6. Give one manageable implementation step.

7. Wait for my output.

8. Review the result and correct misconceptions.

9. Introduce a controlled failure where useful.

10. Verify the fix with evidence.

11. Record progress and the next dependency.



Use the available 10-hour study window flexibly:

- Approximately 2 hours: concepts and internal execution.

- Approximately 3 hours: implementation.

- Approximately 2 hours: tests and failure analysis.

- Approximately 1.5 hours: deeper internals or performance work.

- Approximately 1 hour: review and progress tracking.

- Approximately 0.5 hours: planning and buffer.



Adjust the schedule when a topic requires additional practice.



## 6. CURRENT PROGRESS AND RESUMPTION POINT



Completed or previously practiced:

- Custom Catalogue Audit auto-configuration JAR.

- Maven packaging and local installation.

- Auto-configuration discovery metadata.

- Conditional activation through @ConditionalOnProperty.

- Default bean creation through @Bean.

- Back-off behavior through @ConditionalOnMissingBean.

- Verification using application startup and condition reports.

- Prior practical exposure to Docker, Jenkins, Kubernetes, and Helm.



Do not assume every earlier topic is fully validated. Confirm evidence when necessary.



Current source-of-truth starting point:

PHASE 0 — LESSON 1: Inspect the existing Product Catalog Service and establish the baseline.



First tasks:

1. Inspect the repository and Git status.

2. Confirm the actual Java, Spring Boot, and Maven versions.

3. Inspect pom.xml and dependencies.

4. Identify the application entry point and configuration files.

5. Identify the existing HTTP request path.

6. Run the application and tests.

7. Record the baseline before changing anything.



Version note:

The intended master-plan baseline is Spring Boot 3.5.x, but the project was previously reported as Spring Boot 4.1.1. Verify the actual project files and runtime before deciding whether to retain or change the version. Do not change versions without a justified reason.



## 7. CONTINUATION INSTRUCTION FOR FUTURE CHATS



Treat this document as the source of truth.



Before starting:

- Check the latest completed phase and exercise.

- Retrieve relevant prior context when available.

- Ask only for missing information that is genuinely necessary.

- Do not restart completed work without a reason.



During learning:

- Follow the dependency order.

- Teach one concept or manageable step at a time.

- Wait for my output during hands-on work.

- Do not skip practical checkpoints.

- Do not jump into unrelated advanced topics merely because they are interesting.

- Explain and agree on justified deviations.

- Preserve the existing working project.



After each lesson:

- Record what was learned, practiced, and validated.

- Record the last command, code change, test result, or failure investigated.

- State the next lesson and its prerequisites.



If the conversation drifts:

1. Identify the deviation.

2. Explain briefly why it happened.

3. Return to the last incomplete checkpoint.

4. Continue the roadmap unless I explicitly approve a change.



Immediate next action:

Begin Phase 0, Lesson 1. Inspect the existing Product Catalog Service and establish its startup/test baseline before proceeding to the next concept.# JAVA + SPRING BOOT BACKEND ENGINEERING — DEPENDENCY-BASED MASTER ROADMAP



## 1. GOAL



Develop production-oriented Java backend engineering and tech-lead-level reasoning through hands-on implementation, internal execution tracing, failure analysis, testing, performance optimization, and deployment.



Main project: Existing Product Catalog Service.



Target profile: Java Full Stack / Backend / DevOps-oriented Engineer.



Technology baseline:

- Java 21

- Spring Boot 3.5.x as the planned baseline; verify the actual project version before making changes

- Maven

- application.properties for new configuration exercises, unless the existing project already uses another format

- PostgreSQL

- Spring Data JPA and Hibernate

- Spring Security

- JUnit 5 and Mockito

- Testcontainers

- Actuator and Micrometer

- Docker, Jenkins, Helm, and Docker Desktop Kubernetes

- Redis, Kafka, and other technologies only when justified by a real application requirement



Available learning time: Approximately 10 hours per day. Use an intensive but sustainable schedule with implementation, testing, debugging, review, and breaks.



## 2. LEARNING RULES



1. Follow the dependency-based sequence below.

2. Teach one concept or closely related group at a time.

3. Use the existing Product Catalog Service as the main learning environment.

4. Explain the problem, prerequisites, internal mechanism, execution path, and trade-offs before implementation.

5. Connect Java concepts to actual Spring Boot behavior. Avoid disconnected memorization.

6. Give Windows PowerShell commands when practical and explain each command and argument.

7. During hands-on exercises, give one manageable step and wait for my output before proceeding.

8. Do not reveal the complete implementation immediately when I am expected to design or solve a problem myself.

9. Verify behavior with tests, debugger sessions, logs, SQL, metrics, profilers, or reproducible commands.

10. Introduce controlled failures and diagnose root causes instead of learning only successful scenarios.

11. Preserve existing working code. Prefer small, incremental, version-controlled changes.

12. Introduce infrastructure only when the concept requires it.

13. Introduce PostgreSQL after Spring startup and HTTP request processing are understood.

14. Introduce distributed systems only after local transactions, failure handling, and concurrency are understood.

15. Maintain a progress tracker with three distinct states: LEARNED, PRACTICED, and VALIDATED.

16. Do not mark a concept VALIDATED merely because it was explained. Require practical evidence.

17. Documentation is consolidated near the end, after sufficient practical work.

18. If a deviation is useful, explain why, agree on the change, and return to the roadmap afterward.

19. Do not repeat completed exercises unnecessarily. Verify previous work only when needed.

20. Prioritize concepts by practical frequency, production impact, prerequisite relationships, and relevance to the target role.



## 3. DEPENDENCY-BASED LEARNING SEQUENCE



PHASE 0 — EXISTING PROJECT INSPECTION AND BASELINE



Purpose: Understand the existing application before changing it.



Topics:

- Inspect repository structure and Git status.

- Confirm Java, Spring Boot, and Maven versions.

- Inspect pom.xml, dependencies, plugins, and build configuration.

- Identify the application entry point and configuration files.

- Identify controllers, services, repositories, entities, DTOs, and existing endpoints.

- Inspect current database configuration without prematurely introducing database changes.

- Run the application and inspect startup logs.

- Run the existing test suite and establish the baseline.

- Record existing failures separately from newly introduced failures.



Exit criteria:

- Application structure and actual versions are known.

- Existing startup and test status are recorded.

- Request entry points are identified.

- No unnecessary project changes have been made.



PHASE 1 — JAVA ESSENTIALS THROUGH APPLICATION BEHAVIOR



Dependency order:

1. Classes, objects, references, and object identity.

2. Interfaces, abstraction, composition, and polymorphism.

3. Exceptions and exception propagation.

4. Collections, generics, equality, and hashCode.

5. Immutability and defensive copying.

6. Lambdas, functional interfaces, and streams.

7. Resource management and try-with-resources.

8. Enums, records, and useful Java 21 language features.



Teaching method:

- Introduce concepts when they explain existing application code or a concrete requirement.

- Connect them to DTOs, services, dependency injection, collections, error handling, and API processing.

- Defer advanced language internals until they become useful.



Exit criteria:

- Can explain the relevant Java behavior in actual application code.

- Can implement and test it without relying on memorized examples.



PHASE 2 — SPRING CORE, IOC, AND BOOT STARTUP



Prerequisite: Phase 0 and the relevant Java fundamentals.



Dependency order:

1. Object creation and the problems Spring IoC solves.

2. Dependency injection and constructor injection.

3. Component scanning and bean registration.

4. Bean definitions, scopes, lifecycle, and initialization.

5. Configuration classes and @Bean methods.

6. Configuration ordering and dependency relationships.

7. Spring Boot startup and application context refresh.

8. Auto-configuration discovery and conditional evaluation.

9. @ConditionalOnClass, @ConditionalOnBean, @ConditionalOnMissingBean, and @ConditionalOnProperty.

10. Externalized configuration and configuration properties.

11. Auto-configuration metadata and reusable library packaging.

12. Startup diagnostics and condition evaluation reports.



Existing progress:

- A custom Catalogue Audit auto-configuration JAR has been created, installed, consumed by the Product Catalog Service, and tested.

- Do not repeat that exercise from scratch.

- Revisit the implementation when deeper configuration or bean lifecycle concepts require it.



Exit criteria:

- Can trace how a dependency becomes a Spring-managed bean.

- Can explain why an auto-configuration activates or backs off.

- Can diagnose missing beans and unexpected bean registrations.



PHASE 3 — HTTP AND SPRING MVC REQUEST PROCESSING



Prerequisite: Understanding of Java object behavior and Spring bean management.



Dependency order:

1. HTTP requests, methods, headers, status codes, and JSON.

2. Embedded server startup and DispatcherServlet's role.

3. Request mapping and controller invocation.

4. DTOs, entity boundaries, and serialization.

5. Service-layer responsibilities and repository boundaries.

6. Validation and error responses.

7. Exception propagation and centralized exception handling.

8. Servlet filters versus Spring MVC interceptors.

9. Request lifecycle and response completion.

10. Content negotiation and relevant HTTP semantics.

11. Request context, correlation IDs, and safe request logging.



Exit criteria:

- Can trace an HTTP request through the application and back to the client.

- Can identify where validation, exceptions, filters, interceptors, and serialization operate.

- Can troubleshoot common HTTP and application-layer failures.



PHASE 4 — POSTGRESQL AND SQL FUNDAMENTALS



Prerequisite: Understand the application request path and the purpose of persistence.



Dependency order:

1. Relational tables, data types, and nullability.

2. Primary keys, foreign keys, unique constraints, and check constraints.

3. INSERT, UPDATE, DELETE, SELECT, filtering, sorting, and pagination.

4. Joins, aggregations, and subqueries.

5. Database constraints and data integrity.

6. Transactions and ACID properties.

7. Isolation levels and concurrent transactions.

8. Indexes and index trade-offs.

9. EXPLAIN and EXPLAIN ANALYZE.

10. Row locks, deadlocks, and lock contention.



Exit criteria:

- Can write and troubleshoot the SQL required by the service.

- Can explain data-integrity and transaction behavior.

- Can investigate a slow query using an execution plan.



PHASE 5 — JDBC, CONNECTION POOLS, JPA, HIBERNATE, AND TRANSACTIONS



Prerequisite: PostgreSQL fundamentals and Spring bean/proxy understanding.



Dependency order:

1. JDBC and how Java communicates with a relational database.

2. Connection pools and pool exhaustion.

3. Spring Data repository abstractions.

4. Entity mapping and Hibernate's role.

5. Persistence context and entity lifecycle states.

6. Managed versus detached entities.

7. Dirty checking and SQL generation.

8. Flush versus transaction commit.

9. @Transactional and proxy-based interception.

10. Transaction boundaries, propagation, and rollback rules.

11. Read-only transactions and their limitations.

12. Lazy/eager loading and the N+1 query problem.

13. Fetch joins, projections, and pagination trade-offs.

14. Optimistic and pessimistic locking.

15. Concurrent updates and lost-update prevention.

16. Database constraint violations and exception translation.



Exit criteria:

- Can predict when SQL executes and when a transaction commits or rolls back.

- Can diagnose common Hibernate and transaction failures.

- Can fix inefficient fetching and concurrency bugs with evidence.



PHASE 6 — SPRING SECURITY AND SECURE API DESIGN



Prerequisite: HTTP lifecycle, filters, bean management, and exception handling.



Dependency order:

1. Authentication versus authorization.

2. Servlet filters and the Spring Security filter chain.

3. SecurityContext and security-context propagation.

4. Password hashing and credential handling.

5. Endpoint authorization rules.

6. JWT structure, validation, expiration, and trust boundaries.

7. Method-level security.

8. CORS and CSRF, including when each matters.

9. Secure error responses and sensitive-data handling.

10. Security testing.



Exit criteria:

- Can trace a request through security processing.

- Can distinguish authentication failures from authorization failures.

- Can test access rules and identify common security mistakes.



PHASE 7 — TESTING AND QUALITY GATES



Testing is introduced incrementally from the beginning. This phase consolidates the strategy.



Dependency order:

1. JUnit 5 and assertions.

2. Unit tests and Mockito.

3. Testing service logic and failure paths.

4. Spring application-context tests.

5. MockMvc and controller integration tests.

6. PostgreSQL Testcontainers.

7. Repository and transaction integration tests.

8. Test data and isolation.

9. Concurrency and regression tests.

10. Maven verification and Jenkins CI quality gates.



Exit criteria:

- Can choose the correct test type for a behavior.

- Can test application logic, HTTP behavior, and real PostgreSQL integration.

- Can detect regressions through automated quality gates.



PHASE 8 — JVM, CONCURRENCY, AND PERFORMANCE



Prerequisite: Working application, request lifecycle, database behavior, and basic testing.



Dependency order:

1. JVM execution model and runtime memory areas.

2. Stack, heap, object allocation, and references.

3. Garbage collection fundamentals.

4. Thread states and scheduling.

5. Java Memory Model and visibility.

6. Synchronization, locks, and contention.

7. Executors, futures, and asynchronous execution.

8. ThreadLocal lifecycle and cleanup.

9. MDC and diagnostic context propagation.

10. Virtual threads and their appropriate use cases.

11. CPU versus memory versus I/O bottlenecks.

12. Profiling, thread dumps, heap analysis, and load testing.



Exit criteria:

- Can explain relevant concurrency behavior in a Spring Boot service.

- Can investigate thread contention, memory pressure, and resource exhaustion.

- Can use measurements rather than assumptions to optimize performance.



PHASE 9 — PRODUCTION OBSERVABILITY



Prerequisite: HTTP lifecycle, exception handling, concurrency, and testing.



Dependency order:

1. Structured logging and log levels.

2. Correlation IDs and request context.

3. Spring Boot Actuator.

4. Micrometer metrics.

5. Request latency and percentile interpretation.

6. Distributed tracing and span propagation.

7. Logs, metrics, and traces: complementary roles.

8. Instrumentation boundaries and cardinality control.

9. Health checks and readiness.

10. Profiling and production troubleshooting.

11. Load testing and bottleneck analysis.

12. Reusable observability auto-configuration where justified.



Important distinction:

- Prefer established libraries and standard instrumentation over rebuilding tracing infrastructure.

- Implement a custom feature only when it solves a clearly defined gap.

- Avoid logging secrets, passwords, tokens, and sensitive request content.



Exit criteria:

- Can measure and investigate request failures and latency.

- Can distinguish application instrumentation from monitoring infrastructure.

- Can design safe, configurable observability components.



PHASE 10 — EXTERNAL DEPENDENCIES AND DISTRIBUTED SYSTEMS



Prerequisite: Transactions, concurrency, testing, and basic observability.



Dependency order:

1. Outbound HTTP calls and client configuration.

2. Connection/read timeouts and failure handling.

3. Retries, backoff, and retry safety.

4. Circuit breakers and bulkheads.

5. Redis fundamentals and caching.

6. Cache invalidation and consistency.

7. Kafka fundamentals and asynchronous messaging.

8. Delivery semantics and duplicate messages.

9. Idempotent operations.

10. Transactional outbox.

11. Eventual consistency.

12. Saga orchestration versus choreography.

13. Distributed transaction trade-offs.

14. Failure recovery and operational diagnostics.



Exit criteria:

- Can explain partial failure and duplicate processing.

- Can select appropriate resilience and consistency strategies.

- Can justify when a distributed pattern is needed rather than applying it by default.



PHASE 11 — ARCHITECTURE, DELIVERY, AND PRODUCTION READINESS



Prerequisite: Reliable application behavior, testing, database understanding, and observability.



Dependency order:

1. Layered architecture and clear responsibilities.

2. Modular monoliths and module boundaries.

3. API and database design trade-offs.

4. Design patterns applied to actual requirements.

5. Microservice decomposition and its costs.

6. Docker images and container configuration.

7. Jenkins CI/CD pipelines.

8. Helm charts and Kubernetes resources.

9. Configuration, secrets, and environment separation.

10. Health probes, resources, and deployment behavior.

11. Rolling updates, rollback, and release safety.

12. Incident simulation and troubleshooting.

13. Production-readiness review.

14. Final capstone and consolidated architecture documentation.



Exit criteria:

- Can build, test, package, deploy, and troubleshoot the service.

- Can explain operational and architectural trade-offs.

- Can document the final design based on verified implementation.



## 4. PRIORITY RULES



P0 — Essential:

- Dependency injection and bean lifecycle

- HTTP request processing

- REST API design and validation

- Exception handling

- SQL and database constraints

- Transactions

- JPA/Hibernate behavior

- Security fundamentals

- Testing and debugging



P1 — High-value production engineering:

- Query and connection-pool performance

- Transaction propagation and concurrency

- Integration testing

- Observability

- JVM profiling

- HTTP resilience

- Docker and CI/CD



P2 — Advanced and requirement-driven:

- Redis caching

- Kafka

- Outbox and Saga patterns

- Virtual threads and advanced concurrency

- Microservice decomposition

- Advanced deployment and incident scenarios



Priority indicates study order and depth, not permanent omission. All roadmap phases remain in scope unless an explicit change is agreed.



## 5. DAILY LEARNING METHOD



For each lesson:

1. State the concrete problem.

2. Identify prerequisites.

3. Explain the internal mechanism.

4. Trace the execution path.

5. Ask me to predict the behavior.

6. Give one manageable implementation step.

7. Wait for my output.

8. Review the result and correct misconceptions.

9. Introduce a controlled failure where useful.

10. Verify the fix with evidence.

11. Record progress and the next dependency.



Use the available 10-hour study window flexibly:

- Approximately 2 hours: concepts and internal execution.

- Approximately 3 hours: implementation.

- Approximately 2 hours: tests and failure analysis.

- Approximately 1.5 hours: deeper internals or performance work.

- Approximately 1 hour: review and progress tracking.

- Approximately 0.5 hours: planning and buffer.



Adjust the schedule when a topic requires additional practice.



## 6. CURRENT PROGRESS AND RESUMPTION POINT



Completed or previously practiced:

- Custom Catalogue Audit auto-configuration JAR.

- Maven packaging and local installation.

- Auto-configuration discovery metadata.

- Conditional activation through @ConditionalOnProperty.

- Default bean creation through @Bean.

- Back-off behavior through @ConditionalOnMissingBean.

- Verification using application startup and condition reports.

- Prior practical exposure to Docker, Jenkins, Kubernetes, and Helm.



Do not assume every earlier topic is fully validated. Confirm evidence when necessary.



Current source-of-truth starting point:

PHASE 0 — LESSON 1: Inspect the existing Product Catalog Service and establish the baseline.



First tasks:

1. Inspect the repository and Git status.

2. Confirm the actual Java, Spring Boot, and Maven versions.

3. Inspect pom.xml and dependencies.

4. Identify the application entry point and configuration files.

5. Identify the existing HTTP request path.

6. Run the application and tests.

7. Record the baseline before changing anything.



Version note:

The intended master-plan baseline is Spring Boot 3.5.x, but the project was previously reported as Spring Boot 4.1.1. Verify the actual project files and runtime before deciding whether to retain or change the version. Do not change versions without a justified reason.



## 7. CONTINUATION INSTRUCTION FOR FUTURE CHATS



Treat this document as the source of truth.



Before starting:

- Check the latest completed phase and exercise.

- Retrieve relevant prior context when available.

- Ask only for missing information that is genuinely necessary.

- Do not restart completed work without a reason.



During learning:

- Follow the dependency order.

- Teach one concept or manageable step at a time.

- Wait for my output during hands-on work.

- Do not skip practical checkpoints.

- Do not jump into unrelated advanced topics merely because they are interesting.

- Explain and agree on justified deviations.

- Preserve the existing working project.



After each lesson:

- Record what was learned, practiced, and validated.

- Record the last command, code change, test result, or failure investigated.

- State the next lesson and its prerequisites.



If the conversation drifts:

1. Identify the deviation.

2. Explain briefly why it happened.

3. Return to the last incomplete checkpoint.

4. Continue the roadmap unless I explicitly approve a change.



Immediate next action:

Begin Phase 0, Lesson 1. Inspect the existing Product Catalog Service and establish its startup/test baseline before proceeding to the next concept.
